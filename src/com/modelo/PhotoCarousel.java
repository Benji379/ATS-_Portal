package com.modelo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

public class PhotoCarousel extends JFrame {
    private List<String> photoPaths;
    private int currentPhotoIndex = 0;
    private JLabel photoLabel;

    public PhotoCarousel(List<String> photoPaths) {
        this.photoPaths = photoPaths;

        setTitle("Photo Carousel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        photoLabel = new JLabel();
        photoLabel.setHorizontalAlignment(JLabel.CENTER);
        displayCurrentPhoto();

        JButton prevButton = new JButton("Previous");
        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showPreviousPhoto();
            }
        });

        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showNextPhoto();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);

        add(photoLabel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void displayCurrentPhoto() {
        String currentPhotoPath = photoPaths.get(currentPhotoIndex);
        ImageIcon imageIcon = new ImageIcon(currentPhotoPath);
        photoLabel.setIcon(imageIcon);
    }

    private void showPreviousPhoto() {
        currentPhotoIndex = (currentPhotoIndex - 1 + photoPaths.size()) % photoPaths.size();
        displayCurrentPhoto();
    }

    private void showNextPhoto() {
        currentPhotoIndex = (currentPhotoIndex + 1) % photoPaths.size();
        displayCurrentPhoto();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                List<String> photoPaths = Arrays.asList("com/vista/front/img1.jpg", "com/vista/front/img2.jpg", "com/vista/front/img3.jpg");
                new PhotoCarousel(photoPaths);
            }
        });
    }
}


