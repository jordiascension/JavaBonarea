/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.miprimerprograma;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author jordi
 */
public class Calculadora {
    
    public int suma(int num1, int num2)
    {
        return num1 + num2;
    }  
    
    public float suma(float num1, float num2){
        return num1 + num2;
    }

    public BigDecimal suma(BigDecimal num1, BigDecimal num2){
         BigDecimal resultado = num1.add(num2);
         BigDecimal rounded = resultado.setScale(2, RoundingMode.HALF_EVEN);
         return rounded;        
    }
	
    public int resta(int num1, int num2) {
            return num1 - num2;
    }

    public int multiplicacion(int num1, int num2) {
            return num1 * num2;
    }

    public int division(int num1, int num2) {
            return num1/num2;
    }

    //Calcular el resto de la división
    public float modulo(int num1, int num2){
            return num1 % num2;
    }
}
