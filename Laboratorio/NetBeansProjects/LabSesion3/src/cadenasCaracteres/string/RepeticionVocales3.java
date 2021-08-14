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
 * Escribir un programa que nos diga cuantas veces se repiten cada una de las vocales en una cadena
que el usuario introduce por teclado.
* 
 */

public class RepeticionVocales3 {
    
    public static void main(String[] args) {
        
            Scanner entrada = new Scanner(System.in);
            String cadena;
            char letras[]={'a', 'e', 'i', 'o', 'u'};
            
            System.out.println("Introduzca la cadena de vocales que desee:s");
            cadena = entrada.nextLine();
            cadena = cadena.toLowerCase();  //pasar a minúsculas
           
            for (int i=0; i < letras.length; i++){
                System.out.println("\nLa vocal " + letras[i] + " aparece " + contador(letras[i],cadena) + " veces");
            }

    }
    
    public static int contador(char letra, String cadena){
        
        
        int pos;
        int cont = 0;
        
        for (int i=0; i <= cadena.length(); i = pos + 1){
            pos = cadena.indexOf(letra,i);
            if (pos == -1){
                pos=cadena.length()+1;
            } else{
                cont++;
            }
        }
        
        return cont;
    
    }
        
}