/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos.ejercicios;

/**
 *
 * @author laura
 */
public class PruebaVehículos {

   
    public static void main(String[] args) {
        
        int marcha = 5;
        Vehiculo1 v1 = new Vehiculo1 ("2548888881L", "Nissan", "Qasqaui", marcha);
        
        v1.setLuces(true);
        v1.setVelocidad(marcha);
        
        //imprimimos los elementos del arrayList
        System.out.println ("Vehículo: " + v1.toString());
    }
    
}
