/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lampara;

/**
 *
 * @author laura
 */

public class Lampara {
    
        private int intensidad = 0;
        private boolean encendida = false;
        
    //constructor
    public Lampara(int intensidad, boolean encendida) {
        this.intensidad = intensidad;
        this.encendida = encendida;
    }
    
    

    public int getIntensidad() {
        return intensidad;
    }
    public void setIntensidad(int intensidad) {
        if (intensidad >= 0 && intensidad <= 100){
            this.intensidad = intensidad;
        } else {
            this.intensidad = 0;
        }
    }
    
    public void setIntensidad (double voltaje){
        if (voltaje < 1.5){
            intensidad = 0;
        } else if (voltaje > 12.5){
            intensidad = 100;
        } else {
            intensidad = (int) (100 * voltaje / 12.5);
        }
        this.intensidad = intensidad;
    }
        

    public boolean isEncendida() {
        return encendida;
    }
    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }
    
    
    //informacion textual de la lámpara

    @Override
    public String toString() {
        String encendidaTxt; 
        if (encendida == true){
            encendidaTxt = "ON";
        } else {
            encendidaTxt = "OFF";
        }
        return "Lampara{" + "intensidad=" + intensidad + ", encendida=" + encendidaTxt + '}';
    }
    

}
