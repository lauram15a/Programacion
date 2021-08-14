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
public class ZombieCaraCubo extends Zombie {

    //constructor
    public ZombieCaraCubo(int coste, int resistencia, int danio, int ciclo, int velocidad) {
        super(coste, resistencia, danio, ciclo, velocidad);
    }

    /**
     * Crea un objeto ZombieComun
     * 
     * Caracubo: es más lento, pero más resistente. Camina un paso cada 4 ciclos y tiene resistencia 8 puntos de vida.
     *
     * @return ZombieComun
     */
    public static ZombieCaraCubo crearZombieCaraCubo() {
        ZombieCaraCubo zmbCC = new ZombieCaraCubo(0, 8, 1, 1, 0);  //resistencia, danio, ciclo, velocidad
        return zmbCC;
    }
}
