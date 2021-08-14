/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */
public class Cadenass {
    
    public static void main (String[] args){
        
        String cadena = "Hola me llamo Laura.";
        String palabra = "Hola";
        String variableString = "45781";
        
        //CAMBIAR TIPO DE DATO
        int variable = Integer.parseInt(variableString); //pasar de string a int
        
        //CORTAR CADENA
        cadena.substring(7); // Nos devuelve a partir del elemento 7
        String subCadena = cadena.substring(5,10);  // Nos devuelve los elementos 5,6,7,8 y 9
        System.out.println("Posición:" + palabra.indexOf("a"));  //devuelve la posicion en la que se encuentra la letra
        
        //MAYÚSCULAS Y MINÚSCULAS
        String sCadena = "Esto Es Una Cadena De TEXTO"; 
        System.out.println(sCadena.toLowerCase());  //pasar toda la cadena a minúsculas
        System.out.println(sCadena.toUpperCase());  //pasar toda la cadena a mayúsculas
        
        
        //for (int i = 0; i < palabra.length();i++)  //recorrer cadena
       
        
        //LISTAS Y CADENAS
        char[] lista = palabra.toCharArray(); //pasa cada letra  a ser un elemento de la lista
        
        String[] listaCadena = cadena.split("\\s+");  //te mete cada palabra de la cadena como un element
    }            
}
