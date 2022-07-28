/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.View.staff;

import com.View.staff.*;
import com.DB.StaffDB;
import com.Objects.Staff;
import com.View.MainFrame;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.CSS;

/**
 *
 * @author diego
 */
public class StaffManagementView extends javax.swing.JInternalFrame {

    /**
     * Creates new form MembersAdd
     */
    public StaffManagementView() {
        initComponents();
        listStaff();

    }

    public void addStaff() {

        try {
            String staffId = textStaffID.getText();
            String fName = textStaffFName.getText();
            String lName = textStaffLName.getText();
            String birthday = textStaffBirthday.getText();
            String phoneNumber = textStaffPhoneNumber.getText();
            String email = textStaffEmail.getText();
            String street = textStaffStreet.getText();
            String houseNumber = textStaffSalary.getText();
            String aircode = textStaffIBAN.getText();
            String city = textStaffCity.getText();
            String country = textStaffCountry.getText();
            String startDate = textStaffStartDate.getText();
            String function = textStaffFunction.getText();
            String salary = textStaffSalary.getText();
            String iban = textStaffIBAN.getText();

            Staff staff = new Staff();

            staff.setId(staffId);
            staff.setFirstName(fName);
            staff.setLastName(lName);
            staff.setBirthday(birthday);
            staff.setCellPhone(phoneNumber);
            staff.setEmail(email);
            staff.setStreet(street);
            staff.setHouseNumber(houseNumber);
            staff.setAircode(aircode);
            staff.setCity(city);
            staff.setCountry(country);
            staff.setStartDate(startDate);
            staff.setFunction(function);
            staff.setSalary(salary);
            staff.setIban(iban);

            StaffDB staffDB = new StaffDB();
            boolean checkAdding = staffDB.addStaff(staff);

            if (checkAdding == true) {
                JOptionPane.showMessageDialog(null, "Staff Registered");
                listStaff();
                clearFields();

            }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Button AddMember" + error.getMessage());
        }
    }

    private void updateStaff() {

        try {
            int staffCode = Integer.parseInt(textStaffCode.getText());
            String memberId = textStaffID.getText();
            String fName = textStaffFName.getText();
            String lName = textStaffLName.getText();
            String birthday = textStaffBirthday.getText();
            String phoneNumber = textStaffPhoneNumber.getText();
            String email = textStaffEmail.getText();
            String street = textStaffStreet.getText();
            String houseNumber = textStaffSalary.getText();
            String aircode = textStaffIBAN.getText();
            String city = textStaffCity.getText();
            String country = textStaffCountry.getText();
            String startDate = textStaffStartDate.getText();
            String function = textStaffFunction.getText();
            String salary = textStaffSalary.getText();
            String iban = textStaffIBAN.getText();

            Staff staff = new Staff();

            staff.setCode(staffCode);
            staff.setId(memberId);
            staff.setFirstName(fName);
            staff.setLastName(lName);
            staff.setBirthday(birthday);
            staff.setCellPhone(phoneNumber);
            staff.setEmail(email);
            staff.setStreet(street);
            staff.setHouseNumber(houseNumber);
            staff.setAircode(aircode);
            staff.setCity(city);
            staff.setCountry(country);
            staff.setStartDate(startDate);
            staff.setFunction(function);
            staff.setSalary(salary);
            staff.setIban(iban);

            StaffDB staffDB = new StaffDB();
            boolean checkAdding = staffDB.updateStaff(staff);

            if (checkAdding == true) {
                JOptionPane.showMessageDialog(null, "Member Updated");
                listStaff();
                clearFields();

            }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Button AddMember" + error.getMessage());
        }
    }

    private void deleteStaff() {
        try {
            int memberCode = Integer.parseInt(textStaffCode.getText());

            Staff staff = new Staff();

            staff.setCode(memberCode);

            StaffDB memberDB = new StaffDB();
            boolean checkAdding = memberDB.deleteStaff(staff);

            if (checkAdding == true) {
                JOptionPane.showMessageDialog(null, "Member Deleted");
                listStaff();
                clearFields();

            }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Button AddMember" + error.getMessage());
        }
    }

