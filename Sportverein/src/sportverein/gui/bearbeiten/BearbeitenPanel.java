/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein.gui.bearbeiten;

import sportverein.gui.Interfaces.Updatable;

/**
 *
 * @author steffen
 */
public class BearbeitenPanel extends javax.swing.JPanel implements Updatable{

    /**
     * Creates new form NeuesMitgliedAnlegen
     */
    public BearbeitenPanel() {
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

        jTabbedPane2 = new javax.swing.JTabbedPane();
        sportlerBearbeitenPanel1 = new sportverein.gui.bearbeiten.SportlerBearbeitenPanel();
        trainerBearbeitenPanel1 = new sportverein.gui.bearbeiten.TrainerBearbeitenPanel();
        vorstandBearbeitenPanel1 = new sportverein.gui.bearbeiten.VorstandBearbeitenPanel();
        sportartBeiarbeitenPanel1 = new sportverein.gui.bearbeiten.SportartBeiarbeitenPanel();
        schiedsrichterBearbeitenPanel1 = new sportverein.gui.bearbeiten.SchiedsrichterBearbeitenPanel();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        jTabbedPane2.addTab("Sportler", sportlerBearbeitenPanel1);
        jTabbedPane2.addTab("Trainer", trainerBearbeitenPanel1);
        jTabbedPane2.addTab("Vorstand", vorstandBearbeitenPanel1);
        jTabbedPane2.addTab("Sportart", sportartBeiarbeitenPanel1);
        jTabbedPane2.addTab("Schiedsrichter", schiedsrichterBearbeitenPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("Sportler");
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        updateViews();
    }//GEN-LAST:event_formMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane2;
    private sportverein.gui.bearbeiten.SchiedsrichterBearbeitenPanel schiedsrichterBearbeitenPanel1;
    private sportverein.gui.bearbeiten.SportartBeiarbeitenPanel sportartBeiarbeitenPanel1;
    private sportverein.gui.bearbeiten.SportlerBearbeitenPanel sportlerBearbeitenPanel1;
    private sportverein.gui.bearbeiten.TrainerBearbeitenPanel trainerBearbeitenPanel1;
    private sportverein.gui.bearbeiten.VorstandBearbeitenPanel vorstandBearbeitenPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateViews() {
        sportlerBearbeitenPanel1.updateViews();
        trainerBearbeitenPanel1.updateViews();
        vorstandBearbeitenPanel1.updateViews();
        sportartBeiarbeitenPanel1.updateViews();
        schiedsrichterBearbeitenPanel1.updateViews();
       
    }
}
