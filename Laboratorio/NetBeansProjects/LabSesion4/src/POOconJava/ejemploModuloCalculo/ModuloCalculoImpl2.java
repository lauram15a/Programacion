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
 * Construir una clase en Java que implemente la interface anterior:
 */

public class ModuloCalculoImpl2 implements ModuloCalculo1{
    
    public double suma (double a, double b){
        return a + b;
    }
    
    public double resta (double a, double b){
        return a - b;
    }
    
    public double multiplica (double a, double b){
        return a * b;
    }
    
    public double divide (double a, double b){
        return a / b;
    }
}
