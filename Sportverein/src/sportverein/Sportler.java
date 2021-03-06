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
public class Sportler extends Mitglied {
    
    private ArrayList <Sportart> sportarten;
    private boolean verletzt;

    @Override
    public String toString() {
        return "Sportler{" + "sportarten=" + sportarten + ", verletzt=" + verletzt + '}';
    }

    public Sportler(ArrayList<Sportart> sportarten, boolean verletzt, Date seit, Double nr, String name, String nachname, char geschlecht, int alter, Date geburtstag) {
        super(seit, nr, name, nachname, geschlecht, alter, geburtstag);
        this.sportarten = sportarten;
        this.verletzt = verletzt;
    }

 

 

    /**
     * @return the sportarten
     */
    public ArrayList <Sportart> getSportarten() {
        return sportarten;
    }

    /**
     * @param sportarten the sportarten to set
     */
    public void setSportarten(ArrayList <Sportart> sportarten) {
        this.sportarten = sportarten;
    }

    /**
     * @return the verletzt
     */
    public boolean isVerletzt() {
        return verletzt;
    }

    /**
     * @param verletzt the verletzt to set
     */
    public void setVerletzt(boolean verletzt) {
        this.verletzt = verletzt;
    }
    
    
    
}
