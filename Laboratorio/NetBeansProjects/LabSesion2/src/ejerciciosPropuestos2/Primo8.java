/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosPropuestos2;

import java.util.Scanner;

/**
 *
 * @author laura
 * 
 * Programa que determine si un número es primo.
Notas: Un número es primo si sólo es divisible por sí mismo y por 1.
Si un número no es primo diremos que es compuesto.
El 0 y el 1 son números especiales que no se consideran primos ni compuestos.
* 
 */
public class Primo8 {
    
    public static void main (String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int n;
        
        System.out.print("\nIntroduce un número: ");
        //lectura de un int
        n = entrada.nextInt();
        
        if (n == 0 || n == 1){
            System.out.println("\n" + n + " no es ni primo ni compuesto.");
        } else if (n == 2 || n == 3 || n == 5 || n == 7){
            System.out.println("\n" + n + " es primo.");
        } else if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0|| n % 7 == 0){
            System.out.println("\n" + n + " es compuesto.");
        } else{
            System.out.println("\n" + n + " es primo.");
        }
    
    }
    
}
   
