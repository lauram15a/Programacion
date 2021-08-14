/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import clases.Historial;
import clases.Torneo;
import interfaces.IniciarSesion;
import java.util.HashMap;

/**
 *
 * @author laura
 */
public class NewMain {

    
    public static void main(String[] args) {
        HashMap<String, Historial> torneo = Torneo.crearTorneo();
        
        IniciarSesion inicioSesion = new IniciarSesion();
        inicioSesion.setVisible(true);
        
        
    }
    
}
