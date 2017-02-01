/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein.gui.anlegen;

import sportverein.gui.datenAusgabe.ComboBoxModels;
import sportverein.gui.datenAusgabe.ListModels;
import sportverein.gui.Interfaces.Updatable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
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
public class SchiedsrichterAnlegenPanel extends javax.swing.JPanel  implements Updatable{
    public ArrayList<Sportart> sportartenVonSchiedsrichter = new ArrayList<Sportart>();
    Sportart sportartAusgewählt;
    /**
     * Creates new form Sportler
     */
    public SchiedsrichterAnlegenPanel() {
        initComponents();
        combo_sportart1.setModel(ComboBoxModels.getSportarten());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_title = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lbl_allgemeineInfos = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        txtF_name = new javax.swing.JTextField();
        lbl_nachname = new javax.swing.JLabel();
        txtF_nachname = new javax.swing.JTextField();
        lbl_geschlecht = new javax.swing.JLabel();
        comboBox_geschlecht = new javax.swing.JComboBox();
        lbl_alter = new javax.swing.JLabel();
        lbl_day = new javax.swing.JLabel();
        comboBox_day = new javax.swing.JComboBox();
        lbl_month = new javax.swing.JLabel();
        comboBox_month = new javax.swing.JComboBox();
        lbl_year = new javax.swing.JLabel();
        comboBox_year = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_sporterInfo = new javax.swing.JLabel();
        button_speichern = new javax.swing.JButton();
        lbl_gehalt3 = new javax.swing.JLabel();
        lbl_gehalt_value = new javax.swing.JLabel();
        slider_gehalt = new javax.swing.JSlider();
        combo_sportart1 = new javax.swing.JComboBox<>();
        lbl_sportart1 = new javax.swing.JLabel();

        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_title.setText("Legen sie einen Schiedsrichter an");
        add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 6, 404, 44));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 56, 591, -1));

        lbl_allgemeineInfos.setText("Allgemeine Informationen");
        add(lbl_allgemeineInfos, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 74, -1, -1));

        lbl_name.setText("Name");
        add(lbl_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 110, -1, -1));

        txtF_name.setToolTipText("geben Sie den Vorname des Sportlers ein");
        txtF_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtF_nameActionPerformed(evt);
            }
        });
        add(txtF_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 469, -1));

        lbl_nachname.setText("Nachname");
        add(lbl_nachname, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 152, -1, -1));
        add(txtF_nachname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 147, 469, -1));

        lbl_geschlecht.setText("Geschlecht");
        add(lbl_geschlecht, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 195, -1, -1));

        comboBox_geschlecht.setModel(ComboBoxModels.getGeschlechter());
        comboBox_geschlecht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_geschlechtActionPerformed(evt);
            }
        });
        add(comboBox_geschlecht, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 191, -1, -1));

        lbl_alter.setText("Alter");
        add(lbl_alter, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 236, -1, -1));

        lbl_day.setText("Tag");
        add(lbl_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 236, 85, -1));

        comboBox_day.setModel(ComboBoxModels.getTage());
        add(comboBox_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        lbl_month.setText("Monat");
        add(lbl_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 236, 85, -1));

        comboBox_month.setModel((ComboBoxModels.getMonate()));
        add(comboBox_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 270, -1, -1));

        lbl_year.setText("Jahr");
        add(lbl_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 236, 110, -1));

        comboBox_year.setModel(ComboBoxModels.getJahre());
        add(comboBox_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 270, 110, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 303, 591, 10));

        lbl_sporterInfo.setText("Schiedsrichter spezifische Informationen");
        add(lbl_sporterInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 319, -1, -1));

        button_speichern.setText("Speichern");
        button_speichern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_speichernActionPerformed(evt);
            }
        });
        add(button_speichern, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 610, -1, -1));

        lbl_gehalt3.setText("Gehalt");
        lbl_gehalt3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lbl_gehalt3PropertyChange(evt);
            }
        });
        add(lbl_gehalt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        lbl_gehalt_value.setText("0");
        add(lbl_gehalt_value, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        slider_gehalt.setMaximum(100000);
        slider_gehalt.setValue(0);
        slider_gehalt.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider_gehaltStateChanged(evt);
            }
        });
        slider_gehalt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                slider_gehaltPropertyChange(evt);
            }
        });
        add(slider_gehalt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 390, -1));

        combo_sportart1.setModel(ComboBoxModels.getSportarten());
        combo_sportart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_sportart1ActionPerformed(evt);
            }
        });
        add(combo_sportart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 140, 20));

        lbl_sportart1.setText("Sportart");
        add(lbl_sportart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void button_speichernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_speichernActionPerformed
        // TODO add your handling code here:
        // 
        String name = txtF_name.getText();
        String nachname = txtF_nachname.getText();
        char geschlecht = 'm';
        if (comboBox_geschlecht.getSelectedIndex() == 1) {
            geschlecht = 'w';
        }
      
        Integer tag = (Integer) comboBox_day.getSelectedItem();
        Integer monat = (Integer) comboBox_month.getSelectedItem();
        Integer jahr = (Integer) comboBox_year.getSelectedItem(); 
        String geburtstag = tag + "." + monat + "." + jahr;
        
        int alter = Help.alterAusDatumString(geburtstag);
      
        int nr = Mitglied.getNaechsteNr();
        Sportart sportart;
        String sportartBez = (String) combo_sportart1.getSelectedItem();
        sportart = Verwaltung.getInstance().findSportart(sportartBez);
        
        
        int gehalt = slider_gehalt.getValue();
        
       
        System.out.println(name);
        System.out.println(nachname);
        System.out.println(geschlecht);
        System.out.println(geburtstag);
        System.out.println(alter);
        System.out.println(nr);
        
        
        System.out.println("Aktuelle Anzahle der Mitglieder: " + Verwaltung.getInstance().getAnzahlMitglieder());
        
        Verwaltung.getInstance().legeSchiedsrichterAn(gehalt, sportart, name, nachname, geschlecht, alter, geburtstag);
        
       System.out.println("Neue Anzahle der Mitglieder: " + Verwaltung.getInstance().getAnzahlMitglieder());
        
        
        System.out.println("Hier wird der Code von Karsten kommen und dann wird gespeichert");
    }//GEN-LAST:event_button_speichernActionPerformed

    private void comboBox_geschlechtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_geschlechtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox_geschlechtActionPerformed

    private void txtF_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtF_nameActionPerformed

    private void lbl_gehalt3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lbl_gehalt3PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_gehalt3PropertyChange

    private void slider_gehaltStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider_gehaltStateChanged
        // TODO add your handling code here:
        String s = String.valueOf(slider_gehalt.getValue());
        lbl_gehalt_value.setText(s);
    }//GEN-LAST:event_slider_gehaltStateChanged

    private void slider_gehaltPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_slider_gehaltPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_slider_gehaltPropertyChange

    private void combo_sportart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_sportart1ActionPerformed
        
    }//GEN-LAST:event_combo_sportart1ActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        updateViews();
    }//GEN-LAST:event_formFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_speichern;
    private javax.swing.JComboBox comboBox_day;
    private javax.swing.JComboBox comboBox_geschlecht;
    private javax.swing.JComboBox comboBox_month;
    private javax.swing.JComboBox comboBox_year;
    private javax.swing.JComboBox<String> combo_sportart1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_allgemeineInfos;
    private javax.swing.JLabel lbl_alter;
    private javax.swing.JLabel lbl_day;
    private javax.swing.JLabel lbl_gehalt;
    private javax.swing.JLabel lbl_gehalt1;
    private javax.swing.JLabel lbl_gehalt2;
    private javax.swing.JLabel lbl_gehalt3;
    private javax.swing.JLabel lbl_gehalt_value;
    private javax.swing.JLabel lbl_geschlecht;
    private javax.swing.JLabel lbl_month;
    private javax.swing.JLabel lbl_nachname;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_sportart1;
    private javax.swing.JLabel lbl_sporterInfo;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_year;
    private javax.swing.JSlider slider_gehalt;
    private javax.swing.JTextField txtF_nachname;
    private javax.swing.JTextField txtF_name;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateViews() {
        combo_sportart1.setModel(ComboBoxModels.getSportarten());
    }
}