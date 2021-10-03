
package concurso.modelos;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    private static final String URL="jdbc:mysql://localhost/concurso";
    private static final String User="root";
    private static final String Password="";
    
    public Connection ConectarDB() {
        
        Connection conectar=null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection(URL,User,Password);
            return conectar;
        }catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido establecer la conexión con la DB."+e, "Conexión", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
    }
}
