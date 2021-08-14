/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcamiento;

import java.util.ArrayList;

/**
 *
 * @author laura
 */
public class Aparcamiento {
    
    private static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    private final static int cantidad = 20;
    private static int numero = 0;
    
    public static ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    
    public static ArrayList<String> getMatriculasVehiculos() {
        ArrayList<String> matriculas = new ArrayList<>();
        for (Vehiculo v : vehiculos){
            matriculas.add(v.getMatricula());
        }
        return matriculas;
    }
    
    public static String introducirVehiculo (Vehiculo v){
        if (vehiculos.contains(v)){  //sí está dentro
            return "El vehículo ya se encuentra en el aparcamiento";
        } else if (numero == cantidad){
            return "El aparcamiento está lleno";
        } else {
            numero ++;  //numero += 1
            vehiculos.add(v);
            return "Vehículo aparcado: " + v.toString();
        }
    }
    
    public static String sacarVehiculo (Vehiculo v){
        if (!Aparcamiento.getVehiculos().contains(v)){ //no está dentro
            return "El vehículo no se encuentra en el aparcamiento";
        } else {
            double precio = v.calcularImporte();
            numero --; //numero -= 1
            vehiculos.remove(v);
            return "Vehículo con matrícula " + v.getMatricula() + " retirado con precio: " + precio + " €";
        }
    } 
    
    public static String sacarVehiculo (String matricula){
        boolean dentro = false;
        Vehiculo ve = null;
        for (Vehiculo v : vehiculos){
            if (v.getMatricula().equals(matricula)){
                ve = v;
                dentro = true;
            }
        }
        if (!dentro) { //no está dentro
            return "El vehículo no se encuentra en el aparcamiento";
        } else {
            double precio = ve.calcularImporte();
            numero --;
            vehiculos.remove(ve);
            return "Vehículo con matrícula " + ve.getMatricula() + " retirado con precio: " + precio + " €";
        }
    }
    
}
