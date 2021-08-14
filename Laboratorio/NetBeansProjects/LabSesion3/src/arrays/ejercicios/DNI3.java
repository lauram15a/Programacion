/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.ejercicios;

import java.util.Scanner;

/**
 *
 * @author laura
 * 
 * Escribir un programa que sea capaz de calcular la letra de un NIF a partir del número del DNI. El
programa debe poseer al menos un método encargado de pedir al usuario el DNI de 8 dígitos y otro
que calculará la letra del NIF (se pueden añadir más métodos auxiliares). Al finalizar el programa se
debe presentar el NIF completo con el formato: ocho dígitos, un guion y la letra en mayúscula; por
ejemplo: 00395469-F. La letra se calculará de la siguiente forma: Se obtiene el resto de la división
entera del número del DNI entre 23 y se usa la siguiente tabla para obtener la letra que corresponde,
esta tabla debe estar almacenada en un array para buscar la letra por su posición.
* 
 */


public class DNI3 {
    
    public static void main (String[] args){
        
        Scanner entrada = new Scanner (System.in);
        
        int dni;
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
                
        System.out.print("DNI (sin letra): ");
        dni = entrada.nextInt();
        
        System.out.println (dni + " - " + letras[posicion(dni)]);
               
    }
    
    public static int posicion (int dni){
        return dni % 23;
    }
}
