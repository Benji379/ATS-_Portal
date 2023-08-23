package com.modelo;

import java.awt.Component;
import java.awt.Point;

/**
 *
 * @author Benji
 */
public class StringUtils {

    public static String obtenerCoordenadasComoString(Component componente) {
        Point posicion = componente.getLocation();
        return "(" + posicion.x + ", " + posicion.y + ")";
    }
}
