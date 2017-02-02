
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein.handler;

import sportverein.models.Spiel;
import sportverein.models.Sportler;
import sportverein.models.Sportart;
import sportverein.models.Schiedsrichter;
import sportverein.models.Mitglied;
import sportverein.models.Mannschaft;
import sportverein.models.Trainer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import sportverein.models.Vorstand;

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
        if (verwaltung == null) {
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

    public void setVerwaltung(ArrayList<Sportler> sportler, ArrayList<Vorstand> vorstand, ArrayList<Schiedsrichter> schiedsrichter, ArrayList<Sportart> sportart, ArrayList<Trainer> trainer, ArrayList<Spiel> spiel, ArrayList<Mannschaft> mannschaft, String benutzer) {
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
            int nr, String name, String nachname,
            char geschlecht, int alter, String geburtstag) {

        Sportler s = new Sportler(sportarten, verletzt, spielstaerke, nr,
                name, nachname, geschlecht, alter, geburtstag);

        this.sportler.add(s);
        return true;
    }

    public boolean legeTrainerAn(double entgelt, double siege, int nr, String name,
            String nachname, char geschlecht, int alter, String geburtstag) {

        Trainer t = new Trainer(entgelt, siege, nr, name, nachname, geschlecht, alter, geburtstag);

        this.trainer.add(t);
        return true;
    }

    public boolean legeVorstandAn(double Gehalt, int nr, String name,
            String nachname, char geschlecht, int alter, String geburtstag) {

        Vorstand v = new Vorstand(Gehalt, nr, name, nachname, geschlecht, alter, geburtstag);

        this.vorstand.add(v);
        return true;
    }

    public boolean legeSchiedsrichterAn(double gehalt, Sportart sportart, String name,
            String nachname, char geschlecht, int alter, String geburtstag) {
        Schiedsrichter s = new Schiedsrichter(gehalt, sportart, name, nachname, geschlecht, alter, geburtstag);

        this.schiedsrichter.add(s);
        return true;
    }

    public boolean legeMannschaftAn(String name, ArrayList<Mitglied> mitglieder, int rang, Sportart sportart) {
        Mannschaft m = new Mannschaft(name, mitglieder, rang, sportart);

        this.mannschaft.add(m);
        return true;
    }

    public boolean legeSportartAn(String name, Integer minAnzahlSpieler) {
        Sportart s = new Sportart(name, minAnzahlSpieler);

        this.sportart.add(s);
        return true;
    }

    public boolean legeSpielAn(Mannschaft heimMannschaft, Mannschaft auswaertsMannschaft, Sportart sportart, Integer rang, String datum) {
        if (heimMannschaft.getSportart() == auswaertsMannschaft.getSportart()) {

            Spiel s = new Spiel(heimMannschaft, auswaertsMannschaft, sportart, rang, datum);

            this.spiel.add(s);
            return true;
        }
        return false; // fehler behoben von Steffen
    }

    public boolean weiseMitgliedEinerMannschaftZu(Mitglied mitglied, Mannschaft mannschaft) {
        if (mannschaft.getMitglieder().contains(mitglied)) {
            return true;
        }
        mannschaft.getMitglieder().add(mitglied);
        return true;
    }

    public boolean loescheMitgliedAusMannschaft(Mitglied mitglied, Mannschaft mannschaft) {
        if (mannschaft.getMitglieder().contains(mitglied)) {
            mannschaft.getMitglieder().remove(mitglied);
        }
        return true;
    }

    public boolean weiseSportlerEineSportartZu(Sportler sportler, Sportart sportart) {
        if (sportler.getSportarten().contains(sportart) == false) {
            sportler.getSportarten().add(sportart);
        }
        return true;
    }

    public boolean entferneSportartVonSportler(Sportler sportler, Sportart sportart) {
        if (sportler.getSportarten().contains(sportart)) {
            sportler.getSportarten().remove(sportart);
        }
        return true;
    }

    public ArrayList<Spiel> getSpielplan(Mannschaft mannschaft) {
        ArrayList<Spiel> s = new ArrayList<>();

        for (int i = 0; i <= spiel.size(); i++) {
            if (spiel.get(i).getAuswaertsMannschaft() == mannschaft) {
                s.add(spiel.get(i));
            }
            if (spiel.get(i).getHeimMannschaft() == mannschaft) {
                s.add(spiel.get(i));
            }
        }
        return s;
    }

    public ArrayList<Spiel> getSpielplan(Sportart sportart) {
        ArrayList<Spiel> s = new ArrayList<>();

        for (int i = 0; i <= spiel.size(); i++) {
            if (spiel.get(i).getSportart() == sportart) {
                s.add(spiel.get(i));
            }
            if (spiel.get(i).getSportart() == sportart) {
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
     *
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
     * created by Steffen Haas
     *
     * @param sportartBez Name der Sportart
     *
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

    public Sportler findSportler(int nr) {
        if (sportler != null) {
            for (Sportler einzelnerSportler : sportler) {
                if (einzelnerSportler.getNr() == nr) {
                    return einzelnerSportler;
                }
            }
        }
        System.out.println("Kein Sportler mit der Nr: " + nr + " gefunden");
        return null;
    }

    public Trainer findTrainer(int nr) {
        if (trainer != null) {
            for (Trainer einzelnderTrainer : trainer) {
                if (einzelnderTrainer.getNr() == nr) {
                    return einzelnderTrainer;
                }
            }
        }
        System.out.println("Keinen Trainer mit der Nr: " + nr + " gefunden");
        return null;
    }

    public Vorstand findVorstand(int nr) {
        if (vorstand != null) {
            for (Vorstand einzelnerVorstand : vorstand) {
                if (einzelnerVorstand.getNr() == nr) {
                    return einzelnerVorstand;
                }
            }
        }
        System.out.println("Keinen Vorstand mit der Nr: " + nr + " gefunden");
        return null;
    }

    public Schiedsrichter findSchiedsrichter(int nr) {
        if (schiedsrichter != null) {
            for (Schiedsrichter einzelnerSchiedsrichter : schiedsrichter) {
                if (einzelnerSchiedsrichter.getNr() == nr) {
                    return einzelnerSchiedsrichter;
                }
            }
        }
        System.out.println("Keinen Schiedsrichter mit der Nr: " + nr + " gefunden");
        return null;
    }

    public Mannschaft findMannschaft(String mannschaftBez) {
        if (mannschaft != null && mannschaft.size() != 0) {
            for (Mannschaft einzelneMannschaft : mannschaft) {
                if (einzelneMannschaft.getName() == mannschaftBez) {
                    return einzelneMannschaft;
                }
            }
        }
        System.out.println("Keine Mannschaft mit dem Namen: " + mannschaftBez + " gefunden");
        return null;
    }

    /**
     * created by Steffen Haas
     *
     * @return String
     */
    public Spiel getNaechstesSpiel() {
        int heuteInt = Help.intFromDateString(Help.getTodayStringDate());
        ArrayList<Spiel> sortierteSpiele = Spiel.sortAbsteigend(spiel);
        for (Spiel einzelnesSpiel : sortierteSpiele) {
            if (Help.intFromDateString(einzelnesSpiel.getDatum()) >= heuteInt) {
                return einzelnesSpiel;
            }
        }
        // fallback leeres Spiel um keine null pointer zu erzeugen
        return new Spiel();
    }

    /**
     * created by Steffen Haas
     *
     * @return
     */
    public String getSpieleNaechstenMonatString() {
        String fallback = "Keine Spiele vorhanden";
        String alleSpiele = "";
        int heuteInt = Help.intFromDateString(Help.getTodayStringDate());
        Calendar cal = Calendar.getInstance();
        // String von Datum des nächsten Monats
        String anfangUeberNaechsterMonat = "1." + (cal.get(Calendar.MONTH) + 3) + "." + cal.get(Calendar.YEAR);
        int naechsterMonatInt = Help.intFromDateString(anfangUeberNaechsterMonat);
        // spiele chronologisch sortieren
        ArrayList<Spiel> sortierteSpiele = Spiel.sortAbsteigend(this.spiel);
        for (Spiel einzelnesSpiel : sortierteSpiele) {
            if (heuteInt < Help.intFromDateString(einzelnesSpiel.getDatum())) {
                // wenn Datum des Spiels nach heute liegt
                if (naechsterMonatInt > Help.intFromDateString(einzelnesSpiel.getDatum())) {
                    // wenn int Spieldatum kleiner als int anfang nächster Monat für diese Spiel Hinzu
                    alleSpiele = alleSpiele + einzelnesSpiel.getDatumUndMannschaften() + "\n";
                }
            }
            String[] splittedStrings = einzelnesSpiel.getDatum().split("\\.");
        }
        if (spiel.size() == 0) {
            return fallback;
        }
        return alleSpiele;
    }

    public String getAlleSportartenNamen() {
        if (sportart != null && sportart.size() != 0) {
            String sportString = "";
            for (Sportart sport : sportart) {
                sportString = sportString + sport.getName() + "\n";
            }
            return sportString;

        } else {
            return "keine Sportarten gefunden";
        }
    }

    public String getAlleSportlerInfos() {
        if (sportler != null && sportler.size() != 0) {
            String sportlerString = "";
            for (Sportler sportler : sportler) {
                sportlerString = sportlerString + sportler.getInfoString() + "\n";
            }
            return sportlerString;
        } else {
            return "keine Sportler gefunden";
        }
    }

    public String getAlleTrainerNamen() {
        if (trainer != null && trainer.size() != 0) {
            String trainerString = "";
            for (Trainer trainer : trainer) {
                trainerString = trainerString + trainer.getInfoString() + "\n";
            }
            return trainerString;
        } else {
            return "keine Trainer gefunden";
        }
    }

    public String getAlleVorstandsNamen() {
        if (vorstand != null && vorstand.size() != 0) {
            String vorstandsString = "";
            for (Vorstand vorstand : vorstand) {
                vorstandsString = vorstandsString + vorstand.getInfoString() + "\n";
            }
            return vorstandsString;
        } else {
            return "keinen Vorstand gefunden";
        }
    }

    public String getAlleMannschaftsNamen() {
        if (mannschaft != null && mannschaft.size() != 0) {
            String[] sortArray = new String[mannschaft.size()];
            for (int i = 0; i < mannschaft.size(); i++) {
                sortArray[i] = mannschaft.get(i).getInfoString();
            }
            Arrays.sort(sortArray);
            String vorstandsString = "";
            for (String stringi : sortArray) {
                vorstandsString = vorstandsString + stringi + "\n";
            }
            return vorstandsString;
        } else {
            return "keine Mannschaft gefunden";
        }
    }

    public String getAlleSchiedsrichterNamen() {
        if (schiedsrichter != null && schiedsrichter.size() != 0) {
            String schiedsrichterString = "";
            for (Schiedsrichter schiedsrichter : schiedsrichter) {
                schiedsrichterString = schiedsrichterString + schiedsrichter.getInfoString() + "\n";
            }
            return schiedsrichterString;
        } else {
            return "keinen Schiedsrichter gefunden";
        }
    }

    public String getAlleSpiele() {
        String fallback = "Keine Spiele vorhanden";
        String alleSpiele = "";
        // spiele chronologisch sortieren
        ArrayList<Spiel> sortierteSpiele = Spiel.sortAbsteigend(this.spiel);
        for (Spiel einzelnesSpiel : sortierteSpiele) {

            // wenn int Spieldatum kleiner als int anfang nächster Monat für diese Spiel Hinzu
            alleSpiele = alleSpiele + einzelnesSpiel.getDatumUndMannschaften() + "\n";

          
        }
        if (spiel.size() == 0) {
            return fallback;
        }
        return alleSpiele;
    }

}
