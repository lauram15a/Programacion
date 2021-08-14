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
public class Torneo {
    
    public static HashMap<String, Historial> crearTorneo (){
        
        HashMap<String, Historial> torneo = new HashMap<String, Historial>();  //diccionario
        return torneo;
        
    }
    
    /**
     *
     * Añade usuario a torneo
     * 
     * @param torneo
     * @param usuario
     * @return
     */
    public static HashMap<String, Historial> aniadirUsuario (HashMap<String, Historial> torneo, Usuario usuario){
        
        Historial historial = Historial.crearHistorial(usuario);
        
        torneo.put(usuario.getDNI(), historial);
        
        return torneo;
    }
    
    /**
     *
     * Comprueba si el usuario está registrado o no
     * 
     * @param torneo
     * @param usuario
     * @param dniString
     * @return
     */
    public static boolean comprobarUsuarioRegistrado (HashMap<String, Historial> torneo, String dni){
        
        if (torneo.containsKey(dni)){ //sí, el usuario ya estaba registrado
            return true;
        } else {  //el usuario no está registrado
            return false;
        }
    }
    
    /**
     * 
     * Para recorrer Torneo
     * 
     * En este caso, para imprimir por pantalla
     *
     * @param torneo
     */
    public static void listarHashMap (HashMap<String, Historial> torneo){
        for (HashMap.Entry<String, Historial> entry: torneo.entrySet()){  //recorre todo torneo
            System.out.println("DNI: " + entry.getKey() + "Nombre: " + entry.getValue().getUsuario().getNombre());
        }
    }
    
    /**
     * 
     * Buscar contactos
     * 
     * @param torneo
     * @param usuario
     */
    public static void buscarUsuario (HashMap<String, Historial> torneo, String dni){
        if (torneo.containsKey(dni)){
            System.out.println("Contacto existe");
        } else {
            System.out.println("No existe");
        }
    }
    
    public static Historial devolverHistorial(HashMap<String, Historial> torneo, String  dni) {
        Historial a = torneo.get(dni);
       
        return a;
    }
    
    /**
     *
     * Eliminar usuario
     * 
     * @param torneo
     * @param usuario
     */
    public static void eliminarUsuario (HashMap<String, Historial> torneo, Usuario usuario){
        if (torneo.containsKey(usuario.getDNI())){
            torneo.remove(usuario.getDNI());
        }
    }
    
