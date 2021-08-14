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
 * Reutilizando el programa anterior escribir solo los números pares en el rango de valores. El método
auxiliar encargado de imprimir todos los valores que se encuentren en su rango tiene que hacer uso
de otra función llamada esPar(int num) que devolverá un booleano indicando si el número es par o
no.
* 
 */
public class SoloPares2 {
    
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
            //llamamos al método
            esPar (i);
            if (esPar(i) == true){
                System.out.print(" " + i);
            }
        }
    }
    
    public static boolean esPar (int num){
        if (num % 2 == 0){
            return true;
        } else{
            return false;
        }
    }
}
