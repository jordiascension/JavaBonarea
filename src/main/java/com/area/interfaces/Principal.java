/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jordi
 */
public class Principal {
    
    public static void main(String[] args) {
        //Polimorfismo de interfaces
        Activar activar = new Telefono();
        activar.on();
        activar.off();
        
        Validar validar = new Telefono();
        validar.validarCodigo(0);
        validar.validarHuella("");
        validar.validarPatron("");
        validar.validarRostro("");
        
        List<Telefono> lista = new ArrayList<Telefono>();       
    }
}
