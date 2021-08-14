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
 */
public class LetraEnPalabra2 {

    public static void main(String[] args) {
        
        
            Scanner entrada = new Scanner(System.in);
            String cadena;
            char letra;
            int pos;
            
            System.out.println("Introduzca la frase que desee");
            cadena = entrada.nextLine();
            
            System.out.println("Intruduzca la letra que desee");
            letra= entrada.next().charAt(0);
            
            int num = cadena.length();
            
            for (int i=0; i <= cadena.length(); i = pos + 1){
                pos = cadena.indexOf(letra,i);
                if (pos ==  -1){
                    pos = cadena.length()+1;
                }
                else{
                    System.out.println("La letra se encuentra en la posicion: " + pos);
                }
            }
    }
}