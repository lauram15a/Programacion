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
 * Programa que pida un entero n>=0 y calcule e imprima Σi entre 0 y n.
 */
public class Sumatorio1 {
    
    public static void main (String[] args) throws IOException{
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        int n;
        int sumatorio;
        
        System.out.print("\nNúmero: ");
        n = Integer.parseInt(entrada.readLine());
        
        sumatorio = 0;
        
        while (n != 0){
            sumatorio += n;
            n -=1;
        }        
        
        System.out.println("Sumatorio: " + sumatorio);
        
    }
}
