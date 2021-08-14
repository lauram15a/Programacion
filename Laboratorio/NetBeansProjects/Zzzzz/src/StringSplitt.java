

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */

// puede ser usado para dividir una cadena en sus tokens básicos.

public class StringSplitt {
    
    public static void main (String [] args){
        
        String[] result = "Esto es¿ una -prueba".split("\\s");
       
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        } 
    }
    
}
   
