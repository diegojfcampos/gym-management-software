/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DB;

import com.Objects.Members;
import com.Objects.Staff;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;





/**
 *
 * @author diego
 */
public class StaffDB {
    
    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    ArrayList<Staff> staffList = new ArrayList<>();
    
    public boolean addStaff(Members objStaff){
        
        conn = (Connection) new com.DB.ConnectionDB().connectDB();
        String myStatement = "INSERT INTO staff(StaffID, FirstName, LastName, Birthday, PhoneNumber, "
                + "Email, Street, HouseNumber, Aircode, City, Country, StartDate) VALUES (?,?,?,?,?,?,?,?,?,?,?,?);";
        
        try{
            st = conn.prepareStatement(myStatement);
            
            st.setString(1, objStaff.getId());
            st.setString(2, objStaff.getFirstName());
            st.setString(3, objStaff.getLastName());
            st.setString(4, objStaff.getBirthday());
            st.setString(5, objStaff.getCellPhone());
            st.setString(6, objStaff.getEmail());
            st.setString(7, objStaff.getStreet());
            st.setString(8, objStaff.getHouseNumber());
            st.setString(9, objStaff.getAircode());
            st.setString(10, objStaff.getCity());
            st.setString(11, objStaff.getCountry());
            st.setString(12, objStaff.getStartDate());
            
            st.execute();
            st.close();
            
            return true;
            
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Staff DB "+ error.getMessage());
            return false;
        }
        
    }

    public ArrayList<Staff> searchStaff(){
        String getStatement = "SELECT * from staff;";
        conn = (Connection) new com.DB.ConnectionDB().connectDB();
        
        try{
            st = conn.prepareStatement(getStatement);
            rs = st.executeQuery();
            
            while(rs.next()){
                Staff staff = new Staff();
                staff.setCode(rs.getInt("StaffCode"));
                staff.setId(rs.getString("StaffID"));
                staff.setFirstName(rs.getString("FirstName"));
                staff.setLastName(rs.getString("LastName"));
                staff.setBirthday(rs.getString("Birthday"));
                staff.setCellPhone(rs.getString("PhoneNumber"));
                staff.setEmail(rs.getString("Email"));
                staff.setStreet(rs.getString("Street"));
                staff.setHouseNumber(rs.getString("HouseNumber"));
                staff.setAircode(rs.getString("Aircode"));
                staff.setCity(rs.getString("City"));
                staff.setCountry(rs.getString("Country"));
                staff.setStartDate(rs.getString("StartDate"));
                
                staffList.add(staff);
            }
            
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null, "StaffDB.searchStaff()" +  error.getMessage());
        }
        return staffList;
    }
    
    public boolean updateStaff(Staff objStaff){
        conn = (Connection) new com.DB.ConnectionDB().connectDB();
        String myStatement = "UPDATE staff set StaffID = ?, FirstName = ?, LastName = ?, Birthday = ?, PhoneNumber = ?, "
                + "Email = ?, Street = ?, HouseNumber = ?, Aircode = ?, City = ?, Country = ?, StartDate = ? where StaffCode = ?;";
        
        try{
            st = conn.prepareStatement(myStatement);
            
            st.setString(1, objStaff.getId());
            st.setString(2, objStaff.getFirstName());
            st.setString(3, objStaff.getLastName());
            st.setString(4, objStaff.getBirthday());
            st.setString(5, objStaff.getCellPhone());
            st.setString(6, objStaff.getEmail());
            st.setString(7, objStaff.getStreet());
            st.setString(8, objStaff.getHouseNumber());
            st.setString(9, objStaff.getAircode());
            st.setString(10, objStaff.getCity());
            st.setString(11, objStaff.getCountry());
            st.setString(12, objStaff.getStartDate());
            
            st.setInt(13, objStaff.getCode());
            
            st.execute();
            st.close();
            
            return true;
            
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Staff DB "+ error.getMessage());
            return false;
        }
    }
    
    public boolean deleteStaff(Staff objStaff){
        conn = (Connection) new com.DB.ConnectionDB().connectDB();
        String myStatement = "delete from staff where StaffCode = ?;";
        
        try{
            st = conn.prepareStatement(myStatement);
            
            st.setInt(1, objStaff.getCode());
            
            st.execute();
            st.close();
            
            return true;
            
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Member DB "+ error.getMessage());
            return false;
        }        
    }


}
