/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import empleados.Departamento;
import empleados.Empresa;

/**
 *
 * @author laura
 */
public class MainNomina {

    public static void main(String[] args) {
        //creamos empresa
        Empresa e1 = new Empresa ("Indra", "1234567");
        
        //creamos departamento
        Departamento d1 = new Departamento (e1, "Informática", "Madrid", "Dep1");
        
        //creamos presonas
        Persona persona1 = new Persona ("78813499D", 48, "casada", "Manuela");
        
        //creamos empleados
        Empleado empleado1 = new Empleado ("Supervisor", d1, 1500, persona1);
        
        //creamos nóminas
        Nomina n1 = new Nomina (e1, d1, empleado1, 52.3);
        
        System.out.println(n1.toString());
    }
    
}
