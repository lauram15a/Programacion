/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author laura
 */
public class Nomina {
    
        private Empresa empresa;
        private Departamento departamento;
        private Empleado empleado;
        private LocalDate fecha;
        private double salarioBruto;
        private double retencion;
        private double salarioNeto;
        

    //constructor
    public Nomina(Empresa empresa, Departamento departamento, Empleado empleado, double retencion) {
        this.empresa = empresa;
        this.departamento = departamento;
        this.empleado = empleado;
        this.retencion = retencion;
        this.salarioNeto = SalarioNeto();
    }
            
        
    
    private double SalarioNeto() {
        return this.salarioNeto = empleado.getSueldo() - retencion;
    }
    
    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    

    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }


    public Empleado getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    

    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public String getFechaString(){
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String hoystr = fecha.format(formatoCorto);
        return hoystr;
    }
    

    public double getSalarioBruto() {
        return salarioBruto;
    }
    public void setSalarioBruto(double salarioBruto) {
        salarioBruto = empleado.getSueldo();
        this.salarioBruto = salarioBruto;
        this.SalarioNeto();
    }   

    
    public double getRetencion() {
        return retencion;
    }
    public void setRetencion(double retencion) {
        this.retencion = retencion;
    }

    
    
    //información textual de la nómina
    @Override
    public String toString() {
        return "Nomina{" + "empresa=" + empresa + ", departamento=" + departamento + ", empleado=" + empleado + ", fecha=" + fecha + ", salarioBruto=" + salarioBruto + ", retencion=" + retencion + ", salarioNeto=" + salarioNeto + '}';
    }
    

}
