/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */
public class Int {
    
    public static void main (String[] args){
        
        int n = 0;
        int sumatorio = 0;
        int dni = 0; 
        
        
        //sumar las cifras de un numero (de 8 cifras)
        while (n < 8){
            n += 1;
            sumatorio += dni % 10;
            dni = dni / 10;
        }
    }
}
