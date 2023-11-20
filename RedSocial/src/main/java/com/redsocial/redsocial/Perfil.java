/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.redsocial.redsocial;

import com.mycompany.primer_proyecto.Login;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import management.ManejoArchivo;
import management.ManejoUsuario;

/**
 *
 * @author diego
 */
public class Perfil extends javax.swing.JFrame {

    Usuario auxAdmin;
    Usuario usuario;
    /**
     * Creates new form Perfil
     */
    public Perfil(Usuario _usuario) {
        initComponents();
        usuario = _usuario;
        setUsuarioLabels();
    }
public Perfil(Usuario _usuario, Usuario _admin) {
        initComponents();
        usuario = _usuario;
        auxAdmin = _admin;
        setUsuarioLabels();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Foto = new javax.swing.JLabel();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_Apellido = new javax.swing.JLabel();
        jLabel_Fecha = new javax.swing.JLabel();
        jLabel_Correo = new javax.swing.JLabel();
        jLabel_Telefono = new javax.swing.JLabel();
        jButton_CerrarSesion = new javax.swing.JButton();
        jButton_Opciones = new javax.swing.JButton();
        jButton_CambiarFoto = new javax.swing.JButton();
        jLabel_Rol = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_Nombre.setText("jLabel1");

        jLabel_Apellido.setText("jLabel1");

        jLabel_Fecha.setText("jLabel1");

        jLabel_Correo.setText("jLabel1");

        jLabel_Telefono.setText("jLabel1");

        jButton_CerrarSesion.setText("Cerrar sesión");
        jButton_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CerrarSesionActionPerformed(evt);
            }
        });

        jButton_Opciones.setText("Actualizar");
        jButton_Opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OpcionesActionPerformed(evt);
            }
        });

        jButton_CambiarFoto.setText("Cambiar foto");
        jButton_CambiarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CambiarFotoActionPerformed(evt);
            }
        });

        jLabel_Rol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Rol.setText("Administrador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Apellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_CambiarFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Rol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_CerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel_Rol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_CambiarFoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Opciones)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Nombre)
                    .addComponent(jLabel_Apellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Fecha)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Correo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Telefono)
                    .addComponent(jButton_CerrarSesion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setUsuarioLabels(){
        if(usuario.Rol == 1){
            jLabel_Rol.setText("Administrador");
        }
        else{
            jLabel_Rol.setText("Usuario");
        }
        jLabel_Nombre.setText(usuario.Nombre);
        jLabel_Apellido.setText(usuario.Apellido);
        jLabel_Fecha.setText(usuario.Fecha_nacimiento);
        jLabel_Telefono.setText(usuario.Telefono);
        jLabel_Correo.setText(usuario.Correo_electronico);
        ImageIcon image = new ImageIcon("C:\\MEIA\\fotografia\\"+usuario.Usuario+".png");
        Icon Icon = new ImageIcon(image.getImage().getScaledInstance(jLabel_Foto.getWidth(), jLabel_Foto.getHeight(),Image.SCALE_DEFAULT));
        jLabel_Foto.setIcon(Icon);
    }
    private void jButton_CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CerrarSesionActionPerformed
        // TODO add your handling code here:
        JFrame ventana;
        if(auxAdmin != null) {
            ventana = new Menu_Usuario_Administrador(auxAdmin);
        }
        else{
            ventana = new Login();
        }
        
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_CerrarSesionActionPerformed

    private void jButton_OpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OpcionesActionPerformed
        // TODO add your handling code here:
        JFrame opciones =  new Opciones(usuario);
        opciones.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_OpcionesActionPerformed

    private void jButton_CambiarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CambiarFotoActionPerformed
        // TODO add your handling code here:
        JFileChooser dialogo = new JFileChooser();
        File ficheroImagen;
        String rutaArchivo;
        ManejoArchivo ManejoArchivo = new ManejoArchivo();
        ManejoUsuario ManejoUsuario = new ManejoUsuario();
        int valor = dialogo.showOpenDialog(this);
        if (valor == JFileChooser.APPROVE_OPTION) 
        {
            ficheroImagen = dialogo.getSelectedFile();
            rutaArchivo = ficheroImagen.getPath();
            //LLAMAR MODIFICAR
            usuario = new Usuario(usuario.Usuario, usuario.Nombre, usuario.Apellido, 
                    usuario.Password,usuario.Rol, usuario.Fecha_nacimiento, 
                    usuario.Correo_electronico, usuario.Telefono, rutaArchivo, usuario.Estatus);
            ManejoArchivo.ModificarBloque("usuario", usuario.Usuario, usuario.Nombre, usuario.Apellido, rutaArchivo, 9);
            ManejoUsuario.ModificarUsuario(usuario);
            ImageIcon image = new ImageIcon(rutaArchivo);
            Icon Icon = new ImageIcon(image.getImage().getScaledInstance(jLabel_Foto.getWidth(), jLabel_Foto.getHeight(),Image.SCALE_DEFAULT));
            jLabel_Foto.setIcon(Icon);
            
        }
        
    }//GEN-LAST:event_jButton_CambiarFotoActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_CambiarFoto;
    private javax.swing.JButton jButton_CerrarSesion;
    private javax.swing.JButton jButton_Opciones;
    private javax.swing.JLabel jLabel_Apellido;
    private javax.swing.JLabel jLabel_Correo;
    private javax.swing.JLabel jLabel_Fecha;
    private javax.swing.JLabel jLabel_Foto;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Rol;
    private javax.swing.JLabel jLabel_Telefono;
    // End of variables declaration//GEN-END:variables
}
