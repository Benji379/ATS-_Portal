package com.modelo;

import static com.modelo.FileDownloader.downloadFile;
import com.modelo.jnafilechooser.api.JnaFileChooser;
import com.vista.moduloInfoInstitucional;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.io.IOException;

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

    public static void descargarArchivo(String downloadLink, String nombreMensage) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            JnaFileChooser jnaCh = new JnaFileChooser();
            jnaCh.setDefaultFileName(FileNameExtractor.extractFileName(downloadLink));
            jnaCh.addFilter("Archivos PDF", "pdf");
            java.awt.Window parentWindow = javax.swing.SwingUtilities.windowForComponent(new moduloInfoInstitucional());
            boolean save = jnaCh.showOpenDialog(parentWindow);
            if (save) {
                try {
                    downloadFile(downloadLink, jnaCh.getSelectedFile());
                    UIController ic = new UIController();
                    JOptionPane.showMessageDialog(null, nombreMensage + " descargado", "Mensage", JOptionPane.PLAIN_MESSAGE, ic.icono("/com/img/icons/cheque.png"));
                } catch (IOException ex) {
                }
            }
        });
    }

    public static String Color_a_Hexa(Color color) {
        int red = color.getRed();
        int green = color.getGreen();
        int blue = color.getBlue();

        String hexRed = Integer.toHexString(red);
        String hexGreen = Integer.toHexString(green);
        String hexBlue = Integer.toHexString(blue);

        // Asegurarse de que los componentes tengan dos dígitos hexadecimales
        if (hexRed.length() == 1) {
            hexRed = "0" + hexRed;
        }
        if (hexGreen.length() == 1) {
            hexGreen = "0" + hexGreen;
        }
        if (hexBlue.length() == 1) {
            hexBlue = "0" + hexBlue;
        }

        // Concatenar los componentes hexadecimales y devolver el resultado
        return hexRed + hexGreen + hexBlue;
    }


}
