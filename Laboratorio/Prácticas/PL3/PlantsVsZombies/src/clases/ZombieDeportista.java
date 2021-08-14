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
public class ZombieDeportista extends Zombie{
    
    //constructor
    public ZombieDeportista(int coste, int resistencia, int danio, int ciclo, int velocidad) {
        super(coste, resistencia, danio, ciclo, velocidad);
    }
    
    /**
     * Crea un objeto ZombieComun
     * 
     * Deportista: es más rápido, pero menos resistente. Camina un paso cada ciclo y tiene resistencia 2 puntos de vida.
     *
     * @return ZombieComun
     */
    public static ZombieDeportista crearZombieDeportista() {
        ZombieDeportista zmbD= new ZombieDeportista(0, 2, 1, 1, 0);  //resistencia, danio, ciclo, velocidad
        return zmbD;
    }
    
}
