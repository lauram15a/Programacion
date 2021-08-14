/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author laura
 */
public class Arrays {
    
    public static void main (String[] args){
        
        //creamos array
        int arrayint[] = new int [3];
        char arraychar [] = {'a', 'b', 'c'};
        
        //rellenamos el array de enteros
        for (int i = 0; i < arrayint.length; i++){
            arrayint[i] = i;
        }
        
        //imprimimos su valor
        for (int i = 0; i < arrayint.length; i++) {
            System.out.println("arrayint[" + i + "]: " + arrayint[i]);
        }

        //incrementamos en 1 cada valor
        for (int i = 0; i < arrayint.length; i++) {
            arrayint[i] += 1;
            System.out.println("arrayint[" + i + "]: " + arrayint[i]);
        }

        //incrementamos en 1 cada letra
        for (int i = 0; i < arraychar.length; i++) {
            arraychar[i] += 1;
        }
        
        //imprimimos su valor
        for (int i = 0; i < arraychar.length; i++) {
            System.out.println("arraychar[" + i + "]: " + arraychar[i]);
        }
    }
}
