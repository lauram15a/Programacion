/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosBasicos2;

import java.util.Random;

/**
 *
 * @author laura
 * 
 * Realizar un programa para calcular las ganancias anuales de una explotación ganadera que vende leche. El
programa generará de forma aleatoria para cada mes una cantidad de litros de leche entre 1000 y 1500 y un
precio de venta entre 0.5 y 1.5 y los almacenará en un array de 2x12 para facilitar el cálculo.
* 
 */
public class AleatorioArray10 {
    
    public static void main(String args[]) {
        
        double datos[][] = new double[2][12];  //crear array
        Random rand = new Random();
        double ganancias = 0;
        
        for (int i = 0; i < datos[0].length; i++) {
            datos[0][i] = rand.nextInt(501) + 1000;  //Rango aleatorios int
            datos[1][i] = rand.nextDouble() + 0.5;   //Rango aleatorios double
        }
        
        for (int i = 0; i < datos[0].length; i++) {
            System.out.print(datos[0][i] + " - " + datos[1][i] + "\n");
        }
        
        for (int i = 0; i < datos[0].length; i++) {
            ganancias += datos[0][i] * datos[1][i];
        }
        
        System.out.println("\nGanancias: " + ganancias);
        
    }
}
