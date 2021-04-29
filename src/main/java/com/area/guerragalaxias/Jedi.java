/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.guerragalaxias;

/**
 *
 * @author jordi
 */
public class Jedi {

    //El ámbito por defecto en java es de package
    //Atributos de objeto
    String nombre;
    String colorSableLuz;

    //ámbito nombre_clase (parametros)
    //En el constructor inicializamos los atributos del objeto del tipo Jedi
    //Este constructor se llamará cuando se realice un new de la clase Jedi
    public Jedi(String nombre, String colorSableLuz) {
        this.nombre = nombre;
        this.colorSableLuz = colorSableLuz;
    }

    //método de objeto
    public void mostrar() {
        System.out.println("Soy un Jedi, mi nombre es " + this.nombre
                + " y el color de mi sable de luz es " + this.colorSableLuz);
    }
}
