/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author steffen
 */
public class Spiel {
    
    public static final String klassenName = Spiel.class.getSimpleName();

    private Mannschaft heimMannschaft;
    private Mannschaft auswaertsMannschaft;
    
    private Integer heimMannschaftPunktestand = 0;
    private Integer auswaertsMannschaftPunktestand = 0;

    private Sportart sportart;
    private Integer rang;
    private String datum;

    public Spiel(Mannschaft heimMannschaft, Mannschaft auswaertsMannschaft, Sportart sportart, Integer rang, String datum) {
        this.heimMannschaft = heimMannschaft;
        this.auswaertsMannschaft = auswaertsMannschaft;
        this.sportart = sportart;
        this.rang = rang; // fuer mehrere Ligen
        this.datum = datum;
    }
    
    public Spiel() {
        this.auswaertsMannschaft = null;
        this.auswaertsMannschaftPunktestand = 0;
        this.heimMannschaft = null;
        this.heimMannschaftPunktestand = 0;
        this.rang = 0;
        this.sportart = null;
        this.datum = "";
    }
    
  

    public Integer getRang() {
        return rang;
    }

    public void setRang(Integer rang) {
        this.rang = rang;
    }

    public Mannschaft getHeimMannschaft() {
        return heimMannschaft;
    }

    public void setHeimMannschaft(Mannschaft heimMannschaft) {
        this.heimMannschaft = heimMannschaft;
    }

    public Mannschaft getAuswaertsMannschaft() {
        return auswaertsMannschaft;
    }

    public void setAuswaertsMannschaft(Mannschaft auswaertsMannschaft) {
        this.auswaertsMannschaft = auswaertsMannschaft;
    }

    public Sportart getSportart() {
        return sportart;
    }

    public void setSportart(Sportart sportart) {
        this.sportart = sportart;
    }
    
    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }
    
    public boolean pruefeDurchfuehrbarkeit(){
        return (heimMannschaft.isSpielbereit() && auswaertsMannschaft.isSpielbereit());
    }
    
    public String getGewinner(){
        if (heimMannschaftPunktestand > auswaertsMannschaftPunktestand){
            return (heimMannschaft.getName() + " gewinnt");
        }
        if (heimMannschaftPunktestand < auswaertsMannschaftPunktestand){
            return (auswaertsMannschaft.getName()  + "gewinnt");
        }
       
        return "Unentschieden";
        
    }
    
    public String getDatumUndMannschaften() {
        String sportartName = "keine Sportart";
        String heimMannschaftName = "keine Heimmannschaft";
        String auswaertsMannschaftName = "kein Auswaertsmannschaft";
        int nullis = 0;
        if (sportart != null) {
            sportartName = sportart.getName();
            
        } else {
            nullis++;
        }
        if (heimMannschaft != null) {
            heimMannschaftName = heimMannschaft.getName();
           
        } else {
            nullis++;
        }
        
        if (auswaertsMannschaft != null) {
            auswaertsMannschaftName = auswaertsMannschaft.getName();
        } else {
            nullis++;
        }
        if (datum == "") {
            datum = "Kein Datum gefunden";
        } else {
            nullis++;
        }
        
        if (nullis > 2) {
            return "Kein Spiel gefunden";
        }
        return (datum + " " + sportartName + " " + heimMannschaftName + " vs " + auswaertsMannschaftName);
    }
    
    public static ArrayList<Spiel> sortAbsteigend(ArrayList<Spiel> spiele) {
         spiele.sort(new Comparator<Spiel>() {

             @Override
             public int compare(Spiel o1, Spiel o2) {
                 return Help.intFromDateString(o1.datum) - Help.intFromDateString(o2.datum);
             }
         });
             return spiele;
         } 
    

    

}
