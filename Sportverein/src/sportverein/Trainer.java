/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author steffen
 */
public class Trainer extends Mitglied {

    public static final String klassenName = Trainer.class.getSimpleName();
    
    private double entgelt;
    private double siege;
    private ArrayList<Mannschaft> mannschaften;

    public Trainer(double entgelt, double siege, double nr, ArrayList<Mannschaft> mannschaften, String name, String nachname, char geschlecht, int alter, String geburtstag) {
        super(nr, mannschaften, name, nachname, geschlecht, alter, geburtstag);
        this.entgelt = entgelt;
        this.siege = siege;
    }
    /**
     * @return the entgelt
     */
    public double getEndgeld() {
        return entgelt;
    }

    /**
     * @param entgelt the entgelt to set
     */
    public void setEndgeld(double entgelt) {
        this.entgelt = entgelt;
    }

    /**
     * @return the siege
     */
    public double getSiege() {
        return siege;
    }

    /**
     * @param siege the siege to set
     */
    public void setSiege(double siege) {
        this.siege = siege;
    }
    
    /**
     * @return the mannschaften
     */
    public ArrayList<Mannschaft> getMannschaften() {
        return mannschaften;
    }

    /**
     * @param mannschaften the mannschaften to set
     */
    public void setMannschaften(ArrayList<Mannschaft> mannschaften) {
        this.mannschaften = mannschaften;
    }
    
    
    
    
    
    
}
