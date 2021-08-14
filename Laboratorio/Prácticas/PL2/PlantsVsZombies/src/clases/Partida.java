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
public class Partida {

    /**
     * main
     * @param args
     */
    public static void main(String[] args) {

        int numZombis = 0;
        int turnosInicialesSinZombis = 0;
        
        int contadorTurno = 1;

        String[] listaLineaComandos = ExcepcionJuego.pedirInstruccion(contadorTurno);

        String modoSeleccion = listaLineaComandos[0].toUpperCase();
        int numFilas = Integer.parseInt(listaLineaComandos[1]);
        int numColumnas = Integer.parseInt(listaLineaComandos[2]);
        String dificultad = listaLineaComandos[3].toUpperCase();

        //crear caasilla vacía
        CasillaVacia casillaVacia = new CasillaVacia(0, 0, 0);

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

        //_________________________________________________________________________________
        System.out.println("\nComenzando la partida.\n");
        Tablero.imprimirTablero(tablero, numFilas, numColumnas);
        System.out.println("\nTienes 50 soles y es el turno 0.");
        System.out.println("Quedan " + numZombis + " zombis por salir.");
        partida(tablero, numFilas, numColumnas, dificultad, casillaVacia, numZombis, turnosInicialesSinZombis);
        //_________________________________________________________________________________

    }

