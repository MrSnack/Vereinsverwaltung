/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein.models;

import java.util.ArrayList;

/**
 *
 * @author steffen
 */
public class Mannschaft {
    
    public static final String klassenName  = Mannschaft.class.getSimpleName();

    private String name;
    private ArrayList<Mitglied> mitglieder;
    private int rang;
    private Sportart sportart;

    public Mannschaft(String name, ArrayList<Mitglied> mitglieder, int rang, Sportart sportart) {
        this.name = name;
        this.mitglieder = mitglieder;
        this.rang = rang;
        this.sportart = sportart;
    }

    public Mannschaft() {
        this.name = "Testmannschaft";
        this.rang = 1;
        this.mitglieder = new ArrayList<Mitglied>();
        this.sportart = new Sportart();
    }

    public String getWriteString() {
        String toReturn ="";
        
        toReturn += this.klassenName +";"+this.getName()+";";
        
        for (Mitglied mitglied : mitglieder) {
            toReturn += mitglied.getNr() +";";
        }
        
        toReturn += this.getRang() +";"+this.getSportart().getName() +";\n";
        return toReturn;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the mitglieder
     */
    public ArrayList<Mitglied> getMitglieder() {
        return mitglieder;
    }

    /**
     * @param mitglieder the mitglieder to set
     */
    public void setMitglieder(ArrayList<Mitglied> mitglieder) {
        this.mitglieder = mitglieder;
    }

    /**
     * @return the rang
     */
    public int getRang() {
        return rang;
    }

    /**
     * @param rang the rang to set
     */
    public void setRang(int rang) {
        this.rang = rang;
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

    public boolean loescheMitglied(Mitglied mitglied) {
        //TODO: funktion implementieren
        if (this.mitglieder.contains(mitglied)) {
            this.mitglieder.remove(mitglied);
            return true;
        }
        return false;
    }

    public boolean fuegeMitgliedHinzu(Mitglied mitglied) {
        if (!this.mitglieder.contains(mitglied)) {
            // kein Mitglied dieser Art beretis in Mannschaft
            this.mitglieder.add(mitglied);
            // Erfolg
            return true;
        }

        return false;
    }

    public Integer getAnzahlGesundeSpieler() {
        Integer anzahlGesundeSpieler = 0;
        for (Mitglied spieler : this.mitglieder) {
           if (spieler.getClass().getSimpleName().equals(Sportler.klassenName)) {
               if(  ((Sportler) spieler).isVerletzt()) {
                   anzahlGesundeSpieler ++;
               }
           }
        }
        return anzahlGesundeSpieler;
    }
    
    public boolean isSpielbereit() {
        if (getAnzahlGesundeSpieler() < this.getSportart().getMinAnzahlSpieler()) {
            // nicht genuegend Sportler fit
            return false;
        }
        // ausreichend Sporlter fit
        return true;
    }

}
