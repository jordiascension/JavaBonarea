/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.herencia;

import java.util.Objects;

/**
 *
 * @author jordi
 */
//Código de la clase profesor, subclase de la clase Persona ejemplo aprenderaprogramar.com
public class Profesor extends Persona {

    //Campos específicos de la subclase.
    private String IdProfesor;

    //Constructor de la subclase: incluimos como parámetros al menos los del 
    //constructor de la superclase
    public Profesor(String nombre, String apellidos, int edad) {

        super(nombre, apellidos, edad);

        IdProfesor = "Unknown";
    } //Cierre del constructor

    //Métodos específicos de la subclase
    public void setIdProfesor(String IdProfesor) {
        this.IdProfesor = IdProfesor;
    }

    public String getIdProfesor() {
        return IdProfesor;
    }

    public void mostrarNombreApellidosYCarnet() {
        System.out.println("Profesor de nombre: " + getNombre() + " " + 
                getApellidos()
                + " con Id de profesor: " + getIdProfesor());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.IdProfesor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Profesor other = (Profesor) obj;
        if (!Objects.equals(this.IdProfesor, other.IdProfesor)) {
            return false;
        }
        return true;
    }
    
    

} //Cierre de la clase

