/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mitocode.map;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hikaru
 */
public class App {
    
    public static void main(String[] args) {
        
        Map<Persona, String> map = new HashMap<Persona, String>();
        
        map.put(new Persona(1, "Hikaru", 23), "Hikaru");
        map.put(new Persona(2, "Elias", 24), "Elias");
        map.put(new Persona(3, "Aldo", 25), "Aldo");
        map.put(new Persona(4, "Hinkaku", 26), "Hinkaku");
        
        for (Map.Entry<Persona, String> ent : map.entrySet()) {
            System.out.println("Clave :"+ent.getKey()+" Valor :"+ent.getValue());
        }
    }
}
