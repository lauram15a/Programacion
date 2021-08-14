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

public class Persona {
    
        private String dni;
        private int edad;
        private String estado;
        private String nombre;
        
    //constructor
    public Persona(String dni, int edad, String estado, String nombre) {
        this.dni = dni;
        this.edad = edad;
        this.estado = estado;
        this.nombre = nombre;
    }
        
    
    public void cumpleaños(){
        edad ++;
    }
    
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
        
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    //información textual de la persona
    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", edad=" + edad + ", estado=" + estado + ", nombre=" + nombre + '}';
    }
    
}
