/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.proyecto1;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author JP113
 */
public class RecetaInterfaz extends javax.swing.JDialog {

    /**
     * Creates new form RecetaInterfaz
     */
        private DefaultListModel<String> recetaListModel;
    
        Recetario recetario = Recetario.getInstancia();
    
    public RecetaInterfaz(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        // Inicializar el modelo de la lista
        recetaListModel = new DefaultListModel<>();
        jList1.setModel(recetaListModel);

        // Agregar los elementos del ArrayList de ingredientes al modelo de la lista
        for (String receta : recetario.verListaRecetas()) {
            recetaListModel.addElement(receta);
        }
    }
    
    public static void SuccessBox(String mensaje, String titulo) {
            //Esta funcion es para que salte un mensaje de confirmacion en caso de que se agregue el ingrediente
            javax.swing.JOptionPane.showMessageDialog((null), mensaje, "Ingrediente agregado con exito" + titulo, javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void FailBox(String mensaje, String titulo) {
            //Esta funcion es para que salte un mensaje de error en caso de que se falle algo
            javax.swing.JOptionPane.showMessageDialog((null), mensaje, "Ingrediente agregado con exito" + titulo, javax.swing.JOptionPane.INFORMATION_MESSAGE);

    }
    
    public void actualizarListaIngredientes() {
        recetaListModel.clear(); // Limpia el modelo actual

        // Agrega los elementos del ArrayList de ingredientes al modelo de la lista
        for (String receta : recetario.verListaRecetas()) {
            recetaListModel.addElement(receta);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AtrasBtn = new javax.swing.JButton();
        tituloLabel = new javax.swing.JLabel();
        AgregarBtn = new javax.swing.JButton();
        EliminarBtn = new javax.swing.JButton();
        VerBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        EditarBtn = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        AtrasBtn.setText("Atras");
        AtrasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasBtnActionPerformed(evt);
            }
        });

        tituloLabel.setFont(new java.awt.Font("Dialog", 0, 25)); // NOI18N
        tituloLabel.setText("Recetas disponibles");

        AgregarBtn.setText("Agregar");
        AgregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarBtnActionPerformed(evt);
            }
        });

        EliminarBtn.setText("Eliminar");
        EliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarBtnActionPerformed(evt);
            }
        });

        VerBtn.setText("Ver");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        EditarBtn.setText("Editar");
        EditarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Ingrese el codigo de la receta que desea ver mas a detalle");

        jButton1.setText("Ver Receta mas a detalle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tituloLabel)
                        .addContainerGap(237, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AtrasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EliminarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AgregarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(VerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EditarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AgregarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(EliminarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(EditarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(VerBtn)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AtrasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasBtnActionPerformed
        dispose(); //cierra esta ventana unicamente, no el proyecto
    }//GEN-LAST:event_AtrasBtnActionPerformed

    private void AgregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarBtnActionPerformed
        AgregarReceta a = new AgregarReceta(null, true);
        a.setVisible(true);
        
        //actualizo la lista luego de agregar una receta
        actualizarListaIngredientes();
        actualizarListaIngredientes();
    }//GEN-LAST:event_AgregarBtnActionPerformed

    private void EliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarBtnActionPerformed
        EliminarReceta a = new EliminarReceta(null, true);
        a.setVisible(true);
        
        //actualizo la lista luego de eliminar una receta
        actualizarListaIngredientes();
    }//GEN-LAST:event_EliminarBtnActionPerformed

    private void EditarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarBtnActionPerformed
        EditarReceta a = new EditarReceta(null, true);
        a.setVisible(true);
        
        //actualizo la lista luego de editar una receta
        actualizarListaIngredientes();
    }//GEN-LAST:event_EditarBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int codigo = (int) jSpinner1.getValue();

        if (recetario.existeReceta(codigo)) {
            String recetaInfo = recetario.verRecetaDetalles(codigo);

            MostrarRecetaInterfaz mostrarReceta = new MostrarRecetaInterfaz(null, true);

            // Establece el texto en un componente de texto (puedes usar un JTextArea o JLabel, dependiendo de tus necesidades)
            mostrarReceta.jTextArea1.setLineWrap(true);
            mostrarReceta.jTextArea1.setWrapStyleWord(true);
            mostrarReceta.jTextArea1.setText(recetaInfo);

            // Muestra la nueva ventana
            mostrarReceta.setVisible(true);
        } else {
            // Manejo de error si la receta no se encuentra
            JOptionPane.showMessageDialog(this, "Receta no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RecetaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecetaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecetaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecetaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RecetaInterfaz dialog = new RecetaInterfaz(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarBtn;
    private javax.swing.JButton AtrasBtn;
    private javax.swing.JButton EditarBtn;
    private javax.swing.JButton EliminarBtn;
    private javax.swing.JButton VerBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
