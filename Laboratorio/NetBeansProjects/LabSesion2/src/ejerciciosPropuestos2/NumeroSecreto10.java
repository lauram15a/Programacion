/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosPropuestos2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author laura
 * 
 * Programar el juego “el número secreto”, que consiste en acertar un número desconocido (generado
aleatoriamente entre el 1 y el 100). El programa deberá ir pidiendo al usuario un número y le indicará
si el número generado es mayor, menor o es el acertado. Si el usuario quiere abandonar el programa
antes de acertar el número introducirá un 0.
* 
 */

public class NumeroSecreto10 {
    
    public static void main (String[] args){
        
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        
        int numDesconocido;
        int num = 0;
        int contador = 0;
        
        
        numDesconocido = rand.nextInt(100) + 1;
        
        while (num != numDesconocido){
            System.out.print("\nIntroduce un número: ");
            num = entrada.nextInt();
            contador += 1;
            if (num == 0){
                num = numDesconocido;
                System.out.println("Has avandonado el juego");
            } else if (num > numDesconocido){
                System.out.println(num + " es mayor que el número desconocido.");
            } else if (num < numDesconocido){
                System.out.println(num + " es menor que el número desconocido.");
            } else{
                System.out.println("\n¡¡¡HAS ACERTADO EL NÚMERO!!!");
            }
        }
        System.out.print("Has necesitado " + contador + " intento(s)");
    }
}
