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

public class Empresa {
    
    private String cif;
    private String nombre;

    //constructor     
    public Empresa(String cif, String nombre) {
        this.cif = cif;
        this.nombre = nombre;
    }

    
    public String getCif() {
        return cif;
    }
    public void setCif(String cif) {
        this.cif = cif;
    }
   
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //información textual de la empresa
    @Override
    public String toString() {
        return "Empresa{" + "cif=" + cif + ", nombre=" + nombre + '}';
    }
    
}
