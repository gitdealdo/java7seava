/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mitocode.stack;

import java.util.Stack;

/**
 *
 * @author hikaru
 */
public class App {
    
    public static void main(String[] args) throws InterruptedException {
        Stack<String> pila = new Stack<String>();    
        pila.push("1-Aldo");
        pila.push("2-Hikaru");
        pila.push("3-Hinkaku");
        pila.push("4-Sharme");
                
        for (String elemento : pila) {
            System.out.println(elemento);
        }
        System.out.println("LIFO");
        System.out.println("Tope " + pila.peek());
        System.out.println("Search "+ pila.search("2-Hikaru"));
        while (!pila.isEmpty()) {            
            System.out.println("Atendiendo "+pila.pop());
            Thread.sleep(1000);
        }
    }   
}
