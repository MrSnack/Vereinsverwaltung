/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein;

import eingabe.DateiEingabe;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import javax.swing.JFrame;
import schnittstellen.IEingabe;
import sportverein.gui.Gui;

/**
 *
 * @author steffen
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     
        
        Person max = new Person();
        Person max2 = Person.personFromString(max.toString());
        System.out.println(max2.toString());
        
        System.out.println(Sportler.klassenName);
        
       
        Spiel s1 = new Spiel(null, null, null, Integer.SIZE, "17.1.2000");
        Spiel s2 = new Spiel(null, null, null, Integer.SIZE, "19.1.2022");
        Spiel s3 = new Spiel(null, null, null, Integer.SIZE, "15.12.2017");
        Spiel s4 = new Spiel(null, null, null, Integer.SIZE, Help.getTodayStringDate());
        Spiel s5 = new Spiel(null, null, null, Integer.SIZE, "15.2.2017");
        Calendar cal = Calendar.getInstance();
        int diesesJahrInt = cal.get(Calendar.YEAR) * 10000;
        System.out.println(diesesJahrInt);
        System.out.println(Help.getTodayStringDate());
        int i = Help.intFromDateString(Help.getTodayStringDate())- diesesJahrInt;
        String[] splittedStrings= s2.getDatum().split("\\.");
        int z = Integer.valueOf(splittedStrings[1])+1;
        System.out.println(z);
        System.out.println(i/100);

        ArrayList<Spiel> spiele = new ArrayList<Spiel>();
        spiele.add(s1);
        spiele.add(s2);
        spiele.add(s3);
        spiele.add(s4);
        spiele.add(s5);
        Verwaltung.getInstance().spiel = spiele;
        System.out.println(Verwaltung.getInstance().getSpieleNaechstenMonatString());
    }
    
}
