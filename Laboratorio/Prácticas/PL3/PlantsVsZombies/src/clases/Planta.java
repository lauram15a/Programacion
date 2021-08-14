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
    
    private float frecuencia;
    
    //constructor
    public Planta(int coste, int resistencia, float frecuencia, int danio, int ciclo) {
        super (coste, resistencia, danio, ciclo);
        this.frecuencia = frecuencia;
    }
    

    public float getFrecuencia() {
        return frecuencia;
    }
    public void setFrecuencia(float frecuencia) {
        this.frecuencia = frecuencia;
    }
    
    public static Planta crearPlanta(){
        Planta planta = new Planta(0,0,0,0,0);
        return planta;
    }

    

}
