package empleados;

public class Persona {

    private String dni;
    private String nombre;
    private int edad;
    private String estado;

    //constructor
    public Persona(String dni, String nombre, int edad, String estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
    }

    public void cumpleaños() {
        edad++;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
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

    //información textual de la persona
    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + '}';
    }
  
}
