/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.redsocial.redsocial;

import java.util.Date;
/**
 *
 * @author Diego Andrés Azurdia Ortiz - 2528119
 * @author Herbert Emilio Alfaro Montes - 1181320
 * @author César Daniel Bocel Morales 1094921
 */
/**
 * Representa a un usuario de la red social
 * 
 */
public class Usuario {
    public String Usuario;
    String Nombre;
    String Apellido;
    String Password;
    Boolean Rol;
    Date Fecha_nacimiento;
    String Correo_electronico;
    int Telefono;
    String Path_fotografia;
    Boolean Estatus;
    /**
     * Constructor para un usuario solo con nombre
     * @param PNombre nombre del usuario
     */
    public Usuario(String PNombre){
        this.Nombre = PNombre;
    }
    /**
     * Inicializa TODOS los valores de un usuario
     * @param PUsuario usuario único 
     * @param PNombre nombre
     * @param PApellido apellido
     * @param PPassword contraseña
     * @param PRol bit del rol (Administrador: true, No administrador: false)
     * @param PFecha_nacimiento fecha de naciemineto
     * @param PCorreo_electronico correo electronico
     * @param PTelefono Telefono
     * @param PPath_fotografia ruta de acceso a la fotografia
     * @param PEstatus bit de estatus (Activo: true, default, Inactivo: false)
     */
    public Usuario(String PUsuario, String PNombre, String PApellido, String PPassword, Boolean PRol, Date PFecha_nacimiento, String PCorreo_electronico, int PTelefono, String PPath_fotografia, Boolean PEstatus)
    {
        this.Usuario = PUsuario;
        this.Nombre = PNombre;
        this.Apellido = PApellido;
        this.Password = PPassword;
        this.Rol = PRol;
        this.Fecha_nacimiento = PFecha_nacimiento;
        this.Correo_electronico = PCorreo_electronico;
        this.Telefono = PTelefono;
        this.Path_fotografia = PPath_fotografia;
        this.Estatus = PEstatus;
    }
    /**
     * Inicializa los valores no por defecto del usuario y asigna los valores por defecto
     * 
      @param PUsuario usuario único 
     * @param PNombre nombre
     * @param PApellido apellido
     * @param PPassword contraseña
     * @param PFecha_nacimiento fecha de naciemineto
     * @param PCorreo_electronico correo electronico
     * @param PTelefono Telefono
     * @param PPath_fotografia ruta de acceso a la fotografia
     */
    public Usuario(String PUsuario, String PNombre, String PApellido, String PPassword, Date PFecha_nacimiento, String PCorreo_electronico, int PTelefono, String PPath_fotografia)
    {
        this.Usuario = PUsuario;
        this.Nombre = PNombre;
        this.Apellido = PApellido;
        this.Password = PPassword;
        this.Rol = false;
        this.Fecha_nacimiento = PFecha_nacimiento;
        this.Correo_electronico = PCorreo_electronico;
        this.Telefono = PTelefono;
        this.Path_fotografia = PPath_fotografia;
        this.Estatus = true;
    }
    
    public String UsuarioToString()
    {
            String txtUsuario, bitRol, bitEstatus;
            if(this.Rol) bitRol = "1";            
            else bitRol = "0";
            if(this.Estatus) bitEstatus = "1";            
            else bitEstatus = "0";
            txtUsuario = this.Usuario+'|'+this.Nombre+'|'+this.Apellido+'|'+this.Password+'|'+bitRol+'|'+this.Fecha_nacimiento+'|'+this.Correo_electronico+'|'+this.Telefono+'|'+this.Path_fotografia+'|'+bitEstatus;
            return txtUsuario;
    }
    public void InhabilitarUsuario(){
        this.Estatus = false;
    }
    public void actualizarUsuario(String PPassword, String PCorreo_electronico, Date PFecha_nacimiento, int PTelefono, String PPath_fotografia){
        this.Password = PPassword;
        this.Fecha_nacimiento = PFecha_nacimiento;
        this.Correo_electronico = PCorreo_electronico;
        this.Telefono = PTelefono;
        this.Path_fotografia = PPath_fotografia;
    }
}
