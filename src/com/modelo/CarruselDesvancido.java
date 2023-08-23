package com.modelo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

public class CarruselDesvancido {

    private final JLabel imageLabel;
    private final List<String> imagePaths;
    private final List<String> imageUrls;
    private int currentIndex = 0;
    private Timer transitionTimer;
    private float alphaOut = 1.0f;
    private float alphaIn = 0.0f;
    private final int transitionDelay = 50; // Tiempo de transición en milisegundos (QUE TAL FLUIDA LA TRANSICION)
    private int interval = 3000; // Intervalo entre transiciones en milisegundos (3 segundos por defecto)
    private final JPanel containerPanel;

    public CarruselDesvancido(JPanel containerPanel, List<String> imagePaths, List<String> imageUrls, int interval) {
        this.containerPanel = containerPanel;
        this.imagePaths = imagePaths;
        this.imageUrls = imageUrls;
        this.interval = interval;

        imageLabel = new JLabel();
        containerPanel.add(imageLabel);

        setupImageLabelListeners(); // Agregar los manejadores de eventos
        showImage(currentIndex); // Mostrar la primera imagen
        startIntervalTimer(); // Iniciar el temporizador de intervalo
    }

    private void setupImageLabelListeners() {
        imageLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                imageLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                imageLabel.setCursor(Cursor.getDefaultCursor());
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                openImageLink(imageUrls.get(currentIndex));
            }
        });
    }

    private void openImageLink(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException ex) {
            System.out.println("Error al abrir el enlace: " + ex.getMessage());
        }
    }

    private void startIntervalTimer() {
        Timer intervalTimer = new Timer(interval, (ActionEvent e) -> {
            transitionToNextImage();
        });
        intervalTimer.setRepeats(false); // Ejecutar solo una vez después del intervalo
        intervalTimer.start();
    }

    private void transitionToNextImage() {
        if (transitionTimer != null && transitionTimer.isRunning()) {
            return; // Evitar múltiples acciones en curso
        }

        transitionTimer = new Timer(transitionDelay, (ActionEvent e) -> {
            alphaOut -= 0.05f; // Desvanecer la imagen actual
            alphaIn += 0.05f; // Aparecer la siguiente imagen

            if (alphaOut <= 0.0f) {
                alphaOut = 1.0f;
                alphaIn = 0.0f;
                currentIndex = (currentIndex + 1) % imagePaths.size();
                showImage(currentIndex);
                transitionTimer.stop(); // Detener el temporizador de transición
                startIntervalTimer(); // Iniciar el temporizador de intervalo
            }

            updateImageLabel();
        });
        transitionTimer.start();
    }

    private void showImage(int index) {
        try {
            BufferedImage originalImage = ImageIO.read(new File(imagePaths.get(index)));
            BufferedImage fadedImage = new BufferedImage(originalImage.getWidth(), originalImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = fadedImage.createGraphics();
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
            g2d.drawImage(originalImage, 0, 0, containerPanel);
            g2d.dispose();
            imageLabel.setIcon(new ImageIcon(fadedImage));
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private void updateImageLabel() {
        try {
            BufferedImage originalImageOut = ImageIO.read(new File(imagePaths.get(currentIndex)));
            BufferedImage fadedImageOut = new BufferedImage(originalImageOut.getWidth(), originalImageOut.getHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2dOut = fadedImageOut.createGraphics();
            g2dOut.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alphaOut));
            g2dOut.drawImage(originalImageOut, 0, 0, containerPanel);
            g2dOut.dispose();

            int nextIndex = (currentIndex + 1) % imagePaths.size();
            BufferedImage originalImageIn = ImageIO.read(new File(imagePaths.get(nextIndex)));
            BufferedImage fadedImageIn = new BufferedImage(originalImageIn.getWidth(), originalImageIn.getHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2dIn = fadedImageIn.createGraphics();
            g2dIn.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alphaIn));
            g2dIn.drawImage(originalImageIn, 0, 0, containerPanel);
            g2dIn.dispose();

            BufferedImage combinedImage = new BufferedImage(fadedImageOut.getWidth(), fadedImageOut.getHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2dCombined = combinedImage.createGraphics();
            g2dCombined.drawImage(fadedImageOut, 0, 0, null);
            g2dCombined.drawImage(fadedImageIn, 0, 0, null);
            g2dCombined.dispose();

            imageLabel.setIcon(new ImageIcon(combinedImage));
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JPanel containerPanel = new JPanel();
            containerPanel.setLayout(new BorderLayout());
            List<String> imagePaths = new ArrayList<>();
            imagePaths.add("src\\com\\img\\carrusel\\img1.jpg");
            imagePaths.add("src\\com\\img\\carrusel\\img2.jpg");
            imagePaths.add("src\\com\\img\\carrusel\\img3.jpg");
            List<String> imageUrls = new ArrayList<>();
            imageUrls.add("https://www.canva.com/design/DAFo_GQzmVs/rEkmuwjiikwVMH5PIZpIJg/view?utm_content=DAFo_GQzmVs&utm_campaign=designshare&utm_medium=link&utm_source=publishsharelink");
            imageUrls.add("https://view.genial.ly/62f289509f74f500192144dc?utm_campaign=Pronto+Pago+AGO23&utm_medium=bitly&utm_source=Banner++-+UTP+%2B+Portal");
            imageUrls.add("https://tubiblioteca.utp.edu.pe/");
            int interval = 5000; // 5 segundos (5000 milisegundos) entre transiciones

            JFrame frame = new JFrame();
            frame.setTitle("Image Carousel with Links");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            CarruselDesvancido carousel = new CarruselDesvancido(containerPanel, imagePaths, imageUrls, interval);
            frame.add(containerPanel);
            frame.setVisible(true);
        });
    }
}
