package com.modelo;

import java.io.*;
import java.net.URL;

public class FileDownloader {

    public static void downloadFile(String fileURL, File destination) throws IOException {
        URL url = new URL(fileURL);
        try (InputStream in = url.openStream();
                FileOutputStream out = new FileOutputStream(destination)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        }
    }

    public static void main(String[] args) {
        String downloadLink = "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Reglamento%20de%20Estudios%20de%20pregrado_v094230350f-cb88-402d-86d9-32c4bf72318a.pdf";
        File destinationFile = new File("C:\\ruta\\hacia\\tu\\archivo\\Reglamento_de_Estudios.pdf");

        try {
            downloadFile(downloadLink, destinationFile);
            System.out.println("Archivo descargado con éxito.");
        } catch (IOException ex) {
            System.err.println("Error al descargar el archivo: " + ex.getMessage());
        }
    }
}
