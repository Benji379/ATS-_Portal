package com.vista;

import com.modelo.UIController;
import static com.vista.frmPrincipal.contenedor;

/**
 *
 * @author Benji
 */
public class moduloInfoInstitucional extends javax.swing.JPanel {

    public moduloInfoInstitucional() {
        initComponents();
        UIController.setPanelBackgroundColors(btnAtras, "#fdadb3", "#fed4d6");
        UIController.configureStyledButton(jButton1, "#23527c", "#387CB4");
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
        Modulo1 = new com.modelo.PanelRound();
        encabezado1 = new com.modelo.PanelRound();
        icono1 = new javax.swing.JLabel();
        jlbTitulo1 = new javax.swing.JLabel();
        contenedorLinks1 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

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

        EcabezadoGeneral.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout EcabezadoGeneralLayout = new javax.swing.GroupLayout(EcabezadoGeneral);
        EcabezadoGeneral.setLayout(EcabezadoGeneralLayout);
        EcabezadoGeneralLayout.setHorizontalGroup(
            EcabezadoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        EcabezadoGeneralLayout.setVerticalGroup(
            EcabezadoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        Modulo1.setBackground(new java.awt.Color(255, 255, 255));
        Modulo1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 124, 180), 2, true));
        Modulo1.setRoundBottomLeft(20);
        Modulo1.setRoundBottomRight(20);
        Modulo1.setRoundTopLeft(20);
        Modulo1.setRoundTopRight(20);

        encabezado1.setBackground(new java.awt.Color(56, 124, 180));
        encabezado1.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
                .addComponent(jlbTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
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

        label1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        label1.setForeground(new java.awt.Color(56, 124, 180));
        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        label1.setText("Reglamento de Estudios");
        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(56, 124, 180));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo.png"))); // NOI18N
        jButton1.setText("Reglamento de Estudios");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloPrincipal/flechaAbajo_Select.png"))); // NOI18N

        javax.swing.GroupLayout contenedorLinks1Layout = new javax.swing.GroupLayout(contenedorLinks1);
        contenedorLinks1.setLayout(contenedorLinks1Layout);
        contenedorLinks1Layout.setHorizontalGroup(
            contenedorLinks1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLinks1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(contenedorLinks1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorLinks1Layout.setVerticalGroup(
            contenedorLinks1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLinks1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Modulo1Layout = new javax.swing.GroupLayout(Modulo1);
        Modulo1.setLayout(Modulo1Layout);
        Modulo1Layout.setHorizontalGroup(
            Modulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modulo1Layout.createSequentialGroup()
                .addComponent(encabezado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(contenedorLinks1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Modulo1Layout.setVerticalGroup(
            Modulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modulo1Layout.createSequentialGroup()
                .addComponent(encabezado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorLinks1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenedorModulosLayout = new javax.swing.GroupLayout(contenedorModulos);
        contenedorModulos.setLayout(contenedorModulosLayout);
        contenedorModulosLayout.setHorizontalGroup(
            contenedorModulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EcabezadoGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Modulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        contenedorModulosLayout.setVerticalGroup(
            contenedorModulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorModulosLayout.createSequentialGroup()
                .addComponent(EcabezadoGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Modulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 204, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenedorGrisLayout = new javax.swing.GroupLayout(contenedorGris);
        contenedorGris.setLayout(contenedorGrisLayout);
        contenedorGrisLayout.setHorizontalGroup(
            contenedorGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorGrisLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(contenedorModulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        contenedorGrisLayout.setVerticalGroup(
            contenedorGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorModulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout contenedorGeneralLayout = new javax.swing.GroupLayout(contenedorGeneral);
        contenedorGeneral.setLayout(contenedorGeneralLayout);
        contenedorGeneralLayout.setHorizontalGroup(
            contenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorGeneralLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(contenedorGris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        contenedorGeneralLayout.setVerticalGroup(
            contenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorGeneralLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(contenedorGris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
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
                        .addContainerGap(57, Short.MAX_VALUE)
                        .addComponent(contenedorGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(contenedorGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(498, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseClicked
        UIController.MostrarPanel(contenedor, new moduloPrincipal(), 1087, 578);
        UIController.scrollToTop(frmPrincipal.scrollContenedor);
    }//GEN-LAST:event_btnAtrasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EcabezadoGeneral;
    private com.modelo.PanelRound Modulo1;
    private com.modelo.PanelRound btnAtras;
    private com.modelo.PanelRound contenedorGeneral;
    private javax.swing.JPanel contenedorGris;
    private javax.swing.JPanel contenedorLinks1;
    private javax.swing.JPanel contenedorModulos;
    private com.modelo.PanelRound encabezado1;
    private javax.swing.JLabel icono1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jlbTitulo1;
    private javax.swing.JLabel label1;
    // End of variables declaration//GEN-END:variables
}
