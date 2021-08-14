/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author laura
 */
public class MainTaller {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
                
        int horas;
        double precioTotal;
        
        System.out.print("Horas: ");
        horas = entrada.nextInt();
        
        //creamos pieza
        Pieza p1 = new Pieza ("Volante", 48.61);
        Pieza p2 = new Pieza ("Rueda", 50);
        Pieza p3 = new Pieza ("REtrovisor", 35.50);
        
        //creamos arraylist piezas
        Pieza [] array1 = new Pieza[] {};
        Pieza [] array2 = new Pieza[] {}; 
        
        
        //creamos vehículo
        Vehiculo v1 = new Vehiculo ("4424FRH", "Nissan", "Qashqai", array1);
        Vehiculo v2 = new Vehiculo ("0007HYK", "Renault", "Capture", array2);
        
        
        //utilizamos la función añadirPieza
        v1.añadirPiezas(p3);
        v2.añadirPiezas(p2);
        v2.añadirPiezas(p1);
        v1.añadirPiezas(p2);
        
        //creamos taller
        Taller t1 = new Taller ("Arreglato", "947539574", 5);
        Taller t2 = new Taller ("Toarregla", "947517222", 10);
        
        
        //llamamos función
        //precioTotal = repararVehiculo(v1, horas, t1);
        
        System.out.println(v1.toString());
        System.out.println("Precio total: " + t1.repararVehiculo(v1, horas));
        
        
    }
    
    /*
    public static double repararVehiculo(Vehiculo vehiculo, int horas, Taller taller){
        
        double precioPiezas = 0;
        double precioTotal = 0;
        double precioPiezasTotal = 0;
        
        
        for (int i = 0; i < vehiculo.getPiezas().size(); i++){
            precioPiezas = vehiculo.getPiezas().get(i).getPrecio();
            precioPiezasTotal += precioPiezas;
            System.out.println(precioPiezasTotal);
            
        }
        
        precioTotal = precioPiezasTotal + horas * taller.getPrecioHora();
        
        return precioTotal;
    }
    */
}
