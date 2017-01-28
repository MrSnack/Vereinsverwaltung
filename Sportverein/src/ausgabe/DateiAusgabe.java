/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ausgabe;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import schnittstellen.IAusgabe;

/**
 *
 * @author Karsten
 */
public class DateiAusgabe implements IAusgabe{

    private final String fileURL = "./resources/DatenhaltungSchreiben.txt";
    
    
    @Override
    public void schreibeDaten(ArrayList<Object> daten) {
        //TODO: irgendwas zum schreiben überlegen das unten geht nur bedingt oder benötigt viel arbeit
    }
    
    
    
    
    //
    
 /*   public void schreibeDaten(ArrayList<Object> daten) {
        Class c = null;
        String text = "";

        for (Object object : daten) {
            c = object.getClass();

            Field[] fields = c.getDeclaredFields();

            for (int i = 0; i < fields.length; i++) {

                try {
                    fields[i].setAccessible(true);
                    Object obj = fields[i].get(object);
                    text += obj +";";
                } catch (IllegalArgumentException ex) {
                    Logger.getLogger(DateiAusgabe.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(DateiAusgabe.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            text += "\n";
        }
        
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(fileURL));
            
            bw.write(text);
            
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(DateiAusgabe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
*/

    
}
