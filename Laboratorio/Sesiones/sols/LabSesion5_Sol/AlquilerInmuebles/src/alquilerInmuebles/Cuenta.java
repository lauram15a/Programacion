package alquilerInmuebles;

import java.util.ArrayList;
import java.util.Iterator;

public class Cuenta {

    private long numero;
    private Banco banco;
    private double saldo;
    private ArrayList<Movimiento> movimientos;

    public Cuenta(long numero, Banco banco, double saldo) {
        this.numero = numero;
        this.banco = banco;
        this.saldo = saldo;
        this.movimientos = new ArrayList<>();
    }

    public Cuenta(long numero, Banco banco) {
        this.numero = numero;
        this.banco = banco;
        this.saldo = 0;
        this.movimientos = new ArrayList<>();
    }

    public long getNumero() {
        return numero;
    }

    public Banco getBanco() {
        return banco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void ingreso(double cantidad) { // Recibo cobrado
        saldo += cantidad;
    }

    public void retiro(double cantidad) { // Inmueble: gasto (reparación del  ascensor,  
                                         // de  la caldera, sueldo personal limpieza, etc.)
       saldo -= cantidad;
    }

    public boolean enRojos() {
        return saldo < 0;
    }

    @Override
    public String toString() {
        String datos = "Cuenta: banco = " + banco + " | número =  " + 
                numero + " | saldo = " + saldo + "\nMovimentos:\n";
        Iterator<Movimiento> iter = movimientos.iterator();
        while (iter.hasNext()) {
            Movimiento a = iter.next();
            datos += "\t" + a + "\n";
        }
        return datos;
    }
}
