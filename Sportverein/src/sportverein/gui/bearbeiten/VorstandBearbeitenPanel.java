/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein.gui.bearbeiten;

import sportverein.gui.datenAusgabe.ListModels;
import sportverein.gui.Interfaces.Updatable;
import sportverein.gui.dialoge.VorstandBearbeitenDialog;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import sportverein.handler.Help;
import sportverein.models.Mitglied;
import sportverein.models.Person;
import sportverein.models.Sportart;
import sportverein.models.Sportler;
import sportverein.models.Trainer;
import sportverein.handler.Verwaltung;
import sportverein.models.Vorstand;

/**
 *
 * @author steffen
 */
public class VorstandBearbeitenPanel extends javax.swing.JPanel implements Updatable{

    /**
     * Creates new form Sportler
     */
    public VorstandBearbeitenPanel() {
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

        scrollPane_sportarten = new javax.swing.JScrollPane();
        list_vorstand = new javax.swing.JList();
        button_bearbeiten = new javax.swing.JButton();
        lbl_vorstandsmitglieder = new javax.swing.JLabel();
        lbl_anzahl_vorstandsmitglieder = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        list_vorstand.setModel(ListModels.getVorstand());
        list_vorstand.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollPane_sportarten.setViewportView(list_vorstand);

        add(scrollPane_sportarten, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, 270));

        button_bearbeiten.setText("Bearbeiten");
        button_bearbeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_bearbeitenActionPerformed(evt);
            }
        });
        add(button_bearbeiten, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        lbl_vorstandsmitglieder.setText("Vorstandsmitglieder");
        add(lbl_vorstandsmitglieder, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        lbl_anzahl_vorstandsmitglieder.setText(String.valueOf(Verwaltung.getInstance().getVorstand().size()));
        lbl_anzahl_vorstandsmitglieder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_anzahl_vorstandsmitgliederMouseEntered(evt);
            }
        });
        add(lbl_anzahl_vorstandsmitglieder, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void button_bearbeitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_bearbeitenActionPerformed
        
        
        try {
            String vorstandInfo = (String )list_vorstand.getSelectedValue();
             int nr = Help.getMitgliedNrVonInfoString(vorstandInfo);
        Vorstand v = Verwaltung.getInstance().findVorstand(nr);
        VorstandBearbeitenDialog dialog = new VorstandBearbeitenDialog(new javax.swing.JFrame(), true, v);        
        
         if (dialog.showDialog()) {
                updateViews();
           }
        } catch (NullPointerException e) {
            System.out.println("Zeige Dialog");
           JOptionPane.showMessageDialog(null, "Bitte wählen sie ein Vorstandsmitglied aus.");
        }
        
    }//GEN-LAST:event_button_bearbeitenActionPerformed

    private void lbl_anzahl_vorstandsmitgliederMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_anzahl_vorstandsmitgliederMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_anzahl_vorstandsmitgliederMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_bearbeiten;
    private javax.swing.JLabel lbl_anzahl_vorstandsmitglieder;
    private javax.swing.JLabel lbl_vorstandsmitglieder;
    private javax.swing.JList list_vorstand;
    private javax.swing.JScrollPane scrollPane_sportarten;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateViews() {
       list_vorstand.setModel(ListModels.getVorstand());
       lbl_anzahl_vorstandsmitglieder.setText(String.valueOf(Verwaltung.getInstance().getVorstand().size()));
    }
}
