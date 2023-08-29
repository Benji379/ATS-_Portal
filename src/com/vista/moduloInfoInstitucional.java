package com.vista;

import com.controlador.ControladorInfoInstitucional;
import com.modelo.UIController;
import static com.vista.frmPrincipal.contenedor;
import javax.swing.JPanel;

/**
 *
 * @author Benji
 */
public class moduloInfoInstitucional extends javax.swing.JPanel {

    public moduloInfoInstitucional() {
        initComponents();
        UIController.setPanelBackgroundColors(btnAtras, "#fdadb3", "#fed4d6");
        ControladorInfoInstitucional.initJButtons();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtras = new com.modelo.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        contenedorGeneral = new com.modelo.PanelRound();
        contenedorGris = new javax.swing.JPanel();
        contenedorModulos = new javax.swing.JPanel();
        EcabezadoGeneral = new javax.swing.JPanel();
        jlbTitle = new javax.swing.JLabel();
        jlbPuntos = new javax.swing.JLabel();
        Modulo1 = new com.modelo.PanelRound();
        encabezado1 = new com.modelo.PanelRound();
        icono1 = new javax.swing.JLabel();
        jlbTitulo1 = new javax.swing.JLabel();
        contenedorLinks1 = new javax.swing.JPanel();
        btn_1_1_1 = new javax.swing.JButton();
        btn_1_1_2 = new javax.swing.JButton();
        btn_1_1_3 = new javax.swing.JButton();
        btn_1_1_4 = new javax.swing.JButton();
        btn_1_1_5 = new javax.swing.JButton();
        btn_1_1_6 = new javax.swing.JButton();
        btn_1_1_7 = new javax.swing.JButton();
        btn_1_1_8 = new javax.swing.JButton();
        btn_1_1_9 = new javax.swing.JButton();
        btn_1_2_1 = new javax.swing.JButton();
        btn_1_2_2 = new javax.swing.JButton();
        btn_1_2_3 = new javax.swing.JButton();
        btn_1_2_4 = new javax.swing.JButton();
        btn_1_2_5 = new javax.swing.JButton();
        btn_1_2_6 = new javax.swing.JButton();
        btn_1_2_7 = new javax.swing.JButton();
        btn_1_2_8 = new javax.swing.JButton();
        btn_1_2_9 = new javax.swing.JButton();
        Modulo2 = new com.modelo.PanelRound();
        encabezado2 = new com.modelo.PanelRound();
        icono2 = new javax.swing.JLabel();
        jlbTitulo2 = new javax.swing.JLabel();
        contenedorLinks2 = new javax.swing.JPanel();
        btn_2_1_1 = new javax.swing.JButton();
        btn_2_1_2 = new javax.swing.JButton();
        btn_2_1_3 = new javax.swing.JButton();
        btn_2_1_4 = new javax.swing.JButton();
        btn_2_1_5 = new javax.swing.JButton();
        btn_2_1_6 = new javax.swing.JButton();
        btn_2_1_7 = new javax.swing.JButton();
        btn_2_1_8 = new javax.swing.JButton();
        btn_2_1_9 = new javax.swing.JButton();
        btn_2_2_1 = new javax.swing.JButton();
        btn_2_2_2 = new javax.swing.JButton();
        btn_2_2_3 = new javax.swing.JButton();
        btn_2_2_4 = new javax.swing.JButton();
        btn_2_2_5 = new javax.swing.JButton();
        btn_2_2_6 = new javax.swing.JButton();
        btn_2_2_7 = new javax.swing.JButton();
        btn_2_2_8 = new javax.swing.JButton();
        btn_2_2_9 = new javax.swing.JButton();
        Modulo3 = new com.modelo.PanelRound();
        encabezado3 = new com.modelo.PanelRound();
        icono3 = new javax.swing.JLabel();
        jlbTitulo3 = new javax.swing.JLabel();
        contenedorLinks3 = new javax.swing.JPanel();
        btn_3_1_1 = new javax.swing.JButton();
        btn_3_1_2 = new javax.swing.JButton();
        btn_3_1_3 = new javax.swing.JButton();
        btn_3_1_4 = new javax.swing.JButton();
        btn_3_1_5 = new javax.swing.JButton();
        btn_3_2_1 = new javax.swing.JButton();
        btn_3_2_2 = new javax.swing.JButton();
        btn_3_2_3 = new javax.swing.JButton();
        btn_3_2_4 = new javax.swing.JButton();
        btn_3_2_5 = new javax.swing.JButton();

        setBackground(new java.awt.Color(236, 244, 249));
        setPreferredSize(new java.awt.Dimension(1087, 1377));

        btnAtras.setBackground(new java.awt.Color(236, 244, 249));
        btnAtras.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.setRoundBottomLeft(10);
        btnAtras.setRoundBottomRight(10);
        btnAtras.setRoundTopLeft(10);
        btnAtras.setRoundTopRight(10);
        btnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasMouseClicked(evt);
            }
        });
        btnAtras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(40, 48, 68));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Atrás");
        btnAtras.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaIzquierda.png"))); // NOI18N
        btnAtras.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 40));

        contenedorGeneral.setBackground(new java.awt.Color(255, 255, 255));
        contenedorGeneral.setRoundBottomLeft(20);
        contenedorGeneral.setRoundBottomRight(20);
        contenedorGeneral.setRoundTopLeft(20);
        contenedorGeneral.setRoundTopRight(20);

        contenedorGris.setBackground(new java.awt.Color(243, 243, 243));

        contenedorModulos.setBackground(new java.awt.Color(255, 255, 255));

        EcabezadoGeneral.setBackground(new java.awt.Color(255, 255, 255));

        jlbTitle.setFont(new java.awt.Font("Century Gothic", 0, 26)); // NOI18N
        jlbTitle.setForeground(new java.awt.Color(56, 124, 180));
        jlbTitle.setText("DOCUMENTOS");
        jlbTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jlbTitle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jlbPuntos.setForeground(new java.awt.Color(56, 124, 180));
        jlbPuntos.setText(".................................................................................................................................................................................");
        jlbPuntos.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout EcabezadoGeneralLayout = new javax.swing.GroupLayout(EcabezadoGeneral);
        EcabezadoGeneral.setLayout(EcabezadoGeneralLayout);
        EcabezadoGeneralLayout.setHorizontalGroup(
            EcabezadoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EcabezadoGeneralLayout.createSequentialGroup()
                .addComponent(jlbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jlbPuntos, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        EcabezadoGeneralLayout.setVerticalGroup(
            EcabezadoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EcabezadoGeneralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jlbPuntos))
        );

        Modulo1.setBackground(new java.awt.Color(255, 255, 255));
        Modulo1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 124, 180), 2, true));
        Modulo1.setRoundBottomLeft(20);
        Modulo1.setRoundBottomRight(20);
        Modulo1.setRoundTopLeft(20);
        Modulo1.setRoundTopRight(20);

        encabezado1.setBackground(new java.awt.Color(56, 124, 180));
        encabezado1.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        encabezado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                encabezado1MouseClicked(evt);
            }
        });

        icono1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/iconoListaCuadrada.png"))); // NOI18N

        jlbTitulo1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlbTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jlbTitulo1.setText("Guías y Reglamentos aplicables al Periodo 2023- Ciclo 1 Marzo");

        javax.swing.GroupLayout encabezado1Layout = new javax.swing.GroupLayout(encabezado1);
        encabezado1.setLayout(encabezado1Layout);
        encabezado1Layout.setHorizontalGroup(
            encabezado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encabezado1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icono1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlbTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289))
        );
        encabezado1Layout.setVerticalGroup(
            encabezado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, encabezado1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(encabezado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(icono1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        contenedorLinks1.setBackground(new java.awt.Color(255, 255, 255));

        btn_1_1_1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_1_1_1.setForeground(new java.awt.Color(56, 124, 180));
        btn_1_1_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_1_1_1.setText("Reglamento de Estudios");
        btn_1_1_1.setBorder(null);
        btn_1_1_1.setBorderPainted(false);
        btn_1_1_1.setContentAreaFilled(false);
        btn_1_1_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1_1_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_1_1_1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_1_1_2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_1_1_2.setForeground(new java.awt.Color(56, 124, 180));
        btn_1_1_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_1_1_2.setText("Guía del Estudiante 2023 - Ciclo 1 Marzo");
        btn_1_1_2.setBorder(null);
        btn_1_1_2.setBorderPainted(false);
        btn_1_1_2.setContentAreaFilled(false);
        btn_1_1_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1_1_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_1_1_2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_1_1_3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_1_1_3.setForeground(new java.awt.Color(56, 124, 180));
        btn_1_1_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_1_1_3.setText("Reglamento de Becas");
        btn_1_1_3.setBorder(null);
        btn_1_1_3.setBorderPainted(false);
        btn_1_1_3.setContentAreaFilled(false);
        btn_1_1_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1_1_3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_1_1_3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_1_1_4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_1_1_4.setForeground(new java.awt.Color(56, 124, 180));
        btn_1_1_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_1_1_4.setText("Guia de Becas y Convenios");
        btn_1_1_4.setBorder(null);
        btn_1_1_4.setBorderPainted(false);
        btn_1_1_4.setContentAreaFilled(false);
        btn_1_1_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1_1_4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_1_1_4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_1_1_5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_1_1_5.setForeground(new java.awt.Color(56, 124, 180));
        btn_1_1_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_1_1_5.setText("Reglamento de Defensoría Universitaria");
        btn_1_1_5.setBorder(null);
        btn_1_1_5.setBorderPainted(false);
        btn_1_1_5.setContentAreaFilled(false);
        btn_1_1_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1_1_5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_1_1_5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_1_1_6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_1_1_6.setForeground(new java.awt.Color(56, 124, 180));
        btn_1_1_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_1_1_6.setText("Reglamento de prevencion y sancion del Hostigamiento Sexual");
        btn_1_1_6.setBorder(null);
        btn_1_1_6.setBorderPainted(false);
        btn_1_1_6.setContentAreaFilled(false);
        btn_1_1_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1_1_6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_1_1_6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_1_1_7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_1_1_7.setForeground(new java.awt.Color(56, 124, 180));
        btn_1_1_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_1_1_7.setText("Aprobación Reglamento Grados y Títulos");
        btn_1_1_7.setBorder(null);
        btn_1_1_7.setBorderPainted(false);
        btn_1_1_7.setContentAreaFilled(false);
        btn_1_1_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1_1_7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_1_1_7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_1_1_8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_1_1_8.setForeground(new java.awt.Color(56, 124, 180));
        btn_1_1_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_1_1_8.setText("Reglamento del Internado de Psicologia");
        btn_1_1_8.setBorder(null);
        btn_1_1_8.setBorderPainted(false);
        btn_1_1_8.setContentAreaFilled(false);
        btn_1_1_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1_1_8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_1_1_8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_1_1_9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_1_1_9.setForeground(new java.awt.Color(56, 124, 180));
        btn_1_1_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_1_1_9.setText("Tarifario");
        btn_1_1_9.setBorder(null);
        btn_1_1_9.setBorderPainted(false);
        btn_1_1_9.setContentAreaFilled(false);
        btn_1_1_9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1_1_9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_1_1_9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_1_2_1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_1_2_1.setForeground(new java.awt.Color(56, 124, 180));
        btn_1_2_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_1_2_1.setText("Resol.Rect. N 0035-2023-R-UTP Reglamento Estudios");
        btn_1_2_1.setBorder(null);
        btn_1_2_1.setBorderPainted(false);
        btn_1_2_1.setContentAreaFilled(false);
        btn_1_2_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1_2_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_1_2_1.setPreferredSize(new java.awt.Dimension(393, 17));
        btn_1_2_1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_1_2_2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_1_2_2.setForeground(new java.awt.Color(56, 124, 180));
        btn_1_2_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_1_2_2.setText("RR Nº0099-2023-R-UTP Reglamento de Becas de Pregrado");
        btn_1_2_2.setBorder(null);
        btn_1_2_2.setBorderPainted(false);
        btn_1_2_2.setContentAreaFilled(false);
        btn_1_2_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1_2_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_1_2_2.setPreferredSize(new java.awt.Dimension(393, 17));
        btn_1_2_2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_1_2_3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_1_2_3.setForeground(new java.awt.Color(56, 124, 180));
        btn_1_2_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_1_2_3.setText("RR.Nº 0036-2022-R-UTP Protocolo de Bioseguridad Covid");
        btn_1_2_3.setBorder(null);
        btn_1_2_3.setBorderPainted(false);
        btn_1_2_3.setContentAreaFilled(false);
        btn_1_2_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1_2_3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_1_2_3.setPreferredSize(new java.awt.Dimension(393, 17));
        btn_1_2_3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_1_2_4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_1_2_4.setForeground(new java.awt.Color(56, 124, 180));
        btn_1_2_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_1_2_4.setText("Reglamento Prevención y Sanción Hostigamiento Sexual");
        btn_1_2_4.setBorder(null);
        btn_1_2_4.setBorderPainted(false);
        btn_1_2_4.setContentAreaFilled(false);
        btn_1_2_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1_2_4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_1_2_4.setPreferredSize(new java.awt.Dimension(393, 17));
        btn_1_2_4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_1_2_5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_1_2_5.setForeground(new java.awt.Color(56, 124, 180));
        btn_1_2_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_1_2_5.setText("Reglamento de Disciplina");
        btn_1_2_5.setBorder(null);
        btn_1_2_5.setBorderPainted(false);
        btn_1_2_5.setContentAreaFilled(false);
        btn_1_2_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1_2_5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_1_2_5.setPreferredSize(new java.awt.Dimension(393, 17));
        btn_1_2_5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_1_2_6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_1_2_6.setForeground(new java.awt.Color(56, 124, 180));
        btn_1_2_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_1_2_6.setText("Acreditación de idioma extranjero");
        btn_1_2_6.setBorder(null);
        btn_1_2_6.setBorderPainted(false);
        btn_1_2_6.setContentAreaFilled(false);
        btn_1_2_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1_2_6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_1_2_6.setPreferredSize(new java.awt.Dimension(393, 17));
        btn_1_2_6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_1_2_7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_1_2_7.setForeground(new java.awt.Color(56, 124, 180));
        btn_1_2_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_1_2_7.setText("Reglamento de Grados y Títulos");
        btn_1_2_7.setBorder(null);
        btn_1_2_7.setBorderPainted(false);
        btn_1_2_7.setContentAreaFilled(false);
        btn_1_2_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1_2_7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_1_2_7.setPreferredSize(new java.awt.Dimension(393, 17));
        btn_1_2_7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_1_2_8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_1_2_8.setForeground(new java.awt.Color(56, 124, 180));
        btn_1_2_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_1_2_8.setText("Aprobacion del Reglamento de SECIGRA");
        btn_1_2_8.setBorder(null);
        btn_1_2_8.setBorderPainted(false);
        btn_1_2_8.setContentAreaFilled(false);
        btn_1_2_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1_2_8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_1_2_8.setPreferredSize(new java.awt.Dimension(393, 17));
        btn_1_2_8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_1_2_9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_1_2_9.setForeground(new java.awt.Color(56, 124, 180));
        btn_1_2_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_1_2_9.setText("Politicas Diversidad Equidad Inclusion Estudiantes");
        btn_1_2_9.setBorder(null);
        btn_1_2_9.setBorderPainted(false);
        btn_1_2_9.setContentAreaFilled(false);
        btn_1_2_9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1_2_9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_1_2_9.setPreferredSize(new java.awt.Dimension(393, 17));
        btn_1_2_9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        javax.swing.GroupLayout contenedorLinks1Layout = new javax.swing.GroupLayout(contenedorLinks1);
        contenedorLinks1.setLayout(contenedorLinks1Layout);
        contenedorLinks1Layout.setHorizontalGroup(
            contenedorLinks1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLinks1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorLinks1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_1_1_1)
                    .addComponent(btn_1_1_6)
                    .addComponent(btn_1_1_3)
                    .addComponent(btn_1_1_4)
                    .addComponent(btn_1_1_7)
                    .addComponent(btn_1_1_8)
                    .addComponent(btn_1_1_9)
                    .addGroup(contenedorLinks1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_1_1_5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_1_1_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(contenedorLinks1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLinks1Layout.createSequentialGroup()
                        .addGroup(contenedorLinks1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_1_2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contenedorLinks1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btn_1_2_2, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                                .addComponent(btn_1_2_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_1_2_4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(btn_1_2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_1_2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_1_2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLinks1Layout.createSequentialGroup()
                        .addComponent(btn_1_2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLinks1Layout.createSequentialGroup()
                        .addComponent(btn_1_2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))))
        );
        contenedorLinks1Layout.setVerticalGroup(
            contenedorLinks1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLinks1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorLinks1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLinks1Layout.createSequentialGroup()
                        .addComponent(btn_1_2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_1_2_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_1_2_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_1_2_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_1_2_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_1_2_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_1_2_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_1_2_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_1_2_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorLinks1Layout.createSequentialGroup()
                        .addComponent(btn_1_1_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_1_1_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_1_1_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_1_1_4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_1_1_5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_1_1_6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_1_1_7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_1_1_8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_1_1_9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Modulo1Layout = new javax.swing.GroupLayout(Modulo1);
        Modulo1.setLayout(Modulo1Layout);
        Modulo1Layout.setHorizontalGroup(
            Modulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(encabezado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(contenedorLinks1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Modulo1Layout.setVerticalGroup(
            Modulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modulo1Layout.createSequentialGroup()
                .addComponent(encabezado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorLinks1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Modulo2.setBackground(new java.awt.Color(255, 255, 255));
        Modulo2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 124, 180), 2, true));
        Modulo2.setRoundBottomLeft(20);
        Modulo2.setRoundBottomRight(20);
        Modulo2.setRoundTopLeft(20);
        Modulo2.setRoundTopRight(20);

        encabezado2.setBackground(new java.awt.Color(56, 124, 180));
        encabezado2.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        encabezado2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                encabezado2MouseClicked(evt);
            }
        });

        icono2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/iconoListaCuadrada.png"))); // NOI18N

        jlbTitulo2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlbTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        jlbTitulo2.setText("Guías y Reglamentos aplicables al Periodo 2023- Ciclo 2 Agosto");

        javax.swing.GroupLayout encabezado2Layout = new javax.swing.GroupLayout(encabezado2);
        encabezado2.setLayout(encabezado2Layout);
        encabezado2Layout.setHorizontalGroup(
            encabezado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encabezado2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icono2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlbTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
        );
        encabezado2Layout.setVerticalGroup(
            encabezado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, encabezado2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(encabezado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(icono2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        contenedorLinks2.setBackground(new java.awt.Color(255, 255, 255));

        btn_2_1_1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_2_1_1.setForeground(new java.awt.Color(56, 124, 180));
        btn_2_1_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_2_1_1.setText("Reglamento de Estudios");
        btn_2_1_1.setBorder(null);
        btn_2_1_1.setBorderPainted(false);
        btn_2_1_1.setContentAreaFilled(false);
        btn_2_1_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2_1_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_2_1_1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_2_1_2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_2_1_2.setForeground(new java.awt.Color(56, 124, 180));
        btn_2_1_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_2_1_2.setText("Guía del Estudiante 2023 - Ciclo 1 Marzo");
        btn_2_1_2.setBorder(null);
        btn_2_1_2.setBorderPainted(false);
        btn_2_1_2.setContentAreaFilled(false);
        btn_2_1_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2_1_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_2_1_2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_2_1_3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_2_1_3.setForeground(new java.awt.Color(56, 124, 180));
        btn_2_1_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_2_1_3.setText("Reglamento de Becas");
        btn_2_1_3.setBorder(null);
        btn_2_1_3.setBorderPainted(false);
        btn_2_1_3.setContentAreaFilled(false);
        btn_2_1_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2_1_3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_2_1_3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_2_1_4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_2_1_4.setForeground(new java.awt.Color(56, 124, 180));
        btn_2_1_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_2_1_4.setText("Guia de Becas y Convenios");
        btn_2_1_4.setBorder(null);
        btn_2_1_4.setBorderPainted(false);
        btn_2_1_4.setContentAreaFilled(false);
        btn_2_1_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2_1_4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_2_1_4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_2_1_5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_2_1_5.setForeground(new java.awt.Color(56, 124, 180));
        btn_2_1_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_2_1_5.setText("Reglamento de Defensoría Universitaria");
        btn_2_1_5.setBorder(null);
        btn_2_1_5.setBorderPainted(false);
        btn_2_1_5.setContentAreaFilled(false);
        btn_2_1_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2_1_5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_2_1_5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_2_1_6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_2_1_6.setForeground(new java.awt.Color(56, 124, 180));
        btn_2_1_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_2_1_6.setText("Reglamento de prevencion y sancion del Hostigamiento Sexual");
        btn_2_1_6.setBorder(null);
        btn_2_1_6.setBorderPainted(false);
        btn_2_1_6.setContentAreaFilled(false);
        btn_2_1_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2_1_6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_2_1_6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_2_1_7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_2_1_7.setForeground(new java.awt.Color(56, 124, 180));
        btn_2_1_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_2_1_7.setText("Aprobación Reglamento Grados y Títulos");
        btn_2_1_7.setBorder(null);
        btn_2_1_7.setBorderPainted(false);
        btn_2_1_7.setContentAreaFilled(false);
        btn_2_1_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2_1_7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_2_1_7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_2_1_8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_2_1_8.setForeground(new java.awt.Color(56, 124, 180));
        btn_2_1_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_2_1_8.setText("Reglamento del Internado de Psicologia");
        btn_2_1_8.setBorder(null);
        btn_2_1_8.setBorderPainted(false);
        btn_2_1_8.setContentAreaFilled(false);
        btn_2_1_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2_1_8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_2_1_8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_2_1_9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_2_1_9.setForeground(new java.awt.Color(56, 124, 180));
        btn_2_1_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_2_1_9.setText("Tarifario");
        btn_2_1_9.setBorder(null);
        btn_2_1_9.setBorderPainted(false);
        btn_2_1_9.setContentAreaFilled(false);
        btn_2_1_9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2_1_9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_2_1_9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_2_2_1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_2_2_1.setForeground(new java.awt.Color(56, 124, 180));
        btn_2_2_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_2_2_1.setText("Resol.Rect. N 0035-2023-R-UTP Reglamento Estudios");
        btn_2_2_1.setBorder(null);
        btn_2_2_1.setBorderPainted(false);
        btn_2_2_1.setContentAreaFilled(false);
        btn_2_2_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2_2_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_2_2_1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_2_2_2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_2_2_2.setForeground(new java.awt.Color(56, 124, 180));
        btn_2_2_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_2_2_2.setText("RR Nº0099-2023-R-UTP Reglamento de Becas de Pregrado");
        btn_2_2_2.setBorder(null);
        btn_2_2_2.setBorderPainted(false);
        btn_2_2_2.setContentAreaFilled(false);
        btn_2_2_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2_2_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_2_2_2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_2_2_3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_2_2_3.setForeground(new java.awt.Color(56, 124, 180));
        btn_2_2_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_2_2_3.setText("RR.Nº 0036-2022-R-UTP Protocolo de Bioseguridad Covid");
        btn_2_2_3.setBorder(null);
        btn_2_2_3.setBorderPainted(false);
        btn_2_2_3.setContentAreaFilled(false);
        btn_2_2_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2_2_3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_2_2_3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_2_2_4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_2_2_4.setForeground(new java.awt.Color(56, 124, 180));
        btn_2_2_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_2_2_4.setText("Reglamento Prevención y Sanción Hostigamiento Sexual");
        btn_2_2_4.setBorder(null);
        btn_2_2_4.setBorderPainted(false);
        btn_2_2_4.setContentAreaFilled(false);
        btn_2_2_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2_2_4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_2_2_4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_2_2_5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_2_2_5.setForeground(new java.awt.Color(56, 124, 180));
        btn_2_2_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_2_2_5.setText("Reglamento de Disciplina");
        btn_2_2_5.setBorder(null);
        btn_2_2_5.setBorderPainted(false);
        btn_2_2_5.setContentAreaFilled(false);
        btn_2_2_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2_2_5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_2_2_5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_2_2_6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_2_2_6.setForeground(new java.awt.Color(56, 124, 180));
        btn_2_2_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_2_2_6.setText("Acreditación de idioma extranjero");
        btn_2_2_6.setBorder(null);
        btn_2_2_6.setBorderPainted(false);
        btn_2_2_6.setContentAreaFilled(false);
        btn_2_2_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2_2_6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_2_2_6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_2_2_7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_2_2_7.setForeground(new java.awt.Color(56, 124, 180));
        btn_2_2_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_2_2_7.setText("Reglamento de Grados y Títulos");
        btn_2_2_7.setBorder(null);
        btn_2_2_7.setBorderPainted(false);
        btn_2_2_7.setContentAreaFilled(false);
        btn_2_2_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2_2_7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_2_2_7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_2_2_8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_2_2_8.setForeground(new java.awt.Color(56, 124, 180));
        btn_2_2_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_2_2_8.setText("Aprobacion del Reglamento de SECIGRA");
        btn_2_2_8.setBorder(null);
        btn_2_2_8.setBorderPainted(false);
        btn_2_2_8.setContentAreaFilled(false);
        btn_2_2_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2_2_8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_2_2_8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_2_2_9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_2_2_9.setForeground(new java.awt.Color(56, 124, 180));
        btn_2_2_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_2_2_9.setText("Politicas Diversidad Equidad Inclusion Estudiantes");
        btn_2_2_9.setBorder(null);
        btn_2_2_9.setBorderPainted(false);
        btn_2_2_9.setContentAreaFilled(false);
        btn_2_2_9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2_2_9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_2_2_9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        javax.swing.GroupLayout contenedorLinks2Layout = new javax.swing.GroupLayout(contenedorLinks2);
        contenedorLinks2.setLayout(contenedorLinks2Layout);
        contenedorLinks2Layout.setHorizontalGroup(
            contenedorLinks2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLinks2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorLinks2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLinks2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_2_1_1)
                        .addComponent(btn_2_1_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_2_1_3)
                        .addComponent(btn_2_1_4)
                        .addComponent(btn_2_1_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_2_1_9))
                    .addComponent(btn_2_1_6)
                    .addGroup(contenedorLinks2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_2_1_8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_2_1_7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(contenedorLinks2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLinks2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLinks2Layout.createSequentialGroup()
                            .addComponent(btn_2_2_1)
                            .addGap(58, 58, 58))
                        .addGroup(contenedorLinks2Layout.createSequentialGroup()
                            .addGroup(contenedorLinks2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(contenedorLinks2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn_2_2_4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_2_2_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_2_2_3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(btn_2_2_6)
                                .addComponent(btn_2_2_7)
                                .addComponent(btn_2_2_8))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLinks2Layout.createSequentialGroup()
                        .addComponent(btn_2_2_5)
                        .addGap(206, 206, 206))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLinks2Layout.createSequentialGroup()
                        .addComponent(btn_2_2_9)
                        .addGap(66, 66, 66))))
        );
        contenedorLinks2Layout.setVerticalGroup(
            contenedorLinks2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLinks2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorLinks2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLinks2Layout.createSequentialGroup()
                        .addComponent(btn_2_2_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_2_2_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_2_2_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_2_2_4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_2_2_5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_2_2_6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_2_2_7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_2_2_8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_2_2_9))
                    .addGroup(contenedorLinks2Layout.createSequentialGroup()
                        .addComponent(btn_2_1_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_2_1_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_2_1_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_2_1_4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_2_1_5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_2_1_6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_2_1_7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_2_1_8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_2_1_9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Modulo2Layout = new javax.swing.GroupLayout(Modulo2);
        Modulo2.setLayout(Modulo2Layout);
        Modulo2Layout.setHorizontalGroup(
            Modulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(encabezado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(contenedorLinks2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Modulo2Layout.setVerticalGroup(
            Modulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modulo2Layout.createSequentialGroup()
                .addComponent(encabezado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorLinks2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Modulo3.setBackground(new java.awt.Color(255, 255, 255));
        Modulo3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 124, 180), 2, true));
        Modulo3.setRoundBottomLeft(20);
        Modulo3.setRoundBottomRight(20);
        Modulo3.setRoundTopLeft(20);
        Modulo3.setRoundTopRight(20);
        Modulo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Modulo3MouseClicked(evt);
            }
        });

        encabezado3.setBackground(new java.awt.Color(56, 124, 180));
        encabezado3.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        icono3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/iconoListaCuadrada.png"))); // NOI18N

        jlbTitulo3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlbTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        jlbTitulo3.setText("Manuales vigentes");

        javax.swing.GroupLayout encabezado3Layout = new javax.swing.GroupLayout(encabezado3);
        encabezado3.setLayout(encabezado3Layout);
        encabezado3Layout.setHorizontalGroup(
            encabezado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encabezado3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icono3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlbTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(602, Short.MAX_VALUE))
        );
        encabezado3Layout.setVerticalGroup(
            encabezado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, encabezado3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(encabezado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbTitulo3, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(icono3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        contenedorLinks3.setBackground(new java.awt.Color(255, 255, 255));

        btn_3_1_1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_3_1_1.setForeground(new java.awt.Color(56, 124, 180));
        btn_3_1_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_3_1_1.setText("Manual UTP+ Portal");
        btn_3_1_1.setBorder(null);
        btn_3_1_1.setBorderPainted(false);
        btn_3_1_1.setContentAreaFilled(false);
        btn_3_1_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_3_1_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_3_1_1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_3_1_2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_3_1_2.setForeground(new java.awt.Color(56, 124, 180));
        btn_3_1_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_3_1_2.setText("Programa de Salud Estudiantil (PSE)");
        btn_3_1_2.setBorder(null);
        btn_3_1_2.setBorderPainted(false);
        btn_3_1_2.setContentAreaFilled(false);
        btn_3_1_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_3_1_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_3_1_2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_3_1_3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_3_1_3.setForeground(new java.awt.Color(56, 124, 180));
        btn_3_1_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_3_1_3.setText("Opciones de pago");
        btn_3_1_3.setBorder(null);
        btn_3_1_3.setBorderPainted(false);
        btn_3_1_3.setContentAreaFilled(false);
        btn_3_1_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_3_1_3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_3_1_3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_3_1_4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_3_1_4.setForeground(new java.awt.Color(56, 124, 180));
        btn_3_1_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_3_1_4.setText("Guía rápida de conexión wifi UTP-CAMPUS");
        btn_3_1_4.setBorder(null);
        btn_3_1_4.setBorderPainted(false);
        btn_3_1_4.setContentAreaFilled(false);
        btn_3_1_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_3_1_4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_3_1_4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_3_1_5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_3_1_5.setForeground(new java.awt.Color(56, 124, 180));
        btn_3_1_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_3_1_5.setText("Defensoría Universitaria");
        btn_3_1_5.setBorder(null);
        btn_3_1_5.setBorderPainted(false);
        btn_3_1_5.setContentAreaFilled(false);
        btn_3_1_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_3_1_5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_3_1_5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_3_2_1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_3_2_1.setForeground(new java.awt.Color(56, 124, 180));
        btn_3_2_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_3_2_1.setText("Guía de Matrícula en Línea");
        btn_3_2_1.setBorder(null);
        btn_3_2_1.setBorderPainted(false);
        btn_3_2_1.setContentAreaFilled(false);
        btn_3_2_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_3_2_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_3_2_1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_3_2_2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_3_2_2.setForeground(new java.awt.Color(56, 124, 180));
        btn_3_2_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_3_2_2.setText("Manual de pagos");
        btn_3_2_2.setBorder(null);
        btn_3_2_2.setBorderPainted(false);
        btn_3_2_2.setContentAreaFilled(false);
        btn_3_2_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_3_2_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_3_2_2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_3_2_3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_3_2_3.setForeground(new java.awt.Color(56, 124, 180));
        btn_3_2_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_3_2_3.setText("Protocolo Alumnos");
        btn_3_2_3.setBorder(null);
        btn_3_2_3.setBorderPainted(false);
        btn_3_2_3.setContentAreaFilled(false);
        btn_3_2_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_3_2_3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_3_2_3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_3_2_4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_3_2_4.setForeground(new java.awt.Color(56, 124, 180));
        btn_3_2_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_3_2_4.setText("Manual de Ticketero de Visitas SAE");
        btn_3_2_4.setBorder(null);
        btn_3_2_4.setBorderPainted(false);
        btn_3_2_4.setContentAreaFilled(false);
        btn_3_2_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_3_2_4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_3_2_4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        btn_3_2_5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_3_2_5.setForeground(new java.awt.Color(56, 124, 180));
        btn_3_2_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        btn_3_2_5.setText("Guía del Egresado");
        btn_3_2_5.setBorder(null);
        btn_3_2_5.setBorderPainted(false);
        btn_3_2_5.setContentAreaFilled(false);
        btn_3_2_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_3_2_5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_3_2_5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        javax.swing.GroupLayout contenedorLinks3Layout = new javax.swing.GroupLayout(contenedorLinks3);
        contenedorLinks3.setLayout(contenedorLinks3Layout);
        contenedorLinks3Layout.setHorizontalGroup(
            contenedorLinks3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLinks3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorLinks3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_3_1_1)
                    .addComponent(btn_3_1_2)
                    .addComponent(btn_3_1_3)
                    .addComponent(btn_3_1_4)
                    .addComponent(btn_3_1_5))
                .addGap(147, 147, 147)
                .addGroup(contenedorLinks3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLinks3Layout.createSequentialGroup()
                        .addGroup(contenedorLinks3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_3_2_2)
                            .addComponent(btn_3_2_3)
                            .addComponent(btn_3_2_5))
                        .addGap(245, 245, 245))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLinks3Layout.createSequentialGroup()
                        .addComponent(btn_3_2_1)
                        .addGap(197, 197, 197))
                    .addGroup(contenedorLinks3Layout.createSequentialGroup()
                        .addComponent(btn_3_2_4)
                        .addContainerGap())))
        );
        contenedorLinks3Layout.setVerticalGroup(
            contenedorLinks3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLinks3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contenedorLinks3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLinks3Layout.createSequentialGroup()
                        .addComponent(btn_3_2_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_3_2_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_3_2_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_3_2_4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_3_2_5))
                    .addGroup(contenedorLinks3Layout.createSequentialGroup()
                        .addComponent(btn_3_1_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_3_1_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_3_1_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_3_1_4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_3_1_5)))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout Modulo3Layout = new javax.swing.GroupLayout(Modulo3);
        Modulo3.setLayout(Modulo3Layout);
        Modulo3Layout.setHorizontalGroup(
            Modulo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(encabezado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(contenedorLinks3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Modulo3Layout.setVerticalGroup(
            Modulo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modulo3Layout.createSequentialGroup()
                .addComponent(encabezado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorLinks3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout contenedorModulosLayout = new javax.swing.GroupLayout(contenedorModulos);
        contenedorModulos.setLayout(contenedorModulosLayout);
        contenedorModulosLayout.setHorizontalGroup(
            contenedorModulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EcabezadoGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Modulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Modulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Modulo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        contenedorModulosLayout.setVerticalGroup(
            contenedorModulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorModulosLayout.createSequentialGroup()
                .addComponent(EcabezadoGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(Modulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(Modulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(Modulo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenedorGrisLayout = new javax.swing.GroupLayout(contenedorGris);
        contenedorGris.setLayout(contenedorGrisLayout);
        contenedorGrisLayout.setHorizontalGroup(
            contenedorGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorGrisLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(contenedorModulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        contenedorGrisLayout.setVerticalGroup(
            contenedorGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorGrisLayout.createSequentialGroup()
                .addComponent(contenedorModulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenedorGeneralLayout = new javax.swing.GroupLayout(contenedorGeneral);
        contenedorGeneral.setLayout(contenedorGeneralLayout);
        contenedorGeneralLayout.setHorizontalGroup(
            contenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorGeneralLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(contenedorGris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        contenedorGeneralLayout.setVerticalGroup(
            contenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorGeneralLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(contenedorGris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contenedorGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(contenedorGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseClicked
        UIController.MostrarPanel(contenedor, new moduloPrincipal(), 1087, 578);
        UIController.scrollToTop(frmPrincipal.scrollContenedor);
    }//GEN-LAST:event_btnAtrasMouseClicked

    private void encabezado1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encabezado1MouseClicked
        Achicar(contenedorLinks1);
        
    }//GEN-LAST:event_encabezado1MouseClicked

    private void encabezado2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encabezado2MouseClicked
        Achicar(contenedorLinks2);
    }//GEN-LAST:event_encabezado2MouseClicked

    private void Modulo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modulo3MouseClicked
        Achicar(contenedorLinks3);
    }//GEN-LAST:event_Modulo3MouseClicked

    private void Achicar(JPanel cont) {
        if (cont != null) {
            cont.setVisible(!cont.isVisible());
            revalidate();
            repaint();
            System.out.println("Achicar");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel EcabezadoGeneral;
    public static com.modelo.PanelRound Modulo1;
    public static com.modelo.PanelRound Modulo2;
    public static com.modelo.PanelRound Modulo3;
    public static com.modelo.PanelRound btnAtras;
    public static javax.swing.JButton btn_1_1_1;
    public static javax.swing.JButton btn_1_1_2;
    public static javax.swing.JButton btn_1_1_3;
    public static javax.swing.JButton btn_1_1_4;
    public static javax.swing.JButton btn_1_1_5;
    public static javax.swing.JButton btn_1_1_6;
    public static javax.swing.JButton btn_1_1_7;
    public static javax.swing.JButton btn_1_1_8;
    public static javax.swing.JButton btn_1_1_9;
    public static javax.swing.JButton btn_1_2_1;
    public static javax.swing.JButton btn_1_2_2;
    public static javax.swing.JButton btn_1_2_3;
    public static javax.swing.JButton btn_1_2_4;
    public static javax.swing.JButton btn_1_2_5;
    public static javax.swing.JButton btn_1_2_6;
    public static javax.swing.JButton btn_1_2_7;
    public static javax.swing.JButton btn_1_2_8;
    public static javax.swing.JButton btn_1_2_9;
    public static javax.swing.JButton btn_2_1_1;
    public static javax.swing.JButton btn_2_1_2;
    public static javax.swing.JButton btn_2_1_3;
    public static javax.swing.JButton btn_2_1_4;
    public static javax.swing.JButton btn_2_1_5;
    public static javax.swing.JButton btn_2_1_6;
    public static javax.swing.JButton btn_2_1_7;
    public static javax.swing.JButton btn_2_1_8;
    public static javax.swing.JButton btn_2_1_9;
    public static javax.swing.JButton btn_2_2_1;
    public static javax.swing.JButton btn_2_2_2;
    public static javax.swing.JButton btn_2_2_3;
    public static javax.swing.JButton btn_2_2_4;
    public static javax.swing.JButton btn_2_2_5;
    public static javax.swing.JButton btn_2_2_6;
    public static javax.swing.JButton btn_2_2_7;
    public static javax.swing.JButton btn_2_2_8;
    public static javax.swing.JButton btn_2_2_9;
    public static javax.swing.JButton btn_3_1_1;
    public static javax.swing.JButton btn_3_1_2;
    public static javax.swing.JButton btn_3_1_3;
    public static javax.swing.JButton btn_3_1_4;
    public static javax.swing.JButton btn_3_1_5;
    public static javax.swing.JButton btn_3_2_1;
    public static javax.swing.JButton btn_3_2_2;
    public static javax.swing.JButton btn_3_2_3;
    public static javax.swing.JButton btn_3_2_4;
    public static javax.swing.JButton btn_3_2_5;
    public static com.modelo.PanelRound contenedorGeneral;
    public static javax.swing.JPanel contenedorGris;
    public static javax.swing.JPanel contenedorLinks1;
    public static javax.swing.JPanel contenedorLinks2;
    public static javax.swing.JPanel contenedorLinks3;
    public static javax.swing.JPanel contenedorModulos;
    public static com.modelo.PanelRound encabezado1;
    public static com.modelo.PanelRound encabezado2;
    public static com.modelo.PanelRound encabezado3;
    public static javax.swing.JLabel icono1;
    public static javax.swing.JLabel icono2;
    public static javax.swing.JLabel icono3;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel jlbPuntos;
    public static javax.swing.JLabel jlbTitle;
    public static javax.swing.JLabel jlbTitulo1;
    public static javax.swing.JLabel jlbTitulo2;
    public static javax.swing.JLabel jlbTitulo3;
    // End of variables declaration//GEN-END:variables
}
