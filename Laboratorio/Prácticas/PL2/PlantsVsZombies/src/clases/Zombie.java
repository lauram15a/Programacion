/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Random;

/**
 *
 * @author laura
 */
public class Zombie extends Objeto{
    
    private int velocidad;

    //constructor
    public Zombie(int resistencia, int danio, int ciclo, int velocidad) {
        super (resistencia, danio, ciclo);
        this.velocidad = velocidad;
    }    

    public int getVelocidad() {
        return velocidad;
    }
    
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    /**
     * Crea un objeto Zombie
     * @return Zombie
     */
    public static Zombie crearZombie (){
        Zombie zmb = new Zombie (5, 1, 1, 0);  //resistencia, danio, ciclo, velocidad
        return zmb;
    }
    
    /**
     * Los zombies avanzan o se quedan en su casillo en función del contenido de las casillas. 
     * Modifica el tablero
     * @param tablero
     * @param i
     * @param j
     * @param casillaVacia
     * @return Objeto[][] tablero
     */
    public static Objeto[][] movimientoZmb(Objeto[][] tablero, int i, int j, CasillaVacia casillaVacia) {

        if (tablero[i][j - 1] instanceof CasillaVacia) { //siguiente casilla vacia
            tablero[i][j - 1] = tablero[i][j];  //avanza
            tablero[i][j] = casillaVacia;  //la casilla anterior se queda vacía
        } else if (tablero[i][j - 1] instanceof PlantaGirasol || tablero[i][j - 1] instanceof PlantaLanzaGuisantes) { //siguiente casilla PlantaGirasol o PlantaLanzaGuisantes
            tablero[i][j - 1].setResistencia(tablero[i][j - 1].getResistencia() - tablero[i][j].getDanio()); //resistencia pg = resistencia pg - daño zmb
            if (tablero[i][j - 1].getResistencia() < 1) {   //Planta muere
                tablero[i][j - 1] = casillaVacia;
            }
        }

        return tablero;
    }
}
