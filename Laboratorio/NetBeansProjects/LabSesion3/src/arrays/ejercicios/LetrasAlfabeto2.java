/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.ejercicios;

import java.util.Random;

/**
 *
 * @author laura
 * 
 * Escribir un programa que genere 50 números enteros aleatorios entre el 97 y el 122 que representarán
las letras del alfabeto (exceptuando la ñ), los almacene en un array de caracteres, y cuente cuantas
vocales se han generado. Nota: para pasar del código entero a carácter se utiliza: char c = (char)
numero;
* 
 */

public class LetrasAlfabeto2 {
    
    public static void main (String[] args){
        
        Random aleatorio = new Random();
        
        char numeros[] = new char [50];
        int vocales = 0;
        
        //Rellenar numeros[][]
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = (char) (aleatorio.nextInt((122 - 97) + 1) + 97);
            if (numeros[i] == 'a' || numeros[i] == 'e' || numeros[i] == 'i' || numeros[i] == 'o' || numeros[i] == 'u'){
                vocales += 1;
            }
        }
        System.out.println(numeros);
        System.out.println("Hay " + vocales + " vocal(es).");
        
    }
}
