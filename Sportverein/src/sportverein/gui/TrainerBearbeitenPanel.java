/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein.gui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import sportverein.Help;
import sportverein.Mitglied;
import sportverein.Person;
import sportverein.Sportart;
import sportverein.Sportler;
import sportverein.Trainer;
import sportverein.Verwaltung;

/**
 *
 * @author steffen
 */
public class TrainerBearbeitenPanel extends javax.swing.JPanel {

    /**
     * Creates new form Sportler
     */
    public TrainerBearbeitenPanel() {
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

        lbl_trainer = new javax.swing.JLabel();
        scrollPane_sportarten = new javax.swing.JScrollPane();
        list_trainer = new javax.swing.JList();
        button_bearbeiten = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_trainer.setText("Trainer");
        add(lbl_trainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        list_trainer.setModel(ListModels.getTrainer());
        list_trainer.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollPane_sportarten.setViewportView(list_trainer);

        add(scrollPane_sportarten, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, 270));

        button_bearbeiten.setText("Bearbeiten");
        button_bearbeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_bearbeitenActionPerformed(evt);
            }
        });
        add(button_bearbeiten, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void button_bearbeitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_bearbeitenActionPerformed
        // TODO add your handling code here:
        Trainer t = (Trainer) list_trainer.getSelectedValue();
        
        TrainerBearbeitenDialog dialog = new TrainerBearbeitenDialog(new javax.swing.JFrame(), true, t);        
        dialog.setVisible(true);
    }//GEN-LAST:event_button_bearbeitenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_bearbeiten;
    private javax.swing.JLabel lbl_trainer;
    private javax.swing.JList list_trainer;
    private javax.swing.JScrollPane scrollPane_sportarten;
    // End of variables declaration//GEN-END:variables
}