/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosPropuestos2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 *
 * @author laura
 * 
 * Programa que pida tres números y calcule el área del triángulo que forman.
 * 
 */
public class AreaTriangulo4 {
    
    public static void main (String[] args) throws IOException{
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        double l1;
        double l2;
        double l3;
        boolean condicion;
        double altura;
        double area;
        
        
        System.out.print("\nLado 1: ");
        l1 = Double.parseDouble(entrada.readLine());
        
        System.out.print("\nLado 2: ");
        l2 = Double.parseDouble(entrada.readLine());
        
        System.out.print("\nLado 3: ");
        l3 = Double.parseDouble(entrada.readLine());
        
        //Comprobar si es un triángulo o no 
        if (l1 < (l2 + l3)){
            if (l2 < (l1 + l3)){
                if (l3 < (l2 + l1)){
                    condicion = true;                    
                }
                else{
                    condicion = false;
                }
            }
            else{
                condicion = false;
            }
        }
        else{
            condicion = false;
            
        }
        
        
        //Calcular área
        if (condicion == true){
            altura =  Math.sqrt(Math.pow(l2, 2) - Math.pow(l3/2, 2));
            area = l3 * altura / 2;
            System.out.println("\nÁrea = " + Math.round(area) + " m^2");
        }
        else{
            System.out.println("\nNo es un triángulo.");
        }
    }
}
