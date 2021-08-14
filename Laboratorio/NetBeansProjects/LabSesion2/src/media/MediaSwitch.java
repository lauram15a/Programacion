/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author laura
 */
public class MediaSwitch {
    
    public static void main( String args[] ) throws IOException {
        int contador, total, media;
        String nota;
        
        //Objeto para leer una cadena del teclado
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        // inicialización de variables
        total = 0;
        contador = 1;
        
        while ( contador <= 5 ) {
            System.out.println( "\nTeclee calificación (A,B,C,D,E): " );
            nota = entrada.readLine();
            switch (nota) {
                case "A":
                    total = total + 4;
                    break;
                case "B":
                    total = total + 3;
                    break;
                case "C":
                    total = total + 2;
                    break;
                case "D":
                    total = total + 1;
                    break;
                case "E":
                    total = total + 0;
                    break;
                default:
                    break;
            }
            
            contador = contador + 1;
        }
        
        media = total / 5;
        System.out.println("\n\nEl promedio del grupo es: " + media);
    
    }
}
