package com.vista;

import com.controlador.ControladorPanelPrincipal;
import com.modelo.UIController;
import java.awt.Color;

/**
 *
 * @author Benji
 */
public final class moduloPrincipal extends javax.swing.JPanel {

    public moduloPrincipal() {
        initComponents();
        initControlador();
        UIController.CursorSelectSubrayadoCustom(labelCorreo);
        UIController.CursorSelectSubrayadoCustom(labelCanvas);
        UIController.CursorSelectSubrayadoCustom(labelMicrosft);
        UIController.CursorSelectSubrayadoCustom(jlbContacLima);
        UIController.CursorSelectSubrayadoCustom(jlbContacProvincias);

    }

    private void initControlador() {
        txtFecha.setText(ControladorPanelPrincipal.initFecha());
        ControladorPanelPrincipal.initCarrusel();
        ControladorPanelPrincipal.initBotones();
        UIController.separadorCustom(separador);
        UIController.separadorCustom(separador1);
        ControladorPanelPrincipal.initLabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        panelFecha = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        btnIrHorario = new com.modelo.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        panelHorarios = new com.modelo.PanelRound();
        jlbTambienpouede = new javax.swing.JLabel();
        btnRolExamenes = new javax.swing.JLabel();
        btnInformacionInstitucional = new com.modelo.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlbOtrosEnlaces = new javax.swing.JLabel();
        jlbPodriaInteresar = new javax.swing.JLabel();
        panelInteresante = new javax.swing.JPanel();
        btnBeneficios = new com.modelo.PanelRound();
        logoBeneficios = new javax.swing.JLabel();
        jlbBeneficios = new javax.swing.JLabel();
        jlbDescpBeneficios = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnIngresaBiblioteca = new com.modelo.PanelRound();
        logoBiblioteca = new javax.swing.JLabel();
        jlbBiblioteca = new javax.swing.JLabel();
        jlbDescpBiblioteca = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnBolsaTrabajo = new com.modelo.PanelRound();
        logoBolsaTrabj = new javax.swing.JLabel();
        jlbBolsaTrab = new javax.swing.JLabel();
        jlbDescpBolsaTrab = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnEmpleabilidad = new com.modelo.PanelRound();
        logoEmpleabilidad = new javax.swing.JLabel();
        jlbEmpleabilidad = new javax.swing.JLabel();
        jlbDescpEmpleabilidad = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        separador1 = new javax.swing.JLabel();
        separador = new javax.swing.JLabel();
        panelDescarga_UtpApp = new javax.swing.JPanel();
        jlbDescarga = new javax.swing.JLabel();
        btnAppStore = new com.modelo.PanelRound();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnAppGallery = new com.modelo.PanelRound();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnGooglePlay = new com.modelo.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelOtrasPlataformas = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btnCorreoOutLoock = new com.modelo.PanelRound();
        labelCorreo = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnCanvas = new com.modelo.PanelRound();
        labelCanvas = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnMicrosftOffice = new com.modelo.PanelRound();
        labelMicrosft = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        panelCanalesAyuda = new javax.swing.JPanel();
        jlbCanalesAyuda = new javax.swing.JLabel();
        btnUTP_Infor = new com.modelo.PanelRound();
        jLabel23 = new javax.swing.JLabel();
        btnWhatsApp = new com.modelo.PanelRound();
        jlbEscribenosWhastApp = new javax.swing.JLabel();
        jlbNumeroWhatsApp = new javax.swing.JLabel();
        iconoWhastApp = new javax.swing.JLabel();
        jlbBordeFondo = new javax.swing.JLabel();
        panelContactanos = new javax.swing.JPanel();
        jlbContactanos = new javax.swing.JLabel();
        btnContacLima = new com.modelo.PanelRound();
        jlbContacLima = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnContacProvincias = new com.modelo.PanelRound();
        jlbContacProvincias = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 244, 249));
        setPreferredSize(new java.awt.Dimension(1087, 1377));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        contenedor.setBackground(new java.awt.Color(51, 255, 255));
        contenedor.setFocusCycleRoot(true);
        contenedor.setLayout(new java.awt.BorderLayout());

        panelFecha.setBackground(new java.awt.Color(236, 244, 249));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("Hoy,");

        txtFecha.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFecha.setText("00 aaa 0000");

        btnIrHorario.setBackground(new java.awt.Color(91, 54, 242));
        btnIrHorario.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIrHorario.setRoundBottomLeft(10);
        btnIrHorario.setRoundBottomRight(10);
        btnIrHorario.setRoundTopLeft(10);
        btnIrHorario.setRoundTopRight(10);
        btnIrHorario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIrHorarioMouseClicked(evt);
            }
        });
        btnIrHorario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ir a horario");
        btnIrHorario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        javax.swing.GroupLayout panelFechaLayout = new javax.swing.GroupLayout(panelFecha);
        panelFecha.setLayout(panelFechaLayout);
        panelFechaLayout.setHorizontalGroup(
            panelFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFechaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIrHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFechaLayout.setVerticalGroup(
            panelFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFechaLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(btnIrHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelHorarios.setBackground(new java.awt.Color(255, 255, 255));
        panelHorarios.setRoundBottomLeft(15);
        panelHorarios.setRoundBottomRight(15);
        panelHorarios.setRoundTopLeft(15);
        panelHorarios.setRoundTopRight(15);

        javax.swing.GroupLayout panelHorariosLayout = new javax.swing.GroupLayout(panelHorarios);
        panelHorarios.setLayout(panelHorariosLayout);
        panelHorariosLayout.setHorizontalGroup(
            panelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        panelHorariosLayout.setVerticalGroup(
            panelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jlbTambienpouede.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbTambienpouede.setText("También puedes ver tu");

        btnRolExamenes.setBackground(new java.awt.Color(91, 54, 242));
        btnRolExamenes.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnRolExamenes.setForeground(new java.awt.Color(91, 54, 242));
        btnRolExamenes.setText("rol de examenes aquí");
        btnRolExamenes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnRolExamenes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRolExamenes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRolExamenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRolExamenesMouseClicked(evt);
            }
        });

        btnInformacionInstitucional.setBackground(new java.awt.Color(255, 255, 255));
        btnInformacionInstitucional.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInformacionInstitucional.setRoundBottomLeft(10);
        btnInformacionInstitucional.setRoundBottomRight(10);
        btnInformacionInstitucional.setRoundTopLeft(10);
        btnInformacionInstitucional.setRoundTopRight(10);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/edificio.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(26, 5, 93));
        jLabel5.setText("Información institucional");

        javax.swing.GroupLayout btnInformacionInstitucionalLayout = new javax.swing.GroupLayout(btnInformacionInstitucional);
        btnInformacionInstitucional.setLayout(btnInformacionInstitucionalLayout);
        btnInformacionInstitucionalLayout.setHorizontalGroup(
            btnInformacionInstitucionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInformacionInstitucionalLayout.createSequentialGroup()
                .addGroup(btnInformacionInstitucionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnInformacionInstitucionalLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel5))
                    .addGroup(btnInformacionInstitucionalLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        btnInformacionInstitucionalLayout.setVerticalGroup(
            btnInformacionInstitucionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInformacionInstitucionalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jlbOtrosEnlaces.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbOtrosEnlaces.setText("Otros enlaces:");

        jlbPodriaInteresar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbPodriaInteresar.setText("Te podría interesar:");

        panelInteresante.setBackground(new java.awt.Color(236, 244, 249));

        btnBeneficios.setBackground(new java.awt.Color(255, 255, 255));
        btnBeneficios.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBeneficios.setRoundBottomLeft(10);
        btnBeneficios.setRoundBottomRight(10);
        btnBeneficios.setRoundTopLeft(10);
        btnBeneficios.setRoundTopRight(10);
        btnBeneficios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoBeneficios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoBeneficios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/svg1.png"))); // NOI18N
        btnBeneficios.add(logoBeneficios, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -3, 60, 80));

        jlbBeneficios.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jlbBeneficios.setForeground(new java.awt.Color(40, 48, 68));
        jlbBeneficios.setText("Beneficios");
        btnBeneficios.add(jlbBeneficios, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 20));

        jlbDescpBeneficios.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jlbDescpBeneficios.setForeground(new java.awt.Color(40, 48, 68));
        jlbDescpBeneficios.setText("Disfruta de promociones, descuentos y más en UTP");
        jlbDescpBeneficios.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnBeneficios.add(jlbDescpBeneficios, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 166, 50));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flecha.png"))); // NOI18N
        jLabel10.setToolTipText("");
        btnBeneficios.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 30, 40));

        btnIngresaBiblioteca.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresaBiblioteca.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresaBiblioteca.setRoundBottomLeft(10);
        btnIngresaBiblioteca.setRoundBottomRight(10);
        btnIngresaBiblioteca.setRoundTopLeft(10);
        btnIngresaBiblioteca.setRoundTopRight(10);
        btnIngresaBiblioteca.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoBiblioteca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/svg1.png"))); // NOI18N
        btnIngresaBiblioteca.add(logoBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -3, 60, 80));

        jlbBiblioteca.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jlbBiblioteca.setForeground(new java.awt.Color(40, 48, 68));
        jlbBiblioteca.setText("Ingresa a biblioteca");
        btnIngresaBiblioteca.add(jlbBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 20));

        jlbDescpBiblioteca.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jlbDescpBiblioteca.setForeground(new java.awt.Color(40, 48, 68));
        jlbDescpBiblioteca.setText("Encuentra recursos, libros y más");
        jlbDescpBiblioteca.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnIngresaBiblioteca.add(jlbDescpBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 166, 50));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flecha.png"))); // NOI18N
        jLabel18.setToolTipText("");
        btnIngresaBiblioteca.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 30, 40));

        btnBolsaTrabajo.setBackground(new java.awt.Color(255, 255, 255));
        btnBolsaTrabajo.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBolsaTrabajo.setRoundBottomLeft(10);
        btnBolsaTrabajo.setRoundBottomRight(10);
        btnBolsaTrabajo.setRoundTopLeft(10);
        btnBolsaTrabajo.setRoundTopRight(10);
        btnBolsaTrabajo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoBolsaTrabj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoBolsaTrabj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/svg1.png"))); // NOI18N
        btnBolsaTrabajo.add(logoBolsaTrabj, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -3, 60, 80));

        jlbBolsaTrab.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jlbBolsaTrab.setForeground(new java.awt.Color(40, 48, 68));
        jlbBolsaTrab.setText("Bolsa de trabajo");
        btnBolsaTrabajo.add(jlbBolsaTrab, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 20));

        jlbDescpBolsaTrab.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jlbDescpBolsaTrab.setForeground(new java.awt.Color(40, 48, 68));
        jlbDescpBolsaTrab.setText("Encuentra ofertas laborales exclusivas para ti");
        jlbDescpBolsaTrab.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnBolsaTrabajo.add(jlbDescpBolsaTrab, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 166, 50));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flecha.png"))); // NOI18N
        jLabel26.setToolTipText("");
        btnBolsaTrabajo.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 30, 40));

        btnEmpleabilidad.setBackground(new java.awt.Color(255, 255, 255));
        btnEmpleabilidad.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpleabilidad.setRoundBottomLeft(10);
        btnEmpleabilidad.setRoundBottomRight(10);
        btnEmpleabilidad.setRoundTopLeft(10);
        btnEmpleabilidad.setRoundTopRight(10);
        btnEmpleabilidad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoEmpleabilidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoEmpleabilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/svg1.png"))); // NOI18N
        btnEmpleabilidad.add(logoEmpleabilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -3, 60, 80));

        jlbEmpleabilidad.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jlbEmpleabilidad.setForeground(new java.awt.Color(40, 48, 68));
        jlbEmpleabilidad.setText("Empleabilidad");
        btnEmpleabilidad.add(jlbEmpleabilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 20));

        jlbDescpEmpleabilidad.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jlbDescpEmpleabilidad.setForeground(new java.awt.Color(40, 48, 68));
        jlbDescpEmpleabilidad.setText("Conoce más sobre tu ruta laboral con UTP");
        jlbDescpEmpleabilidad.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnEmpleabilidad.add(jlbDescpEmpleabilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 166, 50));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flecha.png"))); // NOI18N
        jLabel22.setToolTipText("");
        btnEmpleabilidad.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 30, 40));

        javax.swing.GroupLayout panelInteresanteLayout = new javax.swing.GroupLayout(panelInteresante);
        panelInteresante.setLayout(panelInteresanteLayout);
        panelInteresanteLayout.setHorizontalGroup(
            panelInteresanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInteresanteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnBeneficios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnIngresaBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnBolsaTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnEmpleabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        panelInteresanteLayout.setVerticalGroup(
            panelInteresanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInteresanteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelInteresanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBolsaTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBeneficios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresaBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmpleabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        separador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador1.setMaximumSize(new java.awt.Dimension(32767, 32767));

        separador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador.setMaximumSize(new java.awt.Dimension(32767, 32767));

        panelDescarga_UtpApp.setBackground(new java.awt.Color(236, 244, 249));

        jlbDescarga.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jlbDescarga.setText("¡Descarga UTP+APP!");

        btnAppStore.setBackground(new java.awt.Color(255, 255, 255));
        btnAppStore.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAppStore.setRoundBottomLeft(10);
        btnAppStore.setRoundBottomRight(10);
        btnAppStore.setRoundTopLeft(10);
        btnAppStore.setRoundTopRight(10);
        btnAppStore.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(40, 48, 68));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(40, 48, 68));
        jLabel11.setText("App Store");
        btnAppStore.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/iconAppStore.png"))); // NOI18N
        btnAppStore.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 40));

        btnAppGallery.setBackground(new java.awt.Color(255, 255, 255));
        btnAppGallery.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAppGallery.setRoundBottomLeft(10);
        btnAppGallery.setRoundBottomRight(10);
        btnAppGallery.setRoundTopLeft(10);
        btnAppGallery.setRoundTopRight(10);
        btnAppGallery.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(40, 48, 68));
        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(40, 48, 68));
        jLabel13.setText("AppGallery");
        btnAppGallery.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/iconAppGallery.png"))); // NOI18N
        btnAppGallery.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 40));

        btnGooglePlay.setBackground(new java.awt.Color(255, 255, 255));
        btnGooglePlay.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGooglePlay.setRoundBottomLeft(10);
        btnGooglePlay.setRoundBottomRight(10);
        btnGooglePlay.setRoundTopLeft(10);
        btnGooglePlay.setRoundTopRight(10);
        btnGooglePlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(40, 48, 68));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(40, 48, 68));
        jLabel8.setText("Google Play");
        btnGooglePlay.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/iconGooglePlay.png"))); // NOI18N
        btnGooglePlay.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 40));

        javax.swing.GroupLayout panelDescarga_UtpAppLayout = new javax.swing.GroupLayout(panelDescarga_UtpApp);
        panelDescarga_UtpApp.setLayout(panelDescarga_UtpAppLayout);
        panelDescarga_UtpAppLayout.setHorizontalGroup(
            panelDescarga_UtpAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDescarga_UtpAppLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelDescarga_UtpAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbDescarga)
                    .addGroup(panelDescarga_UtpAppLayout.createSequentialGroup()
                        .addGroup(panelDescarga_UtpAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAppGallery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGooglePlay, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(btnAppStore, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelDescarga_UtpAppLayout.setVerticalGroup(
            panelDescarga_UtpAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDescarga_UtpAppLayout.createSequentialGroup()
                .addComponent(jlbDescarga)
                .addGap(30, 30, 30)
                .addGroup(panelDescarga_UtpAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGooglePlay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAppStore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAppGallery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        panelOtrasPlataformas.setBackground(new java.awt.Color(236, 244, 249));

        jLabel15.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jLabel15.setText("Otras plataformas");

        btnCorreoOutLoock.setBackground(new java.awt.Color(236, 244, 249));
        btnCorreoOutLoock.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCorreoOutLoock.setRoundBottomLeft(10);
        btnCorreoOutLoock.setRoundBottomRight(10);
        btnCorreoOutLoock.setRoundTopLeft(10);
        btnCorreoOutLoock.setRoundTopRight(10);
        btnCorreoOutLoock.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCorreo.setBackground(new java.awt.Color(40, 48, 68));
        labelCorreo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        labelCorreo.setForeground(new java.awt.Color(40, 48, 68));
        labelCorreo.setText("Correo outloock");
        labelCorreo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCorreoOutLoock.add(labelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/iconCorreoOutloock.png"))); // NOI18N
        btnCorreoOutLoock.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 40));

        btnCanvas.setBackground(new java.awt.Color(236, 244, 249));
        btnCanvas.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCanvas.setRoundBottomLeft(10);
        btnCanvas.setRoundBottomRight(10);
        btnCanvas.setRoundTopLeft(10);
        btnCanvas.setRoundTopRight(10);
        btnCanvas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCanvas.setBackground(new java.awt.Color(40, 48, 68));
        labelCanvas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        labelCanvas.setForeground(new java.awt.Color(40, 48, 68));
        labelCanvas.setText("Canvas");
        labelCanvas.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCanvas.add(labelCanvas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/iconCanvas.png"))); // NOI18N
        btnCanvas.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 40));

        btnMicrosftOffice.setBackground(new java.awt.Color(236, 244, 249));
        btnMicrosftOffice.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMicrosftOffice.setRoundBottomLeft(10);
        btnMicrosftOffice.setRoundBottomRight(10);
        btnMicrosftOffice.setRoundTopLeft(10);
        btnMicrosftOffice.setRoundTopRight(10);
        btnMicrosftOffice.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMicrosft.setBackground(new java.awt.Color(40, 48, 68));
        labelMicrosft.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        labelMicrosft.setForeground(new java.awt.Color(40, 48, 68));
        labelMicrosft.setText("Microsft Office 365");
        labelMicrosft.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMicrosftOffice.add(labelMicrosft, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/iconMicrosftOffice.png"))); // NOI18N
        btnMicrosftOffice.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 40));

        javax.swing.GroupLayout panelOtrasPlataformasLayout = new javax.swing.GroupLayout(panelOtrasPlataformas);
        panelOtrasPlataformas.setLayout(panelOtrasPlataformasLayout);
        panelOtrasPlataformasLayout.setHorizontalGroup(
            panelOtrasPlataformasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOtrasPlataformasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOtrasPlataformasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15)
                    .addComponent(btnCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCorreoOutLoock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMicrosftOffice, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelOtrasPlataformasLayout.setVerticalGroup(
            panelOtrasPlataformasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOtrasPlataformasLayout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(27, 27, 27)
                .addComponent(btnCorreoOutLoock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMicrosftOffice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCanalesAyuda.setBackground(new java.awt.Color(236, 244, 249));

        jlbCanalesAyuda.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jlbCanalesAyuda.setText("Canales de ayuda");

        btnUTP_Infor.setBackground(new java.awt.Color(255, 255, 255));
        btnUTP_Infor.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUTP_Infor.setRoundBottomLeft(10);
        btnUTP_Infor.setRoundBottomRight(10);
        btnUTP_Infor.setRoundTopLeft(10);
        btnUTP_Infor.setRoundTopRight(10);
        btnUTP_Infor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/iconoUtpAyuda.png"))); // NOI18N
        btnUTP_Infor.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 30));

        btnWhatsApp.setBackground(new java.awt.Color(236, 244, 249));
        btnWhatsApp.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnWhatsApp.setRoundBottomLeft(10);
        btnWhatsApp.setRoundBottomRight(10);
        btnWhatsApp.setRoundTopLeft(10);
        btnWhatsApp.setRoundTopRight(10);
        btnWhatsApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnWhatsAppMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnWhatsAppMouseExited(evt);
            }
        });
        btnWhatsApp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbEscribenosWhastApp.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jlbEscribenosWhastApp.setForeground(new java.awt.Color(23, 81, 40));
        jlbEscribenosWhastApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbEscribenosWhastApp.setText("Escríbenos al WhastApp");
        btnWhatsApp.add(jlbEscribenosWhastApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 170, 30));

        jlbNumeroWhatsApp.setFont(new java.awt.Font("Montserrat", 0, 15)); // NOI18N
        jlbNumeroWhatsApp.setForeground(new java.awt.Color(23, 81, 40));
        jlbNumeroWhatsApp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbNumeroWhatsApp.setText("960 252 970");
        btnWhatsApp.add(jlbNumeroWhatsApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 160, 30));

        iconoWhastApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoWhastApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/iconWhastApp.png"))); // NOI18N
        btnWhatsApp.add(iconoWhastApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 40, 30));

        jlbBordeFondo.setBackground(new java.awt.Color(236, 244, 249));
        jlbBordeFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbBordeFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/bordeWhastApp.png"))); // NOI18N
        btnWhatsApp.add(jlbBordeFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 70));

        javax.swing.GroupLayout panelCanalesAyudaLayout = new javax.swing.GroupLayout(panelCanalesAyuda);
        panelCanalesAyuda.setLayout(panelCanalesAyudaLayout);
        panelCanalesAyudaLayout.setHorizontalGroup(
            panelCanalesAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCanalesAyudaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelCanalesAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbCanalesAyuda)
                    .addGroup(panelCanalesAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnUTP_Infor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnWhatsApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panelCanalesAyudaLayout.setVerticalGroup(
            panelCanalesAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCanalesAyudaLayout.createSequentialGroup()
                .addComponent(jlbCanalesAyuda)
                .addGap(18, 18, 18)
                .addComponent(btnUTP_Infor, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnWhatsApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelContactanos.setBackground(new java.awt.Color(236, 244, 249));

        jlbContactanos.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jlbContactanos.setText("Contáctanos");

        btnContacLima.setBackground(new java.awt.Color(236, 244, 249));
        btnContacLima.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnContacLima.setRoundBottomLeft(10);
        btnContacLima.setRoundBottomRight(10);
        btnContacLima.setRoundTopLeft(10);
        btnContacLima.setRoundTopRight(10);
        btnContacLima.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbContacLima.setBackground(new java.awt.Color(40, 48, 68));
        jlbContacLima.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlbContacLima.setForeground(new java.awt.Color(40, 48, 68));
        jlbContacLima.setText("Lima (01) 315 9600");
        jlbContacLima.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnContacLima.add(jlbContacLima, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/iconTelefono.png"))); // NOI18N
        btnContacLima.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 40));

        btnContacProvincias.setBackground(new java.awt.Color(236, 244, 249));
        btnContacProvincias.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnContacProvincias.setRoundBottomLeft(10);
        btnContacProvincias.setRoundBottomRight(10);
        btnContacProvincias.setRoundTopLeft(10);
        btnContacProvincias.setRoundTopRight(10);
        btnContacProvincias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbContacProvincias.setBackground(new java.awt.Color(40, 48, 68));
        jlbContacProvincias.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlbContacProvincias.setForeground(new java.awt.Color(40, 48, 68));
        jlbContacProvincias.setText("Provincias 0801 19 600");
        jlbContacProvincias.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnContacProvincias.add(jlbContacProvincias, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/iconTelefono.png"))); // NOI18N
        btnContacProvincias.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 40));

        javax.swing.GroupLayout panelContactanosLayout = new javax.swing.GroupLayout(panelContactanos);
        panelContactanos.setLayout(panelContactanosLayout);
        panelContactanosLayout.setHorizontalGroup(
            panelContactanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContactanosLayout.createSequentialGroup()
                .addComponent(jlbContactanos)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelContactanosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContactanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnContacLima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelContactanosLayout.createSequentialGroup()
                        .addComponent(btnContacProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelContactanosLayout.setVerticalGroup(
            panelContactanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContactanosLayout.createSequentialGroup()
                .addComponent(jlbContactanos)
                .addGap(18, 18, 18)
                .addComponent(btnContacLima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnContacProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Todos los derechos reservados - UTP + Portal 2022");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbPodriaInteresar)
                    .addComponent(btnInformacionInstitucional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbOtrosEnlaces)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbTambienpouede)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRolExamenes))
                    .addComponent(panelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelInteresante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addComponent(panelDescarga_UtpApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(panelOtrasPlataformas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(panelCanalesAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(panelContactanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(separador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(separador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTambienpouede)
                    .addComponent(btnRolExamenes))
                .addGap(45, 45, 45)
                .addComponent(jlbOtrosEnlaces)
                .addGap(28, 28, 28)
                .addComponent(btnInformacionInstitucional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jlbPodriaInteresar)
                .addGap(18, 18, 18)
                .addComponent(panelInteresante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDescarga_UtpApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelOtrasPlataformas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panelContactanos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelCanalesAyuda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void btnIrHorarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIrHorarioMouseClicked

    }//GEN-LAST:event_btnIrHorarioMouseClicked

    private void btnRolExamenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRolExamenesMouseClicked

    }//GEN-LAST:event_btnRolExamenesMouseClicked

    private void btnWhatsAppMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWhatsAppMouseEntered
        jlbEscribenosWhastApp.setForeground(Color.decode("#2d8746"));
        jlbNumeroWhatsApp.setForeground(Color.decode("#2d8746"));
    }//GEN-LAST:event_btnWhatsAppMouseEntered

    private void btnWhatsAppMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWhatsAppMouseExited
        jlbEscribenosWhastApp.setForeground(Color.decode("#175128"));
        jlbNumeroWhatsApp.setForeground(Color.decode("#175128"));
    }//GEN-LAST:event_btnWhatsAppMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static com.modelo.PanelRound btnAppGallery;
    public static com.modelo.PanelRound btnAppStore;
    public static com.modelo.PanelRound btnBeneficios;
    public static com.modelo.PanelRound btnBolsaTrabajo;
    public static com.modelo.PanelRound btnCanvas;
    public static com.modelo.PanelRound btnContacLima;
    public static com.modelo.PanelRound btnContacProvincias;
    public static com.modelo.PanelRound btnCorreoOutLoock;
    public static com.modelo.PanelRound btnEmpleabilidad;
    public static com.modelo.PanelRound btnGooglePlay;
    public static com.modelo.PanelRound btnInformacionInstitucional;
    public static com.modelo.PanelRound btnIngresaBiblioteca;
    public static com.modelo.PanelRound btnIrHorario;
    public static com.modelo.PanelRound btnMicrosftOffice;
    public static javax.swing.JLabel btnRolExamenes;
    public static com.modelo.PanelRound btnUTP_Infor;
    public static com.modelo.PanelRound btnWhatsApp;
    public static javax.swing.JPanel contenedor;
    public static javax.swing.JLabel iconoWhastApp;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel17;
    public static javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel19;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel20;
    public static javax.swing.JLabel jLabel21;
    public static javax.swing.JLabel jLabel22;
    public static javax.swing.JLabel jLabel23;
    public static javax.swing.JLabel jLabel24;
    public static javax.swing.JLabel jLabel26;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel jlbBeneficios;
    public static javax.swing.JLabel jlbBiblioteca;
    public static javax.swing.JLabel jlbBolsaTrab;
    public static javax.swing.JLabel jlbBordeFondo;
    public static javax.swing.JLabel jlbCanalesAyuda;
    public static javax.swing.JLabel jlbContacLima;
    public static javax.swing.JLabel jlbContacProvincias;
    public static javax.swing.JLabel jlbContactanos;
    public static javax.swing.JLabel jlbDescarga;
    public static javax.swing.JLabel jlbDescpBeneficios;
    public static javax.swing.JLabel jlbDescpBiblioteca;
    public static javax.swing.JLabel jlbDescpBolsaTrab;
    public static javax.swing.JLabel jlbDescpEmpleabilidad;
    public static javax.swing.JLabel jlbEmpleabilidad;
    public static javax.swing.JLabel jlbEscribenosWhastApp;
    public static javax.swing.JLabel jlbNumeroWhatsApp;
    public static javax.swing.JLabel jlbOtrosEnlaces;
    public static javax.swing.JLabel jlbPodriaInteresar;
    public static javax.swing.JLabel jlbTambienpouede;
    public static javax.swing.JLabel labelCanvas;
    public static javax.swing.JLabel labelCorreo;
    public static javax.swing.JLabel labelMicrosft;
    public static javax.swing.JLabel logoBeneficios;
    public static javax.swing.JLabel logoBiblioteca;
    public static javax.swing.JLabel logoBolsaTrabj;
    public static javax.swing.JLabel logoEmpleabilidad;
    public static javax.swing.JPanel panelCanalesAyuda;
    public static javax.swing.JPanel panelContactanos;
    public static javax.swing.JPanel panelDescarga_UtpApp;
    public static javax.swing.JPanel panelFecha;
    public static com.modelo.PanelRound panelHorarios;
    public static javax.swing.JPanel panelInteresante;
    public static javax.swing.JPanel panelOtrasPlataformas;
    public static javax.swing.JLabel separador;
    public static javax.swing.JLabel separador1;
    public static javax.swing.JLabel txtFecha;
    // End of variables declaration//GEN-END:variables
}
