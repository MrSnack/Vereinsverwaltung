/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schnittstellen;

import java.util.ArrayList;
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
public interface IAusgabe {

    void schreibeDaten(ArrayList<Sportart> sportarten, 
            ArrayList<Schiedsrichter> schiedrichter,
            ArrayList<Sportler> sportler,
            ArrayList<Vorstand> vorstaende,
            ArrayList<Trainer> trainer,
            ArrayList<Spiel> spiele, ArrayList<Mannschaft> mannschaften);


    /*
    new ArrayList<Sportler>(), 
                    new ArrayList<Vorstand>(), 
                    new ArrayList<Schiedsrichter>(), 
                    new ArrayList<Sportart>(), 
                    new ArrayList<Trainer>(), 
                    new ArrayList<Spiel>(), 
                    new ArrayList<Mannschaft>(),
     */
}
