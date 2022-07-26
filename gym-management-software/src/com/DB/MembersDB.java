/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DB;

import com.Objects.Members;
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
public class MembersDB {
    
    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    ArrayList<Members> memberList = new ArrayList<>();
    
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

    public ArrayList<Members> searchMembers(){
        String getStatement = "SELECT * from member;";
        conn = (Connection) new com.DB.ConnectionDB().connectDB();
        
        try{
            st = conn.prepareStatement(getStatement);
            rs = st.executeQuery();
            
            while(rs.next()){
                Members member = new Members();
                member.setCode(rs.getInt("MemberCode"));
                member.setId(rs.getString("MemberID"));
                member.setFirstName(rs.getString("FirstName"));
                member.setLastName(rs.getString("LastName"));
                member.setBirthday(rs.getString("Birthday"));
                member.setCellPhone(rs.getString("PhoneNumber"));
                member.setEmail(rs.getString("Email"));
                member.setStreet(rs.getString("Street"));
                member.setHouseNumber(rs.getString("HouseNumber"));
                member.setAircode(rs.getString("Aircode"));
                member.setCity(rs.getString("City"));
                member.setCountry(rs.getString("Country"));
                member.setStartDate(rs.getString("StartDate"));
                
                memberList.add(member);
            }
            
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null, "MemberDB.searchMembers()" +  error.getMessage());
        }
        return memberList;
    }
    
    public boolean updateMember(Members objMember){
        conn = (Connection) new com.DB.ConnectionDB().connectDB();
        String myStatement = "UPDATE member set MemberID = ?, FirstName = ?, LastName = ?, Birthday = ?, PhoneNumber = ?, "
                + "Email = ?, Street = ?, HouseNumber = ?, Aircode = ?, City = ?, Country = ?, StartDate = ? where MemberCode = ?;";
        
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
            
            st.setInt(13, objMember.getCode());
            
            st.execute();
            st.close();
            
            return true;
            
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Member DB "+ error.getMessage());
            return false;
        }
    }
    
    public boolean deleteMember(Members objMember){
        conn = (Connection) new com.DB.ConnectionDB().connectDB();
        String myStatement = "delete from member where MemberCode = ?;";
        
        try{
            st = conn.prepareStatement(myStatement);
            
            st.setInt(1, objMember.getCode());
            
            st.execute();
            st.close();
            
            return true;
            
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Member DB "+ error.getMessage());
            return false;
        }        
    }


}
