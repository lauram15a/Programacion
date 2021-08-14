
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */
public class Aplicacion {
    
    private static ArrayList<Servicio> historico = new ArrayList<Servicio>();
    
    public static ArrayList<Servicio> getHistorico(){
        return historico;
    }
    
    public static String introducirServicio (Servicio v){
        if (historico.contains(v)){  //sí está dentro
            return "El servicio ya está";
        } else {
            historico.add(v);
            return "servicio agregado: " + v.toString();
        }
    }
    
}
