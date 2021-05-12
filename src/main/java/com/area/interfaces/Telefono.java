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
public class Telefono implements Activar, Validar{

    @Override
    public void on() {
        System.out.println("The phone is on");
    }

    @Override
    public void off() {
       System.out.println("The phone is off");
    }

    @Override
    public boolean validarCodigo(int numero) {
        return true;
    }

    @Override
    public boolean validarPatron(String patron) {
        return true;
    }

    @Override
    public boolean validarHuella(String patronHuella) {
        return true;
    }

    @Override
    public boolean validarRostro(String patronRostro) {
        return true;
    }  
}
