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
Realizar un programa que calcule la longitud y el área de una circunferencia. La fórmula a aplicar será:
longitud = 2π * radio; área = π * radio2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
import java.text.DecimalFormat;

public class LongitudArea2 {
    
    public static void main (String[] args) throws IOException{
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        double radio;
        double longitud;
        double area;
        
        System.out.print("\nRadio: ");
        radio = Double.parseDouble(entrada.readLine());
        
        longitud = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);
        
        DecimalFormat decimal = new DecimalFormat("#.##");
        
        System.out.println("\nLongitud: " + decimal.format(longitud) + " m");
        System.out.println("\nÁrea: " + decimal.format(area) + " m^2");
    }
}
