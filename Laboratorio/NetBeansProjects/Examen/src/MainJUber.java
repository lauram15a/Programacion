
import java.time.LocalDateTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */
public class MainJUber {

    public static void main(String[] args) {
        
        //creamos persona
        Persona p1 = new Persona ("Laura", "78897532B", "laura@gmail.com", 678945236);
        Persona p2 = new Persona ("María", "12897532B", "maria@gmail.com", 623456789);
        
        //creamos cliente
        Cliente cliente1 = new Cliente ("Laura", "78897532B", "laura@gmail.com", 678945236, "contraseña", 123467);
        
        //creamos conductor
        Conductor conductor1 = new Conductor ("María", "12897532B", "maria@gmail.com", 623456789, 0);
        
        //creamos flota
        LocalDateTime hoy = LocalDateTime.now();
        Flota f1 = new Flota ("4456BTF", "Seat", "León", "JUberX");
        
        //creamos ubicacio
        Ubicacion ubicacionRecogida = new Ubicacion ("EPS", 40.512824, -3.348736);
        Ubicacion ubicacionDestino = new Ubicacion ("Aeropuerto de Barajas T4", 40.489091, -3.593678);
        
        //creamos servicio
        double distancia = Servicio.calcularDistancia(ubicacionRecogida, ubicacionDestino);
        double coste = Servicio.calcularCoste(f1, ubicacionRecogida, ubicacionDestino);
        
        Servicio s1 = new Servicio (hoy, f1, ubicacionRecogida, ubicacionDestino, distancia, coste, cliente1, conductor1, 4);
        
        //calculamos sueldo  LO PONGO COMENTADO PORQUE ME DA ERROR Y NO ME DA TIEMPO A REVISARLO
        //double sueldo = Conductor.calcularSalario(f1, ubicacionRecogida, ubicacionDestino);
       // conductor1.setSalario(sueldo);
        
        //
        System.out.println(Aplicacion.introducirServicio(s1));
                
        
        
        //
        
    }
    
}
