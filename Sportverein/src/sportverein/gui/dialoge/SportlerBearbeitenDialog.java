/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein.gui.dialoge;

import sportverein.handler.Help;
import sportverein.handler.Verwaltung;
import sportverein.models.Sportler;
import sportverein.models.Sportart;
import sportverein.models.Mannschaft;
import java.util.ArrayList;
import sportverein.*;
import sportverein.gui.datenAusgabe.ComboBoxModels;
import sportverein.gui.datenAusgabe.ListModels;

/**
 *
 * @author steffen
 */
public class SportlerBearbeitenDialog extends javax.swing.JDialog {
    Sportler sportler;
    public ArrayList<Sportart> sportartenVonSportler;
    public boolean didSave;
    /**
     * Creates new form SportlerWerdenDialog
     */
    public SportlerBearbeitenDialog(java.awt.Frame parent, boolean modal, Sportler sportler) {
        super(parent, modal);
        this.sportler = sportler;
        initComponents();
        setLocationRelativeTo(parent);
        pack();
        
        txtF_name.setText(sportler.getName());
        txtF_nachname.setText(sportler.getNachname());
        if (sportler.getGeschlecht()== 'm'){
            comboBox_geschlecht.setSelectedIndex(0);
        }
        if (sportler.getGeschlecht()== 'w'){
            comboBox_geschlecht.setSelectedIndex(1);
        }
        //Geburtstag
        int tag = 0;
        int monat = 0;
        int jahr = 0;
        
        
        String[] s = sportler.getGeburtstag().split("\\.");
        
        tag = Integer.parseInt(s[0]);
        monat = Integer.parseInt(s[1]);
        jahr = Integer.parseInt(s[2]);
        comboBox_day.setSelectedItem(tag);
        comboBox_month.setSelectedItem(monat);
        comboBox_year.setSelectedItem(jahr);
        checkbox_verletzt.setSelected(sportler.isVerletzt());
        comboBox_spielstaerke.setSelectedItem(sportler.getSpielstärke());
        
        sportartenVonSportler = sportler.getSportarten();
        list_sportarten_sportler.setModel(ListModels.setSportarten(sportartenVonSportler));
        
    }
    
    public boolean showDialog() {
        this.setVisible(true);
        return didSave;
    }
    
    public void cancel() {
        this.setVisible(false);
        dispose();
        this.didSave = false;
    }
    
