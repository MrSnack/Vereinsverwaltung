/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein.gui;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

import javax.swing.ListModel;
import sportverein.Sportart;
import sportverein.Verwaltung;

/**
 *
 * @author steffen
 */
public class ListModels {
    
    
    
    public static AbstractListModel<String> getSportarten() {
        ArrayList<Sportart> sportarten = Verwaltung.getInstance().getSportart();
        
      if (sportarten == null) {
            String[] fallback = new String[1];
            fallback[0] = "keine Sportarten verhanden";
            return new javax.swing.DefaultComboBoxModel(fallback);
        } else {
          String[] sportartenBez = new String[sportarten.size()];
          for (Sportart sportart : sportarten) {
              sportartenBez[sportarten.indexOf(sportart)] = sportart.getName();
          }
          return new javax.swing.AbstractListModel() {
            String[] strings = sportartenBez;
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        };
      }
    }
    
    public static AbstractListModel<String> setSportarten(ArrayList<Sportart> sportarten) {
        
        
      if (sportarten == null) {
            String[] fallback = new String[1];
            fallback[0] = "keine Sportarten verhanden";
            return new javax.swing.DefaultComboBoxModel(fallback);
        } else {
          String[] sportartenBez = new String[sportarten.size()];
          for (Sportart sportart : sportarten) {
              sportartenBez[sportarten.indexOf(sportart)] = sportart.getName();
          }
          return new javax.swing.AbstractListModel() {
            String[] strings = sportartenBez;
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        };
      }
    }
    
}
