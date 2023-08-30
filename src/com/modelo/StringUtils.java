package com.modelo;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author Benji
 */
public class StringUtils {

    public static String obtenerCoordenadasComoString(Component componente) {
        Point posicion = componente.getLocation();
        return "(" + posicion.x + ", " + posicion.y + ")";
    }

    public static void limitacionCaracteres(JTextField txtField, KeyEvent evt, int cantNumeros, boolean conEspacio) {
        if (conEspacio) {
            if (txtField.getText().length() >= cantNumeros) {
                evt.consume();
            }
        } else {
            int key = evt.getKeyChar();
            boolean espacio = key == KeyEvent.VK_SPACE;
            if (espacio) {
                evt.consume();
            } else {
                if (txtField.getText().length() >= cantNumeros) {
                    evt.consume();
                }
            }
        }
    }

    public static void limitacionEspacio(JTextField txtField, KeyEvent evt) {
        int key = evt.getKeyChar();
        boolean espacio = key == KeyEvent.VK_SPACE;

        if (espacio) {
            evt.consume();
        }
    }

    public static void limitacionNumeros(JTextField txtField, KeyEvent evt, int CantNumeros) {
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean espacio = key == KeyEvent.VK_SPACE;
        if (!numeros || espacio) {
            evt.consume();
        } else {
            if (txtField.getText().length() >= CantNumeros) {
                evt.consume();
            }
        }
    }

    public static void limitacionNumeros(JTextField txtField, KeyEvent evt, int CantNumeros, String caracterAdicionalPermitir) {
        int key = evt.getKeyChar();
        boolean numeros = (key >= 48 && key <= 57) || key == 46; // Permitir números y el punto (.)
        boolean espacio = key == KeyEvent.VK_SPACE;

        String text = txtField.getText();
        boolean tienePunto = text.contains(caracterAdicionalPermitir);

        if (!numeros || (tienePunto && key == 46) || espacio) {
            evt.consume();
        } else {
            if (text.length() >= CantNumeros) {
                evt.consume();
            }
        }
    }

    public static void limitacionNumerosDecimales(JTextField txtField, KeyEvent evt, int CantNumeros) {
        char key = evt.getKeyChar();
        String text = txtField.getText();
        boolean tienePunto = text.contains(".");

        if (!Character.isDigit(key) && key != '.' || (tienePunto && key == '.') || (key == '.' && text.indexOf('.') != text.lastIndexOf('.'))) {
            evt.consume();
        } else {
            if (text.length() >= CantNumeros) {
                evt.consume();
            }
        }
    }

    public static boolean validacionDeDecimal(JTextField txtField) {
        String text = txtField.getText();
        int countDots = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.') {
                countDots++;
            }
            if (countDots > 1) {
                return false;
            }
        }
        return true;
    }

}
