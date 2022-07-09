/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DB;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class ConnectionDB {
    
    private static final String userName = "gymproject";
    private static final String userPassword = "admin123";
    private static final String dbUrl = "jdbc:mysql://localhost:3306/gymproject";
    
    public java.sql.Connection connectDB(){
        
        java.sql.Connection conn = null;
        
        try{
            conn = DriverManager.getConnection(dbUrl, userName, userPassword);
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Connection Error" + error.getMessage());
        }
        return conn;
        
    }
}
