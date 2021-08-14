package alquilerInmuebles;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Nomina {

    private Particular particular;
    private LocalDate fecha;
    private double salarioBruto;
    private double retencion;

    public Nomina(Particular particular, double salarioBruto, double retencion) {
        this.particular = particular;
        this.salarioBruto = salarioBruto;
        this.retencion = retencion;
        this.fecha = LocalDate.now();
    }

    public Particular getParticular() {
        return particular;
    }

    public void setParticular(Particular particular) {
        this.particular = particular;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getRetencion() {
        return retencion;
    }

    public void setRetencion(double retencion) {
        this.retencion = retencion;
    }

    public double getSalarioNeto() {
        return this.salarioBruto - (this.salarioBruto * (this.retencion / 100));
    }

    public String getFechaString() {
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String hoystr = fecha.format(formatoCorto);
        return hoystr;
    }

    @Override
    public String toString() {
        return "Nomina{" + "fecha=" + getFechaString() + ", salarioBruto=" + salarioBruto + ", retencion=" + retencion + '}';
    }

}
