/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author laura
 */
public class Planta extends Objeto{
    
    private int coste;
    private float frecuencia;
    
    //constructor
    public Planta(int coste, int resistencia, float frecuencia, int danio, int ciclo) {
        super (resistencia, danio, ciclo);
        this.coste = coste;
        this.frecuencia = frecuencia;
    }
    

    public int getCoste() {
        return coste;
    }
    public void setCoste(int coste) {
        this.coste = coste;
    }



    public float getFrecuencia() {
        return frecuencia;
    }
    public void setFrecuencia(float frecuencia) {
        this.frecuencia = frecuencia;
    }

    

}
