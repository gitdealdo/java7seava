package com.mitocode.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    private List canasta = new ArrayList();
    public static void main( String[] args )
    {        
        // Se tiene un canasta en donde solo se pueden colocar frutas
        System.out.println("Canasta abierta, por favor ingresar solo frutas");
        
        
        Manzana m1 = new Manzana("Roja");
        Manzana m2 = new Manzana("Verde");
        Naranja n1 = new Naranja("Sin pepa");
        Galleta g1 = new Galleta("Chocolate");
        
        App app = new App();
        app.verificar(m1);
        app.verificar(m2);
        app.verificar(n1);
        app.verificar(g1);
    }
    
    private void verificar(Object object){
        if (object instanceof Fruta) {
            canasta.add(object);
            System.out.println("Fruta agregada "+ ((Fruta)object).getNombre());
        }else{
            System.out.println("Elemento no permitido solo frutas por favor");
        }
    }
}
