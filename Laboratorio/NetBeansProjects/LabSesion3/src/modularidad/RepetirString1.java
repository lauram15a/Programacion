/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularidad;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class RepetirString1 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número:");
        
        int n = entrada.nextInt();
        eco(n); //llamada a la función
    }
    
    public static void eco(int veces) {
        
        for (int i = 0; i < veces; i++) {
            System.out.println("Eco...");
        }
    }
}
