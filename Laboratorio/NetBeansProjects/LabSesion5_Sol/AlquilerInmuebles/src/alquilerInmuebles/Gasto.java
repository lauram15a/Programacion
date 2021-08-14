package alquilerInmuebles;

public class Gasto extends Movimiento {

    private Inmueble inmueble;
    private String tipo;

    public Gasto(Inmueble inmueble, String tipo, Cuenta cuenta, double cantidad) {
        super(cuenta, cantidad);
        this.inmueble = inmueble;
        this.tipo = tipo;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Gasto{" + "inmueble=" + inmueble + ", tipo=" + tipo + '}';
    }

}
