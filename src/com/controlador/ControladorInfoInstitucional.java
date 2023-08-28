package com.controlador;

import com.data.LinksAyuda;
import com.modelo.ActionUtils;
import com.modelo.UIController;
import static com.vista.moduloInfoInstitucional.*;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Benji
 */
public class ControladorInfoInstitucional {

    public static void initJButtons() {
        configSelectBtns(
                btn_1_1_1, btn_1_1_2, btn_1_1_3, btn_1_1_4, btn_1_1_5, btn_1_1_6, btn_1_1_7, btn_1_1_8, btn_1_1_9,
                btn_1_2_1, btn_1_2_2, btn_1_2_3, btn_1_2_4, btn_1_2_5, btn_1_2_6, btn_1_2_7, btn_1_2_8, btn_1_2_9,
                btn_2_1_1, btn_2_1_2, btn_2_1_3, btn_2_1_4, btn_2_1_5, btn_2_1_6, btn_2_1_7, btn_2_1_8, btn_2_1_9,
                btn_2_2_1, btn_2_2_2, btn_2_2_3, btn_2_2_4, btn_2_2_5, btn_2_2_6, btn_2_2_7, btn_2_2_8, btn_2_2_9,
                btn_3_1_1, btn_3_1_2, btn_3_1_3, btn_3_1_4, btn_3_1_5,
                btn_3_2_1, btn_3_2_2, btn_3_2_3, btn_3_2_4, btn_3_2_5
        );
    }

    public static void configSelectBtns(JButton... buttons) {
        String[] links = getLinks(); // Obtener el array de enlaces
        for (int i = 0; i < buttons.length; i++) {
            UIController.setSelectButton(buttons[i], "#23527c");
            final String link = links[i];
            
            if (buttons[i] == btn_1_2_6 || buttons[i] == btn_2_2_6) {
                buttons[i].addActionListener((ActionEvent e) -> {
                    System.out.println(link);
                    ActionUtils.AccederEnlace(link);
                });
            } else {
                final String texto = buttons[i].getText();
                buttons[i].addActionListener((ActionEvent e) -> {
                    ActionUtils.descargarArchivo(link,texto);
                });
            }
        }
    }

