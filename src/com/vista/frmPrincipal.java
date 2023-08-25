package com.vista;

import com.controlador.ControladorFrmPrincipal;
import com.modelo.ActionUtils;
import com.modelo.UIController;

/**
 *
 * @author Benji
 */
public final class frmPrincipal extends javax.swing.JFrame {

    ControladorFrmPrincipal ac = new ControladorFrmPrincipal();

    public frmPrincipal() {
        initComponents();
        initControlador();
        this.setLocationRelativeTo(null);
        this.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/img/icons/logo.png")));
        irModuloInicio();
    }

    private void initControlador() {
        ControladorFrmPrincipal.configScroll();
        ControladorFrmPrincipal.configPanelInicial();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelEncabezado = new javax.swing.JPanel();
        eslogan = new javax.swing.JLabel();
        panelRedes = new javax.swing.JPanel();
        btnInstagram = new com.modelo.PanelRound();
        logoInstagram = new javax.swing.JLabel();
        btnYoutube = new com.modelo.PanelRound();
        logoYoutube = new javax.swing.JLabel();
        btnGitHub = new com.modelo.PanelRound();
        logoGitHub = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ScrollMenu = new javax.swing.JScrollPane();
        panelMenun = new javax.swing.JPanel();
        btn3Rallas = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnInicio = new javax.swing.JPanel();
        logoCasa = new javax.swing.JLabel();
        jlbInicio = new javax.swing.JLabel();
        FocusInicio = new javax.swing.JLabel();
        btnCursos = new javax.swing.JPanel();
        logoCursos = new javax.swing.JLabel();
        jlbCursos = new javax.swing.JLabel();
        FocusCursos = new javax.swing.JLabel();
        btnExamenes = new javax.swing.JPanel();
        logoExamamenes = new javax.swing.JLabel();
        jlbExamenes = new javax.swing.JLabel();
        FocusExamenes = new javax.swing.JLabel();
        scrollContenedor = new javax.swing.JScrollPane();
        contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATS+ Portal | Universidad Tecnologica del Perú");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panelEncabezado.setBackground(new java.awt.Color(255, 255, 255));
        panelEncabezado.setPreferredSize(new java.awt.Dimension(0, 111));

        eslogan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eslogan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/principal/utpmasportal.png"))); // NOI18N

        panelRedes.setBackground(new java.awt.Color(255, 255, 255));

        btnInstagram.setBackground(new java.awt.Color(255, 255, 255));
        btnInstagram.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInstagram.setRoundBottomLeft(10);
        btnInstagram.setRoundBottomRight(10);
        btnInstagram.setRoundTopLeft(10);
        btnInstagram.setRoundTopRight(10);
        btnInstagram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInstagramMouseClicked(evt);
            }
        });

        logoInstagram.setBackground(new java.awt.Color(0, 0, 0));
        logoInstagram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoInstagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/barraMenu/instagram.png"))); // NOI18N

        javax.swing.GroupLayout btnInstagramLayout = new javax.swing.GroupLayout(btnInstagram);
        btnInstagram.setLayout(btnInstagramLayout);
        btnInstagramLayout.setHorizontalGroup(
            btnInstagramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoInstagram, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );
        btnInstagramLayout.setVerticalGroup(
            btnInstagramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnYoutube.setBackground(new java.awt.Color(255, 255, 255));
        btnYoutube.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnYoutube.setRoundBottomLeft(10);
        btnYoutube.setRoundBottomRight(10);
        btnYoutube.setRoundTopLeft(10);
        btnYoutube.setRoundTopRight(10);
        btnYoutube.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnYoutubeMouseClicked(evt);
            }
        });

        logoYoutube.setBackground(new java.awt.Color(0, 0, 0));
        logoYoutube.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoYoutube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/youtube.png"))); // NOI18N

        javax.swing.GroupLayout btnYoutubeLayout = new javax.swing.GroupLayout(btnYoutube);
        btnYoutube.setLayout(btnYoutubeLayout);
        btnYoutubeLayout.setHorizontalGroup(
            btnYoutubeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoYoutube, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );
        btnYoutubeLayout.setVerticalGroup(
            btnYoutubeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoYoutube, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnGitHub.setBackground(new java.awt.Color(255, 255, 255));
        btnGitHub.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGitHub.setRoundBottomLeft(10);
        btnGitHub.setRoundBottomRight(10);
        btnGitHub.setRoundTopLeft(10);
        btnGitHub.setRoundTopRight(10);
        btnGitHub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGitHubMouseClicked(evt);
            }
        });

        logoGitHub.setBackground(new java.awt.Color(0, 0, 0));
        logoGitHub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoGitHub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/github.png"))); // NOI18N

        javax.swing.GroupLayout btnGitHubLayout = new javax.swing.GroupLayout(btnGitHub);
        btnGitHub.setLayout(btnGitHubLayout);
        btnGitHubLayout.setHorizontalGroup(
            btnGitHubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoGitHub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        btnGitHubLayout.setVerticalGroup(
            btnGitHubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoGitHub, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout panelRedesLayout = new javax.swing.GroupLayout(panelRedes);
        panelRedes.setLayout(panelRedesLayout);
        panelRedesLayout.setHorizontalGroup(
            panelRedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedesLayout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(btnGitHub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(panelRedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRedesLayout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(btnYoutube, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(71, Short.MAX_VALUE)))
            .addGroup(panelRedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRedesLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(btnInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(122, Short.MAX_VALUE)))
        );
        panelRedesLayout.setVerticalGroup(
            panelRedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGitHub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelRedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRedesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnYoutube, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(panelRedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRedesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel1.setText("Hola,");

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel2.setText("Benjamin");

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("U22101319");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/barraMenu/imagenUsuario.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelEncabezadoLayout = new javax.swing.GroupLayout(panelEncabezado);
        panelEncabezado.setLayout(panelEncabezadoLayout);
        panelEncabezadoLayout.setHorizontalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(eslogan, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 372, Short.MAX_VALUE)
                .addComponent(panelRedes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        panelEncabezadoLayout.setVerticalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEncabezadoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(eslogan)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelEncabezadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelEncabezadoLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        panelMenun.setBackground(new java.awt.Color(255, 255, 255));
        panelMenun.setPreferredSize(new java.awt.Dimension(105, 650));

        btn3Rallas.setBackground(new java.awt.Color(253, 112, 117));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/icono_menu.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btn3RallasLayout = new javax.swing.GroupLayout(btn3Rallas);
        btn3Rallas.setLayout(btn3RallasLayout);
        btn3RallasLayout.setHorizontalGroup(
            btn3RallasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn3RallasLayout.setVerticalGroup(
            btn3RallasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn3RallasLayout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        btnInicio.setBackground(new java.awt.Color(255, 255, 255));
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });

        logoCasa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/barraMenu/hogar.png"))); // NOI18N

        jlbInicio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbInicio.setForeground(new java.awt.Color(40, 48, 68));
        jlbInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbInicio.setText("Inicio");

        FocusInicio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        FocusInicio.setForeground(new java.awt.Color(40, 48, 68));
        FocusInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout btnInicioLayout = new javax.swing.GroupLayout(btnInicio);
        btnInicio.setLayout(btnInicioLayout);
        btnInicioLayout.setHorizontalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInicioLayout.createSequentialGroup()
                .addComponent(FocusInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoCasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        btnInicioLayout.setVerticalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInicioLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(logoCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbInicio)
                .addGap(19, 19, 19))
            .addComponent(FocusInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnCursos.setBackground(new java.awt.Color(255, 255, 255));
        btnCursos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCursosMouseClicked(evt);
            }
        });

        logoCursos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/barraMenu/libro.png"))); // NOI18N

        jlbCursos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbCursos.setForeground(new java.awt.Color(40, 48, 68));
        jlbCursos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbCursos.setText("Cursos");

        FocusCursos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        FocusCursos.setForeground(new java.awt.Color(40, 48, 68));
        FocusCursos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout btnCursosLayout = new javax.swing.GroupLayout(btnCursos);
        btnCursos.setLayout(btnCursosLayout);
        btnCursosLayout.setHorizontalGroup(
            btnCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCursosLayout.createSequentialGroup()
                .addComponent(FocusCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(btnCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        btnCursosLayout.setVerticalGroup(
            btnCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCursosLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(logoCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbCursos)
                .addGap(19, 19, 19))
            .addComponent(FocusCursos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnExamenes.setBackground(new java.awt.Color(255, 255, 255));
        btnExamenes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExamenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExamenesMouseClicked(evt);
            }
        });

        logoExamamenes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoExamamenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/barraMenu/hoja.png"))); // NOI18N

        jlbExamenes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbExamenes.setForeground(new java.awt.Color(40, 48, 68));
        jlbExamenes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbExamenes.setText("Examenes");

        FocusExamenes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        FocusExamenes.setForeground(new java.awt.Color(40, 48, 68));
        FocusExamenes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout btnExamenesLayout = new javax.swing.GroupLayout(btnExamenes);
        btnExamenes.setLayout(btnExamenesLayout);
        btnExamenesLayout.setHorizontalGroup(
            btnExamenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExamenesLayout.createSequentialGroup()
                .addComponent(FocusExamenes, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(btnExamenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnExamenesLayout.createSequentialGroup()
                        .addComponent(logoExamamenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29))
                    .addGroup(btnExamenesLayout.createSequentialGroup()
                        .addComponent(jlbExamenes, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))))
        );
        btnExamenesLayout.setVerticalGroup(
            btnExamenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExamenesLayout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(logoExamamenes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbExamenes)
                .addGap(19, 19, 19))
            .addComponent(FocusExamenes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelMenunLayout = new javax.swing.GroupLayout(panelMenun);
        panelMenun.setLayout(panelMenunLayout);
        panelMenunLayout.setHorizontalGroup(
            panelMenunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn3Rallas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnExamenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenunLayout.setVerticalGroup(
            panelMenunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenunLayout.createSequentialGroup()
                .addComponent(btn3Rallas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExamenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 291, Short.MAX_VALUE))
        );

        ScrollMenu.setViewportView(panelMenun);

        contenedor.setLayout(new java.awt.CardLayout());
        scrollContenedor.setViewportView(contenedor);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ScrollMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(111, 111, 111)
                    .addComponent(scrollContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 1089, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(ScrollMenu)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(scrollContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCursosMouseClicked
        irModuloCursos();
    }//GEN-LAST:event_btnCursosMouseClicked

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        irModuloInicio();
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnExamenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExamenesMouseClicked
        ac.FocusPanel(FocusExamenes);
    }//GEN-LAST:event_btnExamenesMouseClicked

    private void btnInstagramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInstagramMouseClicked
        ActionUtils.AccederEnlace("https://www.instagram.com/benji_jal/");
    }//GEN-LAST:event_btnInstagramMouseClicked

    private void btnYoutubeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnYoutubeMouseClicked
        ActionUtils.AccederEnlace("https://www.youtube.com/@BenjiJ379");
    }//GEN-LAST:event_btnYoutubeMouseClicked

    private void btnGitHubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGitHubMouseClicked
        ActionUtils.AccederEnlace("https://github.com/Benji379?tab=stars");
    }//GEN-LAST:event_btnGitHubMouseClicked

    public void irModuloInicio() {
        ac.FocusPanel(FocusInicio);
        UIController.MostrarPanel(contenedor, new moduloPrincipal(), 1087, 578);
    }

    public void irModuloCursos() {
        ac.FocusPanel(FocusCursos);
//        UIController.MostrarPanel(contenedor, new moduloPrincipal(), 1087, 578);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel FocusCursos;
    public static javax.swing.JLabel FocusExamenes;
    public static javax.swing.JLabel FocusInicio;
    public static javax.swing.JScrollPane ScrollMenu;
    public static javax.swing.JPanel btn3Rallas;
    public static javax.swing.JPanel btnCursos;
    public static javax.swing.JPanel btnExamenes;
    public static com.modelo.PanelRound btnGitHub;
    public static javax.swing.JPanel btnInicio;
    public static com.modelo.PanelRound btnInstagram;
    public static com.modelo.PanelRound btnYoutube;
    public static javax.swing.JPanel contenedor;
    public static javax.swing.JLabel eslogan;
    public static javax.swing.JButton jButton1;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel jlbCursos;
    public static javax.swing.JLabel jlbExamenes;
    public static javax.swing.JLabel jlbInicio;
    public static javax.swing.JLabel logoCasa;
    public static javax.swing.JLabel logoCursos;
    public static javax.swing.JLabel logoExamamenes;
    public static javax.swing.JLabel logoGitHub;
    public static javax.swing.JLabel logoInstagram;
    public static javax.swing.JLabel logoYoutube;
    public static javax.swing.JPanel panelEncabezado;
    public static javax.swing.JPanel panelMenun;
    public static javax.swing.JPanel panelRedes;
    public static javax.swing.JScrollPane scrollContenedor;
    // End of variables declaration//GEN-END:variables
}
