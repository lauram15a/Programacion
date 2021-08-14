/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.ejercicios;

import java.util.Random;

/**
 *
 * @author laura
 * 
 * Realizar un programa que se encargue de crear una matriz de 3 filas por 20 columnas que
representará los sueldos de los empleados de una empresa. En la primera fila se deben generar 20
números decimales aleatorios entre 0 y 300.000 € representando los salarios brutos de los empleados,
la segunda fila representará la retención de estos salarios, calculada a partir de la siguiente tabla y por
último la tercera fila representará el salario neto, es decir, el salario bruto menos la retención.
Presentar por pantalla los datos de la matriz con la información de cada empleado. Ejemplo: Sueldo
del empleado 0: SB: 113763.05745992783 - R: 53468.63700616608 - SN: 60294.420453761755
* 
 */

public class Salarios4 {
    
    public static void main (String[] args){
        
        Random aleatorio = new Random();
        
        double [][] salarios = new double [3][20];
        double retencion = 0; 
        
        for (int i = 0; i < 20; i++){
            salarios[0][i] = aleatorio.nextDouble() * 300001;  //Fila 1 --> salario
            if (salarios[0][i] > 0 && salarios[0][i] < 17708){
                retencion = 0.24 * salarios[0][i];
            } else if (salarios[0][i] > 17707 && salarios[0][i] < 33008){
                retencion = 0.30 * salarios[0][i];
            } else if (salarios[0][i] > 33007 && salarios[0][i] < 53408){
                retencion = 0.40 * salarios[0][i];
            } else if (salarios[0][i] > 53407 && salarios[0][i] < 120001){
                retencion = 0.47 * salarios[0][i];
            } else if (salarios[0][i] > 120000 && salarios[0][i] < 175001){
                retencion = 0.49 * salarios[0][i];
            } else if (salarios[0][i] > 175000 && salarios[0][i] < 300001){
                retencion = 0.51 * salarios[0][i];
            }
            
            salarios[1][i] = retencion;  //Fila 2 --> retencion
            
            salarios[2][i] = salarios[1][i] - salarios[2][i];
        }
        
        for (int i = 0; i < 20; i++){
            System.out.println("\nSueldo del empleado " + i + ": SB: " + salarios[0][i] + " - R: " + salarios[1][i] + " - SN: " + salarios[2][i]);
        }
        
        System.out.println("\n______________________________________________________________________________________________________________________________");
        
        for (int i = 0; i < 20; i++){
            System.out.println("\nSueldo del empleado " + i + ": SB: " + salarios[0][i] + " - R: " + salarios[1][i] + " - SN: " + salarios[2][i]);
        }
    }
        
}
