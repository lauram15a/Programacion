package alquilerInmuebles;

public class LocalComercial extends Inmueble {

    private int superficie;
    private double precioMetro;

    public LocalComercial(int superficie, int precioMetro, int id, Direccion direccion) {
        super(id, direccion);
        this.superficie = superficie;
        this.precioMetro = precioMetro;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public double getPrecioMetro() {
        return precioMetro;
    }

    public void setPrecioMetro(double precioMetro) {
        this.precioMetro = precioMetro;
    }

    @Override
    public double precioAlquiler() {
        return precioMetro * superficie;
    }

    @Override
    public String toString() {
        return "LocalComercial{" + "superficie=" + superficie + ", precioMetro=" + precioMetro + '}';
    }

}
