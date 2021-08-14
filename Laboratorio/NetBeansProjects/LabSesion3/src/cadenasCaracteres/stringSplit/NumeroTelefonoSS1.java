/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenasCaracteres.stringSplit;

import java.util.Scanner;

/**
 *
 * @author laura
 * 
 * Escribir un programa al que se le pasa un número de teléfono de la forma: 91-8885566. El programa
deberá usar la clase StringTokenizer para extraer el código de la comunidad y el resto del número,
convertir el código de la comunidad en int y el resto en long, y presentarlo por pantalla.
* 
 */

public class NumeroTelefonoSS1 {
    
    public static void main (String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        String telf;
        int prefijo;
        long num;
        
        System.out.println("\nNum teléfono (ej: 91-8885566): ");
        telf = entrada.nextLine();
        
        String telefono[] = telf.split("-");
        
        prefijo = Integer.parseInt(telefono[0]);
        num = Long.parseLong(telefono[1]);
        
        System.out.println("Prefijo: " + prefijo + "\nNúmero: " + num);
    }
}
