/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosPropuestos2;

import java.util.Scanner;

/**
 *
 * @author laura
 * 
 * Programa que pida un entero n e imprima el primer número primo >=n.
 * 
 */
public class PrimoMayor9 {
    
    public static void main (String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int n;
        boolean primo;
        
        System.out.print("\nIntroduce un número: ");
        //lectura de un int
        n = entrada.nextInt();
        
        if (n == 0 || n == 1){
            primo = false;
        } else if (n == 2 || n == 3 || n == 5 || n == 7){
            primo = true;
        } else if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0|| n % 7 == 0){
            primo = false;
        } else{
            primo = true;
        }
        
        if (primo == true){
            System.out.println(n);
        } else{
            while (primo != true){
                n += 1;
                if (n == 0 || n == 1){
                    primo = false;
                } else if (n == 2 || n == 3 || n == 5 || n == 7){
                    primo = true;
                } else if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0|| n % 7 == 0){
                    primo = false;
                } else{
                    primo = true;
                }
            }
            System.out.println(n);
        }
        
    }
}
