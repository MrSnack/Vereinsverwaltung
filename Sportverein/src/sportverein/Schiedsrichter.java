/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein;

import java.util.Date;

/**
 *
 * @author steffen
 */
public class Schiedsrichter extends Person {
    
    public static final String klassenName = Schiedsrichter.class.getSimpleName();
    
   private double gehalt;
   private Sportart sportart;

    public Schiedsrichter(double gehalt, Sportart sportart, String name, String nachname, char geschlecht, int alter, String geburtstag) {
        super(name, nachname, geschlecht, alter, geburtstag);
        this.gehalt = gehalt;
        this.sportart = sportart;
    }

    /**
     * @return the gehalt
     */
    public double getGehalt() {
        return gehalt;
    }

    /**
     * @param gehalt the gehalt to set
     */
    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    /**
     * @return the sportart
     */
    public Sportart getSportart() {
        return sportart;
    }

    /**
     * @param sportart the sportart to set
     */
    public void setSportart(Sportart sportart) {
        this.sportart = sportart;
    }
   
    
    
}
