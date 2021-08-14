/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularidad.ejercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author laura
 * 
 * Realizar un programa que permita simular una calculadora. El programa tendrá un método
calculadora que recibirá dos valores de tipo double y un carácter que indicará la operación a realizar
(+,-,*,/). Desde el método main se pedirá al usuario los valores y la operación y se llamará al método
calculadora.
* 
 */

public class Calculadora5 {
    
    public static void main (String[] args){
        
        Scanner entrada = new Scanner (System.in);
        entrada.useLocale(Locale.US);
        
        double n1;
        double n2;
        char caracter;
        double resultado;
        
        System.out.println("----CALCULADORA----");
        System.out.print("\nInstrucciones: \nn1 - intro - caracter (+,-,*,/) - intro - n2 - intro\n");
        
        System.out.print("\n  ");
        n1 = entrada.nextDouble();
        System.out.print("");
        caracter = entrada.next().charAt(0);  //Pedir el caracter
        System.out.print("  ");
        n2 = entrada.nextDouble();
        
        //Llamamos al método
        resultado = calculadora (n1, n2, caracter);
        
        if (resultado != 0){
            System.out.println("________");
            System.out.println("  " + resultado);
        } else{
            System.out.println("Operación no disponible");
        }
    }
    
    public static double calculadora (double n1, double n2, char caracter){
        
        double resultado;
        
        if (caracter == '+'){
            resultado = n1 + n2;
        } else if (caracter == '-'){
            resultado = n1 - n2;
        } else if (caracter == '*'){
            resultado = n1 * n2;
        } else if (caracter == '/'){
            resultado = n1 / n2;
        } else {
            resultado = 0;
        }
        
        return resultado;
    }
}
