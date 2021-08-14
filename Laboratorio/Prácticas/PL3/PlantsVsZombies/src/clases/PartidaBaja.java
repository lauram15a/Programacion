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
public class PartidaBaja extends PartidaDificultad{
    private int puntos;
    public PartidaBaja(String dificultad) {
        super(dificultad);
    }

    public PartidaBaja(ArrayList<Partida> partidasBajas, String dificultad, int puntos) {
        super(dificultad);
        this.partidasBajas = partidasBajas;
        this.puntos = puntos;
    }
    
    
    private ArrayList<Partida> partidasBajas;
    
    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public ArrayList<Partida> getPartidasBajas() {
        return partidasBajas;
    }

    public void setPartidasBajas(ArrayList<Partida> partidasBajas) {
        this.partidasBajas = partidasBajas;
    }
    
    public static PartidaBaja crearPartidaBaja (){
        PartidaBaja partidaBaja = new PartidaBaja("BAJA");
        return partidaBaja;
    }

}
