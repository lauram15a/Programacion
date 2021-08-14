/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Random;

/**
 *
 * @author laura
 */
public class Randoom {
    
    public static void main (String[] args){
        
        int temperaturas[] = new int [5];
        Random rand = new Random();
        int media, total = 0;
        
        for (int i = 0; i < temperaturas.length; i++){
            temperaturas[i] = rand.nextInt(31);  //número aleatorio entre el 0 y el 30
            
        }
        
        //imprimimos las temperaturas
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("temperaturas[" + i + "]: " + temperaturas[i]);
        }
        
        //calculamos la media
        for (int i = 0; i < temperaturas.length; i++) {
            total += temperaturas[i];
        }
        
        media = total / temperaturas.length;
        System.out.println("\nTemperatura media: " + media);
        
    }
}
