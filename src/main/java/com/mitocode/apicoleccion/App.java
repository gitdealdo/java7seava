/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mitocode.apicoleccion;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author hikaru
 */
public class App {
    
    // HashSet para evitar objetos duplicados
    
    public static void main(String[] args) {
        Set<Persona> lista = new HashSet<Persona>();
        lista.add(new Persona(1, "Hinkaku", 23));
        lista.add(new Persona(2, "Aldo", 21));
        lista.add(new Persona(3, "Hikaru", 22));
        lista.add(new Persona(4, "Hinkaku", 25));
        
        
        for (Persona e : lista) {
            System.out.println(e.getEdad()+" "+e.getNombre());
        }
    }    
}
