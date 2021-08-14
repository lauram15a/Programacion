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
public class PartidaImposible extends PartidaDificultad {
private int puntos;
    public PartidaImposible(String dificultad) {
        super(dificultad);
    }

    public PartidaImposible(ArrayList<Partida> partidasImposibles, String dificultad, int puntos) {
        super(dificultad);
        this.partidasImposibles = partidasImposibles;
        this.puntos = puntos;
    }
    
    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    private ArrayList<Partida> partidasImposibles;

    public ArrayList<Partida> getPartidasImposibles() {
        return partidasImposibles;
    }

    public void setPartidasImposibles(ArrayList<Partida> partidasImposibles) {
        this.partidasImposibles = partidasImposibles;
    }

    public static PartidaImposible crearPartidaImposible() {
        PartidaImposible partidaImposible = new PartidaImposible("IMPOSIBLE");
        return partidaImposible;
    }

}
