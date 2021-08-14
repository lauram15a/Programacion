/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenasCaracteres.string;

import java.util.Scanner;

/**
 *
 * @author laura
 * 
 * Escribir un programa que reciba un NIF con 9 caracteres (ej. 00395469F) y nos diga si la letra es
correcta.
* 
 */


public class NIFLetra4 {
    
    public static void main (String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        String nif;
        String letra;
        String numeroString;
    
        System.out.println("\nNIF (ej. 00395469F): ");
        nif = entrada.nextLine();
        
        letra = nif.substring(8);
        letra = letra.toUpperCase(); //pasamos la letra a mayúscula 
        
        numeroString = nif.substring(0, 8);
        int numero = Integer.parseInt(numeroString);
        
        if (conversion(numero, letra)){
            System.out.println("Letra correcta.");
        } else{
            System.out.println("Letra incorrecta.");
        }
    
    }
    
    public static boolean conversion (int numero, String letra){
        
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int resto;
        
        resto = numero % 23;
        
        if (letras[resto].equals(letra)){
            return true;
        } else{
            return false;
        }
        
    }
    
}
