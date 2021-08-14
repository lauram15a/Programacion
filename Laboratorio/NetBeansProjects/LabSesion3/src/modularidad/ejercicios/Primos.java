/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularidad.ejercicios;

/**
 *
 * @author laura
 */
public class Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n = 2;
        int num = 6;
        int numero = 15;
        int numeroo = 17;
        
        mensaje (n);
        mensaje (num);
        mensaje (numero);
        mensaje (numeroo);
    }
    
    public static boolean esPrimo (int n) {
        
        if (n < 1) {
            return false;
        } else if ( (n == 1 || n == 2)){
            return true;
        } else {
            int m = 0;
            for (int i = 2; i < n; i++){
                if (n % i == 0){
                    m++;
                } 
            }
            if (m == 0){
                return true;
            } else {
                return false;
            }
        }
    }
    
    public static void mensaje (int n){
        
        if (esPrimo(n)){
            System.out.println(n + " sí es primo");
        } else {
            System.out.println(n + " no es primo");
        }
    }
    
}
