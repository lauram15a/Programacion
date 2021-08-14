package alquilerInmuebles;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Movimiento {

    private Cuenta cuenta;
    private String descripcion;
    private LocalDate fecha;
    private double cantidad;

    public Movimiento(Cuenta cuenta, double cantidad) {
        this.cuenta = cuenta;
        this.cantidad = cantidad;
        this.fecha = LocalDate.now();
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public String getDescripción() {
        return descripcion;
    }

    public void setDescripción(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaString() {
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String hoystr = fecha.format(formatoCorto);
        return hoystr;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "descripcion=" + descripcion + ", fecha=" + getFechaString() + ", cantidad=" + cantidad + '}';
    }

  
}
