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

    public Vorstand(double Gehalt, double nr, String name, String nachname, char geschlecht, int alter, String geburtstag) {
        super(nr, name, nachname, geschlecht, alter, geburtstag);
        this.Gehalt = Gehalt;
    }

    

    
    
    
}
