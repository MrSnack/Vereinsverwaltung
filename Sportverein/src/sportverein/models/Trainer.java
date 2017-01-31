/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein.models;

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

    public Trainer(double entgelt, double siege, int nr, String name, String nachname, char geschlecht, int alter, String geburtstag) {
        super(nr, name, nachname, geschlecht, alter, geburtstag);
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
    
    public String getWriteString() {
        return this.klassenName+";"+this.getEndgeld()+";"+this.getSiege()+";"+this.getNr()+";"+this.getName()+";"+this.getNachname()+";"+this.getGeschlecht()+";"+this.getAlter()+";"+this.getGeburtstag()+";\n";
    }
    
}
