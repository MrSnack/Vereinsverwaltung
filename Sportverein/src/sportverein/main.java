/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
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
        
        String s = "17.1.2016";
        Help.alterAusDatumString(s);
        
        
       
        
    }
    
}
