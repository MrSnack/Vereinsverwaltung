/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein;

import sportverein.handler.Help;
import sportverein.handler.Verwaltung;
import sportverein.models.Sportler;
import ausgabe.DateiAusgabe;
import eingabe.DateiEingabe;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import schnittstellen.IAusgabe;
import schnittstellen.IEingabe;
import sportverein.models.Person;
import sportverein.gui.Gui;
import sportverein.gui.dialoge.SindSieSicherDialog;

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
        
        Verwaltung verwaltung = Verwaltung.getInstance();
        IEingabe eingabe = new DateiEingabe();
        IAusgabe ausgabe = new DateiAusgabe();
        
        ArrayList<Object> test = eingabe.liesDaten();
        System.err.println("Test Schreiben");
        
        ausgabe.schreibeDaten(verwaltung.getSportart(), verwaltung.getSchiedsrichter(), verwaltung.getSportler(), verwaltung.getVorstand(), verwaltung.getTrainer(), verwaltung.getSpiel(), verwaltung.getMannschaft());
        
        Person max = new Person();
        Person max2 = Person.personFromString(max.toString());
        System.out.println(max2.toString());
        
        System.out.println(Sportler.klassenName);
        
        String s = "17.1.2016";
        Help.alterAusDatumString(s);

        System.out.println(Sportler.klassenName);
       
     String [] a = {"English","German","Italian","Korean","Blablablabla.."};
//before sort
for(int i = 0;i<a.length;i++)
{
  System.out.println(a[i]);
}
Arrays.sort(a);
System.out.println("After sort :");
for(int i = 0;i<a.length;i++)
{
  System.out.println(a[i]);
}
        
    }
    
}
