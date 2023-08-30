package com.controlador;

import static com.vista.moduloCursos.*;
import java.awt.Color;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Benji
 */
public class ControladorPanelCursos {

    public static void initLimitacionNum() {
        txtColor.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                handleChange();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                handleChange();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                handleChange();
            }

            private void handleChange() {
                Color color = muestraColor.getBackground();
                try {
                    muestraColor.setBackground(Color.decode("#" + txtColor.getText()));
                } catch (NumberFormatException e) {
                    muestraColor.setBackground(color);
                }
            }
        });
    }

}
