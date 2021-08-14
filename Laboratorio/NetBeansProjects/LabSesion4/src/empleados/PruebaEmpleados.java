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
public class PruebaEmpleados {

    public static void main(String[] args) {
        
        //1 - creamos la empresa
        Empresa e1 = new Empresa ("Indra", "1234567");
        
        //2 - creamos los departamentos
        Departamento d1 = new Departamento(e1, "1", "Madrid", "Informática");
        Departamento d2 = new Departamento (e1, "2", "Barcelona", "Personal");
        
        //3 - creamos persona
        Persona p1 = new Persona ("12345678Z",  25, "soltero", "Pepe");
        Persona p2 = new Persona ("45673419T",  35, "casada", "Laura");
        Persona p3 = new Persona ("56782345F",  40, "casada", "Rampe");
        
        //4 - creamos los empleados que asignamos a los departamentos
        Empleado emp1 = new Empleado ("programador", d1, 1500, p1);
        Empleado emp2 = new Empleado ("analista", d1, 2000, p2);
        Empleado emp3 = new Empleado ("gerente", d2, 2500, p3);
        
        //modificamos los datos de los empleados
        p1.cumpleaños();
        emp1.setSueldo(2000);
        System.out.println(emp1.toString());
        emp2.setCargo("jefe proyecto");
        System.out.println(emp2.toString());
        
        //imprimimos los elementos del arrayList
        System.out.println ("Empleados departamento: " + d1.getEmpleados().toString());
    }
    
}
