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
public class Empleado {

    private String nombre;
    private String apellidos;
    //campo no obligatorio
    private float sueldo;
    //alt+insertar

    public Empleado(String nombre, String apellidos, float sueldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

}
