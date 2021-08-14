/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosBasicos2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author laura
 */
public class ParImpar5 {
    public static void main (String[] arg) throws IOException{
        
        BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
        
        int numero;
        
        System.out.print("\nIntroduce un número: ");
        numero = Integer.parseInt(entrada.readLine());
        
        if (numero % 2 != 0){
            System.out.println("\n" + numero + " es impar.");
        }
        if (numero % 2 == 0){
            System.out.println("\n" + numero + " es par.");
        }
    }
}
