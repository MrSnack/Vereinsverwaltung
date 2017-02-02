/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein.gui;

import sportverein.gui.Interfaces.Updatable;
import sportverein.handler.Help;
import sportverein.handler.Verwaltung;

/**
 *
 * @author steffen
 */
public class Dashboard extends javax.swing.JPanel implements Updatable{

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        txt_area_alle_spiele_informationen.setEditable(false);
        txt_area_sportler.setEditable(false);
        txt_area_trainer.setEditable(false);
        txt_area_vorstand.setEditable(false);
        txt_area_sportarten.setEditable(false);
        txt_area_schiedsrichter.setEditable(false);
        txt_area_mannschaften.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblGamesLastMonth = new javax.swing.JLabel();
        lblMonthName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_naechstesSpiel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_area_alle_spiele_informationen = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txt_area_spiele_informationen1 = new javax.swing.JTextArea();
        lblGamesLastMonth1 = new javax.swing.JLabel();
        lbl_anzahl_vereinsmitglieder = new javax.swing.JLabel();
        lbl_zahl_vereinsmitglieder = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area_sportler = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_area_vorstand = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_area_trainer = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txt_area_sportarten = new javax.swing.JTextArea();
        lbl_zahl_sportler = new javax.swing.JLabel();
        lbl_zahl_vorstand = new javax.swing.JLabel();
        lbl_anzahl_sportarten = new javax.swing.JLabel();
        lbl_anzahl_trainer = new javax.swing.JLabel();
        lbl_anzahl_mannschaften = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txt_area_mannschaften = new javax.swing.JTextArea();
        lbl_Mannschaften = new javax.swing.JLabel();
        lbl_zahl_schiedsrichter = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txt_area_schiedsrichter = new javax.swing.JTextArea();
        lblSchiedsrichter = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 400));

        jLabel10.setText("Nächtes Spiel:");

        lblGamesLastMonth.setText("Spiele im nächsten Monat:");

        lblMonthName.setText(Help.getNaechstenMonat());

        jLabel1.setText("Spiel Informationen");

        lbl_naechstesSpiel.setText(Verwaltung.getInstance().getNaechstesSpiel().getDatumUndMannschaften());

        txt_area_alle_spiele_informationen.setColumns(20);
        txt_area_alle_spiele_informationen.setRows(5);
        txt_area_alle_spiele_informationen.setText(Verwaltung.getInstance().getSpieleNaechstenMonatString());
        jScrollPane2.setViewportView(txt_area_alle_spiele_informationen);

        txt_area_spiele_informationen1.setColumns(20);
        txt_area_spiele_informationen1.setRows(5);
        txt_area_spiele_informationen1.setText(Verwaltung.getInstance().getSpieleNaechstenMonatString());
        jScrollPane8.setViewportView(txt_area_spiele_informationen1);

        lblGamesLastMonth1.setText("Alle Spiele");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1)
                            .addComponent(lbl_naechstesSpiel)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(lblGamesLastMonth)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblMonthName))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblGamesLastMonth1))))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(lbl_naechstesSpiel)
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGamesLastMonth)
                    .addComponent(lblMonthName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(lblGamesLastMonth1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(173, 173, 173)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(294, Short.MAX_VALUE)))
        );

        lbl_anzahl_vereinsmitglieder.setText("Anzahl Vereinsmitglieder: ");

        lbl_zahl_vereinsmitglieder.setText(String.valueOf(Verwaltung.getInstance().getAnzahlMitglieder()));

        txt_area_sportler.setColumns(20);
        txt_area_sportler.setRows(5);
        txt_area_sportler.setText(Verwaltung.getInstance().getAlleSportlerInfos());
        jScrollPane1.setViewportView(txt_area_sportler);

        jLabel2.setText("Sportler");

        txt_area_vorstand.setColumns(20);
        txt_area_vorstand.setRows(5);
        txt_area_vorstand.setText(Verwaltung.getInstance().getAlleVorstandsNamen());
        jScrollPane3.setViewportView(txt_area_vorstand);

        jLabel3.setText("Vorstandsmitglieder");

        jLabel4.setText("Sportarten");

        txt_area_trainer.setColumns(20);
        txt_area_trainer.setRows(5);
        txt_area_trainer.setText(Verwaltung.getInstance().getAlleTrainerNamen());
        txt_area_trainer.setToolTipText(Verwaltung.getInstance().getAlleTrainerNamen());
        jScrollPane4.setViewportView(txt_area_trainer);

        jLabel5.setText("Trainer");

        txt_area_sportarten.setColumns(20);
        txt_area_sportarten.setRows(5);
        txt_area_sportarten.setText(Verwaltung.getInstance().getAlleSportartenNamen());
        jScrollPane5.setViewportView(txt_area_sportarten);

        lbl_zahl_sportler.setText(String.valueOf(Verwaltung.getInstance().getSportler().size()));

        lbl_zahl_vorstand.setText(String.valueOf(Verwaltung.getInstance().getVorstand().size()));

        lbl_anzahl_sportarten.setText(String.valueOf(Verwaltung.getInstance().getSportart().size()));

        lbl_anzahl_trainer.setText(String.valueOf(Verwaltung.getInstance().getTrainer().size()));

        lbl_anzahl_mannschaften.setText(String.valueOf(Verwaltung.getInstance().getMannschaft().size()));

        txt_area_mannschaften.setColumns(20);
        txt_area_mannschaften.setRows(5);
        txt_area_mannschaften.setText(Verwaltung.getInstance().getAlleTrainerNamen());
        txt_area_mannschaften.setToolTipText(Verwaltung.getInstance().getAlleTrainerNamen());
        jScrollPane6.setViewportView(txt_area_mannschaften);

        lbl_Mannschaften.setText("Manschaften");

        lbl_zahl_schiedsrichter.setText(String.valueOf(Verwaltung.getInstance().getSchiedsrichter().size()));

        txt_area_schiedsrichter.setColumns(20);
        txt_area_schiedsrichter.setRows(5);
        txt_area_schiedsrichter.setText(Verwaltung.getInstance().getAlleSchiedsrichterNamen());
        jScrollPane7.setViewportView(txt_area_schiedsrichter);

        lblSchiedsrichter.setText("Schiedsrichter");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_zahl_vorstand)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_anzahl_vereinsmitglieder)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_zahl_sportler)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addComponent(lbl_zahl_vereinsmitglieder))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_anzahl_trainer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_anzahl_sportarten)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_anzahl_mannschaften)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Mannschaften))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_zahl_schiedsrichter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSchiedsrichter))
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_anzahl_trainer)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_anzahl_sportarten)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_anzahl_mannschaften)
                                .addComponent(lbl_Mannschaften))
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_zahl_schiedsrichter)
                                .addComponent(lblSchiedsrichter))
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_anzahl_vereinsmitglieder)
                            .addComponent(lbl_zahl_vereinsmitglieder))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lbl_zahl_sportler))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lbl_zahl_vorstand))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblGamesLastMonth;
    private javax.swing.JLabel lblGamesLastMonth1;
    private javax.swing.JLabel lblMonthName;
    private javax.swing.JLabel lblSchiedsrichter;
    private javax.swing.JLabel lbl_Mannschaften;
    private javax.swing.JLabel lbl_anzahl_mannschaften;
    private javax.swing.JLabel lbl_anzahl_sportarten;
    private javax.swing.JLabel lbl_anzahl_trainer;
    private javax.swing.JLabel lbl_anzahl_vereinsmitglieder;
    private javax.swing.JLabel lbl_naechstesSpiel;
    private javax.swing.JLabel lbl_zahl_schiedsrichter;
    private javax.swing.JLabel lbl_zahl_sportler;
    private javax.swing.JLabel lbl_zahl_vereinsmitglieder;
    private javax.swing.JLabel lbl_zahl_vorstand;
    private javax.swing.JTextArea txt_area_alle_spiele_informationen;
    private javax.swing.JTextArea txt_area_mannschaften;
    private javax.swing.JTextArea txt_area_schiedsrichter;
    private javax.swing.JTextArea txt_area_spiele_informationen1;
    private javax.swing.JTextArea txt_area_sportarten;
    private javax.swing.JTextArea txt_area_sportler;
    private javax.swing.JTextArea txt_area_trainer;
    private javax.swing.JTextArea txt_area_vorstand;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateViews() {
         // Zahl Lbls
       this.lbl_zahl_vereinsmitglieder.setText(String.valueOf(Verwaltung.getInstance().getAnzahlMitglieder()));
       this.lbl_zahl_sportler.setText(String.valueOf(Verwaltung.getInstance().getSportler().size()));
       this.lbl_anzahl_trainer.setText(String.valueOf(Verwaltung.getInstance().getTrainer().size()));
       this.lbl_zahl_vorstand.setText(String.valueOf(Verwaltung.getInstance().getVorstand().size()));
       this.lbl_anzahl_sportarten.setText(String.valueOf(Verwaltung.getInstance().getSportart().size()));
       this.lbl_zahl_schiedsrichter.setText(String.valueOf(Verwaltung.getInstance().getSchiedsrichter().size()));
       this.lbl_anzahl_mannschaften.setText(String.valueOf(Verwaltung.getInstance().getMannschaft().size()));
       // text Areas
       this.txt_area_sportler.setText(Verwaltung.getInstance().getAlleSportlerInfos());
       this.txt_area_sportarten.setText(Verwaltung.getInstance().getAlleSportartenNamen());
       this.txt_area_trainer.setText(Verwaltung.getInstance().getAlleTrainerNamen());
       this.txt_area_vorstand.setText(Verwaltung.getInstance().getAlleVorstandsNamen());
       this.txt_area_mannschaften.setText(Verwaltung.getInstance().getAlleMannschaftsNamen());
       this.txt_area_schiedsrichter.setText(Verwaltung.getInstance().getAlleSchiedsrichterNamen());
       // spiele infos
       this.lbl_naechstesSpiel.setText(Verwaltung.getInstance().getNaechstesSpiel().getDatumUndMannschaften());
       this.txt_area_spiele_informationen1.setText(Verwaltung.getInstance().getSpieleNaechstenMonatString());  
       this.txt_area_alle_spiele_informationen.setText(Verwaltung.getInstance().getAlleSpiele());    
    }
}
