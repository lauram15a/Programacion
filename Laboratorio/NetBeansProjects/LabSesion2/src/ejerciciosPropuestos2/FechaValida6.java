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
 * Programa que, dados tres números enteros que recogen la información del día, mes y año de una
fecha, determine si es una fecha válida, considerando los años bisiestos.
 */

public class FechaValida6 {
    
    public static void main (String[] args) throws IOException{
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        int dia;
        int mes;
        int anio;
        boolean condicion = true;
        
        System.out.print("\nDía: ");
        dia = Integer.parseInt(entrada.readLine());
        
        System.out.print("\nMes: ");
        mes = Integer.parseInt(entrada.readLine());
        
        System.out.print("\nAño: ");
        anio = Integer.parseInt(entrada.readLine());
        
        //Validar fecha
        if (dia < 0 || dia > 31){
            condicion = false;
        }
        
        
        if (mes < 1 || mes > 12){
            condicion = false;
        }
        
        
        if (dia == 31){
            if (mes != 1 || mes != 3 || mes != 5 || mes != 7 || mes != 8 || mes != 10 || mes != 12){
                condicion = false;
            }
        }
        else{
            if (dia == 30){
                if (mes == 2){
                condicion = false;
                }
            }
            else{
                if (dia == 29){
                    if (mes == 2){
                        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
                            condicion = true;
                        }
                        else{
                            condicion = false;
                        }
                    }
                }
            }
        }
        
        //Mensaje pantalla
        System.out.println("\n" + dia + " - " + mes + " - " + anio);
        
        if (condicion == true){
            System.out.println("\nFecha válida");
        }
        else{
            System.out.println("\nFecha no válida");
        }
    }
}
