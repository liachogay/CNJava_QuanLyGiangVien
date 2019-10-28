/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Phi Ngo
 */
public class Round2 extends javax.swing.JFrame {

    /**
     * Creates new form Round2
     */
    public Round2() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPhase_Round2 = new javax.swing.JTextField();
        jRad1_round2 = new javax.swing.JRadioButton();
        jRad2_round2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPhase_Round2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhase_Round2ActionPerformed(evt);
            }
        });

        jButton1.setText("Trả lời");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Câu tiếp theo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Kết quả");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jRad1_round2)
                        .addGap(40, 40, 40)
                        .addComponent(jRad2_round2)
                        .addGap(54, 54, 54)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(txtPhase_Round2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtPhase_Round2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRad1_round2)
                            .addComponent(jRad2_round2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhase_Round2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhase_Round2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhase_Round2ActionPerformed
    
    public int countSpace = 2;
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        countSpace+=2;
        File file1 = new File("/Users/virgin/Desktop/CNJava_QuanLyGiangVien/Card/src/card/DataSpaceRound2.txt");
        Scanner sc1 = null;
        try {
            sc1 = new Scanner(file1);
            for (int i = 1 ; i <= countSpace; i++){
                if (i < countSpace){
                    sc1.hasNextLine();
                    jRad1_round2.setText(sc1.nextLine());
                }
                else if (i == countSpace){
                    sc1.hasNextLine();
                    txtPhase_Round2.setText(sc1.nextLine());
                }
                else{
                    sc1.hasNextLine();
                    sc1.nextLine();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Round2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public int countFull = 0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (countFull < countSpace - countFull){
            countFull++;
            File file1 = new File("/Users/virgin/Desktop/CNJava_QuanLyGiangVien/Card/src/card/DataFullRound2.txt");
            Scanner sc1 = null;
            try {
                sc1 = new Scanner(file1);
                for (int i = 0 ; i < countFull; i++){
                    if (i<countFull){
                        sc1.hasNextLine();
                        txtPhase_Round2.setText(sc1.nextLine());
                    }
                    else{
                        sc1.hasNextLine();
                        sc1.nextLine();
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Round2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
    private void init(){
        File file = new File("/Users/virgin/Desktop/CNJava_QuanLyGiangVien/Card/src/card/DataSpaceRound2.txt"); 
                Scanner sc = null; 
                try {
                    sc = new Scanner(file);
                    sc.hasNextLine();
                    jRad1_round2.setText(sc.nextLine());
                    txtPhase_Round2.setText(sc.nextLine());
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Round2.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
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
            java.util.logging.Logger.getLogger(Round2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Round2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Round2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Round2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Round2().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JRadioButton jRad1_round2;
    private javax.swing.JRadioButton jRad2_round2;
    private javax.swing.JTextField txtPhase_Round2;
    // End of variables declaration//GEN-END:variables
}