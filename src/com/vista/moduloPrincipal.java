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
        ControladorPanelPrincipal.initCarrusel();
        txtFecha.setText(ControladorPanelPrincipal.initFecha());
        UIController.subrayarJLabel(btnRolExamenes);
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

        setBackground(new java.awt.Color(236, 244, 249));
        setPreferredSize(new java.awt.Dimension(1087, 624));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbTambienpouede)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRolExamenes))
                    .addComponent(panelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
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
                .addContainerGap(451, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked

    private void btnIrHorarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIrHorarioMouseClicked
        
    }//GEN-LAST:event_btnIrHorarioMouseClicked

    private void btnRolExamenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRolExamenesMouseClicked
        
    }//GEN-LAST:event_btnRolExamenesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static com.modelo.PanelRound btnIrHorario;
    private javax.swing.JLabel btnRolExamenes;
    public static javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jlbTambienpouede;
    private javax.swing.JPanel panelFecha;
    private com.modelo.PanelRound panelRound1;
    private javax.swing.JLabel txtFecha;
    // End of variables declaration//GEN-END:variables
}
