/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcamiento;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

/**
 *
 * @author laura
 */
public class Automovil extends Vehiculo {
    
    private String tipo;
    
    //constructor
    public Automovil(String matricula, boolean abono, String tipo) {
        super (matricula, abono);
        this.tipo = tipo;
    }
    
    public Automovil(String matricula, LocalDateTime fecha, boolean abono, String tipo) {
        super (matricula, fecha, abono);
        this.tipo = tipo;
    }

    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public double calcularImporte(){
        LocalDateTime fechaSalida = LocalDateTime.now();
        long minutos = ChronoUnit.MINUTES.between(this.getFecha(), fechaSalida);
        double tasa = 0;
        double total = 0;
        
        switch (tipo){
            case "turismo":
                tasa = 1.5;
                break;
            case "todoterreno":
                tasa = 2.5;
                break;
            case "furgoneta":
                tasa = 3.5;
                break;
        }
        
        total = minutos + tasa / 60;
        
        if (this.isAbono()){
            total -= (total * 0.4);
        }
        
        return total;
    }
    
    @Override
    public String toString() {
        return super.toString() + " # Automovil{" + "tipo=" + tipo + '}';
    }
    
    

}
