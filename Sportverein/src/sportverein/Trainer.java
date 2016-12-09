/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein;

import java.util.Date;

/**
 *
 * @author steffen
 */
public class Trainer extends Mitglied {

    public Trainer(Date seit, Double nr, String name, String nachname, char geschlecht, int alter, Date geburtstag) {
        super(seit, nr, name, nachname, geschlecht, alter, geburtstag);
    }
    
}
