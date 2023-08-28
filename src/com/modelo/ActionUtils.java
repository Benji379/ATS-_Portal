package com.modelo;

import static com.modelo.FileDownloader.downloadFile;
import com.modelo.jnafilechooser.api.JnaFileChooser;
import com.vista.frmPrincipal;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.time.LocalDate;
import javax.swing.JButton;
import javax.swing.JOptionPane;

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
        JnaFileChooser jnaCh = new JnaFileChooser();
        jnaCh.setDefaultFileName(FileNameExtractor.extractFileName(downloadLink));
        jnaCh.addFilter("Archivos PDF", "pdf");
        boolean save = jnaCh.showOpenDialog(new frmPrincipal());
        if (save) {
            try {
                downloadFile(downloadLink, jnaCh.getSelectedFile());
                UIController ic = new UIController();
                JOptionPane.showMessageDialog(null, nombreMensage + " descargado", "Mensage", JOptionPane.PLAIN_MESSAGE, ic.icono("/com/img/icons/cheque.png"));
            } catch (IOException ex) {
            }
        }
    }

}
