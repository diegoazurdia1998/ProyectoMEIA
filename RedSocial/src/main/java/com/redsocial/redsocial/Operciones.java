/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.redsocial.redsocial;

/**
 * La clase Operaciones representa las operaciones, cálculos y validaciones
 * necesarias para el Usuario 
 * 
 * 
 * @author diego
 */
public class Operciones {

    /**
     * Verifica el nivel de segurudad de una contraseña
     * devuelve un valor entero según el resultado
     * 
     * @param contrasena Contraseña a validar
     * @return valor como número entero del cálculo     
     */
    public int calcularSeguridadContrasena(String contrasena) {
        int seguridad = 0;

        // Aumentar la seguridad por la longitud de la contraseña
        int longitud = contrasena.length();
        seguridad += longitud * 4;

        // Aumentar la seguridad si tiene letras mayúsculas y minúsculas
        boolean tieneMayusculas = !contrasena.equals(contrasena.toLowerCase());
        boolean tieneMinusculas = !contrasena.equals(contrasena.toUpperCase());
        if (tieneMayusculas && tieneMinusculas) {
            seguridad += longitud;
        }

        // Aumentar la seguridad si tiene números
        int numeroDigitos = contrasena.replaceAll("\\D", "").length();
        if (numeroDigitos > 0) {
            seguridad += numeroDigitos * 4;
        }

        // Aumentar la seguridad si tiene caracteres especiales
        int numeroEspeciales = contrasena.replaceAll("\\w", "").length();
        seguridad += numeroEspeciales * 6;

        // Disminuir la seguridad si tiene caracteres repetidos
        for (int i = 0; i < contrasena.length(); i++) {
            char caracter = contrasena.charAt(i);
            if (contrasena.indexOf(caracter, i + 1) > -1) {
                seguridad--;
            }
        }

        return seguridad;
   }
public void LamarMenu(boolean bitRol){
    if(bitRol){
        
    }
}

}
