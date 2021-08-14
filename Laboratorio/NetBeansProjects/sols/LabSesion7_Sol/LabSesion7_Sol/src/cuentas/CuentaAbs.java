package cuentas;

import java.time.LocalDate;

public abstract class CuentaAbs {

    private String numcuenta;
    private String titular;
    private double saldo;
    private LocalDate fechaApertura;

    public CuentaAbs(String numcuenta, String titular, double saldo) {
        this.numcuenta = numcuenta;
        this.titular = titular;
        this.saldo = saldo;
        this.fechaApertura = LocalDate.now();
    }

    public CuentaAbs(String numcuenta, String titular, double saldo, LocalDate fechaApertura) {
        this.numcuenta = numcuenta;
        this.titular = titular;
        this.saldo = saldo;
        this.fechaApertura = fechaApertura;
    }
    
    public abstract double calculaInteres(double saldo);

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(String numcuenta) {
        this.numcuenta = numcuenta;
    }
}
