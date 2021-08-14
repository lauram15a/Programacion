/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcamiento;

import java.time.LocalDateTime;
import java.time.Month;

/**
 *
 * @author laura
 */
public class MainAparcamiento2 {

    
    public static void main(String[] args) {
        LocalDateTime diaHora = LocalDateTime.of(2019, Month.FEBRUARY, 19, 10, 59, 59);
        Automovil a1 = new Automovil("1111-AAA", diaHora, true, "turismo");
        Automovil a2 = new Automovil("2222-BBB", diaHora, false, "todoterreno");
        Automovil a3 = new Automovil("3333-CCC", diaHora, false, "furgoneta");
        
        Camion c1 = new Camion("4444-DDD", diaHora, true, 4);
        Camion c2 = new Camion("5555-EEE", diaHora, false, 3);
        Camion c3 = new Camion("6666-FFF", diaHora, false, 5);
        
        System.out.println(Aparcamiento.intoducirVehiculo(a1));
        System.out.println(Aparcamiento.intoducirVehiculo(a2));
        System.out.println(Aparcamiento.intoducirVehiculo(a3));
        
        System.out.println(Aparcamiento.intoducirVehiculo(c1));
        System.out.println(Aparcamiento.intoducirVehiculo(c2));
        System.out.println(Aparcamiento.intoducirVehiculo(c3));
        
        System.out.println("Vehículos: "+ Aparcamiento.getMatriculasVehiculos().toString());
        System.out.println(Aparcamiento.sacarVehiculo(a1.getMatricula()));
        System.out.println("Vehículos: "+ Aparcamiento.getMatriculasVehiculos().toString());
        System.out.println(Aparcamiento.sacarVehiculo(a2.getMatricula()));
        System.out.println("Vehículos: "+ Aparcamiento.getMatriculasVehiculos().toString());
        System.out.println(Aparcamiento.sacarVehiculo(a3.getMatricula()));
        System.out.println("Vehículos: "+ Aparcamiento.getMatriculasVehiculos().toString());
        System.out.println(Aparcamiento.sacarVehiculo(c1.getMatricula()));
        System.out.println("Vehículos: "+ Aparcamiento.getMatriculasVehiculos().toString());
        System.out.println(Aparcamiento.sacarVehiculo(c2.getMatricula()));
        System.out.println("Vehículos: "+ Aparcamiento.getMatriculasVehiculos().toString());
        System.out.println(Aparcamiento.sacarVehiculo(c3.getMatricula()));
        System.out.println("Vehículos: "+ Aparcamiento.getMatriculasVehiculos().toString());
    }
    
}
