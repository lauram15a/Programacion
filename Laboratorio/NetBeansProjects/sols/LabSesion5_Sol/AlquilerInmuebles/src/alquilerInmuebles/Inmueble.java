package alquilerInmuebles;

public abstract class Inmueble {

    private int id;
    private Direccion direccion;

    public Inmueble(int id, Direccion direccion) {
        this.id = id;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    abstract double precioAlquiler();

    @Override
    public String toString() {
        return "Inmueble{" + "id=" + id + ", direccion=" + direccion + '}';
    }

}
