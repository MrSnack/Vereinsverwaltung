/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein;

import java.util.Calendar;

/**
 *
 * @author steffen
 */
public class Help {
    
    public static int alterAusDatumString(String datumString) {
        System.out.println(datumString);
        
        String[] splittedStrings= datumString.split("\\.");
        for (String splittedString : splittedStrings) {
            System.out.println(splittedString);
        }
        
        Integer tag = Integer.valueOf(splittedStrings[0]);
        Integer monat = Integer.valueOf(splittedStrings[1]);
        Integer jahr = Integer.valueOf(splittedStrings[2]);
        
        Calendar cal = Calendar.getInstance();
          int alter = (cal.get(Calendar.YEAR) - jahr); 
          // check if Person schon Geburtstag hatte
             if (monat >= cal.get(Calendar.MONTH)) {
               if (tag < cal.get(Calendar.DAY_OF_MONTH)) {
                  alter --;
               }
             }
             System.out.println(alter);
        return alter;
        
    }
    
}
