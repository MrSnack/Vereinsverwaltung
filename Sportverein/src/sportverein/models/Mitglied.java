/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein.models;

import java.util.ArrayList;
import java.util.Date;
import sportverein.handler.Verwaltung;

/**
 *
 * @author steffen
 */
public class Mitglied extends Person {
    
    public static final String klassenName = Mitglied.class.getSimpleName();
     
    private int nr;

    
    public Mitglied() {
        super();
        this.nr = 1;
    }

    public Mitglied(int nr, String name, String nachname, char geschlecht, int alter, String geburtstag) {
        super(name, nachname, geschlecht, alter, geburtstag);
        this.nr = nr;
    }
    
    

    /**
     * @return the nr
     */
    public int getNr() {
        return nr;
    }

    /**
     * @param nr the nr to set
     */
    public void setNr(int nr) {
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
    public static int getNaechsteNr() {
        return Integer.valueOf(String.valueOf(Mitglied.getAnzahlMitglieder() + 1));
    }
    
    public String getInfoString() {
       return this.getNr()+ "\t Name:"+ this.getName() + " " + this.getNachname();
    }
    
}
