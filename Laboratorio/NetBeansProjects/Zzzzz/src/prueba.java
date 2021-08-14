/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] numeroos = new int[] {1,2,3,4,5,6,7,8,9,10};
        
        remueveElement(numeroos, 5);
        System.out.println(eliminarElemento(numeroos, 5));
    }
    
    private static int[] eliminarElemento(int[] array, int elemento) // [1, 2, 3, 4, 5], 4
    {
        
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] != elemento)
            {
                System.out.println(array[i]);
                System.out.println(resultado.length);
                resultado[resultado.length] = array[i];
            }
        }
        return resultado;
    }
    
    public static Object[] remueveElement(Object[] arrayObjetos, int i) {
      System.arraycopy(arrayObjetos, i + 1, objeto,i, arrayObjetos.length - 1 - i);
      return arrayObjetos; 
   }
}
