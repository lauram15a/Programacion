/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Random;

/**
 *
 * @author laura
 */
public class PartidaEnJuego {

    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args) {

        int numZombis = 0;
        int turnosInicialesSinZombis = 0;

        int[] soles = {50};
        int[] contadorZombis = {0};
        int[] contadorZombiesTablero = {0};
        int[] contadorZombiesMuertos = {0};
        

        int contadorTurno = 1;

        String[] listaLineaComandos = ExcepcionJuego.pedirInstruccion();

        String modoSeleccion = listaLineaComandos[0].toUpperCase();
        //int numFilas = Integer.parseInt(listaLineaComandos[1]);
        //int numColumnas = Integer.parseInt(listaLineaComandos[2]);
        int numFilas = 5;
        int numColumnas = 9;
        String dificultad = listaLineaComandos[3].toUpperCase();

        //crear caasilla vacía
        CasillaVacia casillaVacia = new CasillaVacia(0, 0, 0, 0);

        //crear y rellenar tablero
        Objeto[][] tablero = Tablero.crearTablero(numFilas, numColumnas);
        tablero = Tablero.rellenarTablero(tablero, casillaVacia, numFilas, numColumnas);

        //asignación de turnos, num zombies, turnos iniciales sin zombies --> según dificultad        
        if ("BAJA".equals(dificultad)) {
            numZombis = 5;
            turnosInicialesSinZombis = 10;
        } else if ("MEDIA".equals(dificultad)) {
            numZombis = 15;
            turnosInicialesSinZombis = 7;
        } else if ("ALTA".equals(dificultad)) {
            numZombis = 25;
            turnosInicialesSinZombis = 5;
        } else if ("IMPOSIBLE".equals(dificultad)) {
            numZombis = 50;
            turnosInicialesSinZombis = 5;
        }
        
        int[] contadorZombisQuedan = {numZombis};

        //_________________________________________________________________________________
        System.out.println("\nComenzando la partida.\n");
        Tablero.imprimirMensajes(tablero, numFilas, numColumnas, soles, numZombis, contadorZombisQuedan);
        //_________________________________________________________________________________

        boolean finPartida = false;

        int turnosRepartoZombis = 30;
        int zombisQuedan = 0;

        contadorTurno = 1;
        int contadorPlantaLanzaGuisantes = 0;

        boolean comprobadorImprimir = true;

        listaLineaComandos = ExcepcionJuego.pedirInstruccion();

        if (!"".equals(listaLineaComandos[0])) {
            modoSeleccion = listaLineaComandos[0].toUpperCase();
        } else {
            modoSeleccion = "";
        }

        while (!"S".equals(modoSeleccion)) {
            //eligen PlantaGirasol
            if ("NUEVA".equals(modoSeleccion)) {
                System.out.println("Partida comenzada. Si quieres jugar, haz otra partida");
                contadorTurno--;  //para que no pase turno
                comprobadorImprimir = false;
            } else if (!"".equals(modoSeleccion)) {
                Tablero.agregarPlanta(tablero, soles, listaLineaComandos, numFilas, numColumnas, modoSeleccion);
            }

            //zombies
            Tablero.agregarZombie(tablero, numFilas, numColumnas, contadorZombis, contadorZombiesTablero, turnosInicialesSinZombis, numZombis, contadorZombisQuedan);

            //---------------------------------------------------------------------------------------
            zombisQuedan = numZombis - contadorZombis[0];
            System.out.println("");
            if (comprobadorImprimir == true) {
                Tablero.imprimirMensajes(tablero, numFilas, numColumnas, soles, numZombis, contadorZombisQuedan);
                contadorTurno++;
                turnosInicialesSinZombis--;
            }
            comprobadorImprimir = true;
            //---------------------------------------------------------------------------------------

            //finPartida == true
            if (ExcepcionJuego.finPartida(tablero, numFilas, numColumnas, contadorZombis[0], numZombis, contadorTurno) == true) {
                if (contadorZombis[0] == numZombis) {
                    System.out.println("\nHan ganado las PLANTAS!!!!");
                } else {
                    System.out.println("\nHan ganado los ZOMBIES!!!!");
                }
                System.exit(0);
            }

            //movimientos
            Tablero.movimientos(tablero, numFilas, numColumnas, soles, casillaVacia, contadorZombiesTablero, contadorZombiesMuertos);

            //----------------------------------------------------------------------------------------
            if (finPartida == false) {
                listaLineaComandos = ExcepcionJuego.pedirInstruccion();
                if (!"".equals(listaLineaComandos[0])) {
                    modoSeleccion = listaLineaComandos[0].toUpperCase();
                } else {
                    modoSeleccion = "";
                }
            }
            //---------------------------------------------------------------------------------------
        }

        System.out.println("\nHas abandonado la partida.");

    }

}
