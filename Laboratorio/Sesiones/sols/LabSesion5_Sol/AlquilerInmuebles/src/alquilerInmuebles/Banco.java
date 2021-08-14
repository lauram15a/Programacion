package alquilerInmuebles;

import java.util.ArrayList;

public class Banco {

    private String nombre;
    private ArrayList<Cuenta> cuentas;

    public Banco(String nombre) {
        this.cuentas = new ArrayList<>();
        this.nombre = nombre;
    }

    public void crearCuenta(Long numero, String titular) {
        Cuenta cuenta = new Cuenta(numero, this);
        cuentas.add(cuenta);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + '}';
    }
}

