/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.util.ArrayList;

/**
 *
 * @author laura
 */
public class Vehiculo {
    
    private String matricula;
    private String marca;
    private String modelo;
    private ArrayList<Pieza> piezas;
    
    //constructor

    public Vehiculo(String matricula, String marca, String modelo, Pieza[] piezas) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.piezas = new ArrayList<>();
    }

    

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
        

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
        

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
        

    public ArrayList<Pieza> getPiezas() {
        return piezas;
    }
    public void añadirPiezas(Pieza pieza) {
        this.piezas.add(pieza);
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", piezas=" + piezas + '}';
    }
    
    

}
