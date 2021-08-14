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
public class PartidaMedia extends PartidaDificultad {

    private int puntos;

    public PartidaMedia(String dificultad) {
        super(dificultad);
    }

    public PartidaMedia(ArrayList<Partida> partidaMedia, String dificultad, int puntos) {
        super(dificultad);
        this.partidaMedia = partidaMedia;
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos, ArrayList partidaMedia) {
        this.puntos = puntos;
        puntos = Partida.calcularPuntos(partidaMedia);
    }

    private ArrayList<Partida> partidaMedia;

    public ArrayList<Partida> getPartidasMedias() {
        return partidaMedia;
    }

    public void setPartidaMedia(ArrayList<Partida> partidaMedia) {
        this.partidaMedia = partidaMedia;
    }

    public static PartidaMedia crearPartidaMedia() {
        PartidaMedia partidaMedia = new PartidaMedia("MEDIA");
        return partidaMedia;
    }

}
