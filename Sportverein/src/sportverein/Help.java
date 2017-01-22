/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportverein;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;

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
    /**
     * 
     * @param datumString
     * @return an Int with which we can compare dates better
     */
    public static int intFromDateString(String datumString) {
      
        String[] splittedStrings= datumString.split("\\.");
        String tag = splittedStrings[0];
        if (Integer.valueOf(tag)<= 9) {
            tag = "0" + tag;
        }
        String monat = splittedStrings[1];
        // da monat als 1,2 usw. muss 0 hinzugefügt werden
        if (Integer.valueOf(monat)<= 9) {
            monat = "0" + monat;
        }
        
        String jahr = splittedStrings[2];
        
        
        String dateIntString =  jahr + monat + tag;   
        return Integer.valueOf(dateIntString);
    }
    
    public static String  getTodayStringDate() {
        Calendar cal = Calendar.getInstance();
        String today = cal.get(Calendar.DAY_OF_MONTH) + "." + (cal.get(Calendar.MONTH)+1) + "." + cal.get(Calendar.YEAR);
        return today;
    }
    
}
