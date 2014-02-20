/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jetsetmagazine.gui;

import edu.jetsetmagazine.dao.SoireeDAO;
import edu.jetsetmagazine.entities.Soiree;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Talel
 */
public class AjoutSoiree extends javax.swing.JFrame {

    /**
     * Creates new form AjoutSoiree
     */
    public AjoutSoiree() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFNom_soiree = new javax.swing.JTextField();
        jTFdate_soiree = new javax.swing.JTextField();
        jTFAdresse_soiree = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAdescriptionsoiree = new javax.swing.JTextArea();
        jBvalider = new javax.swing.JButton();
        jBreset = new javax.swing.JButton();
        jBannuler = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(750, 445));

        jLabel1.setText("Ajouter une soirée :");

        jLabel2.setText("Nom soirée :");

        jLabel3.setText("Description soirée :");

        jLabel4.setText("Date soirée :");

        jLabel5.setText("Adresse soirée :");

        jTFNom_soiree.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTFNom_soiree.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFNom_soiree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNom_soireeActionPerformed(evt);
            }
        });

        jTFdate_soiree.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTFdate_soiree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFdate_soireeActionPerformed(evt);
            }
        });

        jTFAdresse_soiree.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTFAdresse_soiree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFAdresse_soireeActionPerformed(evt);
            }
        });

        jTAdescriptionsoiree.setColumns(20);
        jTAdescriptionsoiree.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTAdescriptionsoiree.setRows(5);
        jScrollPane2.setViewportView(jTAdescriptionsoiree);

        jBvalider.setText("Valider l'ajout");
        jBvalider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBvalider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvaliderActionPerformed(evt);
            }
        });

        jBreset.setText("Reset");
        jBreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBresetActionPerformed(evt);
            }
        });

        jBannuler.setText("Annuler");
        jBannuler.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jBannuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBannulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNom_soiree, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFdate_soiree, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFAdresse_soiree, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(226, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBvalider)
                .addGap(18, 18, 18)
                .addComponent(jBreset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBannuler)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNom_soiree, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFdate_soiree, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFAdresse_soiree, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBvalider)
                    .addComponent(jBreset)
                    .addComponent(jBannuler))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNom_soireeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNom_soireeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNom_soireeActionPerformed

    private void jTFdate_soireeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFdate_soireeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFdate_soireeActionPerformed

    private void jBvaliderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvaliderActionPerformed
        // TODO add your handling code here:
        String nomsoiree;
        String discriptionsoiree;
        String datesoiree;
        String adressesoiree;
        nomsoiree=jTFNom_soiree.getText();
        discriptionsoiree=jTAdescriptionsoiree.getText();
        adressesoiree=jTFAdresse_soiree.getText();
        datesoiree=jTFdate_soiree.getText();
        
        String annee=datesoiree.substring(0, 4);
        int an=Integer.parseInt(annee);
        String month;
        month = datesoiree.substring(5, 7);
        int mon;
        mon = Integer.parseInt(month);
        String dd=datesoiree.substring(8, 10);
        int day;        
        day = Integer.parseInt(dd);
        Date date=new Date(an, mon, day);
        
        SoireeDAO soireedao=new SoireeDAO();
        Soiree s=new Soiree();
        s.setNom_soiree(nomsoiree);
        s.setDescription_soiree(discriptionsoiree);
        s.setDate_soiree(date);
        s.setAdresse_soiree(adressesoiree);
        
            
        if(s == null)
        {
           JOptionPane.showMessageDialog(this,"Ajout failed  remplissez les champ de saisie !!!","Ajout soiree",JOptionPane.ERROR_MESSAGE);    
        }
        else
        {
            soireedao.insertSoiree(s); 
            JOptionPane.showMessageDialog(this,"Ajout effectuée avec succée :");
        
        }    
        
        
        
    }//GEN-LAST:event_jBvaliderActionPerformed

    private void jTFAdresse_soireeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFAdresse_soireeActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jTFAdresse_soireeActionPerformed

    private void jBannulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBannulerActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_jBannulerActionPerformed

    private void jBresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBresetActionPerformed
        // TODO add your handling code here:
        jTFNom_soiree.setText("");
        jTAdescriptionsoiree.setText("");
        jTFdate_soiree.setText("");
        jTFAdresse_soiree.setText("");
        
    }//GEN-LAST:event_jBresetActionPerformed

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
            java.util.logging.Logger.getLogger(AjoutSoiree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutSoiree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutSoiree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutSoiree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutSoiree().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBannuler;
    private javax.swing.JButton jBreset;
    private javax.swing.JButton jBvalider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTAdescriptionsoiree;
    private javax.swing.JTextField jTFAdresse_soiree;
    private javax.swing.JTextField jTFNom_soiree;
    private javax.swing.JTextField jTFdate_soiree;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
