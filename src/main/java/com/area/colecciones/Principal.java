/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.colecciones;

import com.area.herencia.Coche;
import java.util.ArrayList;

/**
 *
 * @author jordi
 */
public class Principal {

    public static void main(String[] args) {
        // Declaración de un ArrayList de "String". Puede ser de cualquier otro Elemento u Objeto (float, Boolean, Object, ...)
        ArrayList nombreArrayList = new ArrayList();
        
        int entero =9;
        Integer entero1 = 10;
        Coche coche= new Coche();
        // Añade el elemento al ArrayList
        nombreArrayList.add("Elemento");
        nombreArrayList.add("Elemento1");
        //automatic casting
        nombreArrayList.add(entero);
        
        nombreArrayList.add(entero1);
        
        nombreArrayList.add(coche);
        // Devuelve el numero de elementos del ArrayList
        nombreArrayList.size();
        // Devuelve el elemento que esta en la posición '0' del ArrayList
        nombreArrayList.get(0);
        // Comprueba se existe del elemento ('Elemento') que se le pasa como parametro
        nombreArrayList.contains("Elemento");
        // Devuelve la posición de la primera ocurrencia ('Elemento') en el ArrayList  
        nombreArrayList.indexOf("Elemento");
        // Devuelve la posición de la última ocurrencia ('Elemento') en el ArrayList   
        nombreArrayList.lastIndexOf("Elemento");
        // Borra el elemento de la posición '1' del ArrayList   
        nombreArrayList.remove(1);
        // Borra la primera ocurrencia del 'Elemento' que se le pasa como parametro.  
        nombreArrayList.remove("Elemento");
        //Borra todos los elementos de ArrayList   
        nombreArrayList.clear();
        // Devuelve True si el ArrayList esta vacio. Sino Devuelve False   
        nombreArrayList.isEmpty();
        // Copiar un ArrayList 
        ArrayList arrayListCopia = (ArrayList) nombreArrayList.clone();
        // Pasa el ArrayList a un Array 
        Object[] array = nombreArrayList.toArray();
        System.out.println("Ejecutado con éxito");
    }

}
