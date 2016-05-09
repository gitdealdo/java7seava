/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mitocode.comparator;

import java.util.Comparator;

/**
 *
 * @author hikaru
 */
public class NombreComparator implements Comparator<Persona>{

    @Override
    public int compare(Persona per1, Persona per2) {
        return per1.getNombre().compareTo(per2.getNombre());
    }
    
}
