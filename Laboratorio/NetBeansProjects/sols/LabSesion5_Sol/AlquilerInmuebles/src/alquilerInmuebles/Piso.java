package alquilerInmuebles;

public class Piso extends Inmueble{
    private int planta;
    private char puerta;
    private double precioMensual;

    public Piso(int planta, char puerta, double precioMensual, int id, Direccion direccion) {
        super(id, direccion);
        this.planta = planta;
        this.puerta = puerta;
        this.precioMensual = precioMensual;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public char getPuerta() {
        return puerta;
    }

    public void setPuerta(char puerta) {
        this.puerta = puerta;
    }

    public double getPrecioMensual() {
        return precioMensual;
    }

    public void setPrecioMensual(double precioMensual) {
        this.precioMensual = precioMensual;
    }
    
    @Override
    public double precioAlquiler(){
        return getPrecioMensual();
    }

    @Override
    public String toString() {
        return "Piso{" + "planta=" + planta + ", puerta=" + puerta + ", precioMensual=" + precioMensual + '}';
    }
    
}
