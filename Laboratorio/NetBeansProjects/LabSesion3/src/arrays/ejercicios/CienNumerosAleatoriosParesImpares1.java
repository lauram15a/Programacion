/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author laura
 * 
 * Escribir un programa que genere 100 números enteros aleatorios entre el 1 y el 500, los almacene en
un array, los ordene y a continuación genere un array de caracteres que contenga una ‘p’ en las
posiciones donde hay números pares y una ‘i’ en los impares. Mostrar el contenido de ambos arrays
en filas de 10 elementos formados por pares de número y letra.
* 
 */

public class CienNumerosAleatoriosParesImpares1 {
    
    public static void main (String[] args){
        
        Scanner entrada = new Scanner (System.in);
        Random aleatorio = new Random();
        
        int [] numeros = new int [100];
        String[]letras = new String[100];
        
        //Rellenar numeros[][]
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = aleatorio.nextInt(501);
        }
        //Ordenamos numeros[][]
        Arrays.sort(numeros);
        
        //Rellenar letras[][]
        for (int i = 0; i < letras.length; i++){
            if (numeros[i] % 2 == 0){
                letras[i] = " p";
            } else {
                letras[i] = " i";                    
            }
        }
        
        //Imprimir
        for (int i = 0; i < numeros.length; i++){
            if ((i + 1) % 10 == 0){   //Salto de linea al haber ya 10 elementos en una fila
                System.out.println(numeros[i] + letras[i] + " - ");
            } else {
                System.out.print(numeros[i] + letras[i] + " - ");
            }
        }
        
    }
}
