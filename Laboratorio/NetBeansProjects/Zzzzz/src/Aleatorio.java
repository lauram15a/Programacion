
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */
public class Aleatorio {
    
    public static void main (String[] args){
        
        Random aleatorio = new Random();
        
        int entero;
        double decimal;
        
        entero = aleatorio.nextInt(501) + 1000;  //Rango aleatorios int  (de 1000 a 1500)
        decimal = aleatorio.nextDouble() + 0.5;   //Rango aleatorios double
        
        int valorDado = aleatorio.nextInt(6)+1;  // Entre 0 y 5, más 1.
        
        //resultado = aleatorio.nextInt((maximo - minimo) + 1) + minimo;   !!!!!!!!!!!!!!
    }
}
