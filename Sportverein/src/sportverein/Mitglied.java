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
    
     
    private double nr;
    private ArrayList<Mannschaft> mannschaften;

    public Mitglied(double nr, ArrayList<Mannschaft> mannschaften, String name, String nachname, char geschlecht, int alter, Date geburtstag) {
        super(name, nachname, geschlecht, alter, geburtstag);
        this.nr = nr;
        this.mannschaften = mannschaften;
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
    
    public Trainer werdeTrainer(double endgeld, double siege) {
        Trainer trainer = new Trainer(endgeld, siege,nr, 
                mannschaften, 
                super.getNachname(), 
                super.getName(), 
                super.getGeschlecht(), 
                super.getAlter(), 
                super.getGeburtstag()
        );
        return trainer;
    }
    
    
}
