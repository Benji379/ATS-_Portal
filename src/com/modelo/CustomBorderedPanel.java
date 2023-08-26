package com.modelo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class CustomBorderedPanel extends JPanel {
    private Color borderColor;
    private int borderWidth;
    private int cornerRadius;

    public CustomBorderedPanel(Color borderColor, int borderWidth, int cornerRadius) {
        this.borderColor = borderColor;
        this.borderWidth = borderWidth;
        this.cornerRadius = cornerRadius;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(borderColor);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Dibujar los bordes redondeados con el espacio entre las líneas
        g2d.drawRoundRect(borderWidth, borderWidth, width - 1 - 2 * borderWidth, height - 1 - 2 * borderWidth, cornerRadius, cornerRadius);

        g2d.dispose();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            Color borderColor = Color.decode("#FF5733");
            int borderWidth = 50;
            int cornerRadius = 20;

            CustomBorderedPanel panel = new CustomBorderedPanel(borderColor, borderWidth, cornerRadius);

            javax.swing.JFrame frame = new javax.swing.JFrame("Custom Bordered Panel Example");
            frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
