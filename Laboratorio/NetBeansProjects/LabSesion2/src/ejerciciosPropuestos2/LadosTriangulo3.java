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
 * Programa que pida tres números y diga si pueden ser los lados de un triángulo.
 * 
 */
public class LadosTriangulo3 {
    
    public static void main (String[] args) throws IOException{
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        double l1;
        double l2;
        double l3;
        
        System.out.print("\nLado 1: ");
        l1 = Double.parseDouble(entrada.readLine());
        
        System.out.print("\nLado 2: ");
        l2 = Double.parseDouble(entrada.readLine());
        
        System.out.print("\nLado 3: ");
        l3 = Double.parseDouble(entrada.readLine());
        
        if (l1 < (l2 + l3)){
            if (l2 < (l1 + l3)){
                if (l3 < (l2 + l1)){
                    System.out.println("\nSí es un triángulo.");                    
                }
                else{
                    System.out.println("\nNo es un triángulo.");
                }
            }
            else{
                System.out.println("\nNo es un triángulo.");
            }
        }
        else{
            System.out.println("\nNo es un triángulo.");
        }
    }
}
