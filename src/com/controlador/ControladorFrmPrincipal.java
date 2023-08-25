package com.controlador;

import com.modelo.UIController;
import static com.vista.frmPrincipal.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Benji
 */
public class ControladorFrmPrincipal {

    public static List<JLabel> labelList = new ArrayList<>();

    public static void configPanelInicial() {
        UIController.configBotones(btnInicio, btnCursos, btnExamenes, btnGitHub, btnYoutube, btnInicio);

        labelList.add(FocusInicio);
        labelList.add(FocusCursos);
        labelList.add(FocusExamenes);
    }

    public void FocusPanel(JLabel label) {
        UIController.removeIconsExceptOne(labelList, label);
        label.setIcon(new ImageIcon(getClass().getResource("/com/img/barraMenu/lineaRosa.png"))); // NOI18N
    }

    public static void configScroll() {
        UIController.ScrollBarrCustom(ScrollMenu);
        UIController.ScrollBarrCustom(scrollContenedor);
        UIController.ScrollInvisible(ScrollMenu);
    }

}
