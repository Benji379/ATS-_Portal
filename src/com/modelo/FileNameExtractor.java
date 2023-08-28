package com.modelo;

/**
 *
 * @author Benji
 */
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNameExtractor {

    public static String extractFileName(String downloadLink) {
        String decodedLink = "";
        try {
            decodedLink = URLDecoder.decode(downloadLink, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        Pattern pattern = Pattern.compile("nombre=([^&]*)");
        Matcher matcher = pattern.matcher(decodedLink);

        if (matcher.find()) {
            String fileName = matcher.group(1);
            return fileName;
        }

        return null;
    }

    public static void main(String[] args) {
        String downloadLink = "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Reglamento%20de%20Estudios%20de%20pregrado_v094230350f-cb88-402d-86d9-32c4bf72318a.pdf";

        String fileName = extractFileName(downloadLink);
        System.out.println("Nombre del archivo: " + fileName);
    }
}
