
package concurso.modelos;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Respuestas extends Conexion{
    private int id;
    private String respuesta;
    private int idPregunta;
    private boolean correcta;
    private PreparedStatement sentencia;

    public Respuestas() {
    }

    public Respuestas(int id, String respuesta, int idPregunta, boolean correcta) {
        this.id = id;
        this.respuesta = respuesta;
        this.idPregunta = idPregunta;
        this.correcta = correcta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public boolean isCorrecta() {
        return correcta;
    }

    public void setCorrecta(boolean correcta) {
        this.correcta = correcta;
    }
    
    public ResultSet obtenerRespuestas(int idPregunta){
        Connection conectar = ConectarDB();
        ResultSet datos = null;
        
        String consulta = "SELECT * FROM respuestas WHERE idPregunta ="
                + "?";
        
        try {
            sentencia=conectar.prepareStatement(consulta);
            sentencia.setInt(1, idPregunta);
            datos = sentencia.executeQuery();
            return datos;
        }catch(Exception e){
            System.out.println("Error: "+e);
            return null;
        }
    }
    
    public String obtenerRespuesta(int id){
        Connection conectar = ConectarDB();
        ResultSet dato = null;
        
        String consulta = "SELECT * FROM respuestas WHERE id ="
                + "?";
        String dat = null;
        try{
            sentencia=conectar.prepareStatement(consulta);
            sentencia.setInt(1, id);
            dato = sentencia.executeQuery();
            while(dato.next()){
                dat = dato.getString("respuesta");
            }
            return dat;
        }catch(Exception e){
            System.out.println("Error: "+e);
            return null;
        }
    }
    
    public String obtenerRespuesta(String respuesta){
        Connection conectar = ConectarDB();
        ResultSet dato = null;
        
        String consulta = "SELECT * FROM respuestas WHERE respuesta ="
                + "?";
        String dat = null;
        try{
            sentencia=conectar.prepareStatement(consulta);
            sentencia.setString(1, respuesta);
            dato = sentencia.executeQuery();
            while(dato.next()){
                dat = dato.getString("respuesta");
            }
            return dat;
        }catch(Exception e){
            System.out.println("Error: "+e);
            return null;
        }
    }
    
}
