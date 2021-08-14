/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosBasicos2;

/**
 *
 * @author laura
 */

/**
Realizar un programa que pida como entrada un número decimal y lo muestre redondeado al entero más
próximo. Ejemplos: 2,3 se redondea a 2 y 4,8 se redondea a 5.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Redondeo1 {
    public static void main (String[] args) throws IOException{
        
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        
        double numero;
        
        System.out.print("\nIntroduce un número: ");
        numero = Double.parseDouble(entrada.readLine());
        
        //Redondeo
        System.out.print("Redondeo: ");
        System.out.println(Math.round(numero));
        
        //Parte entera + 1
        System.out.print("Hacia arriba: ");
        System.out.println(Math.ceil(numero));
        
        //Parte entera
        System.out.print("Hacia abajo: ");
        System.out.println(Math.floor(numero));
               
        
    }
    
}