    private void listStaff() {
        try {

            StaffDB objStaffDB = new StaffDB();
            DefaultTableModel tableModel = (DefaultTableModel) tableStaffList.getModel();
            tableModel.setNumRows(0);

            ArrayList<Staff> staffList = objStaffDB.searchStaff();

            for (int row = 0; row < staffList.size(); row++) {

                tableModel.addRow(new Object[]{
                    staffList.get(row).getCode(),
                    staffList.get(row).getId(),
                    staffList.get(row).getFirstName(),
                    staffList.get(row).getLastName(),
                    staffList.get(row).getStartDate(),
                    staffList.get(row).getBirthday(),
                    staffList.get(row).getCellPhone(),
                    staffList.get(row).getEmail(),
                    staffList.get(row).getStreet(),
                    staffList.get(row).getHouseNumber(),
                    staffList.get(row).getAircode(),
                    staffList.get(row).getCity(),
                    staffList.get(row).getCountry(),
                    staffList.get(row).getFunction(),
                    staffList.get(row).getSalary(),
                    staffList.get(row).getIban()});
            }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "View Member Consult" + error.getMessage());
        }

    }

    private void loadStaff() {
        int row = tableStaffList.getSelectedRow();

        textStaffCode.setText(tableStaffList.getModel().getValueAt(row, 0).toString());
        textStaffID.setText(tableStaffList.getModel().getValueAt(row, 1).toString());
        textStaffFName.setText(tableStaffList.getModel().getValueAt(row, 2).toString());
        textStaffLName.setText(tableStaffList.getModel().getValueAt(row, 3).toString());
        textStaffStartDate.setText(tableStaffList.getModel().getValueAt(row, 4).toString());
        textStaffBirthday.setText(tableStaffList.getModel().getValueAt(row, 5).toString());
        textStaffPhoneNumber.setText(tableStaffList.getModel().getValueAt(row, 6).toString());
        textStaffEmail.setText(tableStaffList.getModel().getValueAt(row, 7).toString());
        textStaffStreet.setText(tableStaffList.getModel().getValueAt(row, 8).toString());
        textStaffSalary.setText(tableStaffList.getModel().getValueAt(row, 9).toString());
        textStaffIBAN.setText(tableStaffList.getModel().getValueAt(row, 10).toString());
        textStaffCity.setText(tableStaffList.getModel().getValueAt(row, 11).toString());
        textStaffCountry.setText(tableStaffList.getModel().getValueAt(row, 12).toString());
        textStaffFunction.setText(tableStaffList.getModel().getValueAt(row, 13).toString());
        textStaffSalary.setText(tableStaffList.getModel().getValueAt(row, 14).toString());
        textStaffIBAN.setText(tableStaffList.getModel().getValueAt(row, 15).toString());

    }

    private void clearFields() {
        textStaffCode.setText(null);
        textStaffID.setText(null);
        textStaffFName.setText(null);
        textStaffLName.setText(null);
        textStaffBirthday.setText(null);
        textStaffPhoneNumber.setText(null);
        textStaffEmail.setText(null);
        textStaffStreet.setText(null);
        textStaffSalary.setText(null);
        textStaffIBAN.setText(null);
        textStaffCity.setText(null);
        textStaffCountry.setText(null);
        textStaffStartDate.setText(null);
        textStaffIBAN.setText(null);
        textStaffFunction.setText(null);
        textStaffSalary.setText(null);
    }
    
    private Staff staffMoreInfo(){
        int staffCode = Integer.parseInt(textStaffCode.getText());
            String memberId = textStaffID.getText();
            String fName = textStaffFName.getText();
            String lName = textStaffLName.getText();
            String birthday = textStaffBirthday.getText();
            String phoneNumber = textStaffPhoneNumber.getText();
            String email = textStaffEmail.getText();
            String street = textStaffStreet.getText();
            String houseNumber = textStaffSalary.getText();
            String aircode = textStaffIBAN.getText();
            String city = textStaffCity.getText();
            String country = textStaffCountry.getText();
            String startDate = textStaffStartDate.getText();
            String salary = textStaffSalary.getText();
            String function = textStaffFunction.getText();
            String iban = textStaffIBAN.getText();
      

            Staff staff = new Staff();

            staff.setCode(staffCode);
            staff.setId(memberId);
            staff.setFirstName(fName);
            staff.setLastName(lName);
            staff.setBirthday(birthday);
            staff.setCellPhone(phoneNumber);
            staff.setEmail(email);
            staff.setStreet(street);
            staff.setHouseNumber(houseNumber);
            staff.setAircode(aircode);
            staff.setCity(city);
            staff.setCountry(country);
            staff.setStartDate(startDate);
            staff.setIban(iban);
            staff.setFunction(function);
            staff.setSalary(salary);
            
            return staff;
    }

    @SuppressWarnings("unchecked")
    StaffMoreInformation staffMoreInformation = new StaffMoreInformation();
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textStaffID = new javax.swing.JTextField();
        textStaffLName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textStaffStartDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textStaffEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textStaffStreet = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textStaffIBAN = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textStaffSalary = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textStaffCity = new javax.swing.JTextField();
        btnMemberRefresh = new javax.swing.JButton();
        textStaffPhoneNumber = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textStaffCountry = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        textStaffBirthday = new javax.swing.JTextField();
        textStaffFName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStaffList = new javax.swing.JTable();
        btnMemberRegister = new javax.swing.JButton();
        btnMemberDelete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnMemberAlterate = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        textStaffCode = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        textStaffFunction = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        textStaffHouseNumber1 = new javax.swing.JTextField();
        textStaffAircode = new javax.swing.JTextField();
        btnMemberLoad1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("STAFF");
        setDesktopIcon(getDesktopIcon());
        setName("Insert User"); // NOI18N
        setPreferredSize(new java.awt.Dimension(560, 300));
        setVisible(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID Number *");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel2.setText("First Name *");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        textStaffID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textStaffIDActionPerformed(evt);
            }
        });
        getContentPane().add(textStaffID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 160, -1));
        getContentPane().add(textStaffLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 200, -1));

        jLabel3.setText("Birthday");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));

        textStaffStartDate.setText("yyyy/mm/dd");
        textStaffStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textStaffStartDateActionPerformed(evt);
            }
        });
        getContentPane().add(textStaffStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 102, -1));

        jLabel4.setText("E-mail");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        textStaffEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textStaffEmailActionPerformed(evt);
            }
        });
        getContentPane().add(textStaffEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 330, -1));

        jLabel5.setText("Street / Road");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        getContentPane().add(textStaffStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 200, -1));

        jLabel7.setText("AirCode");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));
        getContentPane().add(textStaffIBAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 150, -1));

        jLabel8.setText("Phone Number");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel9.setText("Number");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));
        getContentPane().add(textStaffSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 70, -1));

        jLabel10.setText("City");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));
        getContentPane().add(textStaffCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 120, -1));

        btnMemberRefresh.setText("Refresh");
        btnMemberRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btnMemberRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 90, 120, 70));
        getContentPane().add(textStaffPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 190, -1));

        jLabel11.setText("Country");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, -1));

        textStaffCountry.setText("Ireland");
        getContentPane().add(textStaffCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 100, -1));

        jLabel6.setText("Last Name *");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        jLabel12.setText("Start Date");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        textStaffBirthday.setText("yyyy/mm/dd");
        textStaffBirthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textStaffBirthdayActionPerformed(evt);
            }
        });
        getContentPane().add(textStaffBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 102, -1));
        getContentPane().add(textStaffFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 130, -1));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(2147483647, 32767));

        tableStaffList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "ID", "First Name", "Last Name", "Start Date", "Birthday", "Phone Number", "Email", "Street", "Num", "Aircode", "City", "Country", "Function", "Salary", "Iban"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableStaffList.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jScrollPane1.setViewportView(tableStaffList);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 1270, 240));

        btnMemberRegister.setText("Register");
        btnMemberRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnMemberRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 120, 70));

        btnMemberDelete.setText("Delete");
        btnMemberDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnMemberDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 90, 120, 70));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMemberAlterate.setText("Update");
        btnMemberAlterate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberAlterateActionPerformed(evt);
            }
        });
        jPanel1.add(btnMemberAlterate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 120, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 550, 160));

        jLabel13.setText("Code");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        textStaffCode.setEnabled(false);
        textStaffCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textStaffCodeActionPerformed(evt);
            }
        });
        getContentPane().add(textStaffCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 4, 70, 30));

        jLabel14.setText("Function");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));
        getContentPane().add(textStaffFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 190, -1));

        jLabel15.setText("Salary");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 110, -1));
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 190, -1));

        jLabel16.setText("IBAN");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));
        getContentPane().add(textStaffHouseNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 70, -1));
        getContentPane().add(textStaffAircode, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 100, -1));

        btnMemberLoad1.setText("Load Member");
        btnMemberLoad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberLoad1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMemberLoad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 250, -1, -1));

        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(this);

        setBounds(0, 0, 1304, 603);
    }// </editor-fold>//GEN-END:initComponents

    private void textStaffStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textStaffStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textStaffStartDateActionPerformed

    private void textStaffEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textStaffEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textStaffEmailActionPerformed

    private void textStaffBirthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textStaffBirthdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textStaffBirthdayActionPerformed

    private void btnMemberRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberRefreshActionPerformed
        clearFields();
        listStaff();
    }//GEN-LAST:event_btnMemberRefreshActionPerformed

    private void textStaffIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textStaffIDActionPerformed

    }//GEN-LAST:event_textStaffIDActionPerformed

    private void btnMemberRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberRegisterActionPerformed
        if (textStaffID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " ID Number is a Mandotory field");
        } else if (textStaffFName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " First Name is a Mandotory field");
        } else if (textStaffLName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " Last Name is a Mandotory field");
        } else {
            addStaff();
        }

    }//GEN-LAST:event_btnMemberRegisterActionPerformed

    private void btnMemberAlterateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberAlterateActionPerformed
        updateStaff();
    }//GEN-LAST:event_btnMemberAlterateActionPerformed

    private void btnMemberDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberDeleteActionPerformed
        deleteStaff();
        clearFields();
    }//GEN-LAST:event_btnMemberDeleteActionPerformed

    private void textStaffCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textStaffCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textStaffCodeActionPerformed

    private void btnMemberLoad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberLoad1ActionPerformed
        loadStaff();
    }//GEN-LAST:event_btnMemberLoad1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMemberAlterate;
    private javax.swing.JButton btnMemberDelete;
    private javax.swing.JButton btnMemberLoad1;
    private javax.swing.JButton btnMemberRefresh;
    private javax.swing.JButton btnMemberRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTable tableStaffList;
    private javax.swing.JTextField textStaffAircode;
    private javax.swing.JTextField textStaffBirthday;
    private javax.swing.JTextField textStaffCity;
    private javax.swing.JTextField textStaffCode;
    private javax.swing.JTextField textStaffCountry;
    private javax.swing.JTextField textStaffEmail;
    private javax.swing.JTextField textStaffFName;
    private javax.swing.JTextField textStaffFunction;
    private javax.swing.JTextField textStaffHouseNumber1;
    private javax.swing.JTextField textStaffIBAN;
    private javax.swing.JTextField textStaffID;
    private javax.swing.JTextField textStaffLName;
    private javax.swing.JTextField textStaffPhoneNumber;
    private javax.swing.JTextField textStaffSalary;
    private javax.swing.JTextField textStaffStartDate;
    private javax.swing.JTextField textStaffStreet;
    // End of variables declaration//GEN-END:variables
}
