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
public class PlantaGirasol extends Planta{
        
    //constructor
    public PlantaGirasol(int coste, int resistencia, float frecuencia, int danio, int ciclo) {
        super(coste, resistencia, frecuencia, danio, ciclo);
    }
            
    /**
     * Crea objeto PlantaGirasol
     * @return PlantaGirasol
     */
    public static PlantaGirasol crearPlantaGirasol(){
        PlantaGirasol pG = new PlantaGirasol (20, 1, 10, 0, 1);        
        return pG;
    }
    
    /**
     * Suma 10 soles al num total de soles
     * @param soles
     * @return int soles
     */
    public static void generarSoles(int[] soles) {
        soles[0] = soles[0] + 10;
    }
    
    
}
