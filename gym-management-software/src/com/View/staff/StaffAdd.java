/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.View.staff;

/**
 *
 * @author diego
 */
public class StaffAdd extends javax.swing.JInternalFrame {

    /**
     * Creates new form StaffNew
     */
    public StaffAdd() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("First name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel2.setText("Last Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 140, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 160, -1));

        jLabel3.setText("Birthday");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jTextField3.setText("yyyy/mm/dd");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 102, -1));

        jLabel4.setText("E-mail");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 230, -1));

        jLabel5.setText("Street / Road");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 296, -1));

        jLabel7.setText("AirCode");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 90, -1));

        jLabel8.setText("Phone Number");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jLabel9.setText("Number");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 60, -1));

        jLabel10.setText("City");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 110, -1));

        jButton1.setText("Register");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 140, 70));
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 170, -1));

        jLabel11.setText("Country");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        jTextField6.setText("Ireland");
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 130, -1));

        jLabel6.setText("ID");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 140, -1));

        jLabel12.setText("Start Date");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jTextField12.setText("yyyy/mm/dd");
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 100, -1));

        jLabel13.setText("Function");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 190, -1));

        jLabel14.setText("Salary");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 110, -1));

        jLabel15.setText("IBAN");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 190, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
