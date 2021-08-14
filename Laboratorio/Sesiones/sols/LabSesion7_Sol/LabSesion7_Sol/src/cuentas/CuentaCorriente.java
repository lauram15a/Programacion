package cuentas;

import java.time.LocalDate;

public class CuentaCorriente extends CuentaAbs {

    private long numTarjCred;
    private final double INTERES = 1.5;

    public CuentaCorriente(String numcuenta, String titular, double saldo, long numTarjCred) {
        super(numcuenta, titular, saldo);
        this.numTarjCred = numTarjCred;
    }

    public CuentaCorriente(String numcuenta, String titular, double saldo, LocalDate fechaApertura, long numTarjCred) {
        super(numcuenta, titular, saldo, fechaApertura);
        this.numTarjCred = numTarjCred;
    }

    @Override
    public double calculaInteres(double saldo) {
        return this.getSaldo() + (this.getSaldo()*(INTERES/100));
    }

    public long getNumTarjCred() {
        return numTarjCred;
    }

    public void setNumTarjCred(long numTarjCred) {
        this.numTarjCred = numTarjCred;
    }
}
