/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein;

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

    public Spiel(Mannschaft heimMannschaft, Mannschaft auswaertsMannschaft, Sportart sportart, Integer rang){
        this.heimMannschaft = heimMannschaft;
        this.auswaertsMannschaft = auswaertsMannschaft;
        this.sportart = sportart;
        this.rang = rang;
        
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
    
    public boolean pruefeDurchfuehrbarkeit(){
        return (heimMannschaft.isSpielbereit() && auswaertsMannschaft.isSpielbereit());
    }
    
    public String getGewinner(){
        if (heimMannschaftPunktestand > auswaertsMannschaftPunktestand){
            return heimMannschaft.getName();
        }
        if (heimMannschaftPunktestand < auswaertsMannschaftPunktestand){
            return auswaertsMannschaft.getName();
        }
       
        return "Unentschieden";
        
    }

}
