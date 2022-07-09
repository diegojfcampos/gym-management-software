/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.Objects.*;
/**
 *
 * @author diego
 */
public class UserDB {
    
    Connection conn;
    
    public ResultSet userAuthentication(Users userObject) {
       
        conn = new com.DB.ConnectionDB().connectDB();
        
        try{
            String mysql = "SELECT * from users WHERE UserName = ? and UserPassword = ?";

            PreparedStatement pst = conn.prepareStatement(mysql);
            pst.setString(1, userObject.getUserName());
            pst.setString(2, userObject.getUserPassword());

            ResultSet rs = pst.executeQuery();

            return rs;
            
        }catch(SQLException error) {
            
            JOptionPane.showConfirmDialog(null, "error in UserDB" +  error);
            return null;
	}
    }  
    
    
}
