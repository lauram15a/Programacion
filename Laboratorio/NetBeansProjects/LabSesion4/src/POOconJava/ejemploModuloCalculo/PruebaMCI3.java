/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOconJava.ejemploModuloCalculo;

/**
 *
 * @author laura
 * 
 * Construir una clase en Java que haga uso de la clase anterior y que sume 2+3, y multiplique el resultado
por 8:
 */

public class PruebaMCI3 {
    
    public static void main (String[] args){
        
        ModuloCalculoImpl2 mci = new ModuloCalculoImpl2();
        System.out.println(mci.multiplica(mci.suma(2, 3), 8));
    }
}
