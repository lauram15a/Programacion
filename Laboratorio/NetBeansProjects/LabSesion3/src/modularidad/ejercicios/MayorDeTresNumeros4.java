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
 * Repetir el ejercicio anterior con una versión que devuelva el mayor de tres números pero reutilizando
el método mayor de dos números.
* 
 */


public class MayorDeTresNumeros4 {
    
    public static void main (String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int n1;
        int n2;
        int n3;
        
        System.out.print("\nPrimer número: ");
        n1 = entrada.nextInt();
        System.out.print("\nSegundo número: ");
        n2 = entrada.nextInt();
        System.out.print("\nTercer número: ");
        n3 = entrada.nextInt();
        
        //Llamamos al método
        System.out.println("\nEl número mayor es " + mayor (n1, n2, n3));
    }
    
    public static int mayor (int n1, int n2, int n3){
        if (n1 < n2 && n3 < n2){   //n2
            return n2;
        } else if (n1 > n2 && n1 > n3){  //n1
            return n1;
        } else if (n3 > n1 && n3 > n2){  //n3
            return n3;
        } else{
            return n1;
        }
    }
    
}
