/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.miprimerprograma;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 *
 * @author jordi
 */
public class Principal {

    //Disable maven index update frecuency
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("El resultado de la suma es "
                + calculadora.suma(4, 2));

        System.out.println("El resultado de la suma con decimales es "
                + calculadora.suma(new BigDecimal("1.505"), new BigDecimal("1.440")));

        BigDecimal num1 = new BigDecimal("1.505");
        BigDecimal num2 = new BigDecimal("1.440");
        //1.945--1.94
        //1.955--1.96
        System.out.println("El resultado de la suma con decimales es "
                + calculadora.suma(num1, num2));

        //Configuración del separador de miles
        DecimalFormat formatea = new DecimalFormat("###,###.##");
        System.out.println("El resultado de la suma con decimales es "
                + formatea.format(calculadora.suma(num1, num2)));
    }
}
