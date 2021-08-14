/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOconJava.metodosEstaticos;

/**
 *
 * @author laura
 * 
 * Construir una clase en Java que haga uso de la clase anterior y que sume 2+3, y multiplique el resultado
por 8:
 */

public class PruebaOperaciones2 {
    
    public static void main (String[] args){
        
        System.out.println(Operaciones1.multiplica(Operaciones1.suma(2, 3), 8));
    }
}
