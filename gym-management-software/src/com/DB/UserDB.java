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
import java.util.ArrayList;
/**
 *
 * @author diego
 */
public class UserDB {
    
    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    ArrayList<Users> userList = new ArrayList<>();
    
    public ResultSet userAuthentication(Users userObject) {
       
        conn = new com.DB.ConnectionDB().connectDB();
        
        try{
            String mysql = "SELECT * from users WHERE UserName = ? and UserPassword = ?";

            PreparedStatement pst = conn.prepareStatement(mysql);
            pst.setString(1, userObject.getUserName());
            pst.setString(2, userObject.getUserPassword());

            rs = pst.executeQuery();

            return rs;
            
        }catch(SQLException error) {
            
            JOptionPane.showConfirmDialog(null, "error in UserDB" +  error);
            return null;
	}
    }
    
    public boolean registerUserDB(Users objUsers){
        String registerStatement = "INSERT INTO users(UserName, UserPassword) VALUES(?,?);";
        conn = (Connection) new com.DB.ConnectionDB().connectDB();
        
        try{
            st = conn.prepareStatement(registerStatement);
            st.setString(1, objUsers.getUserName());
            st.setString(2, objUsers.getUserPassword());
            
            st.execute();
            st.close();           
            return true;
                    
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "registerUserDB()" + erro.getMessage());
            return false;
        }
    }
    
    public boolean updateUserDB(Users objUsers){
        String registerStatement = "UPDATE users set UserName =?,  UserPassword = ? WHERE UserId = ?;";
        conn = (Connection) new com.DB.ConnectionDB().connectDB();
        
        try{
            st = conn.prepareStatement(registerStatement);
            st.setString(1, objUsers.getUserName());
            st.setString(2, objUsers.getUserPassword());
            st.setInt(3, objUsers.getUserId());
            
            st.execute();
            st.close();           
            return true;
                    
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "registerUserDB()" + erro.getMessage());
            return false;
        }
    }
    
    public ArrayList<Users> searchUsers(){
        String getStatement = "SELECT * from users;";
        conn = (Connection) new com.DB.ConnectionDB().connectDB();
        
        try{
            st = conn.prepareStatement(getStatement);
            rs = st.executeQuery();
            
            while(rs.next()){
                Users user = new Users();
                user.setUserId(rs.getInt("UserId"));
                user.setUserName(rs.getString("UserName"));
                user.setUserPassword(rs.getString("UserPassword"));
                
                userList.add(user);
            }
            
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null, "UserDB.searchUsers()" +  error.getMessage());
        }
        return userList;
    }
    public boolean deleteUser(Users objUser){
        conn = (Connection) new com.DB.ConnectionDB().connectDB();
        String myStatement = "delete from users where UserId = ?;";
        
        try{
            st = conn.prepareStatement(myStatement);
            
            st.setInt(1, objUser.getUserId());
            
            st.execute();
            st.close();
            
            return true;
            
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Delete UserDB "+ error.getMessage());
            return false;
        }        
    }
    
    
}
