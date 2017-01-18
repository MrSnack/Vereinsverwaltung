/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein.gui;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.scene.control.ComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import sportverein.Sportart;
import sportverein.Verwaltung;

/**
 *
 * @author steffen
 */
public class ComboBoxModels {
    
    
    
    // für Mitglied Geburtstag
    
    public static DefaultComboBoxModel<Integer> getTage() {
        
        Integer[] days = new Integer[31];
        for (int i = 0; i <days.length; i++) {
            days[i] = i + 1;
        } 
        
        return new javax.swing.DefaultComboBoxModel(days);
    }
    
    public static DefaultComboBoxModel<Integer> getMonate() {
        Integer[] month = new Integer[12];
        for (int i = 0; i <month.length; i++) {
            month[i] = i + 1;
        } 
        return new javax.swing.DefaultComboBoxModel(month);
    }
    
    public static DefaultComboBoxModel<Integer> getJahre() {
        Integer currentYear = new GregorianCalendar().get(Calendar.YEAR);
        Integer yearsSinceNineTeenHundered = currentYear - 1900;
        
        Integer[] years = new Integer[yearsSinceNineTeenHundered];
        for (int i = 0; i <years.length; i++) {
            years[i] = i + 1900;
        } 
        return new javax.swing.DefaultComboBoxModel(years);
    }
    
    // für Mitglied Geschlecht
    
    public static DefaultComboBoxModel<String> getGeschlechter() {
       String[] geschlechter = {"männlich","weiblich"};
       return new javax.swing.DefaultComboBoxModel(geschlechter);
    }
    
    // für Trainer
    
    public static DefaultComboBoxModel<String> getMannschaften() {
        if (Verwaltung.getInstance().getMannschaft() == null) {
            String[] fallback = new String[1];
            fallback[0] = "keine Mannschaften";
            return new javax.swing.DefaultComboBoxModel(fallback);
        }
        // TODO:
       return null;
    }
    
    
    // für ...
    
    public static DefaultComboBoxModel<String> getSportler() {
      if (Verwaltung.getInstance().getSportler() == null || Verwaltung.getInstance().getSportler().size() == 0) {
            String[] fallback = new String[1];
            fallback[0] = "keine Sportler verhanden";
            return new javax.swing.DefaultComboBoxModel(fallback);
        }
        // TODO:
       return null;
    }
    
    
    // fpr Sportler
    
    public static DefaultComboBoxModel<String> getSportarten() {
        ArrayList<Sportart> sportarten = Verwaltung.getInstance().getSportart();
        
      if (sportarten == null || sportarten.size() == 0) {
            String[] fallback = new String[1];
            fallback[0] = "keine Sportarten verhanden";
            return new javax.swing.DefaultComboBoxModel(fallback);
        } else {
          String[] sportartenBez = new String[sportarten.size()];
          for (Sportart sportart : sportarten) {
              sportartenBez[sportarten.indexOf(sportart)] = sportart.getName();
          }
           return new javax.swing.DefaultComboBoxModel(sportartenBez);  
      }
    }
    
    public static DefaultComboBoxModel<Integer> getSpielstaerke() {
        Integer[] spielstaerke = new Integer[100];
        for (int i = 0; i <spielstaerke.length; i++) {
            spielstaerke[i] = i + 1;
        } 
        return new javax.swing.DefaultComboBoxModel(spielstaerke);
    }
    
    
    
    
    
    
    
    
    
}
