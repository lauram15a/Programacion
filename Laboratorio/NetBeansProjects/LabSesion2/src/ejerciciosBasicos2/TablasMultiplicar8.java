/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosBasicos2;

/**
 *
 * @author laura
 * 
 * 
 */
public class TablasMultiplicar8 {
    
    public static void main (String[] args){
                
        for (int i = 1; i < 11; i++){
            System.out.println("\nTABLA DEL " + i);
            for (int j = 0; j < 11; j++){
                System.out.println(i + " * " + j + " = " + i*j);
            }
            
        }
    }
}
