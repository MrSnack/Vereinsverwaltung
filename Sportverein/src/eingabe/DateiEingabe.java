/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eingabe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import schnittstellen.IEingabe;
import sportverein.Mannschaft;
import sportverein.Mitglied;
import sportverein.Schiedsrichter;
import sportverein.Spiel;
import sportverein.Sportart;
import sportverein.Sportler;
import sportverein.Trainer;
import sportverein.Vorstand;

/**
 *
 * @author Hans
 */
public class DateiEingabe implements IEingabe {

    private final String fileURL = "./resources/Datenhaltung.txt";

    private static ArrayList<Object> daten = new ArrayList<>();
    
    public ArrayList<Mannschaft> getMannschaften() {
        ArrayList<Mannschaft> mannschaften = new ArrayList<>();
        for (Object o : daten) {
            if(o.getClass().getSimpleName().equals(Mannschaft.klassenName)) {
                mannschaften.add((Mannschaft)o);
            }
        }
        return mannschaften;
    }
    
    public ArrayList<Schiedsrichter> getSchiedsrichter() {
        ArrayList<Schiedsrichter> schiedsrichter = new ArrayList<>();
        for (Object o : daten) {
            if(o.getClass().getSimpleName().equals(Schiedsrichter.klassenName)) {
                schiedsrichter.add((Schiedsrichter)o);
            }
        }
        return schiedsrichter;
    }
    
    public ArrayList<Spiel> getSpiele() {
        ArrayList<Spiel> spiele = new ArrayList<>();
        for (Object o : daten) {
            if(o.getClass().getSimpleName().equals(Spiel.klassenName)) {
                spiele.add((Spiel)o);
            }
        }
        return spiele;
    }
    
    public ArrayList<Sportart> getSportarten() {
        ArrayList<Sportart> sportarten = new ArrayList<>();
        for (Object o : daten) {
            if(o.getClass().getSimpleName().equals(Sportart.klassenName)) {
                sportarten.add((Sportart)o);
            }
        }
        return sportarten;
    }
    
    public ArrayList<Sportler> getSportler() {
        ArrayList<Sportler> sportler = new ArrayList<>();
        for (Object o : daten) {
            if(o.getClass().getSimpleName().equals(Sportler.klassenName)) {
                sportler.add((Sportler)o);
            }
        }
        return sportler;
    }
    
    public ArrayList<Trainer> getTrainer() {
        ArrayList<Trainer> trainer = new ArrayList<>();
        for (Object o : daten) {
            if(o.getClass().getSimpleName().equals(Trainer.klassenName)) {
                trainer.add((Trainer)o);
            }
        }
        return trainer;
    }
    
    public ArrayList<Vorstand> getVorstand() {
        ArrayList<Vorstand> vorstand = new ArrayList<>();
        for (Object o : daten) {
            if(o.getClass().getSimpleName().equals(Vorstand.klassenName)) {
                vorstand.add((Vorstand)o);
            }
        }
        return vorstand;
    }
    
