/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

/**
 *
 * @author laura
 */

public class Empleado {
    
        private String cargo;
        private Departamento departamento;  //asociación
        private double sueldo;
        private Persona persona;

    //constructor
        
    public Empleado(String cargo, Departamento departamento, double sueldo, Persona persona) {
        this.cargo = cargo;
        this.departamento = departamento;
        this.sueldo = sueldo;
        this.persona = persona;
    }

        

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
 

    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
          

    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //información textual del empleado compuesta por la información de la persona + empleado + departamento
    @Override
    public String toString() {
        return "Empleado{" + "cargo=" + cargo + ", departamento=" + departamento + ", sueldo=" + sueldo + ", persona=" + persona + '}';
    }
        
}
