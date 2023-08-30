package com.modelo;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class PanelesDinamicos {

    private static final List<JPanel> LIST_PANELES = new ArrayList<>();

    public void reorganizePanels(JPanel panelPrincipal, JPanel panelContenedor, JPanel panelDuplicar, int separacion, int margenLateral) {
        panelContenedor.removeAll();

        int containerWidth = panelPrincipal.getWidth() - 2 * margenLateral; // Resta los márgenes laterales
        int panelWidth = panelDuplicar.getPreferredSize().width;
        int panelHeight = panelDuplicar.getPreferredSize().height;
        int gap = 10;  // Espacio entre subpaneles

        int numColumns = Math.max(1, containerWidth / (panelWidth + gap));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(separacion, separacion, 0, 0);

        for (int i = 0; i < LIST_PANELES.size(); i++) {
            JPanel panel = LIST_PANELES.get(i);
            gbc.gridx = i % numColumns;
            gbc.gridy = i / numColumns;
            panel.setPreferredSize(new Dimension(panelWidth, panelHeight));
            panelContenedor.add(panel, gbc);
        }

        panelContenedor.revalidate();
        panelContenedor.repaint();
    }

    public void AgregarPanel(JPanel panelContenedor, int separacion, int margenLateral, JPanel panelDuplicar) {
        int panelWidth = panelDuplicar.getPreferredSize().width;
        int panelHeight = panelDuplicar.getPreferredSize().height;

        LIST_PANELES.add(panelDuplicar);

        int containerWidth = panelContenedor.getWidth();

        int numColumns = Math.max(1, (containerWidth - 2 * margenLateral) / panelWidth);

        int totalWidth = numColumns * panelWidth;

        int numRows = (int) Math.ceil((double) LIST_PANELES.size() / numColumns);

        panelContenedor.setLayout(new FlowLayout(FlowLayout.LEFT, separacion, separacion));
        panelContenedor.removeAll();

        for (int i = 0; i < LIST_PANELES.size(); i++) {
            JPanel panel = LIST_PANELES.get(i);
            panel.setPreferredSize(new Dimension(panelWidth, panelHeight));

            panelContenedor.add(panel);

            if ((i + 1) % numColumns == 0) {
                panelContenedor.add(new JPanel()); // Agregar un componente vacío para forzar el salto de línea
            }
        }

        int containerHeight = numRows * panelHeight + (numRows - 1) * separacion;
        panelContenedor.setPreferredSize(new Dimension(totalWidth + 2 * margenLateral, containerHeight));

        panelContenedor.revalidate();
        panelContenedor.repaint();
    }

    public void AgregarMenuPanelVertical(JPanel panelContenedor, int separacion, JPanel panel) {
        panel.setMaximumSize(new Dimension(Integer.MAX_VALUE, panel.getPreferredSize().height));
        panelContenedor.setLayout(new BoxLayout(panelContenedor, BoxLayout.Y_AXIS));
        if (panelContenedor.getComponentCount() > 0) {
            panelContenedor.add(javax.swing.Box.createVerticalStrut(separacion));
        }
        panelContenedor.add(panel);
        LIST_PANELES.add(panel);
        panelContenedor.revalidate();
        panelContenedor.repaint();
    }
}
