/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;


/**
 *
 * @author Akash Dixit
 */
public class ConnectionProvider {
    public static Connection getcon()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection("Jdbc:mysql://localhost:3306/bbms","root","12345");
            return con;
        } 
        catch (Exception e) {
            System.out.println("problem :"+e);
             
        }
       return null;
       
       
    }
    
    
}
