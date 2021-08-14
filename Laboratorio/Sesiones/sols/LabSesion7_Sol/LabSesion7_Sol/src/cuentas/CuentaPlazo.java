package cuentas;

import java.time.LocalDate;

public class CuentaPlazo extends CuentaAbs {

    private int numAños;
    private final double INTERES = 3.5;

    public CuentaPlazo(String numcuenta, String titular, double saldo, int numAños) {
        super(numcuenta, titular, saldo);
        this.numAños = numAños;
    }

    public CuentaPlazo(String numcuenta, String titular, double saldo, LocalDate fechaApertura, int numAños) {
        super(numcuenta, titular, saldo, fechaApertura);
        this.numAños = numAños;
    }

    @Override
    public double calculaInteres(double saldo) {
        return this.getSaldo() + (this.getSaldo()*(INTERES/100));
    }

    public int getNumAños() {
        return numAños;
    }

    public void setNumAños(int numAños) {
        this.numAños = numAños;
    }
}
