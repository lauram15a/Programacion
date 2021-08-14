/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Usuario {

    private String DNI;
    private String nombre;

    public Usuario(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    
    
    
    
    
    
    
    
    
    /**
     * Comprobar si el dni es verdadero o no
     * 
     * @param dni
     * @return
     */
    public static boolean comprobarDNI(String dni) {

        String[] listaDNI = dni.split("");  //te mete cada palabra de la cadena como un element  //[4,5,5,7,9,1,6,6,c]

        if (comprobarLongitudDNI(listaDNI) == true) {  //comprobar longitud
            String letraDNIdada = listaDNI[8].toUpperCase(); //[C]
            int comprobadorFalse = 0;
            for (int i = 0; i < 8; i++) {
                if (comprobarIntNumeros(listaDNI[i]) == true) {
                    int num = Integer.parseInt(listaDNI[i]);  //[4,5,5,7,9,1,6,6]
                } else {
                    comprobadorFalse++; //0
                }
            }
            if (comprobadorFalse == 0) {
                String cadenaNum = "";
                for (int i = 0; i < 8; i ++){
                    cadenaNum = cadenaNum + listaDNI[i];
                }

                int numDNI = Integer.parseInt(cadenaNum); 

                if (comprobarLetraDNI(letraDNIdada, numDNI) == true) {  //comprobar letra del dni
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    /**
     * Comprueba si la longitu es 9
     *
     * @param dni
     * @return boolean
     */
    public static boolean comprobarLongitudDNI(String[] listaDNI) {

        if (listaDNI.length != 9) {
            return false;
        } else {
            return true;
        }
    }

    /**
     *Comprueba si la el número en sí del dni es un entero
     * 
     * @param cadenaDNI
     * @return boolean
     */
    public static boolean comprobarIntNumeros(String cadenaDNI) {
        try {
            Integer.parseInt(cadenaDNI);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    
    /**
     * Comprueba la letra del DNI
     * 
     * @param letraDNIdada
     * @param numDNI
     * @return
     */
    public static boolean comprobarLetraDNI (String letraDNIdada, int numDNI){
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int posicionDNI = numDNI % 23;
        String letraDNI = letras[posicionDNI];
        
        if (letraDNIdada.equals(letraDNI)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static String imprimirCadena(String dni) {
        String[] listaDNI = dni.split("");
        String cadenaNum = "";
        for (int i = 0; i < 9; i++) {
            if (i != 8){
                cadenaNum = cadenaNum + listaDNI[i];
            } else {
                cadenaNum = cadenaNum + listaDNI[i].toUpperCase();
            }
        }
        return cadenaNum;
    }
    
    public static String prepararDNI (String dni){
        String[] listaDNI = dni.split("");
        String cadenaNum = "";
        for (int i = 0; i < 9; i++){
            if (i != 8){
                cadenaNum = cadenaNum + listaDNI[i];
            } else {
                cadenaNum = cadenaNum + listaDNI[i].toUpperCase();
            }
        }
        return cadenaNum;
    }
}