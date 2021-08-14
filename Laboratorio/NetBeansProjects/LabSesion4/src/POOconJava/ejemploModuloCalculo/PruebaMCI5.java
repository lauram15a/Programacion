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
 * Construir una clase en Java que haga uso de la clase anterior y que sume 2+3, y calcule el módulo de la
división por 3:
 */

public class PruebaMCI5 {
    
    public static void main (String[] args){
        ModuloCalculoImpl4 mci2 = new ModuloCalculoImpl4();
        System.out.println (mci2.modulo(mci2.suma(2, 3), 3));
    }
}
