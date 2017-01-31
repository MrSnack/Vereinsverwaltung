/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein.models;

/**
 *
 * @author steffen
 */
public class Sportart {
    
    public static final String klassenName  = Sportart.class.getSimpleName();
    
    private String name;
    private Integer minAnzahlSpieler;

    public Sportart() {
        this.name = "Sport";
        this.minAnzahlSpieler = 1;
               
    }
    
    public Sportart(String name, Integer minAnzahlSpieler) {
        this.name = name;
        this.minAnzahlSpieler = minAnzahlSpieler;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMinAnzahlSpieler() {
        return minAnzahlSpieler;
    }

    public void setMinAnzahlSpieler(Integer minAnzahlSpieler) {
        this.minAnzahlSpieler = minAnzahlSpieler;
    }

    
    public String getWriteString() {
        return this.klassenName + ";" + this.getName() +";" +this.getMinAnzahlSpieler() + ";\n";
    }
    
    
}
