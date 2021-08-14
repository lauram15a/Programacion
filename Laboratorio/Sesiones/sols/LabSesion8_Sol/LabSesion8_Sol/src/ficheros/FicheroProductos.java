package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FicheroProductos {

    public static void main(String[] args) {
        // TODO code application logic here
        leer();
    }

    public static void leer() {
        String cad;
        try {
            FileInputStream fis = new FileInputStream("productos.txt");
            InputStreamReader isr = new InputStreamReader(fis, "ISO-8859-1");
            BufferedReader br = new BufferedReader(isr);
            PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter("productos_iva.txt")));
            String cadena = "";
            String array[];
            while ((cad = br.readLine()) != null) {
                System.out.println(cad);
                array = cad.split(";");
                double precio = Double.parseDouble(array[6].trim()); //trim quita espacios en blanco
                precio += (precio * 0.18);
                for (int i = 0; i < array.length - 1; i++) {
                    cadena += array[i] + ";";
                }
                cadena += " " + precio + ";";
                salida.println(cadena);
                cadena = "";
            }
            //Cerramos el stream
            br.close();
            salida.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}
