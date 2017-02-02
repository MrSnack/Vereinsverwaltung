/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein.models;

import java.util.Date;

/**
 *
 * @author steffen
 */
public class Schiedsrichter extends Person {
    
    public static final String klassenName = Schiedsrichter.class.getSimpleName();
    
   private double gehalt;
   private Sportart sportart;
   private int nr;
   
    public Schiedsrichter(double gehalt, Sportart sportart, String name, String nachname, char geschlecht, int alter, String geburtstag) {
        super(name, nachname, geschlecht, alter, geburtstag);
        this.gehalt = gehalt;
        this.sportart = sportart;
    }

    public Schiedsrichter(){
        super();
        gehalt = 123456;
        
    }
    /**
     * @return the gehalt
     */
    public double getGehalt() {
        return gehalt;
    }

    public int getNr(){
        return nr;
    }
    
    public void setNr(int pNr){
        nr = pNr;
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
   
    public String getWriteString() {
        return this.klassenName + ";" + this.getGehalt() + ";" + this.getSportart().getName() + ";" + this.getName() + ";" + this.getNachname() +";" + this.getGeschlecht() +";"+this.getAlter()+";"+this.getGeburtstag()+";\n";
    }
    
     public String getInfoString() {
       return "Name:"+ this.getName() + " " + this.getNachname();
    }
    
    
}
