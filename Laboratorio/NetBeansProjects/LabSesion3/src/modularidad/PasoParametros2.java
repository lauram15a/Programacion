/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularidad;

/**
 *
 * @author laura
 * 
 * Paso de parámetros por valor y por referencia
 * 
 */

public class PasoParametros2 {
    
    static String global = "global";
    
    public static void main (String[] args){
        
        int num = 1;                            //por valor
        int numeros[] = {1, 2, 3, 4, 5};        //los arrays se pasan por referencia
        String cadena = "abc";                  // por valor
        
        System.out.println("\n--------------ANTES--------------\n");
        
        System.out.println("\nNúmero antes de la llamada al método: " + num);
        System.out.println("\nArray antes de la llamada al método:");
        
        for (int i=0; i<5; i++) {
            System.out.print(" "+numeros[i]);
        }
        
        System.out.println("\nCadena antes de la llamada al método:"+cadena);
        System.out.println("\nGlobal antes de la llamada al método:"+global); 
        
        //llamamos al método
        convierte(num, numeros, cadena);
        
        System.out.println("\n--------------DESPUÉS--------------\n");
        
        System.out.println("\nNúmero después de la llamada al método:" + num);
        System.out.println("\nArray después de la llamada al método:");
        for (int i=0; i<5; i++) {
            System.out.print(" "+numeros[i]);
        }
        
        System.out.println("\nCadena después de la llamada al método:" + cadena);
        System.out.println("\nGlobal después de la llamada al método:" + global);
    }
    
    public static void convierte(int num, int numeros[], String cadena) {
        
        num += 1;
        
        //sumamos 1 al array de enteros
        
        for (int i=0; i<5; i++) {
            numeros[i] += 1;
        }
        cadena = "def";         //no se cambia porque no es mutable
        global = "nueva";
    
    }
}
