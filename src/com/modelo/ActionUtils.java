package com.modelo;

import java.io.IOException;
import java.time.LocalDate;

/**
 *
 * @author Benji
 */
public class ActionUtils {

    public static void AccederEnlace(String enlace) {
        String url = "C:\\Windows\\System32\\cmd.exe /K start " + enlace;
        try {
            Runtime.getRuntime().exec(url);
        } catch (IOException e) {
        }
    }

    public static int getAño() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear();
    }

    public static int getDia() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getDayOfMonth();
    }

    public static int getMes() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getMonthValue();
    }

    public static String getNameMes() {

        String mes[] = {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nob", "dic"};
        
        for (int i = 0; i < 12; i++) {
            if ((getMes() - 1) == i) {
                return mes[i];
            }
        }
        return null;
    }

}
