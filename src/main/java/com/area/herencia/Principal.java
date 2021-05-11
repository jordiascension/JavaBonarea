/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.herencia;

/**
 *
 * @author jordi
 */
public class Principal {
    
     public static void main (String [ ] Args) {
        Profesor profesor1 = new Profesor ("Juan", "Hernández García", 23);
        profesor1.setIdProfesor("Prof 22-387-11");
        profesor1.mostrarNombreApellidosYCarnet();
        
        //Polimorfisme && reflection -- introspecció --psicologia --yoga 
        //--dynamic code
        Persona persona = new Profesor ("Pau", "Martínez Soto", 33);
        //unboxing && unwrapping && conversió--convertir objectes que hereden 
        //casting && downcasting && casteo
        //entre si
        ((Profesor)persona).setIdProfesor("Prof 23-567-26");
        ((Profesor)persona).mostrarNombreApellidosYCarnet();
        
        Persona persona1 = new Profesor ("Pepe", "Fernández Biel", 45);        
        Profesor profesor2 = (Profesor)persona1;
        profesor2.setIdProfesor("Prof 23-567-26");
        profesor2.mostrarNombreApellidosYCarnet();
        
        Object object1 = new Persona("Neus", "Membrado", 50);
        Object object2 = new Profesor("Pepe", "Fernández Biel", 45);
        Object object3 = new Coche();
        
        Object object4;
        object4 = new Persona("Neus", "Membrado", 50);
        object4 = new Profesor("Pepe", "Fernández Biel", 45);
        object4 = new Coche();
        
        //Error de conversió
        //Profesor profesor3 = (Coche)persona1;
     }    

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
     
     
     
}