    public void save() {
        this.setVisible(false);
        dispose();
        this.didSave = true;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_sportarten = new javax.swing.JLabel();
        lbl_verletzt = new javax.swing.JLabel();
        checkbox_verletzt = new javax.swing.JCheckBox();
        lbl_spielstaerke = new javax.swing.JLabel();
        comboBox_spielstaerke = new javax.swing.JComboBox();
        button_speichern = new javax.swing.JButton();
        lbl_sporterInfo = new javax.swing.JLabel();
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
        button_abbrechen = new javax.swing.JButton();
        scrollPane_sportarten = new javax.swing.JScrollPane();
        list_sportarten_sportler = new javax.swing.JList();
        scrollPane_sportarten1 = new javax.swing.JScrollPane();
        list_sportarten = new javax.swing.JList();
        btn_nachRechts = new javax.swing.JButton();
        btn_nachLinks1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl_sportarten.setText("Sportarten");

        lbl_verletzt.setText("Verletzt");

        checkbox_verletzt.setText("ja");
        checkbox_verletzt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_verletztActionPerformed(evt);
            }
        });

        lbl_spielstaerke.setText("Spielstärke");

        comboBox_spielstaerke.setModel(ComboBoxModels.getSpielstaerke());

        button_speichern.setText("Speichern");
        button_speichern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_speichernActionPerformed(evt);
            }
        });

        lbl_sporterInfo.setText("Sportler spezifische Informationen");

        lbl_title.setText("Bearbeiten sie einen Sportler ");

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

        button_abbrechen.setText("Abbrechen");
        button_abbrechen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_abbrechenActionPerformed(evt);
            }
        });

        list_sportarten_sportler.setModel(ListModels.getSportarten());
        list_sportarten_sportler.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollPane_sportarten.setViewportView(list_sportarten_sportler);

        list_sportarten.setModel(ListModels.getSportarten());
        list_sportarten.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollPane_sportarten1.setViewportView(list_sportarten);

        btn_nachRechts.setText("--->");
        btn_nachRechts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nachRechtsActionPerformed(evt);
            }
        });

        btn_nachLinks1.setText("<---");
        btn_nachLinks1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nachLinks1ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_sporterInfo)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_alter)
                                            .addComponent(lbl_geschlecht)
                                            .addComponent(lbl_nachname)
                                            .addComponent(lbl_name))
                                        .addGap(53, 53, 53)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboBox_geschlecht, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtF_nachname, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtF_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_allgemeineInfos))
                        .addGap(115, 123, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_sportarten)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(button_speichern)
                                .addGap(83, 83, 83)
                                .addComponent(button_abbrechen)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(scrollPane_sportarten1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_nachRechts, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_nachLinks1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addComponent(scrollPane_sportarten, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(122, 122, 122)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboBox_spielstaerke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checkbox_verletzt)))
                                    .addComponent(lbl_spielstaerke)
                                    .addComponent(lbl_verletzt))
                                .addGap(43, 43, 43))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_allgemeineInfos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkbox_verletzt)
                                    .addComponent(lbl_verletzt))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_spielstaerke)
                                    .addComponent(comboBox_spielstaerke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbl_sportarten)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(scrollPane_sportarten1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btn_nachRechts)
                                .addGap(21, 21, 21)
                                .addComponent(btn_nachLinks1))
                            .addComponent(scrollPane_sportarten, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_speichern)
                    .addComponent(button_abbrechen))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkbox_verletztActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_verletztActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkbox_verletztActionPerformed

    private void button_speichernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_speichernActionPerformed
      
       sportler.setSportarten(sportartenVonSportler);
        sportler.setVerletzt(checkbox_verletzt.isSelected());
        sportler.setSpielstärke(Double.parseDouble(String.valueOf(comboBox_spielstaerke.getSelectedItem())));
        sportler.setName(txtF_name.getText());
        sportler.setNachname(txtF_nachname.getText());
        if (comboBox_geschlecht.getSelectedIndex()==0){
            sportler.setGeschlecht('m');
        }
        if (comboBox_geschlecht.getSelectedIndex()==1){
            sportler.setGeschlecht('w');
        }
        Integer tag = (Integer) comboBox_day.getSelectedItem();
        Integer monat = (Integer) comboBox_month.getSelectedItem();
        Integer jahr = (Integer) comboBox_year.getSelectedItem(); 
        String geburtstag = tag + "." + monat + "." + jahr;
        sportler.setGeburtstag(geburtstag);
        int alter = Help.alterAusDatumString(geburtstag);
        sportler.setAlter(alter);
        
        if (Verwaltung.getInstance().getSportler().contains(sportler)){
            Verwaltung.getInstance().getSportler().remove(sportler);
            Verwaltung.getInstance().getSportler().add(sportler);
        }
        System.out.println(sportler.toString());
        save();
        
    }//GEN-LAST:event_button_speichernActionPerformed

    private void txtF_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtF_nameActionPerformed

    private void comboBox_geschlechtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_geschlechtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox_geschlechtActionPerformed

    private void button_abbrechenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_abbrechenActionPerformed
        cancel();
    }//GEN-LAST:event_button_abbrechenActionPerformed

    private void btn_nachRechtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nachRechtsActionPerformed
        String sportartName = (String )list_sportarten.getSelectedValue();

        Sportart sportart = Verwaltung.getInstance().findSportart(sportartName);
        sportartenVonSportler.add(sportart);
        list_sportarten_sportler.setModel(ListModels.setSportarten(sportartenVonSportler));
    }//GEN-LAST:event_btn_nachRechtsActionPerformed

    private void btn_nachLinks1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nachLinks1ActionPerformed
        String sportartName = (String )list_sportarten_sportler.getSelectedValue();

        Sportart sportart = Verwaltung.getInstance().findSportart(sportartName);
        sportartenVonSportler.remove(sportart);
        list_sportarten_sportler.setModel(ListModels.setSportarten(sportartenVonSportler));
    }//GEN-LAST:event_btn_nachLinks1ActionPerformed

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
            java.util.logging.Logger.getLogger(SportlerBearbeitenDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SportlerBearbeitenDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SportlerBearbeitenDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SportlerBearbeitenDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SportlerBearbeitenDialog dialog = new SportlerBearbeitenDialog(new javax.swing.JFrame(), true, new Sportler());
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
    private javax.swing.JButton btn_nachLinks1;
    private javax.swing.JButton btn_nachRechts;
    private javax.swing.JButton button_abbrechen;
    private javax.swing.JButton button_speichern;
    private javax.swing.JCheckBox checkbox_verletzt;
    private javax.swing.JComboBox comboBox_day;
    private javax.swing.JComboBox comboBox_geschlecht;
    private javax.swing.JComboBox comboBox_month;
    private javax.swing.JComboBox comboBox_spielstaerke;
    private javax.swing.JComboBox comboBox_year;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_allgemeineInfos;
    private javax.swing.JLabel lbl_alter;
    private javax.swing.JLabel lbl_day;
    private javax.swing.JLabel lbl_geschlecht;
    private javax.swing.JLabel lbl_month;
    private javax.swing.JLabel lbl_nachname;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_spielstaerke;
    private javax.swing.JLabel lbl_sportarten;
    private javax.swing.JLabel lbl_sporterInfo;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_verletzt;
    private javax.swing.JLabel lbl_year;
    private javax.swing.JList list_sportarten;
    private javax.swing.JList list_sportarten_sportler;
    private javax.swing.JScrollPane scrollPane_sportarten;
    private javax.swing.JScrollPane scrollPane_sportarten1;
    private javax.swing.JTextField txtF_nachname;
    private javax.swing.JTextField txtF_name;
    // End of variables declaration//GEN-END:variables
}
