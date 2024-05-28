
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author raphael
 */
public class ConnectionFactory {
    String host = "localhost";
    String port = "3306";
    String user = "root";
    String password = "";
    String database = "eventos";
    

    Connection conectar() throws Exception{
       
        var stringConexao = String.format(
            "jdbc:mysql://%s:%s/%s",
            host, port, database
        );
        return DriverManager.getConnection(
            stringConexao, user, password
        );

    }
}
