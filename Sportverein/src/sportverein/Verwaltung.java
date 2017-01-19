/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein;

import java.util.ArrayList;

/**
 *
 * @author SNowak7137
 */
public class Verwaltung {
    
    private static Verwaltung verwaltung = null;
   
    ArrayList<Sportler> sportler;
    ArrayList<Vorstand> vorstand;
    ArrayList<Schiedsrichter> schiedsrichter;
    ArrayList<Sportart> sportart;
    ArrayList<Trainer> trainer;
    ArrayList<Spiel> spiel;
    ArrayList<Mannschaft> mannschaft;
    
    String benutzer;
    
    private Verwaltung() {
        // me emtpy must so
    }
 
    public static Verwaltung getInstance() {
        if(verwaltung == null) {
            verwaltung = new Verwaltung();
           // init all lists
            verwaltung.setVerwaltung(
                    new ArrayList<Sportler>(), 
                    new ArrayList<Vorstand>(), 
                    new ArrayList<Schiedsrichter>(), 
                    new ArrayList<Sportart>(), 
                    new ArrayList<Trainer>(), 
                    new ArrayList<Spiel>(), 
                    new ArrayList<Mannschaft>(), 
                    "Admin");
        } 
        return verwaltung;
    }
    
      private void setVerwaltung(ArrayList<Sportler> sportler, ArrayList<Vorstand> vorstand, ArrayList<Schiedsrichter> schiedsrichter, ArrayList<Sportart> sportart, ArrayList<Trainer> trainer, ArrayList<Spiel> spiel, ArrayList<Mannschaft> mannschaft, String benutzer) {
        this.sportler = sportler;
        this.vorstand = vorstand;
        this.schiedsrichter = schiedsrichter;
        this.sportart = sportart;
        this.trainer = trainer;
        this.spiel = spiel;
        this.mannschaft = mannschaft;
        this.benutzer = benutzer;
    }
    
    
    public ArrayList<Sportler> getSportler() {
        return sportler;
    }

    public void setSportler(ArrayList<Sportler> sportler) {
        this.sportler = sportler;
    }

    public ArrayList<Vorstand> getVorstand() {
        return vorstand;
    }

    public void setVorstand(ArrayList<Vorstand> vorstand) {
        this.vorstand = vorstand;
    }

    public ArrayList<Schiedsrichter> getSchiedsrichter() {
        return schiedsrichter;
    }

    public void setSchiedsrichter(ArrayList<Schiedsrichter> schiedsrichter) {
        this.schiedsrichter = schiedsrichter;
    }

    public ArrayList<Sportart> getSportart() {
        return sportart;
    }

    public void setSportart(ArrayList<Sportart> sportart) {
        this.sportart = sportart;
    }

    public ArrayList<Trainer> getTrainer() {
        return trainer;
    }

    public void setTrainer(ArrayList<Trainer> trainer) {
        this.trainer = trainer;
    }

    public ArrayList<Spiel> getSpiel() {
        return spiel;
    }

    public void setSpiel(ArrayList<Spiel> spiel) {
        this.spiel = spiel;
    }

    public ArrayList<Mannschaft> getMannschaft() {
        return mannschaft;
    }

    public void setMannschaft(ArrayList<Mannschaft> mannschaft) {
        this.mannschaft = mannschaft;
    }

    public String getBenutzer() {
        return benutzer;
    }

    public void setBenutzer(String benutzer) {
        this.benutzer = benutzer;
    }
    
    //@param Konstruktorparameter von Sportler
    public boolean legeSportlerAn(ArrayList<Sportart> sportarten, boolean verletzt, double spielstaerke,
                               double nr,String name, String nachname, 
                               char geschlecht, int alter, String geburtstag){
        
        
        Sportler s = new Sportler(sportarten,verletzt,spielstaerke,nr,
                                  name,nachname,geschlecht,alter,geburtstag);
        
        this.sportler.add(s);
        return true;
    }
    
    public boolean legeTrainerAn(double entgelt, double siege, double nr, String name,
                              String nachname, char geschlecht, int alter, String geburtstag) {
        
        Trainer t = new Trainer(entgelt,siege,nr,name,nachname,geschlecht,alter,geburtstag);
        
        this.trainer.add(t);
        return true;
    }
    
    public boolean legeVorstandAn(double Gehalt, Double nr, String name,
                               String nachname, char geschlecht, int alter, String geburtstag) {
        
        Vorstand v = new Vorstand(Gehalt,nr,name,nachname,geschlecht,alter,geburtstag);
        
        this.vorstand.add(v);
        return true;
    }
    
