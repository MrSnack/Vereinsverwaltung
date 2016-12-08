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
public class Person implements Bla{

    
    private String name;
    private String nachname;
    private int alter;
    private char geschlecht;
    private Date geburtstag;

    
    

    public Person(String name, String nachname, char geschlecht, int alter, Date geburtstag) {
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
        this.geburtstag = Person.getGeburtstagbyInt(20, Calendar.NOVEMBER, 12);
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
    public Date getGeburtstag() {
        return geburtstag;
    }
    
    public static Date getGeburtstagbyInt(int alter, int monat, int tag) {
         int year = Calendar.getInstance().get(Calendar.YEAR);
        int jahr = year - alter;
        Calendar c = Calendar.getInstance();
        c.set(jahr, monat, tag);
        return c.getTime();
    }

    /**
     * @param geburtstag the geburtstag to set
     */
    public void setGeburtstag(Date geburtstag) {
        this.geburtstag = geburtstag;
    }
    
    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String gebString = df.format(geburtstag);
        System.out.println(geburtstag);
        return this.getClass().getSimpleName() + " " +name + "+" + nachname + "=" + alter + "=" + geschlecht + "=" + gebString;
    }
    
    public static Person fromString(String dataString) {
        System.out.println(dataString);
        
        
        String[] splittedStrings= dataString.split("[=|+|\\s]");
        
        String name = splittedStrings[1];
        String nachname = splittedStrings[2];
         int alter = Integer.parseInt(splittedStrings[3]);
        // TODO
       
        char geschlecht = splittedStrings[4].charAt(0);
        String[] intStrings = splittedStrings[5].split("/");
        for (int i =0; i <intStrings.length; i++) {
            System.out.println(intStrings[i]);
        }
        
        int tag = Integer.parseInt(intStrings[0]);
        int monat = Integer.parseInt(intStrings[1]);
        
        
        for (int i =0; i <splittedStrings.length; i++) {
            System.out.println(splittedStrings[i]);
        }
        Date geburtstag = Person.getGeburtstagbyInt(alter, monat, tag);
        return new Person(name, nachname, geschlecht, alter, geburtstag);
    }

    @Override
    public void dosomething() {
        // bla
    }
    
}
