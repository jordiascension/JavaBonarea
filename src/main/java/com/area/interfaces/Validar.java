/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.interfaces;

/**
 *
 * @author jordi
 */
public interface Validar {
    
     boolean validarCodigo(int numero);
     boolean validarPatron(String patron);
     boolean validarHuella(String patronHuella);
     boolean validarRostro(String patronRostro);
}
