/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */
public class Matrices {
    
    public static void main (String[] args){
        
        //CREAR MATRICES
        
        
        //matriz de datos int de 4 filas y 6 columnas:
        int [][] ventas = new int[4][6];
        
        //matriz de datos double de 3 filas y 4 columnas:
        double [][] temperaturas = new double[3][4];
        
        //matriz de datos String
        String[][] matrix = new String[1][6];
        
        //matrices irregulares
        int [][] m = new int[3][]; //crea una matriz m de 3 filas.
        //A cada fila se le puede asignar un número distinto de columnas:
        m[0] = new int[3];
        m[1] = new int[5];
        m[2] = new int[2];
        
        
        
        //INICIALIZAR MATRICES
        
        
        //matriz numeros de tipo int, de 4 filas y 3 columnas
        int [][] numeros = {{6,7,5}, {3, 8, 4}, {1,0,2}, {9,5,2}};
        
        //matriz irregular de 4 filas. La primera de 5 columnas, la segunda de 3, la tercera de 4 y la cuarta de 2
        int [][] a = {{6,7,5,0,4}, {3, 8, 4}, {1,0,2,7}, {9,5}};
        
        
        
        //RECORRER MATRICES
        
        
        //Usaremos siempre length para obtener el número de columnas que tiene cada fila
        for (int i = 0; i < a.length; i++) {  //número de filas
            for (int j = 0; j < a[i].length; j++) { //número de columnas de cada fila
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
