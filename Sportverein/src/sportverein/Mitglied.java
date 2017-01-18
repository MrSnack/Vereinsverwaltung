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
public class Mitglied extends Person {
    
    public static final String klassenName = Mitglied.class.getSimpleName();
     
    private double nr;
    private ArrayList<Mannschaft> mannschaften;

    public Mitglied(double nr, ArrayList<Mannschaft> mannschaften, String name, String nachname, char geschlecht, int alter, String geburtstag) {
        super(name, nachname, geschlecht, alter, geburtstag);
        this.nr = nr; // auto increment
        this.mannschaften = mannschaften;
    }
    
    public Mitglied() {
        super();
        this.nr = 1;
        this.mannschaften = null;
    }

    /**
     * @return the nr
     */
    public double getNr() {
        return nr;
    }

    /**
     * @param nr the nr to set
     */
    public void setNr(double nr) {
        this.nr = nr;
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

    public Sportler werdeSportler (ArrayList<Sportart> sportarten, boolean verletzt, int spielstaerke) {
        Sportler sportler = new Sportler(
                sportarten, 
                verletzt, 
                spielstaerke, 
                nr, 
                mannschaften, 
                super.getNachname(), 
                super.getName(), 
                super.getGeschlecht(), 
                super.getAlter(), 
                super.getGeburtstag()
        );
        return sportler;   
    }
    
    public Vorstand werdeVorstand(double gehalt) {
        Vorstand vorstand = new Vorstand(gehalt,
                nr, 
                mannschaften, 
                super.getNachname(), 
                super.getName(), 
                super.getGeschlecht(), 
                super.getAlter(), 
                super.getGeburtstag()
        );
        return vorstand;
    }
    
    public Trainer werdeTrainer(double entgeld, double siege) {
        Trainer trainer = new Trainer(entgeld, siege,nr, 
                mannschaften, 
                super.getNachname(), 
                super.getName(), 
                super.getGeschlecht(), 
                super.getAlter(), 
                super.getGeburtstag()
        );
        return trainer;
    }
    /** @param mannschaft die geloescht werden soll
     * @return boolean true = erfolg bei vorhandener Mannschaft
     * @see Mannschaft.loescheMitglied
     * 
    */
    public boolean verlasseMannschaft(Mannschaft mannschaft) {
        if (this.mannschaften.contains(mannschaft)) {
            this.mannschaften.remove(mannschaft);
            mannschaft.loescheMitglied(this);
            return true;
        }
        return false;
    }
    /**
     * 
     * @param mannschaft
     * @return bool if worked or not
     */
    public boolean treteMannschaftBei(Mannschaft mannschaft) {    
        if (mannschaft.getMitglieder().contains(this)) {
            return false;
        }

        // füge Mannschaft zu mannschaften hinzu
        this.mannschaften.add(mannschaft);
        // für Mitglied dieser Mannschaft hinzu
        mannschaft.getMitglieder().add(this);
        return true;
    } 
    /**
     * created by Steffen Haas
     * 
     * 
     * @return gesamt Zahl Mitglieder
     */
    public static int getAnzahlMitglieder() {
        return Verwaltung.getInstance().getAnzahlMitglieder();
    }
    /**
     * HAAS
     * 
     * @return double basierend auf anzahl vorhandener mitglieder + 1
     */
    public static double getNaechsteNr() {
        return Double.valueOf(String.valueOf(Mitglied.getAnzahlMitglieder() + 1));
    }
    
}
