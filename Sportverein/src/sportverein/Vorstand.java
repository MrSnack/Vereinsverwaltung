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
public class Vorstand extends Mitglied {
    public static final String klassenName = Vorstand.class.getSimpleName();
    
    double Gehalt;

    public Vorstand(double Gehalt, int nr, String name, String nachname, char geschlecht, int alter, String geburtstag) {
        super(nr, name, nachname, geschlecht, alter, geburtstag);
        this.Gehalt = Gehalt;
    }

    
    
    public Vorstand(){
        Person p = new Person();
        super.setName(p.getName());
        super.setNachname(p.getNachname());
        super.setAlter(p.getAlter());
        super.setGeschlecht(p.getGeschlecht());
        super.setNr(23456);
        
    }
    
    public void setGehalt(double pGehalt){
        Gehalt = pGehalt;
    }
    
    public double getGehalt(){
        return Gehalt;
    }
    
    public String getWriteString() {
        return this.klassenName +";" +this.getGehalt() +";" +this.getNr() +";" +this.getName() +";"+this.getNachname()+";"+this.getGeschlecht()+";"+this.getAlter()+";"+this.getGeburtstag()+";\n";
    }
    
}
