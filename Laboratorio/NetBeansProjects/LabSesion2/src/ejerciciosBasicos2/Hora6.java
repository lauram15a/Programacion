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
public class Hora6 {
    
    public static void main (String[] args) throws IOException{
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        int hora;
        int minutos;
        int segundos;
        
        System.out.print("\nHora: ");
        hora = Integer.parseInt(entrada.readLine());
        
        System.out.print("\nMinutos: ");
        minutos = Integer.parseInt(entrada.readLine());
        
        System.out.print("\nSegundos: ");
        segundos = Integer.parseInt(entrada.readLine());
        
        segundos += 1;
        
        if (segundos > 59){
            minutos += 1;
            segundos = 0;
        }
        if (minutos > 59){
            hora += 1;
            minutos = 0;
        }
        
        if (hora < 10 || minutos < 10 || segundos < 10){
            if (segundos < 10){
                if (minutos < 10){
                    if (hora < 10){
                        System.out.println("\n0" + hora + " : 0" + minutos + " : 0" + segundos);
                    }
                    else{
                        System.out.println("\n" + hora + " : 0" + minutos + " : 0" + segundos);
                    }
                }
                else{
                    System.out.println("\n" + hora + " : " + minutos + " : 0" + segundos);
                }  
            }
            else{
                if (minutos < 10){
                    if (hora < 10){
                        System.out.println("\n0" + hora + " : 0" + minutos + " : " + segundos);
                    }
                    else{
                        System.out.println("\n" + hora + " : 0" + minutos + " : " + segundos);
                    }
                }
                else{
                    System.out.println("\n0" + hora + " : " + minutos + " : " + segundos);
                }  
            } 
        }
        else{
            System.out.println("\n" + hora + " : " + minutos + " : " + segundos);
        }
      
        
    }
}
