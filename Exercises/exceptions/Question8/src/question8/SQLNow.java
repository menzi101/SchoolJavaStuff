
package question8;


import com.mysql.jdbc.Connection;
import java.sql.*;

/**
 *Menzi Hlope
 * CGMSXBYZ5
 */
public class SQLNow {
    public static Connection getConnection() throws Exception{
        String dbRoot = "jdbc:mysql://";
        String hostName = "localhost:3306/";
        String dbName = "question8";
        String dbURL = dbRoot+hostName+dbName;
        String userName = "cgmsxbyz5";
        String password = "Paul@321";
        
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(dbURL,userName,password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
        return con;
        
    
}
    
}

