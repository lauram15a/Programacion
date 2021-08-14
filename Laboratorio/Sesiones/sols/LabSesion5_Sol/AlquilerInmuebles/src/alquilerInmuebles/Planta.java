package alquilerInmuebles;

public class Planta {

    private int numero;
    private int superficie;
    private double precio;
    private Edificio edificio;

    public Planta(int numero, int superficie, int precio, Edificio edificio) {
        this.numero = numero;
        this.superficie = superficie;
        this.precio = precio;
        this.edificio = edificio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    public double getPrecioMensual() {
        return superficie * precio;
    }

    @Override
    public String toString() {
        return "Planta{" + "numero=" + numero + ", superficie=" + superficie + ", precio=" + precio + ", edificio=" + edificio + '}';
    }

}
