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
        return (datum + " " + sportart.getName()) + " " + heimMannschaft.getName() + " vs " + auswaertsMannschaft.getName();
    }
    
    public static ArrayList<Spiel> sortAbsteigend(ArrayList<Spiel> spiele) {
         Integer[] arr = new Integer[spiele.size()];
         spiele.sort(new Comparator<Spiel>() {

             @Override
             public int compare(Spiel o1, Spiel o2) {
                 return Help.intFromDateString(o1.datum) - Help.intFromDateString(o2.datum);
             }
         });
             return spiele;
         } 
    

    

}
