/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

/**
 *
 * @author laura
 */
public class Taller {
    
    private String nombre;
    private String telefono;
    private double precioHora;
    
    //constructor
    public Taller(String nombre, String telefono, double precioHora) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.precioHora = precioHora;
    }
        

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }        

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }        

    public double getPrecioHora() {
        return precioHora;
    }
    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }
    
    public double repararVehiculo (Vehiculo car, double horas){
        double precio = 0;
        precio += horas * this.precioHora;
        for (int i = 0; i < car.getPiezas().size(); i++){
            precio += car.getPiezas().get(i).getPrecio();
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Taller{" + "nombre=" + nombre + ", telefono=" + telefono + ", precioHora=" + precioHora + '}';
    }
    
    

}
