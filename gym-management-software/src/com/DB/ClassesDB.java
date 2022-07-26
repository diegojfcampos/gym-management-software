/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DB;

import com.Objects.Classes;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class ClassesDB {
    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    ArrayList<Classes> listClasses = new ArrayList<>();
    
    public boolean addClasses(Classes objClasses){
        try{
            conn = new com.DB.ConnectionDB().connectDB();
            String addStatement = "INSERT INTO classes(ClassName, ClassCapacity, Duration, Description)"
                    + "VALUES (?,?,?,?)";
            
            st = conn.prepareStatement(addStatement);
            st.setString(1, objClasses.getName());
            st.setString(2, objClasses.getMaxCapacity());
            st.setString(3, objClasses.getAvgDuration());
            st.setString(4, objClasses.getDescription());
            
            st.execute();
            st.close();
            return true;
            
            
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null, " ClassesDB.addClasses()" + error.getMessage());
            return false;
        }
    }
     public boolean updateClasses(Classes objClasses){
        conn = (Connection) new com.DB.ConnectionDB().connectDB();
        String myStatement = "UPDATE classes set ClassName = ?, ClassCapacity = ?, Duration = ?, Description = ? where ClassID = ?;";
        
        try{
            st = conn.prepareStatement(myStatement);
            
            st.setString(1, objClasses.getName());
            st.setString(2, objClasses.getMaxCapacity());
            st.setString(3, objClasses.getAvgDuration());
            st.setString(4, objClasses.getDescription());            
            st.setInt(5, objClasses.getClassesID());
            
            st.execute();
            st.close();
            
            return true;
            
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Classes DB "+ error.getMessage());
            return false;
        }
    }
    
    public boolean deleteClasses(Classes objClasses){
        conn = (Connection) new com.DB.ConnectionDB().connectDB();
        String myStatement = "delete from classes where ClassID = ?;";
        
        try{
            st = conn.prepareStatement(myStatement);
            
            st.setInt(1, objClasses.getClassesID());
            
            st.execute();
            st.close();
            
            return true;
            
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Classes DB "+ error.getMessage());
            return false;
        }        
    }
    public ArrayList<Classes> searchClasses(){
        String getStatement = "SELECT * from classes;";
        conn = (Connection) new com.DB.ConnectionDB().connectDB();
        
        try{
            st = conn.prepareStatement(getStatement);
            rs = st.executeQuery();
            
            while(rs.next()){
                Classes classes = new Classes();
                classes.setClassesID(rs.getInt("ClassID"));
                classes.setName(rs.getString("ClassName"));
                classes.setAvgDuration(rs.getString("Duration"));
                classes.setMaxCapacity(rs.getString("ClassCapacity"));
                classes.setDescription(rs.getString("Description"));

                
                listClasses.add(classes);
            }
            
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null, "MemberDB.searchMembers()" +  error.getMessage());
        }
        return listClasses;
    }
}
