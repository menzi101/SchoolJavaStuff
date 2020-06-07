/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freelunch;

import java.sql.*;
/**
 *
 * @author Makro Centurion
 */
public class JavaSQLTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/freelunch", "testacc", "Paulette@123");
            System.out.println("Connection Successful");
        } catch (SQLException sqle) {
            System.out.println("Error " + sqle);
            
        } catch (ClassNotFoundException cnfe){
            System.out.println("Error " + cnfe);
        }

    }
    
}
