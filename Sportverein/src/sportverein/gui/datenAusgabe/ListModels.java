/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein.gui.datenAusgabe;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

import javax.swing.ListModel;
import sportverein.models.Mannschaft;
import sportverein.models.Sportart;
import sportverein.models.Sportler;
import sportverein.models.Trainer;
import sportverein.handler.Verwaltung;
import sportverein.models.Schiedsrichter;
import sportverein.models.Spiel;
import sportverein.models.Vorstand;

/**
 *
 * @author steffen
 */
public class ListModels {
    
    
    
    public static AbstractListModel<String> getSportarten() {
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
          return new javax.swing.AbstractListModel() {
            String[] strings = sportartenBez;
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        };
      }
    }
    
    public static AbstractListModel<String> getSportler() {
        ArrayList<Sportler> sportler = Verwaltung.getInstance().getSportler();
        
      if (sportler == null || sportler.size() == 0) {
            String[] fallback = new String[1];
            fallback[0] = "keine Sportler verhanden";
            return new javax.swing.DefaultComboBoxModel(fallback);
        } else {
          String[] sportartenBez = new String[sportler.size()];
          for (Sportler spo : sportler) {
              sportartenBez[sportler.indexOf(spo)] = spo.getInfoString();
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
        
      if (sportler == null || sportler.size() == 0) {
            String[] fallback = new String[1];
            fallback[0] = "keine Sportler verhanden";
            return new javax.swing.DefaultComboBoxModel(fallback);
        } else {
          String[] sportartenBez = new String[sportler.size()];
          for (Sportler spo : sportler) {
              if (mannschaft.getMitglieder().contains(spo)){
                sportartenBez[sportler.indexOf(spo)] = spo.getInfoString();
              }
          }
          return new javax.swing.AbstractListModel() {
            String[] strings = sportartenBez;
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        };
      }
    }
     
     public static AbstractListModel<String> getSportlerMit(Sportart sportart) {
        ArrayList<Sportler> sportler = Verwaltung.getInstance().getSportler();
        
      if (sportler == null || sportler.size() == 0) {
            String[] fallback = new String[1];
            fallback[0] = "keine Sportler gefunden";
            return new javax.swing.DefaultComboBoxModel(fallback);
        } else {
          ArrayList<String> sportlerBez = new ArrayList<String>();
          for (Sportler spo : sportler) {
              for (Sportart spoSportart : spo.getSportarten()) {
                  if (spoSportart.getName() == sportart.getName()){
                    sportlerBez.add(spo.getInfoString());
                 } 
              } 
          }
          if (sportlerBez.size() == 0) {
              String[] fallback = new String[1];
            fallback[0] = "keine Sportler mit dieser Sportart gefunden";
            return new javax.swing.DefaultComboBoxModel(fallback);
          } else {
              return new javax.swing.AbstractListModel() {
                  ArrayList<String> strings = sportlerBez;
            public int getSize() { return strings.size(); }
            public Object getElementAt(int i) { return strings.get(i); }
             };
          }
          
      }
    }
     
    public static AbstractListModel<String> getTrainer() {
        ArrayList<Trainer> trainer = Verwaltung.getInstance().getTrainer();
        
      if (trainer == null || trainer.size() == 0) {
            String[] fallback = new String[1];
            fallback[0] = "keine Trainer verhanden";
            return new javax.swing.DefaultComboBoxModel(fallback);
        } else {
          String[] sportartenBez = new String[trainer.size()];
          for (Trainer tr : trainer) {
              sportartenBez[trainer.indexOf(tr)] = tr.getInfoString();
          }
          return new javax.swing.AbstractListModel() {
            String[] strings = sportartenBez;
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        };
      }
    }
     
    public static AbstractListModel<String> getTrainer(Mannschaft mannschaft) {
        ArrayList<Trainer> trainer = mannschaft.getTrainer();
        
      if (trainer == null || trainer.size() == 0) {
            String[] fallback = new String[1];
            fallback[0] = "keine Trainer verhanden";
            return new javax.swing.DefaultComboBoxModel(fallback);
        } else {
          String[] sportartenBez = new String[trainer.size()];
          for (Trainer tr : trainer) {
              if (mannschaft.getTrainer().contains(tr)){
                sportartenBez[trainer.indexOf(tr)] = tr.getInfoString();
              }
          }
          return new javax.swing.AbstractListModel() {
            String[] strings = sportartenBez;
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        };
      }
    }
    
    
    public static AbstractListModel<String> setSportarten(ArrayList<Sportart> sportarten) {
        
        
      if (sportarten == null || sportarten.size() == 0) {
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
    
    
     
    
    public static AbstractListModel<String> setSportler(ArrayList<Sportler> sportlerListe) {

        
      if (sportlerListe == null || sportlerListe.size() == 0) {
            String[] fallback = new String[1];
            fallback[0] = "kein Sportler verhanden";
            return new javax.swing.DefaultComboBoxModel(fallback);
        } else {
          String[] sportlerBez = new String[sportlerListe.size()];
          for (Sportler spo : sportlerListe) {
              sportlerBez[sportlerListe.indexOf(spo)] = spo.getInfoString();
          }
          return new javax.swing.AbstractListModel() {
            String[] strings = sportlerBez;
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        };
      }
    }
    
    public static AbstractListModel<String> getVorstand() {
        ArrayList<Vorstand> vorstand = Verwaltung.getInstance().getVorstand();
        System.out.println("Anzahl Vorstand:" + vorstand.size());
      if (vorstand == null || vorstand.size() == 0) {
            String[] fallback = new String[1];
            fallback[0] = "keine Vorstandsmitglieder verhanden";
            return new javax.swing.DefaultComboBoxModel(fallback);
        } else {
          String[] vorstandBez = new String[vorstand.size()];
          for (Vorstand v : vorstand) {
              System.out.println("Index of Vorstand " + v.getName() +" index"+ vorstand.indexOf(v));
              vorstandBez[vorstand.indexOf(v)] = v.getInfoString();
          }
          return new javax.swing.AbstractListModel() {
            String[] strings = vorstandBez;
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        };
      }
    }

    public static ListModel setTrainer(ArrayList<Trainer> trainerListe) {
        if (trainerListe == null || trainerListe.size() == 0) {
            String[] fallback = new String[1];
            fallback[0] = "keine Trainer verhanden";
            return new javax.swing.DefaultComboBoxModel(fallback);
        } else {
          ArrayList<String> trainerBez = new ArrayList<String>();
          for (Trainer einTrainer : trainerListe) {
              trainerBez.add(einTrainer.getInfoString());
          }
          // check array again for size
          if (trainerBez.size() == 0) {
              String[] fallback = new String[1];
            fallback[0] = "keine Trainer gefunden";
            return new javax.swing.DefaultComboBoxModel(fallback);
          }
          return new javax.swing.AbstractListModel() {
                  ArrayList<String> strings = trainerBez;
            public int getSize() { return strings.size(); }
            public Object getElementAt(int i) { return strings.get(i); }
             };
      }
    }
    
    public static AbstractListModel<String> getSchiedsrichter() {
        ArrayList<Schiedsrichter> schiedsrichter = Verwaltung.getInstance().getSchiedsrichter();
        System.out.println("Anzahl Schiedsrichter:" + schiedsrichter.size());
      if (schiedsrichter == null || schiedsrichter.size() == 0) {
            String[] fallback = new String[1];
            fallback[0] = "keine Schiedsrichter verhanden";
            return new javax.swing.DefaultComboBoxModel(fallback);
        } else {
          String[] schiedsrichterBez = new String[schiedsrichter.size()];
          for (Schiedsrichter s : schiedsrichter) {
              System.out.println("Index of Schiedsrichter " + s.getName() +" index"+ schiedsrichter.indexOf(s));
              schiedsrichterBez[schiedsrichter.indexOf(s)] = s.getInfoString();
          }
          return new javax.swing.AbstractListModel() {
            String[] strings = schiedsrichterBez;
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        };
      }
    }
    
    public static AbstractListModel<String> getSpiel() {
         ArrayList<Spiel> spiel = Verwaltung.getInstance().getSpiel();
        
      if (spiel == null || spiel.size() == 0) {
            String[] fallback = new String[1];
            fallback[0] = "keine Spiele verhanden";
            return new javax.swing.DefaultComboBoxModel(fallback);
        } else {
          String[] mannschaftBez = new String[spiel.size()];
          for (Spiel ma : spiel) {
              mannschaftBez[spiel.indexOf(ma)] = ma.getDatumUndMannschaften();
          }
          return new javax.swing.AbstractListModel() {
            String[] strings = mannschaftBez;
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        };
      }
    }
    
    public static AbstractListModel<String> getMannschaft() {
        ArrayList<Mannschaft> mannschaft = Verwaltung.getInstance().getMannschaft();
        
      if (mannschaft == null || mannschaft.size() == 0) {
            String[] fallback = new String[1];
            fallback[0] = "keine Mannschaften verhanden";
            return new javax.swing.DefaultComboBoxModel(fallback);
        } else {
          String[] mannschaftBez = new String[mannschaft.size()];
          for (Mannschaft ma : mannschaft) {
              mannschaftBez[mannschaft.indexOf(ma)] = ma.getName();
          }
          return new javax.swing.AbstractListModel() {
            String[] strings = mannschaftBez;
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        };
      }
    }
    
}
