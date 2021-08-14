/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class ExcepcionJuego {
    
    

    /**
     * Pide instrucción por teclado hasta que sea correcta
     * Si la instrucción es "ayuda", llama a la función imprimirLineaComandos()
     * @return String[] listaLineaComandos
     */
    public static String[] pedirInstruccion(int contadorTurno) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n(Teclear ''ayuda'' para lista de comandos. <Enter> para terminar el turno.)");
        String lineaComandos = entrada.nextLine();
        String[] listaLineaComandos = lineaComandos.split("\\s+");  //te mete cada palabra de la cadena como un element

        while (comprobarInstruccion(listaLineaComandos) == false) {
            System.out.println("\n¡¡¡¡Instrucción no válida!!!!");
            listaLineaComandos = pedirInstruccion(contadorTurno);
        }

        if ("AYUDA".equals(listaLineaComandos[0].toUpperCase())) {
            imprimirLineaComandos();
            System.out.println("\n--> Ahora que sabe, introduzca instrucción:");
            listaLineaComandos = pedirInstruccion(contadorTurno);
        }
        
        if ("S".equals(listaLineaComandos[0].toUpperCase())) {
            System.out.println("\nHas abandonado la partida.");
            System.exit(0);
        }
        
        //primera instrucción que se meta sea la de determinar las dimensiones del tablero y seleccionar la dificultad
        if (contadorTurno == 0) {
            while (!"N".equals(listaLineaComandos[0].toUpperCase()) && !"S".equals(listaLineaComandos[0].toUpperCase())) {
                System.out.println("\n¡¡¡¡No puede dar esa instrucción porque no ha iniciado ninguna partida!!!! Introduzca la instrucción requrida: ");
                listaLineaComandos = ExcepcionJuego.pedirInstruccion(contadorTurno);
            }

            int numFilas = Integer.parseInt(listaLineaComandos[1]);
            int numColumnas = Integer.parseInt(listaLineaComandos[2]);

            while (ExcepcionJuego.tamanioTableroFilas(numFilas) != true || ExcepcionJuego.tamanioTableroColumnas(numColumnas) != true) {
                listaLineaComandos = ExcepcionJuego.pedirInstruccion(contadorTurno);
                numFilas = Integer.parseInt(listaLineaComandos[1]);
                numColumnas = Integer.parseInt(listaLineaComandos[2]);
            }
        }

        return listaLineaComandos;
    }
    
    /**
     * Imprime las instrucciones
     */
    public static void imprimirLineaComandos() {
        System.out.println("\nN <filas> <columnas> <Dificultad>: Nueva partida (Dificultad: BAJA, MEDIA, ALTA, IMPOSIBLE).");
        System.out.println("G <fila> <columna>: colocar girasol.");
        System.out.println("L <fila> <columna>: colocar LanzaGuisantes.");
        System.out.println("S: Salir de la aplicación.");
        System.out.println("<Enter>: Pasar Turno");
    }

    /**
     * Comprueba si la instrucción introducida es correcta
     * @param listaLineaComandos
     * @return boolean
     */
    public static boolean comprobarInstruccion(String[] listaLineaComandos) {

        if ("AYUDA".equals(listaLineaComandos[0].toUpperCase())) {  //ayuda
            if (listaLineaComandos.length != 1) {  //mas de un elemento en lista
                return false;
            } else {   //mas de un elemento en lista
                return true;
            }
        } else if ("N".equals(listaLineaComandos[0].toUpperCase())) {  //nueva partida
            if (listaLineaComandos.length != 4) {  //sin 4 elementos
                return false;
            } else {
                if (esEntero(listaLineaComandos[1]) == false) {  //no es int la fila
                    return false;
                } else if (esEntero(listaLineaComandos[2]) == false) { //no es int la columna
                    return false;
                } else {
                    return comprobarDificultad(listaLineaComandos);
                }
            }
        } else if ("L".equals(listaLineaComandos[0].toUpperCase()) || "G".equals(listaLineaComandos[0].toUpperCase())) {  //plantas
            if (listaLineaComandos.length != 3) {  //sin 3 elementos
                return false;
            } else {
                if (esEntero(listaLineaComandos[1]) == false) {  //no es int la fila
                    return false;
                } else if (esEntero(listaLineaComandos[2]) == false) { //no es int la columna
                    return false;
                } else {
                    return true;
                }
            }
        } else if ("".equals(listaLineaComandos[0])) {  //paso de turno
            return true;
        } else if ("S".equals(listaLineaComandos[0].toUpperCase())) {  //salir
            if (listaLineaComandos.length != 1) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    /**
     * Comprueba si las filas y columnas son enteros
     * @param elemento
     * @return boolean
     */
    public static boolean esEntero(String elemento) {
        try {
            Integer.parseInt(elemento);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    /**
     * Comprueba si la dificultad introducida es correcta
     * @param listaLineaComandos
     * @return boolean
     */
    public static boolean comprobarDificultad(String[] listaLineaComandos) {
        if ("BAJA".equals(listaLineaComandos[3].toUpperCase()) || "MEDIA".equals(listaLineaComandos[3].toUpperCase()) || "ALTA".equals(listaLineaComandos[3].toUpperCase()) || "IMPOSIBLE".equals(listaLineaComandos[3].toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Comprueba que el num de filas sea mayor que 0 y menor que 100
     * @param numFilas
     * @return boolean
     */
    public static boolean tamanioTableroFilas(int numFilas) {
        if (numFilas < 1) {
            System.out.println("\nComo mínimo debe haber 1 fila para poder jugar.");
            System.out.println("Le recomendamos que el máximo número de filas sea 15.");
            return false;
        } else if (numFilas > 99) {
            System.out.println("\nComo mucho el número de filas será 99, si no el juego es aburrido.");
            System.out.println("Le recomendamos que el máximo número de filas sea 15.");
            return false;
        } else {
            return true;
        }
    }

    /**
     * Comprueba que el num de columnas sea mayor que 0 y menor que 100
     * @param numColumnas
     * @return boolean
     */
    public static boolean tamanioTableroColumnas(int numColumnas) {
        if (numColumnas < 3) {
            System.out.println("\nComo mínimo debe haber 3 columnas para poder jugar.");
            System.out.println("Le recomendamos que el máximo número de columnas sea 15.");
            return false;
        } else if (numColumnas > 99) {
            System.out.println("\nComo mucho el número de columnas será 99, si no el juego es aburrido.");
            System.out.println("Le recomendamos que el máximo número de columnas sea 15.");
            return false;
        } else {
            return true;
        }
    }

}