    public static HashMap<String, Historial> torneoLleno (){
        //tablero
        Objeto[][] tablero = Tablero.crearTablero(5, 9);
        
        //usuarios
        Usuario u1 = new Usuario ("11111111H", "Hugo");
        Usuario u2 = new Usuario ("22222222J", "Juan");
        Usuario u3 = new Usuario ("33333333P", "Paco");
        Usuario u4 = new Usuario ("44444444A", "Ana");
        Usuario u5 = new Usuario ("55555555K", "Kiko");
        
        //partidas
        Partida p1 = new Partida (20, true, true, tablero);
        Partida p2 = new Partida (27, true, true, tablero);
        Partida p3 = new Partida (0, true, false, tablero);
        Partida p4 = new Partida (30, true, true, tablero);
        Partida p5 = new Partida (37, true, true, tablero);
        Partida p6 = new Partida (0, true, false, tablero);
        Partida p7 = new Partida (23, true, true, tablero);
        Partida p8 = new Partida (8, true, true, tablero);
        Partida p9 = new Partida (0, true, false, tablero);
        Partida p10 = new Partida (40, true, true, tablero);
        Partida p11 = new Partida (47, true, true, tablero);
        Partida p12 = new Partida (0, true, false, tablero);
        Partida p13 = new Partida (10, true, true, tablero);
        Partida p14 = new Partida (17, true, true, tablero);
        Partida p15 = new Partida (0, true, false, tablero);
        Partida p16 = new Partida (90, true, true, tablero);
        Partida p17 = new Partida (67, true, true, tablero);
        Partida p18 = new Partida (0, true, false, tablero);
        Partida p19 = new Partida (21, true, true, tablero);
        Partida p20 = new Partida (48, true, true, tablero);
        Partida p21 = new Partida (0, true, false, tablero);
        Partida p22 = new Partida (50, true, true, tablero);
        Partida p23 = new Partida (45, true, true, tablero);
        Partida p24 = new Partida (0, true, false, tablero);
        Partida p25 = new Partida (17, true, true, tablero);
        Partida p26 = new Partida (0, true, false, tablero);
        Partida p27 = new Partida (33, true, true, tablero);
        Partida p28 = new Partida (81, true, true, tablero);
        Partida p29 = new Partida (0, true, false, tablero);
        Partida p30 = new Partida (49, true, true, tablero);
        Partida p31 = new Partida (63, true, true, tablero);
        
        //array Partidas
        ArrayList<Partida> a1 = new ArrayList<Partida>();
        ArrayList<Partida> a2 = new ArrayList<Partida>();
        ArrayList<Partida> a3 = new ArrayList<Partida>();
        ArrayList<Partida> a4 = new ArrayList<Partida>();
        ArrayList<Partida> a5 = new ArrayList<Partida>();
        ArrayList<Partida> a6 = new ArrayList<Partida>();
        ArrayList<Partida> a7 = new ArrayList<Partida>();
        ArrayList<Partida> a8 = new ArrayList<Partida>();
        ArrayList<Partida> a9 = new ArrayList<Partida>();
        ArrayList<Partida> a10 = new ArrayList<Partida>();
        ArrayList<Partida> a11 = new ArrayList<Partida>();
        ArrayList<Partida> a12 = new ArrayList<Partida>();
        ArrayList<Partida> a13 = new ArrayList<Partida>();
        ArrayList<Partida> a14 = new ArrayList<Partida>();
        ArrayList<Partida> a15 = new ArrayList<Partida>();
        ArrayList<Partida> a16 = new ArrayList<Partida>();
        ArrayList<Partida> a17 = new ArrayList<Partida>();
        ArrayList<Partida> a18 = new ArrayList<Partida>();
        ArrayList<Partida> a19 = new ArrayList<Partida>();
        ArrayList<Partida> a20 = new ArrayList<Partida>();
        
        a1.add(p1);
        a1.add(p2);
        
        a2.add(p3);
        
        a3.add(p4);
        
        a4.add(p5);
        a4.add(p6);
        a4.add(p7);
        
        a5.add(p8);
        
        a6.add(p9);
        a6.add(p10);
        
        a7.add(p11);
        a7.add(p12);
        a7.add(p13);
        
        a8.add(p14);
        
        a9.add(p15);
        a9.add(p16);
        
        a10.add(p17);
        
        a11.add(p18);
        a11.add(p19);
        
        a12.add(p20);
        
        a13.add(p21);
        
        a14.add(p22);
        
        a15.add(p23);
        a15.add(p24);
        
        a16.add(p25);
        
        a17.add(p26);
        a17.add(p27);
        
        a18.add(p28);
        
        a19.add(p29);
        
        a20.add(p30);
        a20.add(p31);       
        
        
        
        //PartdaBaja
        PartidaBaja pb1 = new PartidaBaja(a1, "BAJA", Partida.calcularPuntos (a1));
        PartidaBaja pb2 = new PartidaBaja(a2, "BAJA", Partida.calcularPuntos (a2));
        PartidaBaja pb3 = new PartidaBaja(a3, "BAJA", Partida.calcularPuntos (a3));
        PartidaBaja pb4 = new PartidaBaja(a4, "BAJA", Partida.calcularPuntos (a4));
        PartidaBaja pb5 = new PartidaBaja(a5, "BAJA", Partida.calcularPuntos (a5));
        
        //PartidaMedia
        PartidaMedia pm1 = new PartidaMedia(a6, "MEDIA", Partida.calcularPuntos (a6));
        PartidaMedia pm2 = new PartidaMedia(a7, "MEDIA", Partida.calcularPuntos (a7));
        PartidaMedia pm3 = new PartidaMedia(a8, "MEDIA", Partida.calcularPuntos (a8));
        PartidaMedia pm4 = new PartidaMedia(a9, "MEDIA", Partida.calcularPuntos (a9));
        PartidaMedia pm5 = new PartidaMedia(a10, "MEDIA", Partida.calcularPuntos (a10));
        
        //PartidaAlta
        PartidaAlta pa1 = new PartidaAlta(a11, "MEDIA", Partida.calcularPuntos (a11));
        PartidaAlta pa2 = new PartidaAlta(a12, "MEDIA", Partida.calcularPuntos (a12));
        PartidaAlta pa3 = new PartidaAlta(a13, "MEDIA", Partida.calcularPuntos (a13));
        PartidaAlta pa4 = new PartidaAlta(a14, "MEDIA", Partida.calcularPuntos (a14));
        PartidaAlta pa5 = new PartidaAlta(a15, "MEDIA", Partida.calcularPuntos (a15));
        
        //PartidaImposible
        PartidaImposible pi1 = new PartidaImposible(a16, "IMPOSIBLE", Partida.calcularPuntos (a16));
        PartidaImposible pi2 = new PartidaImposible(a17, "IMPOSIBLE", Partida.calcularPuntos (a17));
        PartidaImposible pi3 = new PartidaImposible(a18, "IMPOSIBLE", Partida.calcularPuntos (a18));
        PartidaImposible pi4 = new PartidaImposible(a19, "IMPOSIBLE", Partida.calcularPuntos (a19));
        PartidaImposible pi5 = new PartidaImposible(a20, "IMPOSIBLE", Partida.calcularPuntos (a20));
        
        //Historial
        Historial h1 = new Historial(u1, pb1, pm1, pa1, pi1);
        Historial h2 = new Historial(u2, pb2, pm2, pa2, pi2);
        Historial h3 = new Historial(u3, pb3, pm3, pa3, pi3);
        Historial h4 = new Historial(u4, pb4, pm4, pa4, pi4);
        Historial h5 = new Historial(u5, pb5, pm5, pa5, pi5);
        
        //Torneo
        HashMap<String, Historial> torneo = Torneo.crearTorneo();
        torneo.put(h1.getUsuario().getDNI(), h1);
        torneo.put(h2.getUsuario().getDNI(), h2);
        torneo.put(h3.getUsuario().getDNI(), h3);
        torneo.put(h4.getUsuario().getDNI(), h4);
        torneo.put(h5.getUsuario().getDNI(), h5);
        
        return torneo;
    }
}

