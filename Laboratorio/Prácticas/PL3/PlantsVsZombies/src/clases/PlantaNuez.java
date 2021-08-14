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
public class PlantaNuez extends Planta{

    //constructor
    public PlantaNuez(int coste, int resistencia, float frecuencia, int danio, int ciclo) {
        super(coste, resistencia, frecuencia, danio, ciclo);
    }
    
    /**
     * Crea objeto PlantaNuez
     * @return PlantaNuez
     */
    public static PlantaNuez crearPlantaNuez(){
        PlantaNuez pN = new PlantaNuez(50, 10, 0, 0, 0);  //coste, resistencia, frecuencia, danio, ciclo
        return pN;
    }
   
}
