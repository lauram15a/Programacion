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
public class Tablero {

    /**
     * Crea tablero
     * @param filas
     * @param columnas
     * @return Objeto[][] tablero
     */
    public static Objeto[][] crearTablero(int filas, int columnas) {
        Objeto[][] tablero = new Objeto[filas][columnas];
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
                            } else if (tablero[contador][j] instanceof Zombie) {
                                System.out.print((contador + 1) + "    |  Z(" + tablero[contador][j].getResistencia() + ")  |");
                            }
                        } else {
                            if (tablero[contador][j] instanceof CasillaVacia) {
                                System.out.print((contador + 1) + "   |        |");
                            } else if (tablero[contador][j] instanceof PlantaGirasol) {
                                System.out.print((contador + 1) + "   | G(" + tablero[contador][j].getResistencia() + ")  |");
                            } else if (tablero[contador][j] instanceof PlantaLanzaGuisantes) {
                                System.out.print((contador + 1) + "   | L(" + tablero[contador][j].getResistencia() + ")  |");
                            } else if (tablero[contador][j] instanceof Zombie) {
                                System.out.print((contador + 1) + "   |  Z(" + tablero[contador][j].getResistencia() + ")  |");
                            }
                        }

                    } else if (j == (numColumnas - 1)) {  //última columna
                        if (tablero[contador][j] instanceof CasillaVacia) {
                            System.out.println("        |");
                        } else if (tablero[contador][j] instanceof PlantaGirasol) {
                            System.out.println("  G(" + tablero[contador][j].getResistencia() + ")  |");
                        } else if (tablero[contador][j] instanceof PlantaLanzaGuisantes) {
                            System.out.println("  L(" + tablero[contador][j].getResistencia() + ")  |");
                        } else if (tablero[contador][j] instanceof Zombie) {
                            System.out.println("  Z(" + tablero[contador][j].getResistencia() + ")  |");
                        }
                    } else {  //columnas del medio
                        if (tablero[contador][j] instanceof CasillaVacia) {
                            System.out.print("        |");
                        } else if (tablero[contador][j] instanceof PlantaGirasol) {
                            System.out.print("  G(" + tablero[contador][j].getResistencia() + ")  |");
                        } else if (tablero[contador][j] instanceof PlantaLanzaGuisantes) {
                            System.out.print("  L(" + tablero[contador][j].getResistencia() + ")  |");
                        } else if (tablero[contador][j] instanceof Zombie) {
                            System.out.print("  Z(" + tablero[contador][j].getResistencia() + ")  |");
                        }
                    }
                }
            }
        }
    }

}



