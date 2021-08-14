/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularidad;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author laura
 * 
 * En el siguiente ejemplo calculamos la potencia de un número. Para realizarlo nos basamos en la clase Math
que define múltiples métodos matemáticos.
* 
 */

public class Potencia3 {
    
    public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
        
        double base = 0;
        double exponente = 0;
        double resultado;
        
        System.out.print("\nBase: ");
        base = entrada.nextDouble();
        System.out.print("\nExponente: ");
        exponente = entrada.nextDouble();
                
               
        //llamamos al método
        resultado = calcula(base, exponente);
        System.out.println("\n\nEl resultado es: "+resultado);
    }
    
    public static double calcula(double num1, double num2) {
        //Calculamos con el método pow de la clase Math
        return Math.pow(num1, num2);
    }
}
