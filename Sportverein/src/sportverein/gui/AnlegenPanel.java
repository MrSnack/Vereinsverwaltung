/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein.gui;

/**
 *
 * @author steffen
 */
public class AnlegenPanel extends javax.swing.JPanel {

    /**
     * Creates new form NeuesMitgliedAnlegen
     */
    public AnlegenPanel() {
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
        sportlerAnlegenTab1 = new sportverein.gui.SportlerAnlegenPanel();
        trainerAnlegenPanel1 = new sportverein.gui.TrainerAnlegenPanel();
        vorstandAnlegen1 = new sportverein.gui.VorstandAnlegen();
        sportartAnlegenPanel1 = new sportverein.gui.SportartAnlegenPanel();

        jTabbedPane2.addTab("Sportler", sportlerAnlegenTab1);
        jTabbedPane2.addTab("Trainer", trainerAnlegenPanel1);
        jTabbedPane2.addTab("Vorstand", vorstandAnlegen1);
        jTabbedPane2.addTab("Sportart", sportartAnlegenPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 531, Short.MAX_VALUE)
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("Sportler");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane2;
    private sportverein.gui.SportartAnlegenPanel sportartAnlegenPanel1;
    private sportverein.gui.SportlerAnlegenPanel sportlerAnlegenTab1;
    private sportverein.gui.TrainerAnlegenPanel trainerAnlegenPanel1;
    private sportverein.gui.VorstandAnlegen vorstandAnlegen1;
    // End of variables declaration//GEN-END:variables
}
