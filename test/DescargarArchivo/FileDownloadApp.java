package DescargarArchivo;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.*;
import java.io.*;
import java.net.URL;

public class FileDownloadApp extends JFrame {
    private JButton downloadButton;

    public FileDownloadApp() {
        setTitle("File Download App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setLocationRelativeTo(null);

        downloadButton = new JButton("Descargar Archivo");
        downloadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos PDF", "pdf");
                fileChooser.setFileFilter(filter);
                fileChooser.setSelectedFile(new File("Reglamento_de_Estudios.pdf")); // Nombre predeterminado con extensión PDF
                
                int choice = fileChooser.showSaveDialog(FileDownloadApp.this);
                
                if (choice == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    String url = "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Reglamento%20de%20Estudios%20de%20pregrado_v094230350f-cb88-402d-86d9-32c4bf72318a.pdf";
                    
                    try {
                        downloadFile(url, selectedFile);
                        JOptionPane.showMessageDialog(FileDownloadApp.this, "Archivo descargado con éxito.");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(FileDownloadApp.this, "Error al descargar el archivo: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        add(downloadButton);
    }

    public void downloadFile(String fileURL, File destination) throws IOException {
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
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FileDownloadApp().setVisible(true);
            }
        });
    }
}
