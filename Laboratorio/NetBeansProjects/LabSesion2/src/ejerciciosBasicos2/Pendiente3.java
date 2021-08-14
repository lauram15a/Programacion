/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosBasicos2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 *
 * @author laura
 */

/**
Realizar un programa que calcule la pendiente de una línea recta dada por dos puntos de la misma (x1,y1) y
(x2,y2). La fórmula a aplicar será: p = (y2-y1) / (x2-x1)
 */

public class Pendiente3 {
    public static void main (String[] args) throws IOException{
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        double x1;
        double y1;
        double x2;
        double y2;
        double pendiente;
        
        System.out.print("\nx1: "); 
        x1 = Double.parseDouble(entrada.readLine());
        
        System.out.print("\ny1: "); 
        y1 = Double.parseDouble(entrada.readLine());
        
        System.out.print("\nx2: "); 
        x2 = Double.parseDouble(entrada.readLine());
        
        System.out.print("\ny2: "); 
        y2 = Double.parseDouble(entrada.readLine());
        
        pendiente = (y2-y1) / (x2-x1);
        
        System.out.println("");
        
        //Controlar número de decimales
        DecimalFormat decimal = new DecimalFormat("#.##");
        System.out.println("Pendiente: " + decimal.format(pendiente));
        
    }
    
}
