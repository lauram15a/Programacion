/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenasCaracteres.string;

import java.util.Scanner;

/**
 *
 * @author laura
 * 
 * Escribir un programa que pida una palabra y un entero n y vaya rotando el carácter inicial de la
palabra, al final de la misma, tantas veces como indique n. (Por ejemplo, “monja”,3 debe devolver
“jamon” y “monja”;5 “monja”).
* 
 */

public class MonjaJamon1 {
    
    public static void main (String[] args){
        
        Scanner entrada = new Scanner (System.in);
        
        String palabra;
        int n;
                
        System.out.println("\nPalabra: ");
        palabra = entrada.nextLine();
        
        System.out.print("\nEntero: ");
        n = entrada.nextInt();
                        
        System.out.println(" " + palabra.substring(n) + palabra.substring(0,n));
    }
}
