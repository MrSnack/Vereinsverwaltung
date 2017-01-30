/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein.gui;

import java.util.ArrayList;
import sportverein.*;

/**
 *
 * @author steffen
 */
public class TrainerWerdenDialog extends javax.swing.JDialog {
    Mitglied mitglied;
    /**
     * Creates new form SportlerWerdenDialog
     */
    public TrainerWerdenDialog(java.awt.Frame parent, boolean modal, Mitglied mitglied) {
        super(parent, modal);
        this.mitglied = mitglied;
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

        lbl_Vorname = new javax.swing.JLabel();
        button_speichern = new javax.swing.JButton();
        lbl_TrainerInfo = new javax.swing.JLabel();
        lbl_Nachname = new javax.swing.JLabel();
        lbl_Entgelt = new javax.swing.JLabel();
        lbl_Siege = new javax.swing.JLabel();
        lbl_siege_value = new javax.swing.JLabel();
        slider_siege = new javax.swing.JSlider();
        lbl_entgelt_value = new javax.swing.JLabel();
        slider_entgelt = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl_Vorname.setText(this.mitglied.getName());

        button_speichern.setText("Speichern");
        button_speichern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_speichernActionPerformed(evt);
            }
        });

        lbl_TrainerInfo.setText("Trainer spezifische Informationen");

        lbl_Nachname.setText(this.mitglied.getNachname());

        lbl_Entgelt.setText("Entgelt");

        lbl_Siege.setText("Siege");

        lbl_siege_value.setText("0");

        slider_siege.setMaximum(1000);
        slider_siege.setValue(0);
        slider_siege.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider_siegeStateChanged(evt);
            }
        });

        lbl_entgelt_value.setText("0");

        slider_entgelt.setMaximum(10000);
        slider_entgelt.setValue(0);
        slider_entgelt.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider_entgeltStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(button_speichern)
                        .addContainerGap(246, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_TrainerInfo)
                            .addComponent(lbl_Vorname)
                            .addComponent(lbl_Nachname, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(296, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_Entgelt)
                            .addGap(31, 31, 31)
                            .addComponent(lbl_entgelt_value, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(slider_entgelt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_Siege)
                            .addGap(42, 42, 42)
                            .addComponent(lbl_siege_value, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(slider_siege, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_Vorname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Nachname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(lbl_TrainerInfo)
                .addGap(216, 216, 216)
                .addComponent(button_speichern)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(170, 170, 170)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_Entgelt)
                        .addComponent(lbl_entgelt_value)
                        .addComponent(slider_entgelt, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(25, 25, 25)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Siege)
                            .addComponent(lbl_siege_value))
                        .addComponent(slider_siege, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(171, Short.MAX_VALUE)))
        );

        lbl_Nachname.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_speichernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_speichernActionPerformed
        // TODO add your handling code here:
        //
        
        String name = mitglied.getName();
        String nachname = mitglied.getNachname();
        char geschlecht = mitglied.getGeschlecht();
        String geburtstag = mitglied.getGeburtstag();
        int alter = mitglied.getAlter();
        int nr = mitglied.getNr();
        double entgelt = slider_entgelt.getValue();
        double siege = slider_siege.getValue();

        System.out.println("Aktuelle Anzahle der Mitglieder: " + Verwaltung.getInstance().getAnzahlMitglieder());
        Verwaltung.getInstance().legeTrainerAn(entgelt, siege, nr, name, nachname, geschlecht, alter, geburtstag);

        System.out.println("Neue Anzahle der Mitglieder: " + Verwaltung.getInstance().getAnzahlMitglieder());

        System.out.println("Hier wird der Code von Karsten kommen und dann wird gespeichert");
        
    }//GEN-LAST:event_button_speichernActionPerformed

    private void slider_siegeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider_siegeStateChanged
        // TODO add your handling code here:
        String s = String.valueOf(slider_siege.getValue());
        lbl_siege_value.setText(s);
    }//GEN-LAST:event_slider_siegeStateChanged

    private void slider_entgeltStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider_entgeltStateChanged
        // TODO add your handling code here:
        String s = String.valueOf(slider_entgelt.getValue());
        lbl_entgelt_value.setText(s);
    }//GEN-LAST:event_slider_entgeltStateChanged

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
            java.util.logging.Logger.getLogger(TrainerWerdenDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainerWerdenDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainerWerdenDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainerWerdenDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TrainerWerdenDialog dialog = new TrainerWerdenDialog(new javax.swing.JFrame(), true, new Mitglied());
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_speichern;
    private javax.swing.JLabel lbl_Entgelt;
    private javax.swing.JLabel lbl_Nachname;
    private javax.swing.JLabel lbl_Siege;
    private javax.swing.JLabel lbl_TrainerInfo;
    private javax.swing.JLabel lbl_Vorname;
    private javax.swing.JLabel lbl_entgelt_value;
    private javax.swing.JLabel lbl_siege_value;
    private javax.swing.JSlider slider_entgelt;
    private javax.swing.JSlider slider_siege;
    // End of variables declaration//GEN-END:variables
}