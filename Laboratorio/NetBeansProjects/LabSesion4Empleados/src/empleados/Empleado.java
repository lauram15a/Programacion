package empleados;

public class Empleado extends Persona {

    private double sueldo;
    private String cargo;
    private Departamento departamento; //asociación

    //constructor
    public Empleado(String dni, String nombre, int edad, String estado,
            double sueldo, String cargo, Departamento departamento) {
        super(dni, nombre, edad, estado);
        this.sueldo = sueldo;
        this.cargo = cargo;
        this.departamento = departamento;
        this.departamento.altaEmpleado(this); //tenemos que incorporar el empleado al departamento
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + " # Empleado{" + "sueldo=" + sueldo + ", cargo=" + cargo + ", departamento=" + departamento + '}';
    }

}
