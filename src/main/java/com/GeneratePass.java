/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author MAYANK MISHRA
 */
public class GeneratePass extends javax.swing.JFrame {

    /**
     * Creates new form GeneratePass
     */
    public GeneratePass() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Capital = new javax.swing.JCheckBox();
        Small = new javax.swing.JCheckBox();
        Numbers = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        Symbols = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 36)); // NOI18N
        jLabel3.setText("SELECT REQUIREMENTS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 350, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 60));

        Capital.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        Capital.setForeground(new java.awt.Color(51, 255, 255));
        Capital.setText("CAPITAL LETTERS");
        Capital.setFocusable(false);
        Capital.setPreferredSize(new java.awt.Dimension(150, 50));
        Capital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapitalActionPerformed(evt);
            }
        });
        getContentPane().add(Capital, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 150, 30));

        Small.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        Small.setForeground(new java.awt.Color(0, 255, 255));
        Small.setText("SMALL LETTERS");
        Small.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmallActionPerformed(evt);
            }
        });
        getContentPane().add(Small, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        Numbers.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        Numbers.setForeground(new java.awt.Color(0, 255, 255));
        Numbers.setText("NUMBERS\n");
        Numbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumbersActionPerformed(evt);
            }
        });
        getContentPane().add(Numbers, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 20));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        Symbols.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        Symbols.setForeground(new java.awt.Color(0, 255, 255));
        Symbols.setText("SYMBOL\n");
        Symbols.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SymbolsActionPerformed(evt);
            }
        });
        getContentPane().add(Symbols, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 30));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("GENERATED PASSWORD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 290, 60));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 270, -1));

        jButton4.setBackground(new java.awt.Color(0, 255, 255));
        jButton4.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 14)); // NOI18N
        jButton4.setText("COPY");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 14)); // NOI18N
        jButton1.setText("GENERATE\n");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\SEM 3 project\\horizontal.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 700, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CapitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CapitalActionPerformed

    private void SmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SmallActionPerformed

    private void SymbolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SymbolsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SymbolsActionPerformed

    private void NumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumbersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumbersActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int numDigits = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of digits:"));
        StringBuilder password = new StringBuilder();

        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*().[];:~";

        String characters = "";

        if (Capital.isSelected()) {
            characters += capitalLetters;
        }
        if (Small.isSelected()) {
            characters += smallLetters;
        }
        if (Numbers.isSelected()) {
            characters += numbers;
        }
        if (Symbols.isSelected()) {
            characters += symbols;
        }

        Random random = new Random();

        for (int i = 0; i < numDigits; i++) {
            int randomIndex = random.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));
        }

        jTextField1.setText(password.toString());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.toBack();
        setVisible(false);             // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
             String text = jTextField1.getText();
                StringSelection selection = new StringSelection(text);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(selection, null);
                JOptionPane.showMessageDialog(this, "Text copied to clipboard!");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(GeneratePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneratePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneratePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneratePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneratePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Capital;
    private javax.swing.JCheckBox Numbers;
    private javax.swing.JCheckBox Small;
    private javax.swing.JCheckBox Symbols;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
