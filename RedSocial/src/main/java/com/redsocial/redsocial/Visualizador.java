/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.redsocial.redsocial;

/**
 *
 * @author Emilio
 */
public class Visualizador extends javax.swing.JFrame {
    Usuario aux;
    /**
     * Creates new form Visualizador
     * @param usuario
     */
    public Visualizador(Usuario usuario) {
        initComponents();
        aux = usuario;
        lblUsuario.setText(usuario.Nombre);
        if(usuario.Rol == 1)
        {
            lblRol.setText("Administrador");
        }else
        {
            lblRol.setText("Regular");
        }
        lblPath.setText(usuario.Path_fotografia);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        lblPath = new javax.swing.JLabel();
        btnLlamarVentana = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUsuario.setText("jLabel1");

        lblRol.setText("jLabel1");

        lblPath.setText("jLabel1");

        btnLlamarVentana.setText("Menu de usuario");
        btnLlamarVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlamarVentanaActionPerformed(evt);
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
                        .addComponent(lblUsuario)
                        .addGap(158, 158, 158)
                        .addComponent(lblPath))
                    .addComponent(lblRol))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLlamarVentana)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(lblPath))
                .addGap(18, 18, 18)
                .addComponent(lblRol)
                .addGap(52, 52, 52)
                .addComponent(btnLlamarVentana)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLlamarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlamarVentanaActionPerformed
        // TODO add your handling code here:
        if(aux.Rol == 1){
            var ventana  = new Menu_Usuario_Administrador(aux);
            ventana.setVisible(true);
        }
        else{
            var ventana  = new Menu_Usuario_Regular(aux);
            ventana.setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_btnLlamarVentanaActionPerformed

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
            java.util.logging.Logger.getLogger(Visualizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visualizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visualizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visualizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Usuario u = new Usuario("alguien",0,"fotico");
                new Visualizador(u).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLlamarVentana;
    private javax.swing.JLabel lblPath;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
