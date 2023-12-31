package com.modelo;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class JListCustom {

    public static void customizeJList(JList<String> jList, int itemHeight, int itemSpacing, int leftSpacing, Color colorFondo, Color colorLetras) {
        // Crear un borde vacío
        Border emptyBorder = BorderFactory.createEmptyBorder();

        // Establecer el fondo blanco
        // Establecer la fuente y el color de las letras

        // Configurar el cambio de cursor a mano cuando se selecciona un elemento
        jList.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int index = jList.locationToIndex(e.getPoint());
                if (index >= 0 && jList.getCellBounds(index, index).contains(e.getPoint())) {
                    jList.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                } else {
                    jList.setCursor(Cursor.getDefaultCursor());
                }
            }
        });

        // Establecer el renderizador personalizado para cambiar el color de fondo cuando se selecciona un elemento
        jList.setCellRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {
                JLabel renderer = (JLabel) super.getListCellRendererComponent(list, value, index,
                        isSelected, cellHasFocus);

                renderer.setBackground(isSelected ? new Color(255, 255, 255) : colorFondo);
                renderer.setForeground(isSelected ? new Color(0, 0, 0) : colorLetras);
                renderer.setBorder(emptyBorder);

                // Establecer el espacio izquierdo del texto
                Border textBorder = BorderFactory.createEmptyBorder(0, leftSpacing, 0, 0);
                renderer.setBorder(BorderFactory.createCompoundBorder(renderer.getBorder(), textBorder));

                Dimension preferredSize = renderer.getPreferredSize();
                preferredSize.height = itemHeight;
                preferredSize.width += itemSpacing;
                renderer.setPreferredSize(preferredSize);

                return renderer;
            }
        });
    }
}
