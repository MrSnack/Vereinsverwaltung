/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein.gui;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

import javax.swing.ListModel;
import sportverein.Mannschaft;
import sportverein.Sportart;
import sportverein.Sportler;
import sportverein.Trainer;
import sportverein.Verwaltung;
import sportverein.Vorstand;

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
    
    public static AbstractListModel<String> getSportler() {
        ArrayList<Sportler> sportler = Verwaltung.getInstance().getSportler();
        
      if (sportler == null) {
            String[] fallback = new String[1];
            fallback[0] = "keine Sportarten verhanden";
            return new javax.swing.DefaultComboBoxModel(fallback);
        } else {
          String[] sportartenBez = new String[sportler.size()];
          for (Sportler spo : sportler) {
              sportartenBez[sportler.indexOf(sportler)] = spo.getName();
          }
          return new javax.swing.AbstractListModel() {
            String[] strings = sportartenBez;
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        };
      }
    }
    
     public static AbstractListModel<String> getSportler(Mannschaft mannschaft) {
        ArrayList<Sportler> sportler = Verwaltung.getInstance().getSportler();
        
      if (sportler == null) {
            String[] fallback = new String[1];
            fallback[0] = "keine Sportarten verhanden";
            return new javax.swing.DefaultComboBoxModel(fallback);
        } else {
          String[] sportartenBez = new String[sportler.size()];
          for (Sportler spo : sportler) {
              if (mannschaft.getMitglieder().contains(spo)){
                sportartenBez[sportler.indexOf(sportler)] = spo.getName();
              }
          }
          return new javax.swing.AbstractListModel() {
            String[] strings = sportartenBez;
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        };
      }
    }
    
    public static AbstractListModel<String> getTrainer() {
        ArrayList<Trainer> trainer = Verwaltung.getInstance().getTrainer();
        
      if (trainer == null) {
            String[] fallback = new String[1];
            fallback[0] = "keine Sportarten verhanden";
            return new javax.swing.DefaultComboBoxModel(fallback);
        } else {
          String[] sportartenBez = new String[trainer.size()];
          for (Trainer tr : trainer) {
              sportartenBez[trainer.indexOf(trainer)] = tr.getName();
          }
          return new javax.swing.AbstractListModel() {
            String[] strings = sportartenBez;
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        };
      }
    }
    
    public static AbstractListModel<String> getVorstand() {
        ArrayList<Vorstand> vorstand = Verwaltung.getInstance().getVorstand();
        
      if (vorstand == null) {
            String[] fallback = new String[1];
            fallback[0] = "keine Sportarten verhanden";
            return new javax.swing.DefaultComboBoxModel(fallback);
        } else {
          String[] sportartenBez = new String[vorstand.size()];
          for (Vorstand v : vorstand) {
              sportartenBez[vorstand.indexOf(vorstand)] = v.getName();
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
