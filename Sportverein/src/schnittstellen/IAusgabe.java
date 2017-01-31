/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schnittstellen;

import java.util.ArrayList;
import sportverein.models.Mannschaft;
import sportverein.models.Schiedsrichter;
import sportverein.models.Spiel;
import sportverein.models.Sportart;
import sportverein.models.Sportler;
import sportverein.models.Trainer;
import sportverein.models.Vorstand;

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
