
package itja211_cgmsxbyz5_1;

/**
 *  Menzi Hlope
 *  CGMSXBYZ5
 */

import com.mysql.jdbc.Connection;
import java.sql.*;

public class MySQLConnection {
    public static Connection getConnection() throws Exception{
        String dbRoot = "jdbc:mysql://";
        String hostName = "localhost:3306/";
        String dbName = "question1";
        String dbURL = dbRoot+hostName+dbName;
        String userName = "question1";
        String password = "Pearson@123";
        
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
