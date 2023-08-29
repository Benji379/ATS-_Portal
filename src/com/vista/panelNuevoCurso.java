package com.vista;

import com.modelo.JListCustom;
import com.modelo.UIController;

/**
 *
 * @author Benji
 */
public class panelNuevoCurso extends javax.swing.JPanel {

    public panelNuevoCurso() {
        initComponents();
        JListCustom.customizeJList(jList1, 40, 1, 2);
        UIController.removeWhiteBorder(jScrollPane1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPanel = new com.modelo.PanelRound();
        txtNameCurso = new javax.swing.JLabel();
        txtCreditos = new javax.swing.JLabel();
        txtCreditos1 = new javax.swing.JLabel();
        jScrollPane1 = new com.modelo.scrollWin11.ScrollPaneWin11();
        jList1 = new javax.swing.JList<>();
        SOMBRA = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 244, 249));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoPanel.setBackground(new java.awt.Color(255, 51, 51));
        FondoPanel.setRoundBottomLeft(15);
        FondoPanel.setRoundBottomRight(15);
        FondoPanel.setRoundTopLeft(15);
        FondoPanel.setRoundTopRight(15);
        FondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNameCurso.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        txtNameCurso.setForeground(new java.awt.Color(255, 255, 255));
        txtNameCurso.setText("TALLER DE PROGRAMACION");
        FondoPanel.add(txtNameCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 190, 30));

        txtCreditos.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtCreditos.setForeground(new java.awt.Color(255, 255, 255));
        txtCreditos.setText("Créditos:");
        FondoPanel.add(txtCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 190, 30));

        txtCreditos1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtCreditos1.setForeground(new java.awt.Color(255, 255, 255));
        txtCreditos1.setText("Horario");
        FondoPanel.add(txtCreditos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 70, 30));

        jList1.setBackground(new java.awt.Color(255, 51, 51));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Benjamin", "Juan", "Amarillo" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        FondoPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, -1));

        add(FondoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 220, 305));

        SOMBRA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SOMBRA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/cursos/fondoNuevoCurso.png"))); // NOI18N
        SOMBRA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(SOMBRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 330));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static com.modelo.PanelRound FondoPanel;
    public static javax.swing.JLabel SOMBRA;
    public static javax.swing.JList<String> jList1;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel txtCreditos;
    public static javax.swing.JLabel txtCreditos1;
    public static javax.swing.JLabel txtNameCurso;
    // End of variables declaration//GEN-END:variables
}
