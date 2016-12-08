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
public class Mitglied extends Person {
    
    private Date seit;
    private Double nr;

    public Mitglied(Date seit, Double nr, String name, String nachname, char geschlecht, int alter, Date geburtstag) {
        super(name, nachname, geschlecht, alter, geburtstag);
        this.seit = seit;
        this.nr = nr;
    }

    @Override
    public String toString() {
        return "Mitglied{" + "seit=" + seit + ", nr=" + nr + '}';
    }

   

    /**
     * @return the seit
     */
    public Date getSeit() {
        return seit;
    }

    /**
     * @param seit the seit to set
     */
    public void setSeit(Date seit) {
        this.seit = seit;
    }

    /**
     * @return the nr
     */
    public Double getNr() {
        return nr;
    }

    /**
     * @param nr the nr to set
     */
    public void setNr(Double nr) {
        this.nr = nr;
    }
    
    
    
}
