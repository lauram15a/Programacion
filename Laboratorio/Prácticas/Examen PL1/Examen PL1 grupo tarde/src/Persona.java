/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */
public class Persona {
    
    private String nombre;
    private String dni;
    private String correo;
    private int telefono;
    
    //constructor

    public Persona(String nombre, String dni, String correo, int telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
   

    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    
    
}
