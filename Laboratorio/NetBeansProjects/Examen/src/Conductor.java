/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */
public class Conductor extends Persona{
    
        
        private double salario;
        
    //constructor

    public Conductor(String nombre, String dni, String correo, int telefono, double salario) {
        super (nombre, dni, correo, telefono);
        this.salario = salario;
    }
    
    

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcularSalario (Flota flota, Ubicacion ubicacionRecogida, Ubicacion ubicacionDestino){
        salario = 0.5 * Servicio.calcularCoste(flota, ubicacionRecogida, ubicacionDestino);
        return salario;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
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
        final Conductor other = (Conductor) obj;
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conductor{" + "salario=" + salario + '}';
    }

    
    

}
