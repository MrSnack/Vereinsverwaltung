/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein.gui.bearbeiten;

import sportverein.gui.datenAusgabe.ListModels;
import sportverein.gui.dialoge.SportartenBearbeitenDialog;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import sportverein.gui.Interfaces.Updatable;
import sportverein.gui.dialoge.SindSieSicherDialog;
import sportverein.handler.Help;
import sportverein.models.Mitglied;
import sportverein.models.Person;
import sportverein.models.Sportart;
import sportverein.models.Sportler;
import sportverein.handler.Verwaltung;

/**
 *
 * @author steffen
 */
public class SportartBeiarbeitenPanel extends javax.swing.JPanel implements Updatable {

    /**
     * Creates new form Sportler
     */
    public SportartBeiarbeitenPanel() {
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

        lbl_sportler = new javax.swing.JLabel();
        scrollPane_sportarten = new javax.swing.JScrollPane();
        list_sportarten = new javax.swing.JList();
        button_loeschen = new javax.swing.JButton();
        lbl_anzahl_sportarten = new javax.swing.JLabel();
        button_bearbeiten1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_sportler.setText("Sportarten");
        add(lbl_sportler, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        list_sportarten.setModel(ListModels.getSportarten());
        list_sportarten.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollPane_sportarten.setViewportView(list_sportarten);

        add(scrollPane_sportarten, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, 270));

        button_loeschen.setText("Löschen");
        button_loeschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_loeschenActionPerformed(evt);
            }
        });
        add(button_loeschen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        lbl_anzahl_sportarten.setText(String.valueOf(Verwaltung.getInstance().getSportart().size()));
        add(lbl_anzahl_sportarten, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        button_bearbeiten1.setText("Bearbeiten");
        button_bearbeiten1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_bearbeiten1ActionPerformed(evt);
            }
        });
        add(button_bearbeiten1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void button_loeschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_loeschenActionPerformed
        // TODO add your handling code here:

        try {
            String sportartBez = (String) list_sportarten.getSelectedValue();
            if (sportartBez != null) {
                Sportart s = Verwaltung.getInstance().findSportart(sportartBez);
                if (Verwaltung.getInstance().getSportart().contains(s)) {
                    SindSieSicherDialog dialog = new SindSieSicherDialog(new javax.swing.JFrame(), true, "Möchten Sie dieses Mitglied \n" + s.getName() + "\n wirklich löschen?");
                    if (dialog.showDialog()) {
                        Verwaltung.getInstance().getSportler().remove(s);
                        this.updateViews();
                    }
                }
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Bitte wählen sie eine Sportart aus");
        }


    }//GEN-LAST:event_button_loeschenActionPerformed

    private void button_bearbeiten1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_bearbeiten1ActionPerformed
        String sportartBez = (String) list_sportarten.getSelectedValue();
        Sportart s = Verwaltung.getInstance().findSportart(sportartBez);
        SportartenBearbeitenDialog dialog = new SportartenBearbeitenDialog(new javax.swing.JFrame(), true, s);
        if (dialog.showDialog()) {
            updateViews();
        }
    }//GEN-LAST:event_button_bearbeiten1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_bearbeiten1;
    private javax.swing.JButton button_loeschen;
    private javax.swing.JLabel lbl_anzahl_sportarten;
    private javax.swing.JLabel lbl_sportler;
    private javax.swing.JList list_sportarten;
    private javax.swing.JScrollPane scrollPane_sportarten;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateViews() {
        list_sportarten.setModel(ListModels.getSportarten());
        lbl_anzahl_sportarten.setText(String.valueOf(Verwaltung.getInstance().getSportart().size()));
    }
}
