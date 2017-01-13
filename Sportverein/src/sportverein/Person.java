/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein;

import java.sql.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

/**
 *
 * @author steffen
 */
public class Person{

    public static final String klassenName = Person.class.getSimpleName();
    
    private String name;
    private String nachname;
    private int alter;
    private char geschlecht;
    private String geburtstag;

    public Person(String name, String nachname, char geschlecht, int alter, String geburtstag) {
        this.name = name;
        this.nachname = nachname;
        this.geschlecht = geschlecht;
        this.alter = alter;
        this.geburtstag = geburtstag;
    }
    
    public Person() {
        this.name = "MAX";
        this.nachname = "MUSTERMANN";
        this.geschlecht = 'm';
        this.alter = 20;
        this.geburtstag = "22.11.1996";
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
     * @return the nachname
     */
    public String getNachname() {
        return nachname;
    }

    /**
     * @param nachname the nachname to set
     */
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    /**
     * @return the alter
     */
    public int getAlter() {
        return alter;
    }

    /**
     * @param alter the alter to set
     */
    public void setAlter(int alter) {
        this.alter = alter;
    }

    /**
     * @return the geschlecht
     */
    public char getGeschlecht() {
        return geschlecht;
    }

    /**
     * @param geschlecht the geschlecht to set
     */
    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }

    /**
     * @return the geburtstag
     */
    public String getGeburtstag() {
        return geburtstag;
    }

    /**
     * @param geburtstag the geburtstag to set
     */
    public void setGeburtstag(String geburtstag) {
        this.geburtstag = geburtstag;
    }
    
    @Override
    public String toString() {
        
        return this.getClass().getSimpleName() + " " +name + "+" + nachname + "=" + alter + "=" + geschlecht + "=" + geburtstag;
    }
    
    public static Person personFromString(String dataString) {
        System.out.println(dataString);
        
        
        String[] splittedStrings= dataString.split("[=|+|\\s]");
        
        String name = splittedStrings[1];
        String nachname = splittedStrings[2];
         int alter = Integer.parseInt(splittedStrings[3]);

        char geschlecht = splittedStrings[4].charAt(0);
        String geburtstag = splittedStrings[5];
        
        return new Person(name, nachname, geschlecht, alter, geburtstag);
    }
    
}
