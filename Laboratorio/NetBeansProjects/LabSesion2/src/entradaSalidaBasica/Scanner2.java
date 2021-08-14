/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradaSalidaBasica;

/**
 *
 * @author laura
 */

import java.util.Locale;
import java.util.Scanner;

public class Scanner2 {
    
    public static void main (String[] args){
        //Objeto para leer una cadena del teclado                     
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); //para introducir los decimales con punto y no con coma
        
        String cadena;
        int entero;
        double decimal;
        char caracter;
        
        //String
        System.out.println("\nCadena: ");
        cadena = entrada.nextLine();
        
        //int
        System.out.println("\nIEntero: ");
        entero = entrada.nextInt();

        //double
        System.out.println("\nDecimal: ");
        decimal = entrada.nextDouble();
        
        
        //char
        System.out.println("\nCaracter");
        caracter= entrada.next().charAt(0);
        
    }
}
