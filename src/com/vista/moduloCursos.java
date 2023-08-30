package com.vista;

import com.controlador.ControladorPanelCursos;
import com.modelo.JColorChoseer;
import com.modelo.PanelesDinamicos;
import com.modelo.StringUtils;
import com.modelo.UIController;
import java.awt.Color;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/**
 *
 * @author Benji
 */
public class moduloCursos extends javax.swing.JPanel {

    private final PanelesDinamicos panelesDinamicos;

    public moduloCursos() {
        initComponents();
        cmd1.setFont(new java.awt.Font("Haettenschweiler", 0, 30)); // NOI18N
        UIController.removeWhiteBorder(jScrollPane1);
        panelesDinamicos = new PanelesDinamicos();
        initPanelDina();
        ControladorPanelCursos.initLimitacionNum();
    }

    private void initPanelDina() {
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                panelNuevoCurso p = new panelNuevoCurso();
                panelesDinamicos.reorganizePanels(jPanel1, CONTENEDOR, p, 20, 10);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new com.modelo.PanelRound();
        cmd1 = new button.Button();
        panelHorario = new javax.swing.JPanel();
        textField6 = new textfield.TextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelColor = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtColor = new textfield.TextField();
        muestraColor = new com.modelo.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelCreditos = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtCreditoDecimal = new textfield.TextField();
        jLabel7 = new javax.swing.JLabel();
        txtCreditoEntero = new textfield.TextField();
        jLabel4 = new javax.swing.JLabel();
        panelNombreCurso = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreCurso = new textfield.TextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        textField5 = new textfield.TextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 =  new com.modelo.scrollWin11.ScrollPaneWin11();
        CONTENEDOR = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 244, 249));
        setPreferredSize(new java.awt.Dimension(1087, 1377));

        panelRound1.setBackground(new java.awt.Color(206, 244, 249));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        cmd1.setBackground(new java.awt.Color(253, 83, 83));
        cmd1.setForeground(new java.awt.Color(245, 245, 245));
        cmd1.setText("REGISTRAR");
        cmd1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        cmd1.setRippleColor(new java.awt.Color(255, 255, 255));
        cmd1.setShadowColor(new java.awt.Color(253, 83, 83));
        cmd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd1ActionPerformed(evt);
            }
        });

        panelHorario.setBackground(new java.awt.Color(206, 244, 249));
        panelHorario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textField6.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        textField6.setShadowColor(new java.awt.Color(219, 76, 76));
        panelHorario.add(textField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 170, 48));

        jLabel6.setFont(new java.awt.Font("Haettenschweiler", 0, 30)); // NOI18N
        jLabel6.setText("Horario:");
        panelHorario.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/cursos/iconHorario.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        panelHorario.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 3, 35, 35));

        panelColor.setBackground(new java.awt.Color(206, 244, 249));

        jPanel3.setBackground(new java.awt.Color(206, 244, 249));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtColor.setText("FF3333");
        txtColor.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        txtColor.setShadowColor(new java.awt.Color(219, 76, 76));
        txtColor.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtColorComponentAdded(evt);
            }
        });
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });
        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtColorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorKeyTyped(evt);
            }
        });
        jPanel3.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 90, 45));

        muestraColor.setBackground(new java.awt.Color(255, 51, 51));
        muestraColor.setRoundBottomLeft(10);
        muestraColor.setRoundBottomRight(10);
        muestraColor.setRoundTopLeft(10);
        muestraColor.setRoundTopRight(10);

        javax.swing.GroupLayout muestraColorLayout = new javax.swing.GroupLayout(muestraColor);
        muestraColor.setLayout(muestraColorLayout);
        muestraColorLayout.setHorizontalGroup(
            muestraColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
        muestraColorLayout.setVerticalGroup(
            muestraColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel3.add(muestraColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 3, 35, 35));

        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(80, 80, 80));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("#");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 20, 40));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/cursos/iconoColores.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 3, 35, 35));

        jLabel2.setFont(new java.awt.Font("Haettenschweiler", 0, 30)); // NOI18N
        jLabel2.setText("Color:");

        javax.swing.GroupLayout panelColorLayout = new javax.swing.GroupLayout(panelColor);
        panelColor.setLayout(panelColorLayout);
        panelColorLayout.setHorizontalGroup(
            panelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelColorLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        panelColorLayout.setVerticalGroup(
            panelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelCreditos.setBackground(new java.awt.Color(206, 244, 249));

        jPanel2.setBackground(new java.awt.Color(206, 244, 249));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCreditoDecimal.setText("00");
        txtCreditoDecimal.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        txtCreditoDecimal.setShadowColor(new java.awt.Color(219, 76, 76));
        txtCreditoDecimal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCreditoDecimalKeyTyped(evt);
            }
        });
        jPanel2.add(txtCreditoDecimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 45, 48));

        jLabel7.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(80, 80, 80));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(",");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 20, 30));

        txtCreditoEntero.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        txtCreditoEntero.setShadowColor(new java.awt.Color(219, 76, 76));
        txtCreditoEntero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCreditoEnteroKeyTyped(evt);
            }
        });
        jPanel2.add(txtCreditoEntero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 34, 48));

        jLabel4.setFont(new java.awt.Font("Haettenschweiler", 0, 30)); // NOI18N
        jLabel4.setText("Créditos:");

        javax.swing.GroupLayout panelCreditosLayout = new javax.swing.GroupLayout(panelCreditos);
        panelCreditos.setLayout(panelCreditosLayout);
        panelCreditosLayout.setHorizontalGroup(
            panelCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreditosLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(106, 106, 106)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCreditosLayout.setVerticalGroup(
            panelCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelNombreCurso.setBackground(new java.awt.Color(206, 244, 249));

        jLabel3.setFont(new java.awt.Font("Haettenschweiler", 0, 30)); // NOI18N
        jLabel3.setText("Nombre del Curso:");

        txtNombreCurso.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        txtNombreCurso.setShadowColor(new java.awt.Color(219, 76, 76));
        txtNombreCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCursoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelNombreCursoLayout = new javax.swing.GroupLayout(panelNombreCurso);
        panelNombreCurso.setLayout(panelNombreCursoLayout);
        panelNombreCursoLayout.setHorizontalGroup(
            panelNombreCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNombreCursoLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNombreCursoLayout.setVerticalGroup(
            panelNombreCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelNombreCursoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(206, 244, 249));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Haettenschweiler", 0, 30)); // NOI18N
        jLabel5.setText("Evaluaciones:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        textField5.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        textField5.setShadowColor(new java.awt.Color(219, 76, 76));
        jPanel4.add(textField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 0, 170, 48));

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelNombreCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCreditos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(cmd1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelNombreCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCreditos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(cmd1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panelColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(236, 244, 249));

        CONTENEDOR.setBackground(new java.awt.Color(236, 244, 249));
        CONTENEDOR.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(CONTENEDOR);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("New York Hardcore", 0, 60)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MIS CURSOS Agosto 2023");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd1ActionPerformed
        panelNuevoCurso.colorFondoList = Color.decode("#" + txtColor.getText());
        panelesDinamicos.AgregarPanel(CONTENEDOR, 20, 40, new panelNuevoCurso());
//        panelesDinamicos.reorganizePanels(jPanel1, CONTENEDOR, new panelNuevoCurso(), 20, 10);
        double creditos = Double.parseDouble(txtCreditoEntero.getText() + "." + txtCreditoDecimal.getText());
        panelNuevoCurso.txtCreditos.setText("Creditos: " + String.valueOf(creditos));
        panelNuevoCurso.FondoPanel.setBackground(Color.decode("#" + txtColor.getText()));
        panelNuevoCurso.txtNameCurso.setText(txtNombreCurso.getText());


    }//GEN-LAST:event_cmd1ActionPerformed

    private void txtNombreCursoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCursoKeyTyped

    }//GEN-LAST:event_txtNombreCursoKeyTyped

    private void txtCreditoEnteroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreditoEnteroKeyTyped
        StringUtils.limitacionNumeros(txtCreditoEntero, evt, 1);
    }//GEN-LAST:event_txtCreditoEnteroKeyTyped

    private void txtCreditoDecimalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreditoDecimalKeyTyped
        StringUtils.limitacionNumeros(txtCreditoDecimal, evt, 2);
    }//GEN-LAST:event_txtCreditoDecimalKeyTyped

    private void txtColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyTyped
        StringUtils.limitacionCaracteres(txtColor, evt, 6, false);
    }//GEN-LAST:event_txtColorKeyTyped

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtColorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyPressed

    }//GEN-LAST:event_txtColorKeyPressed

    private void txtColorComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtColorComponentAdded

    }//GEN-LAST:event_txtColorComponentAdded

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        txtColor.setText(JColorChoseer.showColorChooserAndGetHex());
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        HorarioSemanal abrir = new HorarioSemanal();
        abrir.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel CONTENEDOR;
    public static button.Button cmd1;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    public static javax.swing.JPanel jPanel4;
    public static javax.swing.JScrollPane jScrollPane1;
    public static com.modelo.PanelRound muestraColor;
    public static javax.swing.JPanel panelColor;
    public static javax.swing.JPanel panelCreditos;
    public static javax.swing.JPanel panelHorario;
    public static javax.swing.JPanel panelNombreCurso;
    public static com.modelo.PanelRound panelRound1;
    public static textfield.TextField textField5;
    public static textfield.TextField textField6;
    public static textfield.TextField txtColor;
    public static textfield.TextField txtCreditoDecimal;
    public static textfield.TextField txtCreditoEntero;
    public static textfield.TextField txtNombreCurso;
    // End of variables declaration//GEN-END:variables
}
