/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenasCaracteres.string;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author laura
 * 
 * Escribir un programa que solicite una cadena y una letra y nos devuelva las posiciones que ocupa esa
letra en la cadena.
* 
 */
public class LetraEnPalabraArrays2 {
    
    public static void main (String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        String palabra;
        String letraIngresada;
        
        
        System.out.print("Cadena: ");
        palabra = entrada.nextLine();
        
        System.out.print("Letra: ");
        letraIngresada = entrada.nextLine();
        
        char[] lista = palabra.toCharArray();
        
        for (int i = 0; i < palabra.length(); i ++){
            String letra = String.valueOf(lista[i]);
            if (letraIngresada.equalsIgnoreCase(letra)){
                System.out.println("posiciones de la letra '" + letra + "': " + (i + 1));
            }
        }
    }
}
