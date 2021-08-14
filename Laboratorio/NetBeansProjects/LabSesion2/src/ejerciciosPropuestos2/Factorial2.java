/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosPropuestos2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author laura
 * 
 * Programa que pida un entero n>=0 y calcule el factorial(n).
 */

public class Factorial2 {
    
    public static void main (String[] args) throws IOException{
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        int n;
        int nInicial;
        int factorial;
        
        System.out.print("\nNúmero: ");
        n = Integer.parseInt(entrada.readLine());
        
        nInicial = n;
        
        factorial = 1;
        
        while (n != 0){
            factorial *= n;
            n -= 1;
        }
        
        System.out.println(nInicial + "! = " + factorial);
    }
}
