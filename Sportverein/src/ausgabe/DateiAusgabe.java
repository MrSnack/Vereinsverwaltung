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
import sportverein.Mannschaft;
import sportverein.Schiedsrichter;
import sportverein.Spiel;
import sportverein.Sportart;
import sportverein.Sportler;
import sportverein.Trainer;
import sportverein.Vorstand;

/**
 *
 * @author Karsten
 */
public class DateiAusgabe implements IAusgabe{

    private final String fileURL = "./resources/DatenhaltungSchreiben.txt";
    

     @Override
    public void schreibeDaten(ArrayList<Sportart> sportarten, ArrayList<Schiedsrichter> schiedsrichter, ArrayList<Sportler> sportler, ArrayList<Vorstand> vorstaende, ArrayList<Trainer> trainer, ArrayList<Spiel> spiele, ArrayList<Mannschaft> mannschaften) {
        String text = "";
        
         for (Sportart sportart : sportarten) {
             text += sportart.getWriteString();
         }
        
         for (Schiedsrichter schied : schiedsrichter) {
             text += schied.getWriteString();
         }
        
         for (Sportler sportlers : sportler) {
             text += sportlers.getWriteString();
         }
         
         for (Vorstand vorstand : vorstaende) {
             text += vorstand.getWriteString();
         }
         
         for (Trainer trainers : trainer) {
             text += trainers.getWriteString();
         }
         
         for (Mannschaft mannschafts : mannschaften) {
             text += mannschafts.getWriteString();
         }
         
         for (Spiel spiels : spiele) {
             text += spiels.getWriteString();
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
    
    
    /*public void schreibeDaten(ArrayList<Object> daten) {
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

    }*/

   

    


    
}
