/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.View.members;

import com.DB.MembersDB;
import com.Objects.Members;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.CSS;

/**
 *
 * @author diego
 */
public class MembersManagementView extends javax.swing.JInternalFrame {

    /**
     * Creates new form MembersAdd
     */
    public MembersManagementView() {
        initComponents();
        listMembers();

    }

    public void addMembers() {

        try {
            String memberId = textMemberID.getText();
            String fName = textMemberFName.getText();
            String lName = textMemberLName.getText();
            String birthday = textMemberBirthday.getText();
            String phoneNumber = textMemberPhoneNumber.getText();
            String email = textMemberEmail.getText();
            String street = textMemberStreet.getText();
            String houseNumber = textMemberHouseNumber.getText();
            String aircode = textMemberAircode.getText();
            String city = textMemberCity.getText();
            String country = textMemberCountry.getText();
            String startDate = textMemberStartDate.getText();

            Members member = new Members();

            member.setId(memberId);
            member.setFirstName(fName);
            member.setLastName(lName);
            member.setBirthday(birthday);
            member.setCellPhone(phoneNumber);
            member.setEmail(email);
            member.setStreet(street);
            member.setHouseNumber(houseNumber);
            member.setAircode(aircode);
            member.setCity(city);
            member.setCountry(country);
            member.setStartDate(startDate);

            MembersDB memberDB = new MembersDB();
            boolean checkAdding = memberDB.addMember(member);

            if (checkAdding == true) {
                JOptionPane.showMessageDialog(null, "Member Registered");
                listMembers();
                clearFields();

            }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Button AddMember" + error.getMessage());
        }
    }

    private void updateMembers() {

        try {
            int memberCode = Integer.parseInt(textMemberCode.getText());
            String memberId = textMemberID.getText();
            String fName = textMemberFName.getText();
            String lName = textMemberLName.getText();
            String birthday = textMemberBirthday.getText();
            String phoneNumber = textMemberPhoneNumber.getText();
            String email = textMemberEmail.getText();
            String street = textMemberStreet.getText();
            String houseNumber = textMemberHouseNumber.getText();
            String aircode = textMemberAircode.getText();
            String city = textMemberCity.getText();
            String country = textMemberCountry.getText();
            String startDate = textMemberStartDate.getText();

            Members member = new Members();

            member.setCode(memberCode);
            member.setId(memberId);
            member.setFirstName(fName);
            member.setLastName(lName);
            member.setBirthday(birthday);
            member.setCellPhone(phoneNumber);
            member.setEmail(email);
            member.setStreet(street);
            member.setHouseNumber(houseNumber);
            member.setAircode(aircode);
            member.setCity(city);
            member.setCountry(country);
            member.setStartDate(startDate);

            MembersDB memberDB = new MembersDB();
            boolean checkAdding = memberDB.updateMember(member);

            if (checkAdding == true) {
                JOptionPane.showMessageDialog(null, "Member Updated");
                listMembers();
                clearFields();

            }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Button AddMember" + error.getMessage());
        }
    }

    private void deleteMember() {
        try {
            int memberCode = Integer.parseInt(textMemberCode.getText());

            Members member = new Members();

            member.setCode(memberCode);

            MembersDB memberDB = new MembersDB();
            boolean checkAdding = memberDB.deleteMember(member);

            if (checkAdding == true) {
                JOptionPane.showMessageDialog(null, "Member Deleted");
                listMembers();
                clearFields();

            }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Button AddMember" + error.getMessage());
        }
    }

