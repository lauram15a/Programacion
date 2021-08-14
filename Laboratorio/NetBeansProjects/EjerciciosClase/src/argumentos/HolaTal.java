/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argumentos;

/**
 *
 * @author laura
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HolaTal {
    
    public static void main (String[] args) throws IOException{
        
        BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
        
        String nombre;
        
        Scanner Entrada = new Scanner (System.in);
        
        System.out.println("\nIntroduce tu nombre: ");
        nombre = entrada.readLine();
        
        System.out.println("Hola " + nombre);
    }
}
