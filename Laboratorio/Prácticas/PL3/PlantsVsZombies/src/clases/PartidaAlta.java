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
public class PartidaAlta extends PartidaDificultad {
 private int puntos;
    public PartidaAlta(String dificultad) {
        super(dificultad);
    }

    public PartidaAlta(ArrayList<Partida> partidasAltas, String dificultad, int puntos) {
        super(dificultad);
        this.partidasAltas = partidasAltas;
        this.puntos = puntos;
    }
    
    public int getPuntos() {
        return puntos;
    }


    private ArrayList<Partida> partidasAltas;

    public ArrayList<Partida> getPartidasAltas() {
        return partidasAltas;
    }

    public void setPartidasAltas(ArrayList<Partida> partidasAltas) {
        this.partidasAltas = partidasAltas;
    }

    public static PartidaAlta crearPartidaAlta() {
        PartidaAlta partidaAlta = new PartidaAlta("ALTA");
        return partidaAlta;
    }

}


