/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos.ejercicios;

import java.util.Random;

/**
 *
 * @author laura
 * 
 * 1. Crear un nuevo constructor que solo reciba como parámetros la matrícula, la marca y el modelo, de
forma que la velocidad será 0 y las luces estarán apagadas.
 *
 * 2. Incorporar un nuevo atributo llamado marcha (int) que podrá tomar valores comprendidos entre el 0
y el 5 junto a los correspondientes métodos get y set.
 */

public class Vehiculo1 {

    private String matricula;
    private String marca;
    private String modelo;
    private int velocidad = 0;
    private boolean luces = false;
    private int marcha;
    
    //constructor

    public Vehiculo1(String matricula, String marca, String modelo, int marcha) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.marcha = marcha;
    }
    
    

    //matrícula
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
    //marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    //modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
     //marcha
    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        
        Random aleatorio = new Random();
        
        marcha = aleatorio.nextInt(6); 
        this.marcha = marcha;
    }
    
    
    //velocidad
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int marcha) {
        
        if (marcha == 0){
            velocidad = 0;
        } else if (marcha == 1){
            velocidad = 10;
        } else if (marcha == 2){
            velocidad = 30;
        } else if (marcha == 3){
            velocidad = 60;
        } else if (marcha == 4){
            velocidad = 90;
        } else if (marcha == 5){
            velocidad = 120;
        }
        
        this.velocidad = velocidad;
    }

    
    //luces
    public boolean isLuces() {
        return luces;
    }

    public void setLuces(boolean luces) {
        this.luces = luces;
    } 
    
    
    //informacion textual del vehículo

    @Override
    public String toString() {
        String lucesTxt;
        
        if (luces == true){
            lucesTxt = "Luces encendidas";
        } else{
            lucesTxt = "Luces apagadas";
        }
        return "Vehiculo1{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", marcha=" + marcha + ", velocidad=" + velocidad + ", luces=" + lucesTxt + '}';
    }
    
   

}