    private void listMembers() {
        try {

            MembersDB objMemberDB = new MembersDB();
            DefaultTableModel tableModel = (DefaultTableModel) tableMemberList.getModel();
            tableModel.setNumRows(0);

            ArrayList<Members> membersList = objMemberDB.searchMembers();

            for (int row = 0; row < membersList.size(); row++) {

                tableModel.addRow(new Object[]{
                    membersList.get(row).getCode(),
                    membersList.get(row).getId(),
                    membersList.get(row).getFirstName(),
                    membersList.get(row).getLastName(),
                    membersList.get(row).getStartDate(),
                    membersList.get(row).getBirthday(),
                    membersList.get(row).getCellPhone(),
                    membersList.get(row).getEmail(),
                    membersList.get(row).getStreet(),
                    membersList.get(row).getHouseNumber(),
                    membersList.get(row).getAircode(),
                    membersList.get(row).getCity(),
                    membersList.get(row).getCountry(),});
            }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "View Member Consult" + error.getMessage());
        }

    }

    private void loadMember() {
        int row = tableMemberList.getSelectedRow();

        textMemberCode.setText(tableMemberList.getModel().getValueAt(row, 0).toString());
        textMemberID.setText(tableMemberList.getModel().getValueAt(row, 1).toString());
        textMemberFName.setText(tableMemberList.getModel().getValueAt(row, 2).toString());
        textMemberLName.setText(tableMemberList.getModel().getValueAt(row, 3).toString());
        textMemberStartDate.setText(tableMemberList.getModel().getValueAt(row, 4).toString());
        textMemberBirthday.setText(tableMemberList.getModel().getValueAt(row, 5).toString());
        textMemberPhoneNumber.setText(tableMemberList.getModel().getValueAt(row, 6).toString());
        textMemberEmail.setText(tableMemberList.getModel().getValueAt(row, 7).toString());
        textMemberStreet.setText(tableMemberList.getModel().getValueAt(row, 8).toString());
        textMemberHouseNumber.setText(tableMemberList.getModel().getValueAt(row, 9).toString());
        textMemberAircode.setText(tableMemberList.getModel().getValueAt(row, 10).toString());
        textMemberCity.setText(tableMemberList.getModel().getValueAt(row, 11).toString());
        textMemberCountry.setText(tableMemberList.getModel().getValueAt(row, 12).toString());

    }

    private void clearFields() {
        textMemberCode.setText(null);
        textMemberID.setText(null);
        textMemberFName.setText(null);
        textMemberLName.setText(null);
        textMemberBirthday.setText(null);
        textMemberPhoneNumber.setText(null);
        textMemberEmail.setText(null);
        textMemberStreet.setText(null);
        textMemberHouseNumber.setText(null);
        textMemberAircode.setText(null);
        textMemberCity.setText(null);
        textMemberCountry.setText(null);
        textMemberStartDate.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textMemberID = new javax.swing.JTextField();
        textMemberLName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textMemberStartDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textMemberEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textMemberStreet = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textMemberAircode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textMemberHouseNumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textMemberCity = new javax.swing.JTextField();
        btnMemberRefresh = new javax.swing.JButton();
        textMemberPhoneNumber = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textMemberCountry = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        textMemberBirthday = new javax.swing.JTextField();
        textMemberFName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMemberList = new javax.swing.JTable();
        btnMemberRegister = new javax.swing.JButton();
        btnMemberDelete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnMemberAlterate = new javax.swing.JButton();
        btnMemberLoad = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        textMemberCode = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("New Member");
        setDesktopIcon(getDesktopIcon());
        setName("Insert User"); // NOI18N
        setPreferredSize(new java.awt.Dimension(560, 300));
        setVisible(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID Number *");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel2.setText("First Name *");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        textMemberID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMemberIDActionPerformed(evt);
            }
        });
        getContentPane().add(textMemberID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 160, -1));
        getContentPane().add(textMemberLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 200, -1));

        jLabel3.setText("Birthday");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));

        textMemberStartDate.setText("yyyy/mm/dd");
        textMemberStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMemberStartDateActionPerformed(evt);
            }
        });
        getContentPane().add(textMemberStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 102, -1));

        jLabel4.setText("E-mail");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        textMemberEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMemberEmailActionPerformed(evt);
            }
        });
        getContentPane().add(textMemberEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 330, -1));

        jLabel5.setText("Street / Road");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        getContentPane().add(textMemberStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 200, -1));

        jLabel7.setText("AirCode");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));
        getContentPane().add(textMemberAircode, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 100, -1));

        jLabel8.setText("Phone Number");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel9.setText("Number");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));
        getContentPane().add(textMemberHouseNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 70, -1));

        jLabel10.setText("City");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));
        getContentPane().add(textMemberCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 120, -1));

        btnMemberRefresh.setText("Refresh");
        btnMemberRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btnMemberRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 90, 120, 70));
        getContentPane().add(textMemberPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 190, -1));

        jLabel11.setText("Country");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, -1));

        textMemberCountry.setText("Ireland");
        getContentPane().add(textMemberCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 100, -1));

        jLabel6.setText("Last Name *");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        jLabel12.setText("Start Date");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        textMemberBirthday.setText("yyyy/mm/dd");
        textMemberBirthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMemberBirthdayActionPerformed(evt);
            }
        });
        getContentPane().add(textMemberBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 102, -1));
        getContentPane().add(textMemberFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 130, -1));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(2147483647, 32767));

        tableMemberList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "ID", "First Name", "Last Name", "Start Date", "Birthday", "Phone Number", "Email", "Street", "Num", "Aircode", "City", "Country"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMemberList.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jScrollPane1.setViewportView(tableMemberList);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1270, 310));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 550, 150));

        btnMemberLoad.setText("Load Member");
        btnMemberLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberLoadActionPerformed(evt);
            }
        });
        getContentPane().add(btnMemberLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 210, -1, -1));

        jLabel13.setText("Code");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        textMemberCode.setEnabled(false);
        textMemberCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMemberCodeActionPerformed(evt);
            }
        });
        getContentPane().add(textMemberCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 4, 70, 30));

        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(this);

        setBounds(0, 0, 1304, 603);
    }// </editor-fold>//GEN-END:initComponents

    private void textMemberStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMemberStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMemberStartDateActionPerformed

    private void textMemberEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMemberEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMemberEmailActionPerformed

    private void textMemberBirthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMemberBirthdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMemberBirthdayActionPerformed

    private void btnMemberRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberRefreshActionPerformed
        clearFields();
        listMembers();
    }//GEN-LAST:event_btnMemberRefreshActionPerformed

    private void textMemberIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMemberIDActionPerformed

    }//GEN-LAST:event_textMemberIDActionPerformed

    private void btnMemberRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberRegisterActionPerformed
        if (textMemberID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " ID Number is a Mandotory field");
        } else if (textMemberFName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " First Name is a Mandotory field");
        } else if (textMemberLName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " Last Name is a Mandotory field");
        } else {
            addMembers();
        }

    }//GEN-LAST:event_btnMemberRegisterActionPerformed

    private void btnMemberAlterateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberAlterateActionPerformed
        updateMembers();
    }//GEN-LAST:event_btnMemberAlterateActionPerformed

    private void btnMemberDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberDeleteActionPerformed
        deleteMember();
        clearFields();
    }//GEN-LAST:event_btnMemberDeleteActionPerformed

    private void btnMemberLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberLoadActionPerformed
        loadMember();
    }//GEN-LAST:event_btnMemberLoadActionPerformed

    private void textMemberCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMemberCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMemberCodeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMemberAlterate;
    private javax.swing.JButton btnMemberDelete;
    private javax.swing.JButton btnMemberLoad;
    private javax.swing.JButton btnMemberRefresh;
    private javax.swing.JButton btnMemberRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTable tableMemberList;
    private javax.swing.JTextField textMemberAircode;
    private javax.swing.JTextField textMemberBirthday;
    private javax.swing.JTextField textMemberCity;
    private javax.swing.JTextField textMemberCode;
    private javax.swing.JTextField textMemberCountry;
    private javax.swing.JTextField textMemberEmail;
    private javax.swing.JTextField textMemberFName;
    private javax.swing.JTextField textMemberHouseNumber;
    private javax.swing.JTextField textMemberID;
    private javax.swing.JTextField textMemberLName;
    private javax.swing.JTextField textMemberPhoneNumber;
    private javax.swing.JTextField textMemberStartDate;
    private javax.swing.JTextField textMemberStreet;
    // End of variables declaration//GEN-END:variables
}
