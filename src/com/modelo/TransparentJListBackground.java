package com.modelo;
import javax.swing.*;
import java.awt.*;

public class TransparentJListBackground {

    public static void setTransparentBackground(JList<?> list) {
        list.setOpaque(false);
        list.setBackground(new Color(0, 0, 0, 0)); // Color transparente
        list.setSelectionBackground(new Color(0, 0, 0, 0)); // Color de selección transparente
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Transparent JList Background");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            DefaultListModel<String> model = new DefaultListModel<>();
            model.addElement("Item 1");
            model.addElement("Item 2");
            model.addElement("Item 3");

            JList<String> list = new JList<>(model);
            setTransparentBackground(list);
            JScrollPane scrollPane = new JScrollPane(list);
            
            frame.add(scrollPane);
            frame.setBackground(Color.yellow);

            frame.setSize(300, 200);
            frame.setVisible(true);
        });
    }
}
