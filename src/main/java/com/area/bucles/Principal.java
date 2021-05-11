/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.bucles;

/**
 *
 * @author jordi
 */
public class Principal {
    
    public static void main(String[] args) {
		Empleado empleados[]= new Empleado[5];
		//empleados = new Empleado[3];
		
		Empleado empleado1 = new Empleado("Pepe", "Soto", 50000.00f);
		empleados[0] = empleado1;
		
		empleados[1] = new Empleado("Alberto", "Monte", 80000.00f);
		
		empleados[2] = new Empleado("Juan", "Ferrer", 100000.00f);
                
                empleados[3] = new Empleado("Pedro", "Arco", 30000.00f);
		
		empleados[4] = new Empleado("Fernando", "Blanco", 24000.00f);
		
		float sueldoTotal = 0.0f;
		for (Empleado empleado: empleados) {
			System.out.println(empleado.getNombre());
			System.out.println(empleado.getApellidos());
			sueldoTotal = sueldoTotal + empleado.getSueldo();
		}
		
		System.out.println("El sueldo total del empleado es " +
							sueldoTotal);
	}
}
