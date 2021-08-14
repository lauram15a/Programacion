package alquilerInmuebles;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Particular extends Cliente {

    private LocalDate fechaNac;
    private Nomina nomina;
    private String NIF;

    public Particular(String nombre, String nif, String telefono, String email, double salarioBruto, double retencion) {
        super(nombre, telefono, email);
        this.NIF = nif;
        this.fechaNac = LocalDate.now();
        this.nomina = new Nomina(this, salarioBruto, retencion);
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Nomina getNomina() {
        return nomina;
    }

    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }

    public String getFechaNacString() {
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String hoystr = this.fechaNac.format(formatoCorto);
        return hoystr;
    }

    public String getNif() {
        return NIF;
    }

    public void setNif(String nif) {
        this.NIF = nif;
    }

    @Override
    public boolean esSolvente(Inmueble inmueble) {
        double salario = this.getNomina().getSalarioNeto();
        double precio = 0;
        if (inmueble instanceof Piso) {
            precio = ((Piso) inmueble).getPrecioMensual();
        } else if (inmueble instanceof LocalComercial) {
            precio = ((LocalComercial) inmueble).precioAlquiler();
        } else if (inmueble instanceof Edificio) {
            precio = ((Edificio) inmueble).precioAlquiler();
        }
        return salario > precio;
    }

    @Override
    public String toString() {
        String cliente = super.toString();
        return cliente + " # Particular{" + ", NIF=" + NIF + "fechaNac=" + fechaNac + ", nomina=" + nomina + '}';
    }

}
