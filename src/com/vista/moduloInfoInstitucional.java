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
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtras = new com.modelo.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(722, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(664, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseClicked
        UIController.MostrarPanel(contenedor, new moduloPrincipal(), 1087, 578);
        UIController.scrollToTop(frmPrincipal.scrollContenedor);
    }//GEN-LAST:event_btnAtrasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.modelo.PanelRound btnAtras;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