    public boolean legeSchiedsrichterAn(double gehalt, Sportart sportart, String name, 
                                      String nachname, char geschlecht, int alter, String geburtstag){
        Schiedsrichter s = new Schiedsrichter(gehalt,sportart,name,nachname,geschlecht,alter,geburtstag);
        
        this.schiedsrichter.add(s);        
        return true;
    }
    
    public boolean legeMannschaftAn(String name, ArrayList<Mitglied> mitglieder, int rang, Sportart sportart){
        Mannschaft m = new Mannschaft(name,mitglieder,rang,sportart);
        
        this.mannschaft.add(m);
        return true;
    }
    
    public boolean legeSportartAn(String name, Integer minAnzahlSpieler){
        Sportart s = new Sportart(name,minAnzahlSpieler);
        
        this.sportart.add(s);
        return true;
    }
    
    public boolean legeSpielAn(Mannschaft heimMannschaft, Mannschaft auswaertsMannschaft, Sportart sportart, Integer rang){
        if (heimMannschaft.getSportart() == auswaertsMannschaft.getSportart()){
        
            Spiel s = new Spiel(heimMannschaft,auswaertsMannschaft,sportart,rang);
        
            this.spiel.add(s);
            return true;
        }
        return false; // fehler behoben von Steffen
    }
    
    public boolean weiseMitgliedEinerMannschaftZu(Mitglied mitglied,Mannschaft mannschaft){
        if (mannschaft.getMitglieder().contains(mitglied)){
            return true;
        }
        mannschaft.getMitglieder().add(mitglied);
        return true;
    }
    
    public boolean loescheMitgliedAusMannschaft(Mitglied mitglied,Mannschaft mannschaft){
        if (mannschaft.getMitglieder().contains(mitglied)){
            mannschaft.getMitglieder().remove(mitglied);            
        }
        return true;
    }
    
    public boolean weiseSportlerEineSportartZu(Sportler sportler, Sportart sportart){
        if (sportler.getSportarten().contains(sportart) == false){
            sportler.getSportarten().add(sportart);
        }
        return true;
    }
    
    public boolean entferneSportartVonSportler(Sportler sportler, Sportart sportart){
        if (sportler.getSportarten().contains(sportart)){
            sportler.getSportarten().remove(sportart);
        }
        return true;
    }
    
    public ArrayList<Spiel> getSpielplan(Mannschaft mannschaft){
        ArrayList<Spiel> s = new ArrayList<>();
        
        for (int i = 0;i <= spiel.size();i++){
            if (spiel.get(i).getAuswaertsMannschaft() == mannschaft){
               s.add(spiel.get(i));               
            }
            if (spiel.get(i).getHeimMannschaft() == mannschaft){
                s.add(spiel.get(i));
            }
        }
        return s;
    }
    
    public ArrayList<Spiel> getSpielplan(Sportart sportart){
        ArrayList<Spiel> s = new ArrayList<>();
        
        for (int i = 0;i <= spiel.size();i++){
            if (spiel.get(i).getSportart() == sportart){
               s.add(spiel.get(i));               
            }
            if (spiel.get(i).getSportart() == sportart){
                s.add(spiel.get(i));
            }
        }
        return s;
    }
    /**
     * created by Steffen Haas
     * 
     * 
     * @return gesamt Zahl Mitglieder
     
    */
    public int getAnzahlMitglieder() {
        int anzahlSportler = 0;
        int anzahlTrainer = 0;
        int anzahlVorstand = 0;
        if (sportler != null) {
            anzahlSportler = sportler.size();
        }
        if (trainer != null) {
            anzahlTrainer = trainer.size();
        }
        if (vorstand != null) {
           anzahlVorstand = vorstand.size();
        }
        return (anzahlSportler + anzahlTrainer + anzahlVorstand);
    }
    /**
     * 
     * @param sportartBez
     * @return Sportart wenn vorhandenen sonst null
     */
    public Sportart findSportart(String sportartBez) {
        if (sportart != null) {
           for (Sportart einzelneSportart : sportart) {
              if (einzelneSportart.getName() == sportartBez) {
                return einzelneSportart;
               }
            } 
        }
        System.out.println("Keine Sportart mit der Bezeichnung: " + sportartBez + " gefunden");
        return null;
    }
    
    
    
    
    
}
