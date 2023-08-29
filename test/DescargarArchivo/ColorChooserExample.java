package DescargarArchivo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooserExample extends JFrame {

    public ColorChooserExample() {
        JButton colorButton = new JButton("Seleccionar Color");
        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color selectedColor = JColorChooser.showDialog(ColorChooserExample.this, "Selecciona un color", Color.WHITE);
                if (selectedColor != null) {
                    int red = selectedColor.getRed();
                    int green = selectedColor.getGreen();
                    int blue = selectedColor.getBlue();
                    System.out.println("Color seleccionado (RGB): " + red + ", " + green + ", " + blue);
                }
            }
        });

        JPanel contentPane = new JPanel();
        contentPane.add(colorButton);

        setContentPane(contentPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ejemplo de JColorChooser");
        pack();
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ColorChooserExample().setVisible(true);
            }
        });
    }
}
