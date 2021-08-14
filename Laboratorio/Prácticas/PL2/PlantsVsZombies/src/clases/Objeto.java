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
public abstract class Objeto {
    
    private int resistencia;
    private int danio;
    private int ciclo;

    
    //constructor
    public Objeto(int resistencia, int danio, int ciclo) {
        this.resistencia = resistencia;
        this.danio = danio;
        this.ciclo = ciclo;
    }
    
    
    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }
    

    public int getResistencia() {
        return resistencia;
    }
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    

    public int getDanio() {
        return danio;
    }
    public void setDanio(int danio) {
        this.danio = danio;
    }

}