    /**
     * Se lleva a cabo la partida
     * @param tablero
     * @param numFilas
     * @param numColumnas
     * @param dificultad
     * @param casillaVacia
     * @param numZombis
     * @param turnosInicialesSinZombis
     */
    public static void partida(Objeto[][] tablero, int numFilas, int numColumnas, String dificultad, CasillaVacia casillaVacia, int numZombis, int turnosInicialesSinZombis) {
        int soles = 50;
        String modoSeleccion = "";
        boolean finPartida = false;
        int filaPG = 0;
        int columnaPG = 0;
        int filaPLG = 0;
        int columnaPLG = 0;
        int filaZmb = 0;
        int columnaZmb = 0;

        int ciclo = 1;
        int turnosRepartoZombis = 30;
        int zombisQuedan = 0;

        int contadorTurno = 1;
        int contadorPlantaLanzaGuisantes = 0;
        int contadorPlantaGirasol = 0;
        int contadorZombis = 0;
        int contadorZombiesTablero = 0;
        int contadorZombiesMuertos = 0;
        
        boolean comprobadorImprimir = true;

        ExcepcionPlanta eP = new ExcepcionPlanta();
        ExcepcionJuego eJ = new ExcepcionJuego();

        String[] listaLineaComandos = ExcepcionJuego.pedirInstruccion(contadorTurno);

        if (!"".equals(listaLineaComandos[0])) {
            modoSeleccion = listaLineaComandos[0].toUpperCase();
        } else {
            modoSeleccion = "";
        }

        while (!"S".equals(modoSeleccion)) {
            //eligen PlantaGirasol
            if ("N".equals(modoSeleccion)) {
                System.out.println("Partida comenzada. Si quieres jugar, haz otra partida");
                contadorTurno--;  //para que no pase turno
                comprobadorImprimir = false;
            } else if ("G".equals(modoSeleccion)) {  //PlantaGirasol

                filaPG = Integer.parseInt(listaLineaComandos[1]) - 1;
                columnaPG = Integer.parseInt(listaLineaComandos[2]) - 1;

                try {  //dentro del tablero

                    eP.fueraTablero(numFilas, numColumnas, filaPG, columnaPG);

                    try {  //no última columna

                        eP.ultimaColumna(numColumnas, columnaPG);

                        try {  //casilla no ocupada

                            eP.casillaOcupada(tablero, filaPG, columnaPG);

                            PlantaGirasol planta = PlantaGirasol.crearPlantaGirasol();

                            try {  //suficientes soles

                                eP.comprarPlantas(soles, planta);

                                if (soles - planta.getCoste() >= 0) {
                                    soles = soles - planta.getCoste();
                                    tablero[filaPG][columnaPG] = PlantaGirasol.crearPlantaGirasol();  //coste, resistencia, frecuencia, daño, ciclo
                                    contadorPlantaGirasol++;
                                    tablero[filaPG][columnaPG].setCiclo(1);
                                }

                            } catch (MiExcepcion mE) {
                                System.out.println("\n" + mE.getMessage());
                            }

                        } catch (MiExcepcion mE) {
                            System.out.println("\n" + mE.getMessage());
                        }

                    } catch (MiExcepcion mE) {
                        System.out.println("\n" + mE.getMessage());
                    }

                } catch (Exception e) {
                    System.out.println("\n¡¡¡Fuera del tablero!!!");
                }

            } else if ("L".equals(modoSeleccion)) { //eligen PlantaLanzaGuisantes

                filaPLG = Integer.parseInt(listaLineaComandos[1]) - 1;
                columnaPLG = Integer.parseInt(listaLineaComandos[2]) - 1;

                try {  //dentro del tablero

                    eP.fueraTablero(numFilas, numColumnas, filaPLG, columnaPLG);

                    try {  //no última columna

                        eP.ultimaColumna(numColumnas, columnaPLG);

                        try {  //casilla no ocupada

                            eP.casillaOcupada(tablero, filaPLG, columnaPLG);

                            PlantaLanzaGuisantes planta = PlantaLanzaGuisantes.crearPlantaLanzaGuisantes();

                            try {  //suficientes soles

                                eP.comprarPlantas(soles, planta);

                                if (soles - planta.getCoste() >= 0) {
                                    soles = soles - planta.getCoste();
                                    tablero[filaPLG][columnaPLG] = PlantaLanzaGuisantes.crearPlantaLanzaGuisantes();  //coste, resistencia, frecuencia, daño, ciclo
                                    contadorPlantaLanzaGuisantes++;
                                    tablero[filaPG][columnaPG].setCiclo(1);
                                }

                            } catch (MiExcepcion mE) {
                                System.out.println("\n" + mE.getMessage());
                            }

                        } catch (MiExcepcion mE) {
                            System.out.println("\n" + mE.getMessage());
                        }

                    } catch (MiExcepcion mE) {
                        System.out.println("\n" + mE.getMessage());
                    }

                } catch (Exception e) {
                    System.out.println("\n¡¡¡Fuera del tablero!!!");
                }
            }

            //zombies
            Random aleatorio = new Random();
            if (turnosInicialesSinZombis <= 0 && contadorZombis < numZombis) {
                int contAleatorio = aleatorio.nextInt(2);   //para que los Zmbs salgan cuando quieran
                if (contAleatorio == 1) {
                    filaZmb = aleatorio.nextInt(numFilas);
                    columnaZmb = numColumnas - 1;
                    if (tablero[filaZmb][columnaZmb] instanceof CasillaVacia) {  //para que no salga un zmb sobre otro
                        tablero[filaZmb][columnaZmb] = Zombie.crearZombie();
                        contadorZombis++;
                        contadorZombiesTablero++;
                    }
                }
            }

            //---------------------------------------------------------------------------------------
            zombisQuedan = numZombis - contadorZombis;
            System.out.println("");
            if (comprobadorImprimir == true){
                Tablero.imprimirTablero(tablero, numFilas, numColumnas);
                System.out.println("\nTienes " + soles + " soles y es el turno " + contadorTurno);
                System.out.println("Quedan " + zombisQuedan + " zombis por salir.");
                contadorTurno++;
                turnosInicialesSinZombis--;
            }
            comprobadorImprimir = true;
            //---------------------------------------------------------------------------------------

            //finPartida == true
            if (finPartida(tablero, numFilas, numColumnas, contadorZombis, numZombis, contadorTurno) == true) { 
                if (contadorZombis == numZombis) {
                    System.out.println("\nHan ganado las PLANTAS!!!!");
                } else {
                    System.out.println("\nHan ganado los ZOMBIES!!!!");
                }
                System.exit(0);
            }

            //movimientos
            for (int i = 0; i < numFilas; i++) {
                int contadorDanioFila = 0;

                for (int j = 0; j < numColumnas; j++) {
                    if (tablero[i][j] instanceof PlantaGirasol) {  //Planta Girasol
                        if (tablero[i][j].getCiclo() == -1) {
                            soles = PlantaGirasol.generarSoles(soles);
                            tablero[i][j].setCiclo(1);
                        } else {
                            tablero[i][j].setCiclo(-1);
                        }
                    } else if (tablero[i][j] instanceof PlantaLanzaGuisantes) {  //Planta LanzaGuisantes
                        contadorDanioFila++;
                    }
                    if (tablero[i][j] instanceof Zombie) {  //Zombie
                        tablero[i][j].setResistencia(tablero[i][j].getResistencia() - contadorDanioFila);
                        if (tablero[i][j].getCiclo() == -1) {  //para controlar que sea cada dos cicols
                            tablero[i][j].setCiclo(1);  //a la siguiente descansa
                            if (tablero[i][j].getResistencia() > 0) {
                                tablero = Zombie.movimientoZmb(tablero, i, j, casillaVacia);
                            } else {  //muere zombie
                                tablero[i][j] = casillaVacia;
                                contadorZombiesTablero--;
                                contadorZombiesMuertos++;
                            }
                        } else if (tablero[i][j].getCiclo() == 1) {
                            tablero[i][j].setCiclo(-1);
                        }
                    }
                    if (tablero[i][j].getResistencia() <= 0){
                        tablero[i][j] = casillaVacia;
                    }
                }
            }

            //----------------------------------------------------------------------------------------
            if (finPartida == false) {
                listaLineaComandos = ExcepcionJuego.pedirInstruccion(contadorTurno);
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

    /**
     * Comprueba si la partida debe terminar
     * @param tablero
     * @param numFilas
     * @param numColumnas
     * @param contadorZombis
     * @param numZombis
     * @param contadorTurno
     * @return boolean
     */
    public static boolean finPartida(Objeto[][] tablero, int numFilas, int numColumnas, int contadorZombis, int numZombis, int contadorTurno) {
        if (finPartidaTurno30 (contadorTurno) == true){ //turno 30
            return true;
        } else if (finPartidaZmbColumna0(tablero, numFilas, numColumnas) == true){ //zmbs en columna 0
            return true;
        } else if (finPartidaQuedan0Zmb(tablero, numFilas, numColumnas, contadorZombis, numZombis) == true){ //no quedan más zombis por salir y no hay zombis en tablero
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Comprueba si el num del turno es mayor a 30
     * @param contadorTurno
     * @return boolean
     */
    public static boolean finPartidaTurno30 (int contadorTurno){
        if (contadorTurno > 30) {  
            return true;
        } else {
            return false;
        }
    }

    /**
     * Comprueba si hay Zmb en la columna 0
     * @param tablero
     * @param numFilas
     * @param numColumnas
     * @return boolean
     */
    public static boolean finPartidaZmbColumna0(Objeto[][] tablero, int numFilas, int numColumnas) {
        int comprobacion = 0;
        
        for (int i = 0; i < numFilas; i++) {  
            if (tablero[i][0] instanceof Zombie) {
                comprobacion++;
            }
        }
        
        if (comprobacion > 0){
            return  true;
        } else {
            return false;
        }
    }
    
    /**
     * Comprueba si ya no quedan por salir más zmb y si no hay zmbs en el tablero
     * @param tablero
     * @param numFilas
     * @param numColumnas
     * @param contadorZombis
     * @param numZombis
     * @param zombisQuedan
     * @return boolean
     */
    public static boolean finPartidaQuedan0Zmb(Objeto[][] tablero, int numFilas, int numColumnas, int contadorZombis, int numZombis) {

        if (contadorZombis == numZombis) {
            int comprobacion = 0;
            for (int i = 0; i < numFilas; i++) {
                for (int j = 0; j < numColumnas; j++) {
                    if (tablero[i][j] instanceof Zombie) {
                        comprobacion++;
                    }
                }
            }
            if (comprobacion > 0) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }

    }

}