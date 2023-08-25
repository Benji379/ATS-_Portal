package com.controlador;

import com.modelo.ActionUtils;
import com.modelo.CarruselDesvancido;
import com.modelo.UIController;
import java.util.ArrayList;
import java.util.List;
import static com.vista.moduloPrincipal.*;

/**
 *
 * @author Benji
 */
public class ControladorPanelPrincipal {

    public static void initCarrusel() {
        List<String> imagePaths = new ArrayList<>();
        imagePaths.add("src\\com\\img\\carrusel\\img1.jpg");
        imagePaths.add("src\\com\\img\\carrusel\\img2.jpg");
        imagePaths.add("src\\com\\img\\carrusel\\img3.jpg");
        imagePaths.add("src\\com\\img\\carrusel\\img4.jpg");
        contenedor.setOpaque(false);
        int interval = 5000; // 5 segundos (5000 milisegundos) entre transiciones
        List<String> imageUrls = new ArrayList<>();
        imageUrls.add("https://www.canva.com/design/DAFo_GQzmVs/rEkmuwjiikwVMH5PIZpIJg/view?utm_content=DAFo_GQzmVs&utm_campaign=designshare&utm_medium=link&utm_source=publishsharelink");
        imageUrls.add("https://view.genial.ly/62f289509f74f500192144dc?utm_campaign=Pronto+Pago+AGO23&utm_medium=bitly&utm_source=Banner++-+UTP+%2B+Portal");
        imageUrls.add("https://tubiblioteca.utp.edu.pe/");
        imageUrls.add("https://encuestas.utp.edu.pe/");
        CarruselDesvancido carousel = new CarruselDesvancido(contenedor, imagePaths, imageUrls, interval);
        UIController.setPanelBackgroundColors(btnIrHorario, "#5b36f2", "#745ef6");
    }

    public static String initFecha() {
        return ActionUtils.getDia() + " " + ActionUtils.getNameMes() + " " + ActionUtils.getAño();
    }

    public static void initBotones() {
        UIController.configBotones(btnInformacionInstitucional, btnBeneficios,
                btnIngresaBiblioteca, btnBolsaTrabajo, btnEmpleabilidad,
                btnGooglePlay, btnAppStore, btnAppGallery,btnUTP_Infor);
    }

    public static void initLabel() {
        UIController.subrayarJLabel(btnRolExamenes);
        UIController.configLabel(jlbDescpBeneficios, jlbDescpBiblioteca, jlbDescpBolsaTrab, jlbDescpEmpleabilidad);
    }

    

}
