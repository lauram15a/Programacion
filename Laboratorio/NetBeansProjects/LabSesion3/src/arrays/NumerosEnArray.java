/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.*;

/**
 *
 * @author laura
 * 
 * genera de forma aleatoria 10 números entre el 0 y el 15 (haciendo uso de la clase Random) y a continuación
nos indica que introduzcamos un número y comprueba si ese número está en el array (utilizando la clase
Arrays)
* 
 */
public class NumerosEnArray {
    
    public static void main (String[] args){
        
        Scanner entrada = new Scanner (System.in);
        Random rand = new Random();
        
        int num;
        int numeros[] = new int [10];  //creamos array de 10 elementos al que se le van a introducir ints
        boolean adivinado = false;
        
        //generamos números aleatorios entre el 0 y el 15
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = rand.nextInt (16);
        }
        
        //ordenamos array
        Arrays.sort(numeros);
        
        //pedimos el número
        System.out.print("Introduzca el número (0 - 15): ");
        num = entrada.nextInt();
        
        //llamamos al método
        adivinado = adivinado (numeros, num);
        
        if (adivinado) {  //if adivinado == true
            System.out.println("\nNúmero adivinado");
        } else{
            System.out.println("\nNúmero NO adivinado"); 
        }
        
        //imprimimos todos los números
        System.out.println("\nTodos los números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(" " + numeros[i]);
        }
    }
    
    public static boolean adivinado(int numeros[], int num) {
        return (Arrays.binarySearch(numeros, num) >= 0);
    }
    
}
