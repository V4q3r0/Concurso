
package concurso.modelos;

import com.mysql.jdbc.Connection;
import concurso.controladores.IniciarJuego;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jugador extends Conexion{
    
    private int id;
    private String nombre;
    private int puntos;
    private int nivel;
    private PreparedStatement sentencia;

    public Jugador() {
    }

    public Jugador(int id, String nombre, int puntos, int nivel) {
        this.id = id;
        this.nombre = nombre;
        this.puntos = puntos;
        this.nivel = nivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    public int getNivel() {
        return nivel;
    }
    
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public int obtenerJugador(String nombre) {
        Connection conectar = ConectarDB();
        
        String consulta = "SELECT * FROM jugador WHERE nombre = "
                + "?";
        try {
            sentencia=conectar.prepareStatement(consulta);
            sentencia.setString(1, nombre);
            ResultSet datos = sentencia.executeQuery();
            
            if(datos.next()) {
                this.id=datos.getInt("id");
                this.nombre=datos.getString("nombre");
                this.puntos=datos.getInt("puntos");
                this.nivel=datos.getInt("nivel");
            }else{
                crearJugador(nombre);
            }
            
            
            return 1;
        }catch(Exception e) {
            System.out.println("Error: "+e);
            return 0;
        }
    }
    
    public int crearJugador(String nombre) {
        
        Connection conectar = ConectarDB();
        
        String consulta = "INSERT INTO jugador(nombre, puntos)"
                + "VALUES (?,?)";
        
        try {
            
            sentencia=conectar.prepareStatement(consulta);
            sentencia.setString(1,nombre);
            sentencia.setInt(2,this.puntos);
            int request=sentencia.executeUpdate();
            if(request > 0)
            {
                obtenerJugador(nombre);
            }
            return request;
        }catch(Exception e) {
            System.out.println("Error: "+e);
            return 0;
        }finally {
            try {
                conectar.close();
            }catch (Exception e) {
                System.out.println("Error: "+e);
            }
        }
    }
    
    public int guardarJugador(int id, String nombre, int nivel, int puntos) {
        Connection conectar = ConectarDB();
        
        String consulta = "UPDATE jugador SET nombre = ?, nivel = ?, puntos = ? WHERE id = ?";
        
        try {
            sentencia=conectar.prepareStatement(consulta);
            sentencia.setString(1, nombre);
            sentencia.setInt(2, nivel);
            sentencia.setInt(3, puntos);
            sentencia.setInt(4, id);
            int request=sentencia.executeUpdate();
            return request;
        }catch(Exception e) {
            System.out.println("Error: "+e);
            return 0;
        }
    }
}