    public static String[] getLinks() {
        String links[] = {
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Reglamento%20de%20Estudios%20de%20pregrado_v094230350f-cb88-402d-86d9-32c4bf72318a.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=RR%20N%200035-2023-R-UTP%20Aprobacion%20de%20Reglamento%20de%20Estudios-Pregrado%20V.90cb7806a-33cd-4fee-ade1-ebafeeefb556.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=DPA%20-%20GU0309%20Gu%C3%ADa%20del%20Estudiante%20Lima%20Norte%2050-80%20Marzo%202023eb02ee4a-6d1a-4ce7-8d5c-3c5a6d0bd617.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Guia%20de%20Becas%20y%20Convenios2c3de7e5-7ff4-4e2e-a1bd-9319b4203bff.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=DEU-REG001%20Reglamento%20de%20la%20Oficina%20de%20la%20%20Defensoria%20Universitaria%20(Portal)15751aa2-418e-44c5-9954-dfcfe1969271.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Reglamento%20de%20prevencion%20y%20sancion%20del%20Hostigamiento%20Sexualdf578c2d-8554-42d4-887a-4f851914b347.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Aprobaci%C3%B3n%20Reglamento%20Grados%20y%20T%C3%ADtulos17df817c-d0d5-4e53-9de4-657df6b14c83.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Reglamento%20del%20Internado%20de%20Psicologia447bb578-9f6d-4ae2-942f-b6107f8742f2.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Tarifariocaa31f02-e902-4c62-a60d-705c735121ed.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=RR%20N%200035-2023-R-UTP%20Aprobacion%20de%20Reglamento%20de%20Estudios-Pregrado%20V.90cb7806a-33cd-4fee-ade1-ebafeeefb556.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=RR%20N%C2%BA0099-2023-R-UTP%20Reglamento%20de%20Becas%20de%20Pregrado4515febf-9e6c-441b-8c46-966fa7027050.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=RR.N%C2%BA%200036-2022-R-UTP%20Protocolo%20de%20Bioseguridad%20Covidbece2e25-fe94-4bc3-9804-16cd1ab4bb1d.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Reglamento%20de%20prevencion%20y%20sancion%20del%20Hostigamiento%20Sexual1c093b09-98ad-431c-9285-0d5e855cb544921aad9d-0128-4f74-b6b4-6f8e67a44e8d.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Reglamento%20de%20Disciplina%20del%20Estudiante%20PT%20V5efcb9a3d-830a-4ea4-9cf8-49e484709197.pdf",
            "https://portalestudiante.utp.edu.pe/Tramites/Index",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Reglamento%20de%20Grados%20y%20T%C3%ADtulosaa5fee7a-bc21-4173-92ce-1dea9a83c2bb.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Aprobacion%20del%20Reglamento%20de%20SECIGRA165b4295-fec8-4443-9eef-6a40f77a8871.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Politicas%20de%20Diversidad%20equidad%20e%20Inclusioon%20para%20estudiantes6acebecb-26aa-4697-86d2-8b42333c4550.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Reglamento%20de%20Estudios%20de%20pregrado_v094230350f-cb88-402d-86d9-32c4bf72318a.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=RR%20N%200035-2023-R-UTP%20Aprobacion%20de%20Reglamento%20de%20Estudios-Pregrado%20V.90cb7806a-33cd-4fee-ade1-ebafeeefb556.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=DPA%20-%20GU0309%20Gu%C3%ADa%20del%20Estudiante%20Lima%20Norte%2050-80%20Marzo%202023eb02ee4a-6d1a-4ce7-8d5c-3c5a6d0bd617.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Guia%20de%20Becas%20y%20Convenios2c3de7e5-7ff4-4e2e-a1bd-9319b4203bff.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=DEU-REG001%20Reglamento%20de%20la%20Oficina%20de%20la%20%20Defensoria%20Universitaria%20(Portal)15751aa2-418e-44c5-9954-dfcfe1969271.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Reglamento%20de%20prevencion%20y%20sancion%20del%20Hostigamiento%20Sexualdf578c2d-8554-42d4-887a-4f851914b347.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Aprobaci%C3%B3n%20Reglamento%20Grados%20y%20T%C3%ADtulos17df817c-d0d5-4e53-9de4-657df6b14c83.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Reglamento%20del%20Internado%20de%20Psicologia447bb578-9f6d-4ae2-942f-b6107f8742f2.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Tarifariocaa31f02-e902-4c62-a60d-705c735121ed.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=RR%20N%200035-2023-R-UTP%20Aprobacion%20de%20Reglamento%20de%20Estudios-Pregrado%20V.90cb7806a-33cd-4fee-ade1-ebafeeefb556.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=RR%20N%C2%BA0099-2023-R-UTP%20Reglamento%20de%20Becas%20de%20Pregrado4515febf-9e6c-441b-8c46-966fa7027050.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=RR.N%C2%BA%200036-2022-R-UTP%20Protocolo%20de%20Bioseguridad%20Covidbece2e25-fe94-4bc3-9804-16cd1ab4bb1d.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Reglamento%20de%20prevencion%20y%20sancion%20del%20Hostigamiento%20Sexual1c093b09-98ad-431c-9285-0d5e855cb544921aad9d-0128-4f74-b6b4-6f8e67a44e8d.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Reglamento%20de%20Disciplina%20del%20Estudiante%20PT%20V5efcb9a3d-830a-4ea4-9cf8-49e484709197.pdf",
            "https://portalestudiante.utp.edu.pe/Tramites/Index",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Reglamento%20de%20Grados%20y%20T%C3%ADtulosaa5fee7a-bc21-4173-92ce-1dea9a83c2bb.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Aprobacion%20del%20Reglamento%20de%20SECIGRA165b4295-fec8-4443-9eef-6a40f77a8871.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Politicas%20de%20Diversidad%20equidad%20e%20Inclusioon%20para%20estudiantes6acebecb-26aa-4697-86d2-8b42333c4550.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Manual%20UTP%20Portal67edd44d-cd3c-4958-ba48-c57c18e770c4.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Triptico%20PSEc57399f7-c679-4061-b6e1-a5e5c6807a0a.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=OPCIONES%20DE%20PAGOd7903e35-1a1e-403f-aeef-5ec15f24f1a1.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=WiFi%20Alumnos%20UTPd5fefc84-feec-481f-abbe-d77412086ab8.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Afiche%20de%20la%20DU482b21f6-d55f-41ce-977d-2c2874ac343a.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=dpa_-_do001_guia_de_matricula_en_linea_pregrado_presencialf4a376c2-af3d-496b-89ac-a1253a0abca5.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=MANUAL%20DE%20PAGOS91422757-e2ff-47ba-8295-01983d97aed7.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Protocolo%20COVID%2019-Alumnos4bcf0c35-45fa-4fdc-a331-ea4572bfb9ce.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=Manual%20de%20Ticketero%20de%20Visitas%20SAE%20(QueueSmart)%20%E2%80%93%20Pregrado%20Presencial54f89e67-34d3-49be-a9ee-e2d4b608f792.pdf",
            "https://portalestudiante.utp.edu.pe/IntegratorWithPortalC/DescargarDocumento/?nombre=GyT-GU001Guia_del_egresadodd5eb674-37c9-4269-9509-345fc273ea64.pdf"
        };
        return links;
    }
}
