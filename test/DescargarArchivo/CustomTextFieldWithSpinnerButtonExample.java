/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DescargarArchivo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomTextFieldWithSpinnerButtonExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Custom TextField with Spinner Button Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel(new FlowLayout());

            JTextField customTextField = new JTextField(15);
            JButton spinnerButton = new JButton("...");

            spinnerButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String currentValue = customTextField.getText();
                    JSpinner spinner = new JSpinner();
                    spinner.setValue(Integer.parseInt(currentValue)); // Set the current value

                    int result = JOptionPane.showConfirmDialog(
                            null,
                            spinner,
                            "Select a Value",
                            JOptionPane.OK_CANCEL_OPTION,
                            JOptionPane.PLAIN_MESSAGE
                    );

                    if (result == JOptionPane.OK_OPTION) {
                        customTextField.setText(spinner.getValue().toString());
                    }
                }
            });

            panel.add(customTextField);
            panel.add(spinnerButton);

            frame.getContentPane().add(panel);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