    @Override
    public ArrayList<Object> liesDaten() {
        
        BufferedReader br = null;
        String eingabe = "";
        try {
            br = new BufferedReader(new FileReader(fileURL));
            while ((eingabe = br.readLine()) != null) {
                String[] splittedEingabe = eingabe.split(";");
                switch (splittedEingabe[0]) {
                    case "Sportler":
                        ArrayList<Sportart> sportarten = new ArrayList<>();
                        for (int j = 1; j < splittedEingabe.length; j++) {
                            for (Object o : daten) {
                            if(o.getClass().getSimpleName().equals(Sportart.klassenName) && ((Sportart)o).getName().equals(splittedEingabe[j])) {
                                sportarten.add((Sportart)o);
                            }
                        }
                        }
                        
                        Sportler sportler = new Sportler(sportarten, Boolean.parseBoolean((splittedEingabe[splittedEingabe.length-8])), Double.parseDouble(splittedEingabe[splittedEingabe.length-7]), Double.parseDouble(splittedEingabe[splittedEingabe.length-6]), splittedEingabe[splittedEingabe.length-5], splittedEingabe[splittedEingabe.length-4], splittedEingabe[splittedEingabe.length-3].charAt(0), Integer.parseInt(splittedEingabe[splittedEingabe.length-2]), splittedEingabe[splittedEingabe.length-1]);
                        daten.add(sportler);
                        break;
                    case "Sportart":
                        Sportart sportart = new Sportart(splittedEingabe[1], Integer.parseInt(splittedEingabe[2]));
                        daten.add(sportart);
                        break;
                    case "Schiedsrichter":
                        Sportart schiedsSport = null;
                        for (Object o : daten) {
                            if(o.getClass().getSimpleName().equals(Sportart.klassenName) && ((Sportart)o).getName().equals(splittedEingabe[2])) {
                                schiedsSport = (Sportart)o;
                            }
                        }
                        Schiedsrichter schiedsrichter = new Schiedsrichter(Double.parseDouble(splittedEingabe[1]), schiedsSport, splittedEingabe[3], splittedEingabe[4] , splittedEingabe[5].charAt(0), Integer.parseInt(splittedEingabe[6]), splittedEingabe[7]);
                        daten.add(schiedsrichter);
                        break;
                    case "Mannschaft":
                        ArrayList<Mitglied> mitglieder = new ArrayList<>();
                        Sportart mannSport = null;
                        
                        for (int i = 2; i < splittedEingabe.length-2; i++) {
                            for (Object o : daten) {
                                if(o.getClass().getSuperclass().getSimpleName().equals(Mitglied.klassenName) && ((Mitglied)o).getNr() == Double.parseDouble(splittedEingabe[i])) {
                                    mitglieder.add((Mitglied)o);
                                }
                            }
                        }
                        
                         for (Object o : daten) {
                            if(o.getClass().getSimpleName().equals(Sportart.klassenName) && ((Sportart)o).getName().equals(splittedEingabe[splittedEingabe.length-1])) {
                                mannSport = (Sportart)o;
                            }
                        }
                        
                        Mannschaft mannschaft= new Mannschaft(splittedEingabe[1], mitglieder, Integer.parseInt(splittedEingabe[splittedEingabe.length-2]), mannSport);
                        daten.add(mannschaft);
                        break;
                    case "Spiel":
                        Sportart spielSport = null;
                        Mannschaft heimMannschaft = null;
                        Mannschaft auswaertsMannschaft = null;
                        for (Object o : daten) {
                            if(o.getClass().getSimpleName().equals(Mannschaft.klassenName) && ((Mannschaft)o).getName().equals(splittedEingabe[1])) {
                                heimMannschaft = (Mannschaft)o;
                            }
                            if(o.getClass().getSimpleName().equals(Mannschaft.klassenName) && ((Mannschaft)o).getName().equals(splittedEingabe[2])) {
                                auswaertsMannschaft = (Mannschaft)o;
                            }
                            if(o.getClass().getSimpleName().equals(Sportart.klassenName) && ((Sportart)o).getName().equals(splittedEingabe[3])) {
                                spielSport = (Sportart)o;
                            }
                        }
                        Spiel spiel = new Spiel(heimMannschaft, auswaertsMannschaft, spielSport, Integer.parseInt(splittedEingabe[4]),splittedEingabe[5]);
                        daten.add(spiel);
                        break;
                    case "Trainer":
                        Trainer trainer = new Trainer(Double.parseDouble(splittedEingabe[1]),Double.parseDouble(splittedEingabe[2]) , Double.parseDouble(splittedEingabe[3]), splittedEingabe[4], splittedEingabe[5], splittedEingabe[6].charAt(0), Integer.parseInt(splittedEingabe[7]), splittedEingabe[8]);
                        daten.add(trainer);
                        break;
                    case "Vorstand":
                        Vorstand vorstand = new Vorstand(Double.parseDouble(splittedEingabe[1]) , Double.parseDouble(splittedEingabe[2]), splittedEingabe[3], splittedEingabe[4], splittedEingabe[5].charAt(0), Integer.parseInt(splittedEingabe[6]), splittedEingabe[7]);
                        daten.add(vorstand);
                        break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return daten;
    }

}
