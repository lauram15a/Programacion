package alquilerInmuebles;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContratoAlquiler {

    private LocalDate fecha;
    private int nmeses;
    private Cliente cliente;
    private Inmueble inmueble;

    public ContratoAlquiler(int nmeses, Cliente cliente, Inmueble inmueble) {
        this.nmeses = nmeses;
        this.cliente = cliente;
        this.inmueble = inmueble;
        this.fecha = LocalDate.now();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getNmeses() {
        return nmeses;
    }

    public void setNmeses(int nmeses) {
        this.nmeses = nmeses;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public LocalDate fechaFinContrato() {
        LocalDate result = this.fecha.plusMonths(nmeses);
        return result;
    }

    public String fechaFinContratoString() {
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.fechaFinContrato().format(formatoCorto);
    }

    public String getFechaString() {
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String hoystr = this.fecha.format(formatoCorto);
        return hoystr;
    }

    @Override
    public String toString() {
        return "ContratoAlquiler{" + "fecha=" + getFechaString() + ", nmeses=" + nmeses + ", cliente=" + cliente + ", inmueble=" + inmueble + '}';
    }   
    
}
