/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenasCaracteres.stringTokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author laura
 * 
 * Escribir un programa que lea una frase y nos diga cuántas palabras la componen.
 * 
 */

public class NumPalabrasEnFarseST2 {
    
    public static void main (String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        String frase;
        String palabra;
        int contador = 0;
        
        System.out.print("Frase: ");
        frase = entrada.nextLine();
        
        StringTokenizer st = new StringTokenizer(frase);
        
        while (st.hasMoreTokens()){
            contador += 1;
            palabra = st.nextToken();
        }
        
        System.out.println("\nLa frase tiene " + contador + " palabra(s).");
    }
}
