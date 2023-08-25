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

    private static final LocalDate CURREN_DATE = LocalDate.now();

    public static int getAño() {
        return CURREN_DATE.getYear();
    }

    public static int getDia() {
        return CURREN_DATE.getDayOfMonth();
    }

    public static int getMes() {
        return CURREN_DATE.getMonthValue();
    }

    public static String getNameMes() {

        String mes[] = {"ene", "feb", "mar", "abr", "may", "jun",
            "jul", "ago", "sep", "oct", "nob", "dic"};

        for (int i = 0; i < 12; i++) {
            if ((getMes() - 1) == i) {
                return mes[i];
            }
        }
        return null;
    }

    
}
