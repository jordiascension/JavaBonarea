/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.lambda;

import com.area.herencia.Persona;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author jordi
 */
public class Principal {

    public static void main(String[] args) {

        ArrayList<Persona> milista = new ArrayList<Persona>();
        milista.add(new Persona("Miguel"));
        milista.add(new Persona("Alicia"));
        milista.add(new Persona("Pepe"));
        milista.add(new Persona("Juan"));

        //kiss principle, define just the foreach object, it's not necessary
        //to define the class
        milista.forEach(persona -> System.out.println(persona.getNombre()));

        //foreach with multiple lines
        milista.forEach(persona -> {
            System.out.println(persona.getNombre());
            System.out.println("foreach lambda expression executed");
        });
        
        System.out.println(milista.size());
        milista.removeIf(persona -> (persona.getNombre().equals("Alicia"))); // Lambda Expression
        System.out.println(milista.size()); 
        
        Optional<Persona> personaFiltro=
        milista.stream()
        .filter(persona->persona.getNombre().equals("Juan"))
        .findFirst();
       
       if(personaFiltro.isPresent()){
            Persona personaEncontrada = personaFiltro.get();
            System.out.println("La persona filtrada es " + personaEncontrada.getNombre());
        }else{
            System.out.println("No se ha encontrado a la persona");
        } 
       
       Persona personaFiltro1=
       milista.stream()
       .filter(persona->persona.getNombre().equals("Juan"))
       .findFirst()
       .get();
       
       System.out.println("La persona filtrada es " + personaFiltro1.getNombre());
    }
}
