package com.vista;

import com.modelo.JListCustom;
import com.modelo.StringUtils;
import com.modelo.UIController;
import java.awt.Color;
import java.awt.Font;

public class HorarioSemanal extends javax.swing.JFrame {

    public HorarioSemanal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/img/cursos/iconHorario.png")));
        this.setTitle("Horario " + moduloCursos.txtNombreCurso.getText());
        UIController.transparentarTxtField(tx1, tx2, tx3, tx4);
        UIController.ScrollBarrCustom(jScrollPane1);
        UIController.removeWhiteBorder(jScrollPane1);
        txtTittle.setText("Horario " + moduloCursos.txtNombreCurso.getText());
        JListCustom.customizeJList(jList1, 35, 1, 2, jPanel1.getBackground(), Color.BLACK);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTittle = new javax.swing.JLabel();
        combobox1 = new combobox.Combobox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        tx1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        tx2 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        tx3 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        tx4 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDark1 = new com.modelo.TableDark();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Horario");
        setBackground(new java.awt.Color(206, 244, 249));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(206, 244, 249));

        txtTittle.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        txtTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTittle.setText("Horario");

        combobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" }));
        combobox1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        combobox1.setLabeText("Dia");

        jList1.setBackground(new java.awt.Color(206, 244, 249));
        jList1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Benjamin", "Debora", "Lizbeth" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel2.setBackground(new java.awt.Color(206, 244, 249));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tx1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        tx1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx1.setBorder(null);
        tx1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tx1.setSelectionColor(new java.awt.Color(91, 244, 249));
        tx1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx1KeyTyped(evt);
            }
        });
        jPanel2.add(tx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 30, 20));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setText(":");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 10, 40));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 30, 10));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel4.setText("hasta");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, 40));

        tx2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        tx2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx2.setBorder(null);
        tx2.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tx2.setSelectionColor(new java.awt.Color(91, 244, 249));
        tx2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx2KeyTyped(evt);
            }
        });
        jPanel2.add(tx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 30, 20));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 30, 10));

        tx3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        tx3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx3.setBorder(null);
        tx3.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tx3.setSelectionColor(new java.awt.Color(91, 244, 249));
        tx3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx3KeyTyped(evt);
            }
        });
        jPanel2.add(tx3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 30, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 30, 10));

        tx4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        tx4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx4.setBorder(null);
        tx4.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tx4.setSelectionColor(new java.awt.Color(91, 244, 249));
        tx4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx4KeyTyped(evt);
            }
        });
        jPanel2.add(tx4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 30, 20));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 30, 10));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setText(":");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 10, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel6.setText("De");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel3.setText("Día:");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/cursos/eliminar.png"))); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/cursos/agregar.png"))); // NOI18N

        tableDark1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tableDark1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void tx1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx1KeyTyped
        StringUtils.limitacionNumeros(tx1, evt, 2);
    }//GEN-LAST:event_tx1KeyTyped

    private void tx2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx2KeyTyped
        StringUtils.limitacionNumeros(tx2, evt, 2);
    }//GEN-LAST:event_tx2KeyTyped

    private void tx3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx3KeyTyped
        StringUtils.limitacionNumeros(tx3, evt, 2);
    }//GEN-LAST:event_tx3KeyTyped

    private void tx4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx4KeyTyped
        StringUtils.limitacionNumeros(tx4, evt, 2);
    }//GEN-LAST:event_tx4KeyTyped

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(HorarioSemanal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HorarioSemanal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private combobox.Combobox combobox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private com.modelo.TableDark tableDark1;
    private javax.swing.JTextField tx1;
    private javax.swing.JTextField tx2;
    private javax.swing.JTextField tx3;
    private javax.swing.JTextField tx4;
    private javax.swing.JLabel txtTittle;
    // End of variables declaration//GEN-END:variables
}
