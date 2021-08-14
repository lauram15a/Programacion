/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author laura
 */
public class CambioInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] lista = {0};
        aja(lista);
        System.out.println(lista[0]);
        
        int a = 0;
        aba(a);
        System.out.println(a);

    }

    public static void aja(int[] lista) {
        lista[0]++;
    }
    
    public static void aba(int a) {
        a++;
    }
}
