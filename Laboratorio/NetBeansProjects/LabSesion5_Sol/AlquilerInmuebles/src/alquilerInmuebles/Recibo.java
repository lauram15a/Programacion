package alquilerInmuebles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Recibo {

    private Inmueble inmueble;
    private int numero;
    private double cantidadNeta;
    private double iva;
    private LocalDate fecha;
    private double cantidadLuz;
    private double cantidadAgua;
    private boolean cobrado;

    public Recibo(Inmueble inmueble, int numero, double cantidadNeta, double cantidadLuz, double cantidadAgua) {
        this.inmueble = inmueble;
        this.numero = numero;
        this.cantidadNeta = cantidadNeta;
        this.cantidadLuz = cantidadLuz;
        this.cantidadAgua = cantidadAgua;
        this.cobrado = false;
        this.iva = 21;
        this.fecha = LocalDate.now();
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getCantidadNeta() {
        return cantidadNeta;
    }

    public void setCantidadNeta(double cantidadNeta) {
        this.cantidadNeta = cantidadNeta;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getCantidadLuz() {
        return cantidadLuz;
    }

    public void setCantidadLuz(double cantidadLuz) {
        this.cantidadLuz = cantidadLuz;
    }

    public double getCantidadAgua() {
        return cantidadAgua;
    }

    public void setCantidadAgua(double cantidadAgua) {
        this.cantidadAgua = cantidadAgua;
    }

    public boolean isCobrado() {
        return cobrado;
    }

    public void setCobrado(boolean cobrado) {
        this.cobrado = cobrado;
    }

    public String getFechaString() {
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String hoystr = fecha.format(formatoCorto);
        return hoystr;
    }

    public double getCantidadTotal() {
        return this.cantidadNeta + (this.cantidadNeta * (this.iva / 100));
    }

    public void imprimir() {
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("ddMMyyyy");
        try {
            File logFile = new File(this.inmueble.getId() + "_" + this.numero + "_" + fecha.format(formatoCorto).concat(".txt"));
            System.out.println(logFile.getCanonicalPath());

            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(logFile)));

            writer.println("Inmueble: " + this.inmueble.getId());
            writer.println("Número de recibo: " + this.numero);
            writer.println("Importe: " + this.cantidadNeta + " €");
            writer.println("IVA: " + this.iva);
            writer.println("Total : " + this.getCantidadTotal() + " €");
            writer.println("Luz : " + this.cantidadLuz + " €");
            writer.println("Agua : " + this.cantidadAgua + " €");
            if (cobrado) {
                writer.println("Estado: COBRADO");
            } else {
                writer.println("Estado: PENDIENTE DE COBRAR");
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
    }

    @Override
    public String toString() {
        return "Recibo{" + "inmueble=" + inmueble + ", numero=" + numero + ", cantidadNeta=" + cantidadNeta
                + ", iva=" + iva + ", fecha=" + fecha + ", cantidadLuz=" + cantidadLuz
                + ", cantidadAgua=" + cantidadAgua + ", cobrado=" + cobrado + '}';
    }

}
