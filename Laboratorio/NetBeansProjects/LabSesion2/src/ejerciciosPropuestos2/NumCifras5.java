/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosPropuestos2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author laura
 * 
 * Programa que pida un entero y devuelva el número de cifras que lo componen.
 */

public class NumCifras5 {
    
    public static void main (String[] args) throws IOException{
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        int n;
        int contador = 0;
        int nInicial;
        
                
        System.out.print("\nNúmero: ");
        n = Integer.parseInt(entrada.readLine());
        
        nInicial = n;
        
        while (n > 0){
            n /= 10;
            contador += 1;
        }
        
        System.out.println(nInicial + " tiene " + contador + " cifras.");
    }
}
