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
public class PlantaLanzaGuisantes extends Planta{
    
    private int alcance;

    //constructor
    public PlantaLanzaGuisantes(int coste, int resistencia, float frecuencia, int danio, int ciclo) {
        super(coste, resistencia, frecuencia, danio, ciclo);
        this.alcance = alcance;
    }
    
    
    public int getAlcance() {
        return alcance;
    }
    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }
    
    /**
     * Crea objeto PlantaLanzaGuisantes
     * @return PlantaLanzaGuisantes
     */
    public static PlantaLanzaGuisantes crearPlantaLanzaGuisantes(){
        PlantaLanzaGuisantes pLG = new PlantaLanzaGuisantes(50, 3, 1, 1, 0); 
        return pLG;
    }
    
}
