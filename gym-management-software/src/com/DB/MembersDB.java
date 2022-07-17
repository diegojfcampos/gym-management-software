/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DB;

import com.Objects.Members;
import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;





/**
 *
 * @author diego
 */
public class MembersDB {
    
    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    
    public boolean addMember(Members objMember){
        
        conn = (Connection) new com.DB.ConnectionDB().connectDB();
        String myStatement = "INSERT INTO member(MemberID, FirstName, LastName, Birthday, PhoneNumber, "
                + "Email, Street, HouseNumber, Aircode, City, Country, StartDate) VALUES (?,?,?,?,?,?,?,?,?,?,?,?);";
        
        try{
            st = conn.prepareStatement(myStatement);
            
            st.setString(1, objMember.getId());
            st.setString(2, objMember.getFirstName());
            st.setString(3, objMember.getLastName());
            st.setString(4, objMember.getBirthday());
            st.setString(5, objMember.getCellPhone());
            st.setString(6, objMember.getEmail());
            st.setString(7, objMember.getStreet());
            st.setString(8, objMember.getHouseNumber());
            st.setString(9, objMember.getAircode());
            st.setString(10, objMember.getCity());
            st.setString(11, objMember.getCountry());
            st.setString(12, objMember.getStartDate());
            
            st.execute();
            st.close();
            
            return true;
            
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Member DB "+ error.getMessage());
            return false;
        }
        
    }




}
