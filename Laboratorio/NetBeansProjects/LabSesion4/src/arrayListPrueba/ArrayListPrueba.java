/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayListPrueba;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author laura
 */

public class ArrayListPrueba {
    
    public static void main (String[] args){
        
        //ArrayList de cadenas
        ArrayList<String> colores = new ArrayList<>();
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        colores.add("amarillo");
        
        //primer y último elemento
        System.out.println("Primer elemento: " + colores.get(0));
        System.out.println("Último elemento: " + colores.get(colores.size() - 1 ));
        
        colores.set(2, "azul claro");
        
        if (colores.contains("rojo")){
            System.out.println("\n\"rojo\" encontrado en el índice " + colores.indexOf("rojo") + "\n");
        } else {
            System.out.println("\n\"rojo\" no encontrado\n");
        }
        
        //borrar un elemento
        colores.remove("amarillo");
        
        //ordenamos el array
        Collections.sort(colores);
        
        //imprimimos el contenido 
        System.out.println(colores.toString());
        for (String c: colores){
            System.out.println(c);
        }
    }
}
