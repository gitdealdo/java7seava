/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mitocode.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author hikaru
 */
public class App {
        
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<Persona>();    
        lista.add(new Persona(1, "Aldo", 23));
        lista.add(new Persona(2, "Elias", 19));
        lista.add(new Persona(3, "Hinkaku", 25));
        lista.add(new Persona(4, "Hikaru", 20));
        
//        Collections.sort(lista, new NombreComparator());
        Collections.sort(lista);
        
/*        Collections.sort(lista, new Comparator<Persona>(){

            public int compare(Persona per1, Persona per2) {
                int rpta = 0;
                if (per1.getEdad() > per2.getEdad()) {
                    rpta = 1;
                }else if (per1.getEdad() < per2.getEdad()) {
                    rpta = -1;
                }else{
                    rpta = 0;
                }
                return rpta;
            }
            
        });*/
        
        for (Persona p : lista) {
            System.out.println(p.getEdad()+" "+p.getNombre());
        }
    }    
}
