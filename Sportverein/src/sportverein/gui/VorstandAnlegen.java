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
import sportverein.Verwaltung;

/**
 *
 * @author steffen
 */
public class VorstandAnlegen extends javax.swing.JPanel {

    /**
     * Creates new form Sportler
     */
    public VorstandAnlegen() {
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
        lbl_gehalt = new javax.swing.JLabel();
        button_speichern = new javax.swing.JButton();
        lbl_gehalt_value = new javax.swing.JLabel();
        slider_gehalt = new javax.swing.JSlider();

        lbl_title.setText("Legen sie eine Vorstand an");

        lbl_allgemeineInfos.setText("Allgemeine Informationen");

        lbl_name.setText("Name");

        txtF_name.setToolTipText("geben Sie den Vorname des Sportlers ein");
        txtF_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtF_nameActionPerformed(evt);
            }
        });

        lbl_nachname.setText("Nachname");

        lbl_geschlecht.setText("Geschlecht");

        comboBox_geschlecht.setModel(ComboBoxModels.getGeschlechter());
        comboBox_geschlecht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_geschlechtActionPerformed(evt);
            }
        });

        lbl_alter.setText("Alter");

        lbl_day.setText("Tag");

        comboBox_day.setModel(ComboBoxModels.getTage());

        lbl_month.setText("Monat");

        comboBox_month.setModel((ComboBoxModels.getMonate()));

        lbl_year.setText("Jahr");

        comboBox_year.setModel(ComboBoxModels.getJahre());

        lbl_sporterInfo.setText("Trainer spezifische Informationen");

        lbl_gehalt.setText("Gehalt");
        lbl_gehalt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lbl_gehaltPropertyChange(evt);
            }
        });

        button_speichern.setText("Speichern");
        button_speichern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_speichernActionPerformed(evt);
            }
        });

        lbl_gehalt_value.setText("0");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(lbl_allgemeineInfos))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_alter)
                                            .addComponent(lbl_geschlecht)
                                            .addComponent(lbl_nachname)
                                            .addComponent(lbl_name))
                                        .addGap(53, 53, 53)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboBox_geschlecht, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtF_nachname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                                                .addComponent(txtF_name, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(comboBox_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbl_day, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(comboBox_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbl_month, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(comboBox_year, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lbl_year, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(lbl_sporterInfo))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lbl_gehalt)
                            .addGap(31, 31, 31)
                            .addComponent(lbl_gehalt_value, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(slider_gehalt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button_speichern)))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(lbl_allgemeineInfos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_name)
                    .addComponent(txtF_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nachname)
                    .addComponent(txtF_nachname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_geschlecht)
                    .addComponent(comboBox_geschlecht, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_alter)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_month)
                                .addComponent(lbl_day))
                            .addComponent(lbl_year, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBox_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboBox_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboBox_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_sporterInfo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_gehalt)
                    .addComponent(lbl_gehalt_value)
                    .addComponent(slider_gehalt, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(button_speichern)
                .addGap(211, 211, 211))
        );
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
        double gehalt = Double.valueOf(lbl_gehalt_value.getText());
        
        System.out.println(name);
        System.out.println(nachname);
        System.out.println(geschlecht);
        System.out.println(geburtstag);
        System.out.println(alter);
        System.out.println(nr);
        System.out.println(gehalt);
        
        System.out.println("Aktuelle Anzahle der Mitglieder: " + Verwaltung.getInstance().getAnzahlMitglieder());
        Verwaltung.getInstance().legeVorstandAn(gehalt, nr, name, nachname, geschlecht, alter, geburtstag);
        
       System.out.println("Neue Anzahle der Mitglieder: " + Verwaltung.getInstance().getAnzahlMitglieder());
        
        
        System.out.println("Hier wird der Code von Karsten kommen und dann wird gespeichert");
    }//GEN-LAST:event_button_speichernActionPerformed

    private void comboBox_geschlechtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_geschlechtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox_geschlechtActionPerformed

    private void txtF_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtF_nameActionPerformed

    private void slider_gehaltStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider_gehaltStateChanged
        // TODO add your handling code here:
        String s = String.valueOf(slider_gehalt.getValue());
        lbl_gehalt_value.setText(s);
    }//GEN-LAST:event_slider_gehaltStateChanged

    private void lbl_gehaltPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lbl_gehaltPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_gehaltPropertyChange

    private void slider_gehaltPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_slider_gehaltPropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_slider_gehaltPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_speichern;
    private javax.swing.JComboBox comboBox_day;
    private javax.swing.JComboBox comboBox_geschlecht;
    private javax.swing.JComboBox comboBox_month;
    private javax.swing.JComboBox comboBox_year;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_allgemeineInfos;
    private javax.swing.JLabel lbl_alter;
    private javax.swing.JLabel lbl_day;
    private javax.swing.JLabel lbl_gehalt;
    private javax.swing.JLabel lbl_gehalt_value;
    private javax.swing.JLabel lbl_geschlecht;
    private javax.swing.JLabel lbl_month;
    private javax.swing.JLabel lbl_nachname;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_sporterInfo;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_year;
    private javax.swing.JSlider slider_gehalt;
    private javax.swing.JTextField txtF_nachname;
    private javax.swing.JTextField txtF_name;
    // End of variables declaration//GEN-END:variables
}