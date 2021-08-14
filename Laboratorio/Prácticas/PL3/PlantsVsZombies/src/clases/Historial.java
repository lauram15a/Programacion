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
public class Historial {

    private Usuario usuario;
    private PartidaBaja partidasBajas;
    private PartidaMedia partidasMedias;
    private PartidaAlta partidasAltas;
    private PartidaImposible partidasImposibles;

    public Historial() {

    }

    //constructor
    public Historial(Usuario usuario, PartidaBaja partidasBajas, PartidaMedia partidasMedias, PartidaAlta partidasAltas, PartidaImposible partidasImposibles) {
        this.usuario = usuario;
        this.partidasBajas = partidasBajas;
        this.partidasMedias = partidasMedias;
        this.partidasAltas = partidasAltas;
        this.partidasImposibles = partidasImposibles;
    }

    private int puntosAlta;

    public int getPuntosAlta() {
        return puntosAlta;
    }

    public void setPuntosAlta(int puntosAlta, PartidaAlta p) {
        this.puntosAlta = puntosAlta;
        puntosAlta = Partida.calcularPuntos(p.getPartidasAltas());
    }

    private int puntosMedia;

    public int getPuntosMedia() {
        return puntosMedia;
    }

    public void setPuntosMedia(int puntosMedia, PartidaMedia p) {
        this.puntosMedia = puntosMedia;
        puntosMedia = Partida.calcularPuntos(p.getPartidasMedias());
    }

    private int puntosBaja;

    public int getPuntosBaja() {
        return puntosBaja;
    }

    public void setPuntosBaja(int puntosBaja, PartidaBaja p) {
        this.puntosBaja = puntosBaja;
        puntosBaja = Partida.calcularPuntos(p.getPartidasBajas());

    }

    private int puntosImposible;

    public int getPuntosImposible() {
        return puntosImposible;
    }

    public void setPuntosImposible(int puntosImposible, PartidaImposible p) {
        this.puntosImposible = puntosImposible;
        puntosImposible = Partida.calcularPuntos(p.getPartidasImposibles());

    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public PartidaBaja getPartidasBajas() {
        return partidasBajas;
    }

    public void setPartidasBajas(PartidaBaja partidasBajas) {
        this.partidasBajas = partidasBajas;
    }

    public PartidaMedia getPartidasMedias() {
        return partidasMedias;
    }

    public void setPartidasMedias(PartidaMedia partidasMedias) {
        this.partidasMedias = partidasMedias;
    }

    public PartidaAlta getPartidasAltas() {
        return partidasAltas;
    }

    public void setPartidasAltas(PartidaAlta partidasAltas) {
        this.partidasAltas = partidasAltas;
    }

    public PartidaImposible getPartidasImposibles() {
        return partidasImposibles;
    }

    public void setPartidasImposibles(PartidaImposible partidasImposibles) {
        this.partidasImposibles = partidasImposibles;
    }


    public static Historial crearHistorial (Usuario usuario){
        PartidaBaja partidasBajas = PartidaBaja.crearPartidaBaja();
        PartidaMedia partidasMedias = PartidaMedia.crearPartidaMedia();
        PartidaAlta partidasAltas = PartidaAlta.crearPartidaAlta();
        PartidaImposible partidasImposibles = PartidaImposible.crearPartidaImposible();
        
        Historial  historial = new Historial (usuario, partidasBajas, partidasMedias, partidasAltas, partidasImposibles);
        return historial;
    }

    

    
}
