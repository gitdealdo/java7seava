/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mitocode.tema3;

/**
 *
 * @author hikaru
 */
public class App {
    public static void main(String[] args) {
        
        PaisDAOImpl dao = PaisDAOImpl.getInstance();
//      PaisDAOImpl dao = new PaisDAOImpl();
        for (Object object : dao.getPaises()) {
            System.out.println(((Pais)object).getNombre());
        }
        
        System.out.println("*******************");
        
        for (Object object : dao.getPaises()) {
            System.out.println(((Pais)object).getNombre());
        }
        
        System.out.println("*******************");
        
        PaisDAOImpl daoi = PaisDAOImpl.getInstance();
//        PaisDAOImpl daoi = new PaisDAOImpl();
        for (Object object : daoi.getPaises()) {
            System.out.println(((Pais)object).getNombre());
        }
    }
   
}
