package com.modelo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import scrollbar.ScrollBarCustom;

/**
 *
 * @author Benji
 */
public class UIController {

    public static void removeWhiteBorder(JScrollPane scrollPane) {
        scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
    }

    public static void setPanelBackgroundColors(JPanel panel, String pressedColor, String rolloverColor) {
        Color normalColor = panel.getBackground();

        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel.setBackground(Color.decode(pressedColor));
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panel.setBackground(normalColor);
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel.setBackground(Color.decode(rolloverColor));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel.setBackground(normalColor);
            }
        });
    }

    public static void setFocusLostPanel(JPanel panel, JLabel label) {
        panel.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // No necesitamos hacer nada cuando el foco se gana
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Acción a realizar cuando el JPanel pierde el foco (se hace clic fuera)
                label.setIcon(new ImageIcon(getClass().getResource("/com/img/barraMenu/hogar.png"))); // NOI18N
            }
        });
    }

    public static void removeIconsExceptOne(List<JLabel> labelList, JLabel labelToPreserve) {
        labelList.stream().filter((label) -> (label != labelToPreserve)).forEachOrdered((label) -> {
            label.setIcon(null); // Quita el icono
        });
    }

    public static void FocusFondoPanel(List<JPanel> panelList, JPanel panel) {
        Color backgroundColor = Color.WHITE;

        panelList.stream().filter((p) -> (p != panel)).forEachOrdered((p) -> {
            p.setBackground(backgroundColor);
        });
    }

    public static void ScrollInvisible(JScrollPane scrollPane) {
        scrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0)); // Hace invisible el palito del scroll
        scrollPane.getViewport().setOpaque(false); // Hace invisible el fondo del JScrollPane
    }

    public static void ScrollBarrCustom(JScrollPane scrollPane) {
        scrollPane.setVerticalScrollBar(new ScrollBarCustom());
        ScrollBarCustom spp = new ScrollBarCustom();
        spp.setOrientation(JScrollBar.HORIZONTAL);
        scrollPane.setHorizontalScrollBar(spp);
        UIController.removeWhiteBorder(scrollPane);
    }

    public static void MostrarPanel(JPanel contenedor, JPanel panel, int ancho, int largo) {

        panel.setSize(ancho, largo);
        panel.setLocation(0, 0);

        contenedor.removeAll();
        contenedor.add(panel, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }

    public static void subrayarJLabel(JLabel label) {
        String labelText = label.getText();
        label.setText("<html><u>" + labelText + "</u></html>");
    }
    public static void ajustarJLabel(JLabel label) {
        String labelText = label.getText();
        label.setText("<html>" + labelText + "</html>");
    }

    
    public static void separadorCustom(JLabel label) {
        // Obtenemos el borde actual del JLabel
        Border border = label.getBorder();

        // Creamos un borde compuesto que incluye un borde inferior
        Border compoundBorder = BorderFactory.createCompoundBorder(
                border,
                BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(168,203,226)) // Borde inferior negro
        );

        // Establecemos el nuevo borde para el JLabel
        label.setBorder(compoundBorder);
    }
    
}
