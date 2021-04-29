/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.decisiones;

import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Principal {

    public static void main(String[] args) {
        int num1, num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        num2 = scanner.nextInt();

        scanner.close();//try-catch with resources

        //java stringbuilder vs stringbuffer vs concatenation(+)
        //Synchronize methods
        if (num1 > num2) {
            System.out.println("El número " + num1
                    + " es mayor que el número " + num2);
        } else {
            System.out.println("El número " + num1
                    + " es menor que el número " + num2);
        }
    }
}
