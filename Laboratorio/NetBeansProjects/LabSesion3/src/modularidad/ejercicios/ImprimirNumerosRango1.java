/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularidad.ejercicios;

import java.util.Scanner;

/**
 *
 * @author laura
 * 
 * Realizar un programa que imprima todos los números de un rango de valores. El programa pedirá
dos números (el menor y el mayor) y llamará a un método auxiliar encargado de imprimir todos los
que se encuentren en su rango.
* 
 */

public class ImprimirNumerosRango1 {
    
    public static void main (String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int mayor;
        int menor;
        
        System.out.println("\nIntroduce el número menor: ");
        menor = entrada.nextInt();
        System.out.println("\nIntroduce el número mayor: ");
        mayor = entrada.nextInt();
        
        //Llamamos al método
        imprimir(menor, mayor);
        
    }
    
    public static void imprimir (int menor, int mayor){
        
        for (int i = menor; i < (mayor + 1); i++){
            System.out.print(" " + i);
        }
    }
    
    
}
