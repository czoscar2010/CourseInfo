/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author czosc
 */
public class JDBCMySQLExample {
    
    public static Connection dbConnnector(){
        String jdbcUrl = "jdbc:mysql://localhost:3306/a";
        String username = "root";
        String password = "****"; // father's phone number only 4 digits
        try {
            Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
            //JOptionPane.showMessageDialog(null, "Connect successfully");
            return conn;
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
    } 
    }
    
  
    }

  
