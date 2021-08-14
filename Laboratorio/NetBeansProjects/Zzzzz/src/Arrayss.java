
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */
public class Arrayss {
    
    public static void main (String[] args){
        
        //CREAR ARRAYS
        
        //crear lista de enteros (100 elementos)
        int [] numeros = new int [100];
        
        //crear lista de strings (100 elementos)
        String[]letras = new String[100];
        
        //crear lista de caracteres
        char caracteres[] = new char [50];
        
        
        // INICIALIZAR ARRAYS
        
        int [] numeroos = new int[] {1,2,3,4,5,6,7,8,9,10};
        String []nombres = new String[] {"Hola","yo","me","llamo","Laura"};  
        
        
        // array --> string
        String str = Arrays.toString(numeroos);
        
        // string --> array
        String hola = "Hola me llamo Laura y tengo 19 años.";
        String[] listaHola = hola.split("\\s+");  //te mete cada palabra de la cadena como un element
        
        //COSAS CHULAS
        
        //add() --> añadir un objeto 
        //remove() --> borrar objeto
        //set() --> remplazar un elemento
        //contains(), indexOf() o lastIndexOf() --> buscar un elemento en concreto 
        //get() --> extraer un objeto de una posición específica
        
        
        //borrar
        //Borrar el ultimo elemento pop()
        String[] myFish = new String[] {"angel", "clown", "mandarin", "surgeon"}; 
        //String[] popped = myFish.pop();

        //Borra el primer elemento shift()
        //myFish = ["angel", "clown", "mandarin", "surgeon"];
        //String[] shifted = myFish.shift();

        //Borra una posicion determinada del arreglo
        //arreglo = new Array("redwood", "bay", "cedar", "oak", "maple");
        //delete arreglo[3];
        
        
        //borrar
        ArrayList<Integer> a = new ArrayList<>();
        {
            { //Declaración y creación del ArrayList de enteros.
                a.add(4);
                a.add(4);
                a.add(12);
                a.add(3);
                a.add(41);
                a.add(39);
                a.add(21);
                a.add(4);
            }
        }
        int num = 4;  //número que quieres eliminar
        for (int i = a.size() - 1; i > 0; i--) {
            if (a.get(i).equals(num)) {       //Se eliminan el número/s igual al que se ha introducido por teclado.
                a.remove(i);
            }
        }
        for (int i = 0; i < a.size(); i++) { //Se muestra.
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
    }
}

