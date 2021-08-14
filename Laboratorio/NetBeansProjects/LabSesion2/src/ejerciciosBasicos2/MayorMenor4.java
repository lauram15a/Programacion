/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosBasicos2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 *
 * @author laura
 */

/**
Realizar un programa que pida dos enteros y muestre cual es el mayor y el menor, si son iguales lo indicará
también.
 */

public class MayorMenor4 {
    
    public static void main (String[] args) throws IOException{
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        int n1;
        int n2;
        
        System.out.print("\nPrimer número: ");
        n1 = Integer.parseInt(entrada.readLine());
        
        System.out.print("\nSegundo número: ");
        n2 = Integer.parseInt(entrada.readLine());
        
        if (n1 > n2){
            System.out.println("\n" + n1 + " es mayor que " + n2);
        }
        if (n2 > n1){
            System.out.println("\n" + n2 + " es mayor que " + n1);
        }
        if (n1 == n2){
            System.out.println("\n" + n1 + " es igual que " + n2);
        }
    }
}
