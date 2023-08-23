package com.vista;

import com.controlador.ControladorPanelPrincipal;
import com.modelo.UIController;

/**
 *
 * @author Benji
 */
public final class moduloPrincipal extends javax.swing.JPanel {

    public moduloPrincipal() {
        initComponents();
        txtFecha.setText(ControladorPanelPrincipal.initFecha());
        ControladorPanelPrincipal.initCarrusel();
        initJLabelCustom();
        initBotones();
        UIController.separadorCustom(separador);
    }

    private void initBotones() {
        UIController.setPanelBackgroundColors(btnInformacionInstitucional, "#a8cbe2", "#d5e5f0");
        UIController.setPanelBackgroundColors(btnBeneficios, "#a8cbe2", "#d5e5f0");
        UIController.setPanelBackgroundColors(btnIngresaBiblioteca, "#a8cbe2", "#d5e5f0");
        UIController.setPanelBackgroundColors(btnBolsaTrabajo, "#a8cbe2", "#d5e5f0");
        UIController.setPanelBackgroundColors(btnEmpleabilidad, "#a8cbe2", "#d5e5f0");
    }

    private void initJLabelCustom() {
        UIController.subrayarJLabel(btnRolExamenes);
        UIController.ajustarJLabel(jlbDescpBeneficios);
        UIController.ajustarJLabel(jlbDescpBiblioteca);
        UIController.ajustarJLabel(jlbDescpBolsaTrab);
        UIController.ajustarJLabel(jlbDescpEmpleabilidad);
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
        panelRound1 = new com.modelo.PanelRound();
        jlbTambienpouede = new javax.swing.JLabel();
        btnRolExamenes = new javax.swing.JLabel();
        btnInformacionInstitucional = new com.modelo.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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
        separador = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 244, 249));
        setPreferredSize(new java.awt.Dimension(1087, 1344));
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

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(15);
        panelRound1.setRoundBottomRight(15);
        panelRound1.setRoundTopLeft(15);
        panelRound1.setRoundTopRight(15);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Otros enlaces:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setText("Te podría interesar:");

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
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/feclah (3).png"))); // NOI18N
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
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/feclah (3).png"))); // NOI18N
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
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/feclah (3).png"))); // NOI18N
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
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/feclah (3).png"))); // NOI18N
        jLabel22.setToolTipText("");
        btnEmpleabilidad.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 30, 40));

        separador.setMaximumSize(new java.awt.Dimension(32767, 32767));

        javax.swing.GroupLayout panelInteresanteLayout = new javax.swing.GroupLayout(panelInteresante);
        panelInteresante.setLayout(panelInteresanteLayout);
        panelInteresanteLayout.setHorizontalGroup(
            panelInteresanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInteresanteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelInteresanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(separador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelInteresanteLayout.createSequentialGroup()
                        .addComponent(btnBeneficios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(btnIngresaBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(btnBolsaTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(btnEmpleabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(btnInformacionInstitucional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbTambienpouede)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRolExamenes))
                    .addComponent(panelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelInteresante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTambienpouede)
                    .addComponent(btnRolExamenes))
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(btnInformacionInstitucional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(panelInteresante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void btnIrHorarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIrHorarioMouseClicked

    }//GEN-LAST:event_btnIrHorarioMouseClicked

    private void btnRolExamenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRolExamenesMouseClicked

    }//GEN-LAST:event_btnRolExamenesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.modelo.PanelRound btnBeneficios;
    private com.modelo.PanelRound btnBolsaTrabajo;
    private com.modelo.PanelRound btnEmpleabilidad;
    private com.modelo.PanelRound btnInformacionInstitucional;
    private com.modelo.PanelRound btnIngresaBiblioteca;
    public static com.modelo.PanelRound btnIrHorario;
    private javax.swing.JLabel btnRolExamenes;
    public static javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jlbBeneficios;
    private javax.swing.JLabel jlbBiblioteca;
    private javax.swing.JLabel jlbBolsaTrab;
    private javax.swing.JLabel jlbDescpBeneficios;
    private javax.swing.JLabel jlbDescpBiblioteca;
    private javax.swing.JLabel jlbDescpBolsaTrab;
    private javax.swing.JLabel jlbDescpEmpleabilidad;
    private javax.swing.JLabel jlbEmpleabilidad;
    private javax.swing.JLabel jlbTambienpouede;
    private javax.swing.JLabel logoBeneficios;
    private javax.swing.JLabel logoBiblioteca;
    private javax.swing.JLabel logoBolsaTrabj;
    private javax.swing.JLabel logoEmpleabilidad;
    private javax.swing.JPanel panelFecha;
    private javax.swing.JPanel panelInteresante;
    private com.modelo.PanelRound panelRound1;
    private javax.swing.JLabel separador;
    private javax.swing.JLabel txtFecha;
    // End of variables declaration//GEN-END:variables
}
