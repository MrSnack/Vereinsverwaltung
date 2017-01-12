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
    private double spielstärke;

    public Sportler(ArrayList<Sportart> sportarten, boolean verletzt, double spielstärke, double nr, ArrayList<Mannschaft> mannschaften, String name, String nachname, char geschlecht, int alter, String geburtstag) {
        super(nr, mannschaften, name, nachname, geschlecht, alter, geburtstag);
        this.sportarten = sportarten;
        this.verletzt = verletzt;
        this.spielstärke = spielstärke;
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

    /**
     * @return the spielstärke
     */
    public double getSpielstärke() {
        return spielstärke;
    }

    /**
     * @param spielstärke the spielstärke to set
     */
    public void setSpielstärke(double spielstärke) {
        this.spielstärke = spielstärke;
    }
    
    
    
}
