package alquilerInmuebles;

public class Ingreso extends Movimiento {

    private Recibo recibo;

    public Ingreso(Cuenta cuenta, double cantidad) {
        super(cuenta, cantidad);
    }

    public Recibo getRecibo() {
        return recibo;
    }

    public void setRecibo(Recibo recibo) {
        this.recibo = recibo;
    }

}
