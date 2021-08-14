/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author laura
 */
public class PartidaDificultad {

    private String dificultad;
    
    

    //constructor
    public PartidaDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    
    
    public static ArrayList<Partida> aniadirPartidaLista(Partida partida, ArrayList<Partida> partidas){
        partidas.add(partida);
        return partidas;
    }

}
