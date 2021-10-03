/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurso.modelos;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Alejandro
 */
public class Preguntas extends Conexion{
    private int id;
    private String pregunta;
    private int idCategoria;
    private PreparedStatement sentencia;

    public Preguntas() {
    }

    public Preguntas(int id, String pregunta, int idCategoria) {
        this.id = id;
        this.pregunta = pregunta;
        this.idCategoria = idCategoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    public int obtenerPregunta(int idCategoria) throws SQLException {
        Connection conectar = ConectarDB();
        ResultSet datos = null;
        
        String consulta = "SELECT * FROM preguntas WHERE IDCategoria ="
                + "?";
        try {
            sentencia=conectar.prepareStatement(consulta);
            sentencia.setInt(1, idCategoria);
            datos = sentencia.executeQuery();
            int random = (int) (Math.random()*5+1);
            while(datos.next()){
                datos.absolute(random);
                this.id = datos.getInt("id");
                this.idCategoria = datos.getInt("IDCategoria");
                this.pregunta = datos.getString("pregunta");
                datos.afterLast();
            }
            return 1;
        }catch(Exception e) {
            System.out.println("Error: "+e);
            return 0;
        }finally{
            datos.close();
        }
    }
    
}
