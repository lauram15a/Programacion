/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosBasicos2;

import java.util.Scanner;

/**
 *
 * @author laura
 * 
 * Realizar un programa que pida un entero n y dibuje un triángulo rectángulo de n elementos de lado.
Ejemplo n = 4:
* * * *
* * *
* *
*
 */
public class DibujoTriangulo9 {
    
    public static void main (String[] args){
        
        int n;
        int i = 0;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.print ("Introduce un número: ");
        n = entrada.nextInt();
        
        while (i<n){
            for (int j = 0; j < n; j++){
                System.out.print("*");
            }
        System.out.println("");
        n--;
        }
        
    }
}
