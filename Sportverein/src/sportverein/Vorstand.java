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
    double Gehalt;

    public Vorstand(double Gehalt, Double nr, ArrayList<Mannschaft> mannschaften, String name, String nachname, char geschlecht, int alter, Date geburtstag) {
        super(nr, mannschaften, name, nachname, geschlecht, alter, geburtstag);
        this.Gehalt = Gehalt;
    }
    
    
}
