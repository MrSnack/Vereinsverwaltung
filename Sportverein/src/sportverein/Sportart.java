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
public class Sportart {
    
    private String name;
    private String minAnzahlSpieler;

    public Sportart(String name, String minAnzahlSpieler) {
        this.name = name;
        this.minAnzahlSpieler = minAnzahlSpieler;
    }
    
    public Sportart()  {
        this.name = "nackt Tennis";
        this.minAnzahlSpieler = "69";
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
     * @return the minAnzahlSpieler
     */
    public String getMinAnzahlSpieler() {
        return minAnzahlSpieler;
    }

    /**
     * @param minAnzahlSpieler the minAnzahlSpieler to set
     */
    public void setMinAnzahlSpieler(String minAnzahlSpieler) {
        this.minAnzahlSpieler = minAnzahlSpieler;
    }
    
    
}
