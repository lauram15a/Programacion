
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */
public class StringTokenizerr {
    
    public static void main (String [] args){
        
        StringTokenizer st = new StringTokenizer("Esta es una- - prueba");
        
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
    
}
