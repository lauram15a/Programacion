/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author laura
 */
public class Partida {

    private int puntos;
    private boolean terminada;
    private boolean ganada;
    private Objeto[][] tablero;
    
    //constructor
     public Partida(int puntos, boolean terminada, boolean ganada, Objeto[][] tablero) {
        this.puntos = puntos;
        this.terminada = terminada;
        this.ganada = ganada;
        this.tablero = tablero;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public boolean isTerminada() {
        return terminada;
    }

    public void setTerminada(boolean terminada) {
        this.terminada = terminada;
    }

    public boolean isGanada() {
        return ganada;
    }

    public void setGanada(boolean ganada) {
        this.ganada = ganada;
    }

    public Objeto[][] getTablero() {
        return tablero;
    }

    public void setTablero(Objeto[][] tablero) {
        this.tablero = tablero;
    }
    
    /**
     *
     * Guardar partida
     * 
     * @param torneo
     * @param partida
     */
    public static void guardarPartida (HashMap<String, Historial> torneo, Usuario usuario, Partida partida){
        
    }
    
    public static int calcularPuntos (ArrayList<Partida> a){
       int puntos = 0;
       
       for (int i = 0; i < a.size(); i++){
           puntos = puntos + a.get(i).puntos;
       }
       
       return puntos;
    }

   

}
