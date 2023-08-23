package com.vista;

import com.modelo.CarruselDesvancido;
import com.modelo.UIController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Benji
 */
public final class moduloPrincipal extends javax.swing.JPanel {

    public moduloPrincipal() {
        initComponents();
        UIController.ScrollBarrCustom(jScrollPane);
        initCarrusel();
    }

    public void initCarrusel(){
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
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        Panel = new javax.swing.JPanel();
        contenedor = new javax.swing.JPanel();

        setBackground(new java.awt.Color(236, 244, 249));

        jScrollPane.setPreferredSize(new java.awt.Dimension(1087, 578));

        Panel.setBackground(new java.awt.Color(236, 244, 249));
        Panel.setPreferredSize(new java.awt.Dimension(1087, 578));

        contenedor.setBackground(new java.awt.Color(51, 255, 255));
        contenedor.setFocusCycleRoot(true);
        contenedor.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );

        jScrollPane.setViewportView(Panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel contenedor;
    private javax.swing.JScrollPane jScrollPane;
    // End of variables declaration//GEN-END:variables
}
