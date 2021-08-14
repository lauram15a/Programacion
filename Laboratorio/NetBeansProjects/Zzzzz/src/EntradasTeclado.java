/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author laura
 */
public class EntradasTeclado {
     public static void main (String[] args){
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); //para introducir los decimales con punto y no con coma
        
        int entero;
        double decimal;
        String cadena;
        char caracter;
        
        //int
        System.out.print("Entero: ");
        entero = entrada.nextInt();
        
        //double
        System.out.print("Decimal: ");
        decimal = entrada.nextDouble();
        
        //String
        System.out.println("Cadena: ");
        cadena = entrada.nextLine();
        
        //char
        System.out.print("Caracter: ");
        caracter = entrada.next().charAt(0);  //Pedir el caracter
     }
}
