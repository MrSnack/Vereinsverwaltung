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
import sportverein.models.Trainer;
import sportverein.gui.dialoge.SportlerBearbeitenDialog;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sportverein.*;
import sportverein.gui.Interfaces.Updatable;
import sportverein.gui.datenAusgabe.ComboBoxModels;
import sportverein.gui.datenAusgabe.ListModels;
import sportverein.models.Mitglied;

/**
 *
 * @author steffen
 */
public class MannschaftBearbeitenDialog extends SpeichernDialog implements Updatable{
    Mannschaft mannschaft;
    ArrayList<Sportler> sportlerDerMannschaft = new ArrayList<Sportler>();
    ArrayList<Trainer> trainerDerMannschaft = new ArrayList<Trainer>();
    Sportart sportartAusgewählt;
    /**
     * Creates new form SportlerWerdenDialog
     */
    public MannschaftBearbeitenDialog(java.awt.Frame parent, boolean modal, Mannschaft mannschaft) {
        super(parent, modal);
        this.mannschaft = mannschaft;
        initComponents();
        setLocationRelativeTo(parent);
        pack();
        
        txtF_name.setText(mannschaft.getName());
        combo_sportart1.setSelectedItem(mannschaft.getSportart());
        
        
       
        
          
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
        lbl_sporterInfo = new javax.swing.JLabel();
        scrollPane_sportarten = new javax.swing.JScrollPane();
        list_sportler_mannschaft = new javax.swing.JList();
        lbl_verletzt = new javax.swing.JLabel();
        checkbox_verletzt = new javax.swing.JCheckBox();
        lbl_spielstaerke = new javax.swing.JLabel();
        button_speichern = new javax.swing.JButton();
        lbl_trainer_mannschaft = new javax.swing.JLabel();
        btn_entferne_sportler = new javax.swing.JButton();
        btn_fuege_sporler_hinzu = new javax.swing.JButton();
        combo_sportart1 = new javax.swing.JComboBox<>();
        lbl_sportart1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        scrollPane_sportarten1 = new javax.swing.JScrollPane();
        list_sportler_mit_sportart = new javax.swing.JList();
        comboBox_spielstaerke = new javax.swing.JComboBox();
        scrollPane_sportarten2 = new javax.swing.JScrollPane();
        list_trainer_mannschaft = new javax.swing.JList();
        btn_entferne_trainer = new javax.swing.JButton();
        btn_fuege_trainer_hinzu = new javax.swing.JButton();
        scrollPane_sportarten3 = new javax.swing.JScrollPane();
        list_trainer = new javax.swing.JList();
        lbl_trainer1 = new javax.swing.JLabel();
        lbl_gehalt = new javax.swing.JLabel();
        lbl_siege = new javax.swing.JLabel();
        lbl_siege_wert = new javax.swing.JLabel();
        lbl_gehalt_wert = new javax.swing.JLabel();
        lbl_sporterInfo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl_title.setText("Bearbeiten sie eine Mannschaft");

        lbl_allgemeineInfos.setText("Allgemeine Informationen");

        lbl_name.setText("Name");

        txtF_name.setToolTipText("geben Sie den Vorname des Sportlers ein");
        txtF_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtF_nameActionPerformed(evt);
            }
        });

        lbl_sporterInfo.setText("Trainer spezifische Informationen");

        scrollPane_sportarten.setViewportView(list_sportler_mannschaft);

        lbl_verletzt.setText("Verletzt");

        checkbox_verletzt.setText("ja");
        checkbox_verletzt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_verletztActionPerformed(evt);
            }
        });

        lbl_spielstaerke.setText("Spielstärke");

        button_speichern.setText("Speichern");
        button_speichern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_speichernActionPerformed(evt);
            }
        });

        lbl_trainer_mannschaft.setText("Trainer der Mannschaft");

        btn_entferne_sportler.setText("<---");
        btn_entferne_sportler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entferne_sportlerActionPerformed(evt);
            }
        });

        btn_fuege_sporler_hinzu.setText("--->");
        btn_fuege_sporler_hinzu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fuege_sporler_hinzuActionPerformed(evt);
            }
        });

        combo_sportart1.setModel(ComboBoxModels.getSportarten());
        combo_sportart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_sportart1ActionPerformed(evt);
            }
        });

        lbl_sportart1.setText("Sportart");

        jLabel1.setText("Sportler der Mannschaft");

        jLabel2.setText("Sportler die diese Sportart ausüben");

        list_sportler_mit_sportart.setModel(ListModels.getSportler(mannschaft));
        list_sportler_mit_sportart.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        list_sportler_mit_sportart.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                list_sportler_mit_sportartValueChanged(evt);
            }
        });
        scrollPane_sportarten1.setViewportView(list_sportler_mit_sportart);

        comboBox_spielstaerke.setModel(ComboBoxModels.getSpielstaerke());

        scrollPane_sportarten2.setViewportView(list_trainer_mannschaft);

        btn_entferne_trainer.setText("<---");
        btn_entferne_trainer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entferne_trainerActionPerformed(evt);
            }
        });

        btn_fuege_trainer_hinzu.setText("--->");
        btn_fuege_trainer_hinzu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fuege_trainer_hinzuActionPerformed(evt);
            }
        });

        list_trainer.setModel(ListModels.getTrainer());
        list_trainer.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        list_trainer.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                list_trainerValueChanged(evt);
            }
        });
        scrollPane_sportarten3.setViewportView(list_trainer);

        lbl_trainer1.setText("Alle Trainer");

        lbl_gehalt.setText("Gehalt");

        lbl_siege.setText("Siege");

        lbl_siege_wert.setText("0");

        lbl_gehalt_wert.setText("0");

        lbl_sporterInfo1.setText("Sportler spezifische Informationen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lbl_allgemeineInfos))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lbl_name)
                                .addGap(95, 95, 95)
                                .addComponent(txtF_name, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbl_sportart1)
                                .addGap(80, 80, 80)
                                .addComponent(combo_sportart1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel1)
                                .addGap(94, 94, 94)
                                .addComponent(lbl_trainer1)
                                .addGap(136, 136, 136)
                                .addComponent(lbl_trainer_mannschaft))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(scrollPane_sportarten1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_fuege_sporler_hinzu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_entferne_sportler, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(scrollPane_sportarten, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(scrollPane_sportarten3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_fuege_trainer_hinzu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_entferne_trainer, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(scrollPane_sportarten2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbl_sporterInfo1)
                                .addGap(256, 256, 256)
                                .addComponent(lbl_sporterInfo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbl_verletzt)
                                .addGap(83, 83, 83)
                                .addComponent(checkbox_verletzt)
                                .addGap(275, 275, 275)
                                .addComponent(lbl_gehalt)
                                .addGap(59, 59, 59)
                                .addComponent(lbl_gehalt_wert, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbl_spielstaerke)
                                .addGap(68, 68, 68)
                                .addComponent(comboBox_spielstaerke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(282, 282, 282)
                                .addComponent(lbl_siege)
                                .addGap(64, 64, 64)
                                .addComponent(lbl_siege_wert, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(button_speichern))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_allgemeineInfos)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_name)
                    .addComponent(txtF_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_sportart1)
                    .addComponent(combo_sportart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(lbl_trainer1)
                    .addComponent(lbl_trainer_mannschaft))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane_sportarten1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPane_sportarten, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPane_sportarten3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPane_sportarten2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_fuege_sporler_hinzu)
                                .addGap(17, 17, 17)
                                .addComponent(btn_entferne_sportler))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_fuege_trainer_hinzu)
                                .addGap(17, 17, 17)
                                .addComponent(btn_entferne_trainer)))))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_sporterInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_sporterInfo))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_verletzt)
                    .addComponent(checkbox_verletzt)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_gehalt)
                            .addComponent(lbl_gehalt_wert, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_spielstaerke)
                    .addComponent(comboBox_spielstaerke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_siege)
                    .addComponent(lbl_siege_wert, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(button_speichern)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtF_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtF_nameActionPerformed

    private void checkbox_verletztActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_verletztActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkbox_verletztActionPerformed

    private void button_speichernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_speichernActionPerformed

        String name = txtF_name.getText();

        String sportbez = (String) combo_sportart1.getSelectedItem();
        Sportart sportart = Verwaltung.getInstance().findSportart(sportbez);

        ArrayList<Mitglied> mitglieder = new ArrayList<Mitglied>();
        for (Sportler sportler :sportlerDerMannschaft) {
            mitglieder.add(sportler);
        }
        for (Trainer trainer: trainerDerMannschaft) {
            mitglieder.add(trainer);
        }
        int rang = 0;
        Mannschaft mannschaft = new Mannschaft(name, mitglieder, rang, sportart);

        JOptionPane.showMessageDialog(null, "Mannschaft " + mannschaft.getInfoString() + " wurde gespeichert.");
        Verwaltung.getInstance().getMannschaft().add(mannschaft);

    }//GEN-LAST:event_button_speichernActionPerformed

    private void btn_entferne_sportlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entferne_sportlerActionPerformed
        try {
            String sportlerInfo = (String )list_sportler_mannschaft.getSelectedValue();
            int nr = Help.getMitgliedNrVonInfoString(sportlerInfo);
            Sportler sportler = Verwaltung.getInstance().findSportler(nr);
            sportlerDerMannschaft.remove(sportler);
            list_sportler_mannschaft.setModel(ListModels.setSportler(sportlerDerMannschaft));
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Bitte wählen Sie einen Sportler aus.");
        }

    }//GEN-LAST:event_btn_entferne_sportlerActionPerformed

    private void btn_fuege_sporler_hinzuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fuege_sporler_hinzuActionPerformed
        try {
            String sportlerInfo = (String )list_sportler_mit_sportart.getSelectedValue();
            int nr = Help.getMitgliedNrVonInfoString(sportlerInfo);
            Sportler sportler = Verwaltung.getInstance().findSportler(nr);
            sportlerDerMannschaft.add(sportler);
            list_sportler_mannschaft.setModel(ListModels.setSportler(sportlerDerMannschaft));
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Bitte wählen Sie einen Sportler aus.");
        }
    }//GEN-LAST:event_btn_fuege_sporler_hinzuActionPerformed

    private void combo_sportart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_sportart1ActionPerformed
        String sportbez = (String) combo_sportart1.getSelectedItem();
        Sportart sportart = Verwaltung.getInstance().findSportart(sportbez);
        if (sportartAusgewählt == null || sportart.getName() != sportartAusgewählt.getName()) {
            sportartAusgewählt = sportart;
            System.out.println(sportartAusgewählt.getName());
            list_sportler_mit_sportart.setModel(ListModels.getSportlerMit(sportart));

            sportlerDerMannschaft.clear();
            list_sportler_mannschaft.setModel(ListModels.setSportler(sportlerDerMannschaft));
            System.out.println("Model Size below");
            System.out.println(list_sportler_mit_sportart.getModel().getSize());
        }

        System.out.println("Combo Action performed");
    }//GEN-LAST:event_combo_sportart1ActionPerformed

    private void list_sportler_mit_sportartValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_list_sportler_mit_sportartValueChanged
        try {
            String sportlerInfo = (String )list_sportler_mit_sportart.getSelectedValue();
            int nr = Help.getMitgliedNrVonInfoString(sportlerInfo);
            Sportler sportler = Verwaltung.getInstance().findSportler(nr);

            checkbox_verletzt.setSelected(sportler.isVerletzt());
            int spielStärke = (int)sportler.getSpielstärke();
            comboBox_spielstaerke.setSelectedItem(spielStärke);
        } catch (NullPointerException e) {
            System.out.println("Kein Sportler ausgewählt");
        }
    }//GEN-LAST:event_list_sportler_mit_sportartValueChanged

    private void btn_entferne_trainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entferne_trainerActionPerformed
        try {
            String trainerInfo = (String )list_trainer_mannschaft.getSelectedValue();
            int nr = Help.getMitgliedNrVonInfoString(trainerInfo);
            Trainer trainer = Verwaltung.getInstance().findTrainer(nr);
            sportlerDerMannschaft.remove(trainer);
            list_trainer_mannschaft.setModel(ListModels.setTrainer(trainerDerMannschaft));
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Bitte wählen Sie einen Trainer aus.");
        }
    }//GEN-LAST:event_btn_entferne_trainerActionPerformed

    private void btn_fuege_trainer_hinzuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fuege_trainer_hinzuActionPerformed
        try {
            String trainerInfo = (String )list_trainer.getSelectedValue();
            int nr = Help.getMitgliedNrVonInfoString(trainerInfo);
            Trainer trainer = Verwaltung.getInstance().findTrainer(nr);
            trainerDerMannschaft.add(trainer);
            list_trainer_mannschaft.setModel(ListModels.setTrainer(trainerDerMannschaft));

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Bitte wählen Sie einen Trainer aus.");
        }
    }//GEN-LAST:event_btn_fuege_trainer_hinzuActionPerformed

    private void list_trainerValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_list_trainerValueChanged
        try {
            String trainerInfo = (String )list_sportler_mit_sportart.getSelectedValue();
            int nr = Help.getMitgliedNrVonInfoString(trainerInfo);
            Trainer trainer = Verwaltung.getInstance().findTrainer(nr);
            lbl_gehalt_wert.setText(String.valueOf(trainer.getEndgeld()));
            lbl_siege_wert.setText(String.valueOf(trainer.getSiege()));
        } catch (NullPointerException e) {
            System.out.println("Kein Trainer ausgewählt");
        }

    }//GEN-LAST:event_list_trainerValueChanged

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
            java.util.logging.Logger.getLogger(MannschaftBearbeitenDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MannschaftBearbeitenDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MannschaftBearbeitenDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MannschaftBearbeitenDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JButton btn_entferne_sportler;
    private javax.swing.JButton btn_entferne_trainer;
    private javax.swing.JButton btn_fuege_sporler_hinzu;
    private javax.swing.JButton btn_fuege_trainer_hinzu;
    private javax.swing.JButton button_speichern;
    private javax.swing.JCheckBox checkbox_verletzt;
    private javax.swing.JComboBox comboBox_spielstaerke;
    private javax.swing.JComboBox<String> combo_sportart1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_allgemeineInfos;
    private javax.swing.JLabel lbl_gehalt;
    private javax.swing.JLabel lbl_gehalt_wert;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_siege;
    private javax.swing.JLabel lbl_siege_wert;
    private javax.swing.JLabel lbl_spielstaerke;
    private javax.swing.JLabel lbl_sportart1;
    private javax.swing.JLabel lbl_sporterInfo;
    private javax.swing.JLabel lbl_sporterInfo1;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_trainer1;
    private javax.swing.JLabel lbl_trainer_mannschaft;
    private javax.swing.JLabel lbl_verletzt;
    private javax.swing.JList list_sportler_mannschaft;
    private javax.swing.JList list_sportler_mit_sportart;
    private javax.swing.JList list_trainer;
    private javax.swing.JList list_trainer_mannschaft;
    private javax.swing.JScrollPane scrollPane_sportarten;
    private javax.swing.JScrollPane scrollPane_sportarten1;
    private javax.swing.JScrollPane scrollPane_sportarten2;
    private javax.swing.JScrollPane scrollPane_sportarten3;
    private javax.swing.JTextField txtF_name;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateViews() {
        list_sportler_mannschaft.setModel(ListModels.getSportler(mannschaft));
        list_trainer_mannschaft.setModel(ListModels.getTrainer(mannschaft));
        list_sportler_mit_sportart.setModel(ListModels.getSportlerMit(sportartAusgewählt));
        list_trainer.setModel(ListModels.getTrainer());
        
    }
}
