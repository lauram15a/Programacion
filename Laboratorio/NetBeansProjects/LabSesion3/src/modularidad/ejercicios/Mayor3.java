/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularidad.ejercicios;

import java.util.Scanner;
import static modularidad.ejercicios.SoloPares2.imprimir;

/**
 *
 * @author laura
 * 
 * Realizar un programa que determine cuál es el mayor de dos números. El programa tendrá un
método mayor que recibirá dos valores de tipo entero y devolverá cual es el mayor. Desde el método
main se pedirá al usuario los valores y se llamará al método mayor.
* 
 */
public class Mayor3 {
    
    public static void main (String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int n1;
        int n2;
        
        System.out.print("\nPrimer número: ");
        n1 = entrada.nextInt();
        System.out.print("\nSegundo número: ");
        n2 = entrada.nextInt();
        
        //Llamamos al método
        System.out.println("\nEl número mayor es " + mayor (n1, n2));
    }
    
    public static int mayor (int n1, int n2){
        if (n1 < n2){
            return n2;
        } else if (n1 > n2){
            return n1;
        } else {
            return n1;
        }
    }
    
}
