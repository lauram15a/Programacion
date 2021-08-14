/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import interfaces.PartidaInterfaz;
import javax.swing.JOptionPane;

/**
 *
 * @author laura
 */
public class ExcepcionPlanta {

    
   

    /**
     * Excepción si no hay suficientes soles para comprar plantas
     * @param soles
     * @param planta
     * @throws MiExcepcion
     */    
    public static void comprarPlantas (int soles, Planta planta) throws MiExcepcion{
        if (soles - planta.getCoste() < 0){
            throw new MiExcepcion ("¡¡¡No hay suficientes soles para comprar planta!!!");
        }
    }
    
    /**
     * Excepción si se ha colocado una planta en la última columna
     * @param numColumnas
     * @param columnaPlanta
     * @throws MiExcepcion
     */
    public static void ultimaColumna (int numColumnas, int columnaPlanta) throws MiExcepcion{
        if (numColumnas - 1 == columnaPlanta){
            throw new MiExcepcion ("¡¡¡Última casilla reservada para Zombies!!!");
        } 
    }
    
    /**
     * Escepción si se ha colocado un planta en una casilla ocupada
     * @param tablero
     * @param filaObjeto
     * @param columnaObjeto
     * @throws MiExcepcion
     */
    public static void casillaOcupada (Objeto[][] tablero, int filaObjeto, int columnaObjeto) throws MiExcepcion{
        if (tablero[filaObjeto][columnaObjeto] instanceof CasillaVacia){
        } else {
            throw new MiExcepcion ("¡¡¡Casilla ocupada!!!");
        }
    }
    public static void casillaOcupadaInterfaz(Objeto[][] tablero, int filaObjeto, int columnaObjeto) throws MiExcepcion
    {
        
        if(!(tablero[filaObjeto][columnaObjeto] instanceof CasillaVacia))  //esta ocupada
        {
            JOptionPane.showMessageDialog(null, "¡¡¡Casilla Ocupada!!!");
        }
    }
    
    /**
     * Excepción si se ha colocado una planta fuera del tablero (fuera de rango)
     * @param numFilas
     * @param numColumnas
     * @param filaObjeto
     * @param columnaObjeto
     * @throws MiExcepcion
     */
    public static void fueraTablero (int numFilas, int numColumnas, int filaObjeto, int columnaObjeto) throws MiExcepcion{
        int comprobador = 0;
        
        if (filaObjeto < 0 || filaObjeto > (numFilas - 1)){
            comprobador ++;
        }
        if (columnaObjeto < 0 || columnaObjeto > (numColumnas - 1)){
            comprobador ++;
        } 
        
        if (comprobador != 0){
            throw new MiExcepcion ("¡¡¡Enviaste objeto fuera del tablero!!!");
        }
    }
    
    public static boolean fueraTableroInterfaz (int numFilas, int numColumnas, int filaObjeto, int columnaObjeto){
        int comprobador = 0;
        boolean fuera = true;
        
        if (filaObjeto < 0 || filaObjeto > (numFilas - 1)){
            comprobador ++;
        }
        if (columnaObjeto < 0 || columnaObjeto > (numColumnas - 1)){
            comprobador ++;
        } 
        
        if (comprobador != 0){  // está fuera
            return true;
        } else {  //está dentro
            return false;
        }
    }

}
