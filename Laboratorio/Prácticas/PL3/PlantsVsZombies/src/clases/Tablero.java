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
public class Tablero {

    /**
     * Crea tablero
     * @param filas
     * @param columnas
     * @return Objeto[][] tablero
     */
    
    
    
    public Tablero() {
    }

    public static Objeto[][] crearTablero(int filas, int columnas) {
        Objeto[][] tablero = new Objeto[filas][columnas];
        return tablero;
    }
    
    
    
    public static Objeto[][] rellenarTableroInterfaz(int filas, int columnas, CasillaVacia casillaVacia)
            
    {
         Objeto[][] tablero = crearTablero(filas, columnas);
          for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = casillaVacia;
            }
        }
        return tablero;
  
    }
    /**
     * Rellena el tablero de casillas vacías
     * @param tablero
     * @param casillaVacia
     * @param numFilas
     * @param numColumnas
     * @return Objeto[][] tablero
     */
    public static Objeto[][] rellenarTablero (Objeto[][] tablero, CasillaVacia casillaVacia, int numFilas, int numColumnas){
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                tablero[i][j] = casillaVacia;
            }
        }
        return tablero;
    }

    /**
     * Imprime tablero
     * @param tablero
     * @param numFilas
     * @param numColumnas
     */
    public static void imprimirTablero(Objeto[][] tablero, int numFilas, int numColumnas) {
        int contador = -1;
        int numLinea = 1;

        while (numLinea <= numColumnas) {
            if (numLinea == numColumnas) {  //última columna
                if (numLinea > 10) {  // dos cifras
                    System.out.println("       " + numLinea++);
                } else {
                    System.out.println("        " + numLinea++);
                }
            } else if (numLinea == 1) {  //primera columna
                System.out.print("         " + numLinea++);
            } else if (numLinea > 10) {  // dos cifras
                System.out.print("       " + numLinea++);
            } else {  //las demás columnas
                System.out.print("        " + numLinea++);
            }

        }

        for (int i = 0; i < (numFilas * 2) + 1; i++) {
            if (i % 2 == 0) {
                contador++;
            }
            for (int j = 0; j < numColumnas; j++) {

                if ((i % 2) == 0) { //filas de las rallas
                    if (j == 0) { //primera columna
                        System.out.print("     |--------|");
                    } else if (j == (numColumnas - 1)) {  //última columna
                        System.out.println("--------|");
                    } else {  //columnas del medio
                        System.out.print("--------|");
                    }
                } else { //filas de rellenar
                    if (j == 0) { //primera columna
                        if (contador < 9) {
                            if (tablero[contador][j] instanceof CasillaVacia) {
                                System.out.print((contador + 1) + "    |        |");
                            } else if (tablero[contador][j] instanceof PlantaGirasol) {
                                System.out.print((contador + 1) + "    |  G(" + tablero[contador][j].getResistencia() + ")  |");
                            } else if (tablero[contador][j] instanceof PlantaLanzaGuisantes) {
                                System.out.print((contador + 1) + "    |  L(" + tablero[contador][j].getResistencia() + ")  |");
                            } else if (tablero[contador][j] instanceof PlantaNuez) {
                                System.out.print((contador + 1) + "    |  N(" + tablero[contador][j].getResistencia() + ")  |");
                            } else if (tablero[contador][j] instanceof PlantaPetaCereza) {
                                System.out.print((contador + 1) + "    |  P(" + tablero[contador][j].getResistencia() + ")  |");
                            } else if (tablero[contador][j] instanceof ZombieComun) {
                                System.out.print((contador + 1) + "    |  Z(" + tablero[contador][j].getResistencia() + ")  |");
                            } else if (tablero[contador][j] instanceof ZombieCaraCubo) {
                                System.out.print((contador + 1) + "    | ZC(" + tablero[contador][j].getResistencia() + ")  |");
                            } else if (tablero[contador][j] instanceof ZombieDeportista) {
                                System.out.print((contador + 1) + "    | ZD(" + tablero[contador][j].getResistencia() + ")  |");
                            }
                        } else {
                            if (tablero[contador][j] instanceof CasillaVacia) {
                                System.out.print((contador + 1) + "   |        |");
                            } else if (tablero[contador][j] instanceof PlantaGirasol) {
                                System.out.print((contador + 1) + "   | G(" + tablero[contador][j].getResistencia() + ")  |");
                            } else if (tablero[contador][j] instanceof PlantaLanzaGuisantes) {
                                System.out.print((contador + 1) + "   | L(" + tablero[contador][j].getResistencia() + ")  |");
                            } else if (tablero[contador][j] instanceof PlantaNuez) {
                                System.out.print((contador + 1) + "   |  N(" + tablero[contador][j].getResistencia() + ")  |");
                            } else if (tablero[contador][j] instanceof PlantaPetaCereza) {
                                System.out.print((contador + 1) + "   |  P(" + tablero[contador][j].getResistencia() + ")  |");
                            } else if (tablero[contador][j] instanceof ZombieComun) {
                                System.out.print((contador + 1) + "   |  Z(" + tablero[contador][j].getResistencia() + ")  |");
                            } else if (tablero[contador][j] instanceof ZombieCaraCubo) {
                                System.out.print((contador + 1) + "   | ZC(" + tablero[contador][j].getResistencia() + ")  |");
                            } else if (tablero[contador][j] instanceof ZombieDeportista) {
                                System.out.print((contador + 1) + "   | ZD(" + tablero[contador][j].getResistencia() + ")  |");
                            }
                        }

                    } else if (j == (numColumnas - 1)) {  //última columna
                        if (tablero[contador][j] instanceof CasillaVacia) {
                            System.out.println("        |");
                        } else if (tablero[contador][j] instanceof PlantaGirasol) {
                            System.out.println("  G(" + tablero[contador][j].getResistencia() + ")  |");
                        } else if (tablero[contador][j] instanceof PlantaLanzaGuisantes) {
                            System.out.println("  L(" + tablero[contador][j].getResistencia() + ")  |");
                        } else if (tablero[contador][j] instanceof PlantaNuez) {
                            System.out.println("  N(" + tablero[contador][j].getResistencia() + ")  |");
                        } else if (tablero[contador][j] instanceof PlantaPetaCereza) {
                            System.out.println("  P(" + tablero[contador][j].getResistencia() + ")  |");
                        } else if (tablero[contador][j] instanceof ZombieComun) {
                            System.out.println("  Z(" + tablero[contador][j].getResistencia() + ")  |");
                        } else if (tablero[contador][j] instanceof ZombieCaraCubo) {
                            System.out.println(" ZC(" + tablero[contador][j].getResistencia() + ")  |");
                        } else if (tablero[contador][j] instanceof ZombieDeportista) {
                            System.out.println(" ZD(" + tablero[contador][j].getResistencia() + ")  |");
                        }
                    } else {  //columnas del medio
                        if (tablero[contador][j] instanceof CasillaVacia) {
                            System.out.print("        |");
                        } else if (tablero[contador][j] instanceof PlantaGirasol) {
                            System.out.print("  G(" + tablero[contador][j].getResistencia() + ")  |");
                        } else if (tablero[contador][j] instanceof PlantaLanzaGuisantes) {
                            System.out.print("  L(" + tablero[contador][j].getResistencia() + ")  |");
                        } else if (tablero[contador][j] instanceof PlantaNuez) {
                            System.out.print("  N(" + tablero[contador][j].getResistencia() + ")  |");
                        } else if (tablero[contador][j] instanceof PlantaPetaCereza) {
                            System.out.print("  P(" + tablero[contador][j].getResistencia() + ")  |");
                        } else if (tablero[contador][j] instanceof ZombieComun) {
                            System.out.print("  Z(" + tablero[contador][j].getResistencia() + ")  |");
                        } else if (tablero[contador][j] instanceof ZombieCaraCubo) {
                            System.out.print(" ZC(" + tablero[contador][j].getResistencia() + ")  |");
                        } else if (tablero[contador][j] instanceof ZombieDeportista) {
                            System.out.print(" ZD(" + tablero[contador][j].getResistencia() + ")  |");
                        }
                    }
                }
            }
        }
    }
    
    /**
     * Imprimir mensajes
     * 
     * @param tablero
     * @param numFilas
     * @param numColumnas
     * @param soles
     * @param numZombis
     */
    public static void imprimirMensajes (Objeto[][] tablero, int numFilas, int numColumnas, int[] soles, int numZombis, int[] contadorZombisQuedan){
        Tablero.imprimirTablero(tablero, numFilas, numColumnas);
        System.out.println("\nTienes " + soles[0] + " soles y es el turno 0.");
        System.out.println("Quedan " + contadorZombisQuedan[0] + " zombis por salir.");
    }
    
    /**
     *
     * Agregar objetos a tablero
     * 
     * @param tablero
     * @param objeto
     * @param filaObjeto
     * @param columnaObjeto
     * @return
     */
    public static Objeto[][] agregarPlanta(Objeto[][] tablero, int[] soles, String[] listaLineaComandos, int numFilas, int numColumnas, String modoSeleccion) {
        int fila = Integer.parseInt(listaLineaComandos[1]) - 1;
        int columna = Integer.parseInt(listaLineaComandos[2]) - 1;
        ExcepcionPlanta eP = new ExcepcionPlanta();
        Planta planta = Planta.crearPlanta();

        try {  //dentro del tablero

            eP.fueraTablero(numFilas, numColumnas, fila, columna);

            try {  //no última columna

                eP.ultimaColumna(numColumnas, columna);

                try {  //casilla no ocupada

                    eP.casillaOcupada(tablero, fila, columna);
                    
                    if ("G".equals(modoSeleccion)) {  //PlantaGirasol
                        planta = PlantaGirasol.crearPlantaGirasol();
                    } else if ("L".equals(modoSeleccion)) { //eligen PlantaLanzaGuisantes
                        planta = PlantaLanzaGuisantes.crearPlantaLanzaGuisantes();
                    } else if ("N".equals(modoSeleccion)) { //eligen PlantaLanzaGuisantes
                        planta = PlantaNuez.crearPlantaNuez();
                    } else if ("P".equals(modoSeleccion)) { //eligen PlantaLanzaGuisantes
                        planta = PlantaPetaCereza.crearPlantaPetaCereza();
                    }
                        

                    try {  //suficientes soles

                        eP.comprarPlantas(soles[0], planta);

                        if (soles[0] - planta.getCoste() >= 0) {
                            soles[0] = soles[0] - planta.getCoste();
                            tablero[fila][columna] = planta;  //coste, resistencia, frecuencia, daño, ciclo
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
        
        return tablero;
    }
    
    /**
     *Agregar Zombis
     * 
     * @param tablero
     * @param numFilas
     * @param numColumnas
     * @param contadorZombis
     * @param contadorZombiesTablero
     * @param turnosInicialesSinZombis
     * @param numZombis
     */
    public static Objeto[][] agregarZombie(Objeto[][] tablero, int numFilas, int numColumnas, int[] contadorZombis, int[] contadorZombiesTablero, int turnosInicialesSinZombis, int numZombis, int[] contadorZombisQuedan) {
        
        if (turnosInicialesSinZombis <= 0 && contadorZombis[0] < numZombis) {
            Random aleatorio = new Random();
            int contAleatorio = aleatorio.nextInt(2);   //para que los Zmbs salgan cuando quieran
            if (contAleatorio == 0) {
                int filaZmb = aleatorio.nextInt(numFilas);
                int columnaZmb = numColumnas - 1;
                if (tablero[filaZmb][columnaZmb] instanceof CasillaVacia) {  //para que no salga un zmb sobre otro
                    int eleccionZmb = aleatorio.nextInt(3);
                    if (eleccionZmb == 0) {
                        tablero[filaZmb][columnaZmb] = ZombieComun.crearZombieComun();
                    } else if (eleccionZmb == 1) {
                        tablero[filaZmb][columnaZmb] = ZombieCaraCubo.crearZombieCaraCubo();
                    } else {
                        tablero[filaZmb][columnaZmb] = ZombieDeportista.crearZombieDeportista();
                    }
                    contadorZombis[0]++;
                    contadorZombisQuedan[0] = numZombis - contadorZombis[0];
                    contadorZombiesTablero[0]++;
                }
            }
        }
        return tablero;
    }
    
    /**
     * Movimientos de la partida
     * 
     * @param tablero
     * @param numFilas
     * @param numColumnas
     * @param soles
     * @param casillaVacia
     * @param contadorZombiesTablero
     * @param contadorZombiesMuertos
     * @return
     */
    public static Objeto[][] movimientos(Objeto[][] tablero, int numFilas, int numColumnas, int[] soles, CasillaVacia casillaVacia, int[] contadorZombiesTablero, int[] contadorZombiesMuertos) {
        for (int i = 0; i < numFilas; i++) {
            int contadorDanioFila = 0;

            for (int j = 0; j < numColumnas; j++) {
                if (tablero[i][j] instanceof PlantaGirasol) {  //Planta Girasol
                    if (tablero[i][j].getCiclo() == -1) {
                        PlantaGirasol.generarSoles(soles);
                        tablero[i][j].setCiclo(1);
                    } else {
                        tablero[i][j].setCiclo(-1);
                    }
                    //Planta LanzaGuisantes
                } else if (tablero[i][j] instanceof PlantaLanzaGuisantes) {
                    contadorDanioFila++;
                    //Planta PetaCereza
                } else if (tablero[i][j] instanceof PlantaPetaCereza) {
                    if (tablero[i][j].getCiclo() == 2) {
                        tablero = PlantaPetaCereza.petaLaCereza(tablero, i, j, numFilas, numColumnas, casillaVacia);
                    } else {
                        tablero[i][j].setCiclo(tablero[i][j].getCiclo() + 1);
                    }
                    //Zombie
                } else if (tablero[i][j] instanceof Zombie) {
                    tablero[i][j].setResistencia(tablero[i][j].getResistencia() - contadorDanioFila);
                    //ZombieComun
                    if (tablero[i][j] instanceof ZombieComun) {
                        if (tablero[i][j].getCiclo() == -1) {  //para controlar que sea cada 2 cicols
                            tablero[i][j].setCiclo(1);  //a la siguiente descansa
                            if (tablero[i][j].getResistencia() > 0) {
                                tablero = Zombie.movimientoZmb(tablero, i, j, casillaVacia);
                            } else {  //muere zombie
                                tablero[i][j] = casillaVacia;
                                contadorZombiesTablero[0]--;
                                contadorZombiesMuertos[0]++;
                            }
                        } else if (tablero[i][j].getCiclo() == 1) {
                            tablero[i][j].setCiclo(-1);
                        }
                        //ZombieCaraCubo
                    } else if (tablero[i][j] instanceof ZombieCaraCubo) {
                        if (tablero[i][j].getCiclo() == 4) {  //para controlar que sea cada 4 cicols
                            tablero[i][j].setCiclo(0);  //a la siguiente descansa
                            if (tablero[i][j].getResistencia() > 0) {
                                tablero = Zombie.movimientoZmb(tablero, i, j, casillaVacia);
                            } else {  //muere zombie
                                tablero[i][j] = casillaVacia;
                                contadorZombiesTablero[0]--;
                                contadorZombiesMuertos[0]++;
                            }
                        } else {
                            tablero[i][j].setCiclo(tablero[i][j].getCiclo() + 1);
                        }
                        //ZombieDeportista
                    } else if (tablero[i][j] instanceof ZombieDeportista) {
                        if (tablero[i][j].getResistencia() > 0) {
                            tablero = Zombie.movimientoZmb(tablero, i, j, casillaVacia);
                        } else {  //muere zombie
                            tablero[i][j] = casillaVacia;
                            contadorZombiesTablero[0]--;
                            contadorZombiesMuertos[0]++;
                        }
                    }
                }
                if (tablero[i][j].getResistencia() <= 0) {
                    tablero[i][j] = casillaVacia;
                }
            }
        }
        return tablero;
    }

}



