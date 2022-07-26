/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.View;

import com.View.classes.ClassesManagement;
import com.View.members.MembersManagementView;
import com.View.staff.StaffManagementView;
import com.View.users.UsersManagement;

import javax.swing.JInternalFrame;

/**
 *
 * @author diego
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();

    }

    public void windowManagemt(JInternalFrame internalFrame) {
        if (!internalFrame.isVisible()) {
            DesktopPanel.add(internalFrame);
            internalFrame.setVisible(true);
        } else {
            internalFrame.setVisible(true);
            internalFrame.toFront();
            internalFrame.requestFocus();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        DesktopPanel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mainMemberManagement = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mainStaffNew = new javax.swing.JMenuItem();
        mainClassesNew = new javax.swing.JMenu();
        mainClassesAdd = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        mainUsersNew = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        javax.swing.GroupLayout DesktopPanelLayout = new javax.swing.GroupLayout(DesktopPanel);
        DesktopPanel.setLayout(DesktopPanelLayout);
        DesktopPanelLayout.setHorizontalGroup(
            DesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        DesktopPanelLayout.setVerticalGroup(
            DesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Members");

        mainMemberManagement.setText("Management");
        mainMemberManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMemberManagementActionPerformed(evt);
            }
        });
        jMenu3.add(mainMemberManagement);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Staff");

        mainStaffNew.setText("Management");
        mainStaffNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainStaffNewActionPerformed(evt);
            }
        });
        jMenu4.add(mainStaffNew);

        jMenuBar1.add(jMenu4);

        mainClassesNew.setText("Classes");

        mainClassesAdd.setText("Management");
        mainClassesAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainClassesAddActionPerformed(evt);
            }
        });
        mainClassesNew.add(mainClassesAdd);

        jMenuBar1.add(mainClassesNew);

        jMenu6.setText("Options");

        jMenu7.setText("Users");

        mainUsersNew.setText("Options");
        mainUsersNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainUsersNewActionPerformed(evt);
            }
        });
        jMenu7.add(mainUsersNew);

        jMenu6.add(jMenu7);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPanel, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPanel, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        setSize(new java.awt.Dimension(610, 395));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    MembersManagementView membersFrameNew = new MembersManagementView();
    StaffManagementView staffFrameNew = new StaffManagementView();

    ClassesManagement classesFrameAdd = new ClassesManagement();

    UsersManagement usersFrameAdd = new UsersManagement();


    private void mainMemberManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMemberManagementActionPerformed
        windowManagemt(membersFrameNew);
    }//GEN-LAST:event_mainMemberManagementActionPerformed

    private void mainStaffNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainStaffNewActionPerformed
        windowManagemt(staffFrameNew);
    }//GEN-LAST:event_mainStaffNewActionPerformed

    private void mainClassesAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainClassesAddActionPerformed
        windowManagemt(classesFrameAdd);
    }//GEN-LAST:event_mainClassesAddActionPerformed

    private void mainUsersNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainUsersNewActionPerformed
        windowManagemt(usersFrameAdd);
    }//GEN-LAST:event_mainUsersNewActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem mainClassesAdd;
    private javax.swing.JMenu mainClassesNew;
    private javax.swing.JMenuItem mainMemberManagement;
    private javax.swing.JMenuItem mainStaffNew;
    private javax.swing.JMenuItem mainUsersNew;
    // End of variables declaration//GEN-END:variables
}
