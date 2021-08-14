/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lampara;

/**
 *
 * @author laura
 */
public class MainLampara {
    
    public static void main(String[] args) {
        
        Lampara lampara = new Lampara (4,true);
        
        //imprimimos los elementos del arrayList
        System.out.println ("Lámpara original: " + lampara.toString());
        
        //probamos cosis      
        lampara.setIntensidad(50);
        System.out.println ("Lampara 2: " + lampara.toString());
        
        lampara.setIntensidad(1.5);
        System.out.println ("Lampara 3: " + lampara.toString());
        
        lampara.setEncendida(false);
        System.out.println ("Lampara 1: " + lampara.toString());
        
    }
    
}
