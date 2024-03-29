/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mitocode.comparator;

/**
 *
 * @author hikaru
 */
public class Persona implements Comparable<Persona>{
    private int idPersona;
    private String nombre;
    private int edad; 

    public Persona(int idPersona, String nombre, int edad) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int compareTo(Persona per) {
//        return this.edad - per.getEdad();
        return this.nombre.compareTo(per.getNombre());
    }
    
    
}
