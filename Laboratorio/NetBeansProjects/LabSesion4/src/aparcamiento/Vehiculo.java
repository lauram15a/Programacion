/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcamiento;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author laura
 */
public class Vehiculo {
    
    private String matricula;
    private LocalDateTime fecha;
    private boolean abono;
    

    //constructor
    public Vehiculo(String matricula, boolean abono) {
        this.matricula = matricula;
        this.fecha = LocalDateTime.now();
        this.abono = abono;
    }

    public Vehiculo(String matricula, LocalDateTime fecha, boolean abono) {
        this.matricula = matricula;
        this.fecha = fecha;
        this.abono = abono;
    }
    
    

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }        

    
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
        

    public boolean isAbono() {
        return abono;
    }
    public void setAbono(boolean abono) {
        this.abono = abono;
    }  

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        if (this.abono != other.abono) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", fecha=" + fecha + ", abono=" + abono + '}';
    }
    
    

    

}
