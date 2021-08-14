/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;

/**
 *
 * @author laura
 */

public class Whilee {
    public static void main(String args[]) {
        int i = 10;
        while (i > 0) {
            System.out.println("i:" + i--); // si ponemos --i retornará a partir de 9, y no de 10
        }
    }
}
