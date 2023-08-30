package com.modelo;

import java.awt.Color;
import javax.swing.JColorChooser;

/**
 *
 * @author Benji
 */
public class JColorChoseer {

    public static String showColorChooserAndGetHex() {
        Color selected = JColorChooser.showDialog(null, "Choose a Color", Color.WHITE);
        if (selected != null) {
            return colorToHex(selected);
        }
        return null;
    }

    private static String colorToHex(Color color) {
        String hex = Integer.toHexString(color.getRGB() & 0xFFFFFF);
        return hex.toUpperCase();
    }
}
