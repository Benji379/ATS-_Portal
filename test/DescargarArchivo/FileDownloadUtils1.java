package DescargarArchivo;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.*;
import java.io.*;
import java.net.URL;

public class FileDownloadUtils1 {

    public static void setupFileDownloadButton(JButton button, String downloadLink) {
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();

                FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos PDF", "pdf");
                fileChooser.setFileFilter(filter);
                fileChooser.setSelectedFile(new File("Documento.pdf")); // Nombre predeterminado con extensión PDF

                int choice = fileChooser.showSaveDialog(button);

                if (choice == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();

                    try {
                        downloadFile(downloadLink, selectedFile);
                        JOptionPane.showMessageDialog(button, "Archivo descargado con éxito.");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(button, "Error al descargar el archivo: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
    }

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
        
    }
}
