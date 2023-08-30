package com.modelo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class CustomJListBackground {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Custom JList Background");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Item 1");
        listModel.addElement("Item 2");
        listModel.addElement("Item 3");
        listModel.addElement("Item 4");

        JList<String> jList = new JList<>(listModel);
        jList.setCellRenderer(new CustomListCellRenderer());
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(jList);
        frame.add(scrollPane);

        frame.pack();
        frame.setVisible(true);
    }

    static class CustomListCellRenderer extends DefaultListCellRenderer {

        private static final Color BACKGROUND_NORMAL = Color.WHITE;
        private static final Color BACKGROUND_SELECTION = new Color(220, 220, 220);

        public CustomListCellRenderer() {
            setOpaque(true);
            setBorder(new EmptyBorder(5, 10, 5, 10));
        }

        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                boolean isSelected, boolean cellHasFocus) {
            Component component = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

            // Set the background color based on selection status
            if (isSelected) {
                component.setBackground(BACKGROUND_SELECTION);
            } else {
                component.setBackground(BACKGROUND_NORMAL);
            }

            return component;
        }
    }
}
