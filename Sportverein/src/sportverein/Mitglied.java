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

    
    public Mitglied() {
        super();
        this.nr = 1;
    }

    public Mitglied(double nr, String name, String nachname, char geschlecht, int alter, String geburtstag) {
        super(name, nachname, geschlecht, alter, geburtstag);
        this.nr = nr;
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



    public Sportler werdeSportler (ArrayList<Sportart> sportarten, boolean verletzt, int spielstaerke) {
        Sportler sportler = new Sportler(
                sportarten, 
                verletzt, 
                spielstaerke, 
                nr,
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
                super.getNachname(), 
                super.getName(), 
                super.getGeschlecht(), 
                super.getAlter(), 
                super.getGeburtstag()
        );
        return trainer;
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
