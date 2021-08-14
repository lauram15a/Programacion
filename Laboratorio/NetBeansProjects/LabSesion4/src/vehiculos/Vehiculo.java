/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author laura
 */
public class Vehiculo {
    
    private String matricula;
    private String marca;
    private String modelo;
    private int velocidad;
    private boolean luces;

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

        
    //velocidad
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

        
    //luces
    public boolean isLuces() {
        return luces;
    }

    public void setLuces(boolean luces) {
        this.luces = luces;
    }

    
    //CONSTRUCTOOOOOOR

    public Vehiculo(String matricula, String marca, String modelo, int velocidad, boolean luces) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.luces = luces;
    }
    
    
    //TO STRING()

    @Override
    public String toString() {
        String lucestxt = "";
        
        if (this.luces){
            lucestxt = "luces encendidas";
        } else {
            lucestxt = "luces apagadas";
        }
        
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + ", luces=" + luces + '}';
    }
    
    
}
