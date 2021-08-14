/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.io.File;

/**
 *
 * @author SOTPORT
 */
public class PruebaListadoFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File directorio = new File("imagenes");
        if (directorio.exists() && directorio.isDirectory()) {
            String listado[] = directorio.list();
            System.out.println("\n- Listado del directorio:");
            for (int i = 0; i < listado.length; i++) {
                System.out.println(listado[i] + "\n");
            }
        }

    }
}
