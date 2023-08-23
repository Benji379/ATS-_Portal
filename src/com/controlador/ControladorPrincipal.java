package com.controlador;

import com.modelo.UIController;
import com.vista.frmPrincipal;
import com.vista.moduloPrincipal;

/**
 *
 * @author Benji
 */
public class ControladorPrincipal {

    frmPrincipal p = new frmPrincipal();

    public void AbrirModuloInicio() {
        p.FocusPanel(p.FocusInicio);
        UIController.MostrarPanel(p.contenedor, new moduloPrincipal(), 1087, 578);
    }

}
