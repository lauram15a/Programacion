/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import java.util.ArrayList;

/**
 *
 * @author laura
 */

public class Departamento {
    
        private ArrayList<Empleado> empleados;
        private Empresa empresa;
        private String id;
        private String localizacion;
        private String nombre;
        
    //constructor

    public Departamento(Empresa empresa, String id, String localizacion, String nombre) {  //sin arrayList empleados
        this.empleados = empleados;
        this.empresa = empresa;
        this.id = id;
        this.localizacion = localizacion;
        this.nombre = nombre;
    }
    
    

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    //alta de un empleado en el departamento
    public void altaEmpleado (Empleado emp){
        if (!empleados.contains(emp)){
            empleados.add(emp);
            emp.setDepartamento(this);  //el empleado tiene que reflejar el alta
        }
    }
    //baja de un empleado en el departamento
    public void bajaEmpleado (Empleado emp){
        if (empleados.contains(emp)){
            empleados.remove(emp);
            emp.setDepartamento(null);  //el empleado tiene que reflejar la baja
        }
    }
 

    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    

    public String getLocalizacion() {
        return localizacion;
    }
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
  

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //información textual del departamento
    @Override
    public String toString() {
        return "Departamento{" + "empleados=" + empleados + ", empresa=" + empresa + ", id=" + id + ", localizacion=" + localizacion + ", nombre=" + nombre + '}';
    }
    
}
