/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenasCaracteres.stringSplit;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class NumPalabrasEnFarseSS2 {
    
    public static void main (String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        String frase;
        String palabra;
        int contador = 0;
        
        System.out.print("Frase: ");
        frase = entrada.nextLine();
        
        String[] lista = frase.split("\\s");
       
        for (int i = 0; i < lista.length; i++){
            contador += 1;
            palabra = lista[i];
        } 
        
        System.out.println("\nLa frase tiene " + contador + " palabra(s).");
    }
    
}
