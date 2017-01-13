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
    
    private double endgeld;
    private double siege;

    public Trainer(double endgeld, double siege, double nr, ArrayList<Mannschaft> mannschaften, String name, String nachname, char geschlecht, int alter, String geburtstag) {
        super(nr, mannschaften, name, nachname, geschlecht, alter, geburtstag);
        this.endgeld = endgeld;
        this.siege = siege;
    }
    /**
     * @return the endgeld
     */
    public double getEndgeld() {
        return endgeld;
    }

    /**
     * @param endgeld the endgeld to set
     */
    public void setEndgeld(double endgeld) {
        this.endgeld = endgeld;
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
    
    
    
    
    
    
    
}
