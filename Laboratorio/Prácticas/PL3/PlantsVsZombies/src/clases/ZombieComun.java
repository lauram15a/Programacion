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
public class ZombieComun extends Zombie{
    
    //constructor
    public ZombieComun(int coste, int resistencia, int danio, int ciclo, int velocidad) {
        super(coste, resistencia, danio, ciclo, velocidad);
    }
    
    /**
     * Crea un objeto ZombieComun
     * @return ZombieComun
     */
    public static ZombieComun crearZombieComun (){
        ZombieComun zmbC = new ZombieComun (0, 5, 1, 1, 0);  //resistencia, danio, ciclo, velocidad
        return zmbC;
    }
}
