/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.primer_proyecto;

import java.awt.Image;
import java.awt.event.KeyEvent;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.File;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import management.Data;
import management.ManejoArchivo;
import management.ManejoUsuario;

/**
 *
 * @author 50255
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();    
        ManejoArchivo objManejo = new ManejoArchivo();

        var strError = "";
        if(objManejo.ValidationUserFiles()){
            objManejo.CreationFilesUsers("usuario", strError);
            objManejo.CreationFilesUsers("contactos", strError);
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

        TF_Usuario = new javax.swing.JTextField();
        button1 = new java.awt.Button();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        TF_Password = new javax.swing.JPasswordField();
        Btn_Registro = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button1.setLabel("Ingresar");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        label1.setText("Usuario");

        label2.setText("Contraseña");

        TF_Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TF_PasswordMouseClicked(evt);
            }
        });
        TF_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_PasswordKeyPressed(evt);
            }
        });

        Btn_Registro.setText("Registrar");
        Btn_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegistroActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_Usuario)
                    .addComponent(TF_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(45, 45, 45)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(Btn_Registro)
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Registro)
                    .addComponent(jButton2))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        TF_Usuario.getAccessibleContext().setAccessibleName("TF_Usuario");
        TF_Usuario.getAccessibleContext().setAccessibleDescription("");
        button1.getAccessibleContext().setAccessibleName("BTN_inicio ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        File Archivo = new File("C:/MEIA/usuario.txt");
        File Bitacora = new File("C:/MEIA/bitacora_usuario.txt");
        var strError = "";
        ManejoArchivo objManejo = new ManejoArchivo();
        if(objManejo.CantidadRegistros(Archivo, strError) != 0 || 
                objManejo.CantidadRegistros(Bitacora, strError) != 0){
            if(!TF_Usuario.getText().equals("") && !String.valueOf(TF_Password.getPassword()).equals("")){
                objManejo.RegresarPrincipio(Archivo, strError);
                var strActual = objManejo.BuscarLinea(Archivo, TF_Usuario.getText(), strError, 0, 9);
                if(strActual.equals("")){ 
                    strActual = objManejo.BuscarLinea(Bitacora, TF_Usuario.getText(), strError, 0, 9);
                }
                if(!strActual.equals("")){
                    var split = strActual.split(Pattern.quote("|"));
                    var objUsuario = new ManejoUsuario();
                    if(String.valueOf(TF_Password.getPassword()).equals(objUsuario.decrypt(split[3]))){
                        //INGRESO AL SISTEMA
                        JOptionPane.showMessageDialog(null, "Ingreso al sistema", "Excelente", 1);
                        //var Usuario = new Usuario(split[0], split[1]);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "FALLO", 1);
                    }
                }
                else{
                    int iRespuesta = JOptionPane.showConfirmDialog(null, "¿Desea crearlo?", "No existe el usuario ingresado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (iRespuesta == 0) 
                    {            
                        var fCrearUsuario = new Register();
                        Data.getData().setRole("0"); 
                        fCrearUsuario.setVisible(true);
                        this.dispose();
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Llenar todos los campos", "FALLO", 1);
            }
        }
        else{
            int iRespuesta = JOptionPane.showConfirmDialog(null, "¿Desea crearlo?", "No existe ningun usuario", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (iRespuesta == 0) 
            {
                var fCrearUsuario = new Register();
                Data.getData().setRole("1"); 
                fCrearUsuario.setVisible(true);
                this.dispose();
            }
        }
                                                         
    }//GEN-LAST:event_button1ActionPerformed

    private void Btn_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegistroActionPerformed
 File Archivo = new File("C:/MEIA/usuario.txt");
        File Bitacora = new File("C:/MEIA/bitacora_usuario.txt");
        var fCrearUsuario = new Register();
        ManejoArchivo objManejo = new ManejoArchivo();
        var strError = "";
        if(objManejo.CantidadRegistros(Archivo, strError) != 0 || 
                objManejo.CantidadRegistros(Bitacora, strError) != 0){ 
            Data.getData().setRole("0"); 
        }
        else{
            Data.getData().setRole("1");
        }
        fCrearUsuario.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_RegistroActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       int iRespuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir? ", "¿Salir?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (iRespuesta == 0) 
        {
            var objManejoArchivo = new ManejoArchivo();
            File Archivo = new File("C:/MEIA/usuario.txt");
            File Bita = new File("C:/MEIA/bitacora_usuario.txt");
            var strError = "";
            if(objManejoArchivo.CantidadRegistros(Bita, strError) != 0){
                if(objManejoArchivo.CantidadRegistros(Archivo, strError) == 0){
                    objManejoArchivo.LimpiarBitacora("usuario");
                    objManejoArchivo.ModifyFilesDescUser("usuario", 9, "root", true, strError);
                }
                else{
                    objManejoArchivo.LimpiarBitacora("usuario");
                    objManejoArchivo.ModifyFilesDescUser("usuario", 9, "root", false, strError);
                }
                objManejoArchivo.ModifyFilesDescBita("usuario", 9, "root", true, strError);
            }
            if(objManejoArchivo.CantidadRegistros(Archivo, strError) != 0){
                objManejoArchivo.LimpiarPrincipal("usuario", 9);
                if(objManejoArchivo.CantidadRegistros(Archivo, strError) == 0){
                    objManejoArchivo.ModifyFilesDescUser("usuario", 9, "root", true, strError);
                }
                else{
                    objManejoArchivo.ModifyFilesDescUser("usuario", 9, "root", false, strError);
                }
            }
            objManejoArchivo.limpiarSalir("contactos", 4);
            objManejoArchivo.limpiarSalir("lista", 5);
            objManejoArchivo.limpiarBI("Lista_usuario");
            
            System.exit(0);
        } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TF_PasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_PasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == KeyEvent.VK_TAB) {
             TF_Password.setText(null);
        }
    }//GEN-LAST:event_TF_PasswordKeyPressed

    private void TF_PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF_PasswordMouseClicked
        // TODO add your handling code here:
         TF_Password.setText(null);
    }//GEN-LAST:event_TF_PasswordMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Registro;
    private javax.swing.JPasswordField TF_Password;
    private javax.swing.JTextField TF_Usuario;
    private java.awt.Button button1;
    private javax.swing.JButton jButton2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables
}
