/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosBasicos2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author laura
 * 
 * Realizar un programa que pida un entero y una cadena y repita tantas veces la cadena como indique el
entero.
* 
 */

public class RepetirCadena7 {
    public static void main (String[] args) throws IOException{
        
        BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
        
        String cadena;
        int repeticiones;
        
        System.out.println("\nCadena: ");
        cadena = entrada.readLine();
        
        System.out.println("\nNúmero repeticiones: ");
        repeticiones = Integer.parseInt(entrada.readLine());  //conversión de cadena a número
        
        System.out.println("");
        
        while (repeticiones > 0) {
            System.out.println(cadena);
            repeticiones -= 1;
        }
    }
}
