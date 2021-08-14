package logica;

public class Ordenador extends Producto{
    private String caracteristicas;

    public Ordenador(String codigo, String nombre, double precio, int cantidad, String caracterisiticas) {
        super(codigo,nombre,precio,cantidad);
        this.caracteristicas=caracterisiticas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOrdenador{" + " - caracteristicas = " + caracteristicas + '}';
    }

   
}
