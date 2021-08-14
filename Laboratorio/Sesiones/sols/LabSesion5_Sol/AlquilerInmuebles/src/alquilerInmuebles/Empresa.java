package alquilerInmuebles;

public class Empresa extends Cliente {

    private Direccion direccion;
    private Balance balance;
    private String CIF;

    public Empresa(String nombre, String cif, Direccion direccion, String telefono, String email, Balance balance) {
        super(nombre, telefono, email);
        this.direccion = direccion;
        this.CIF = cif;
        this.balance = balance;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public String getCif() {
        return CIF;
    }

    public void setCif(String cif) {
        this.CIF = cif;
    }

    @Override
    public boolean esSolvente(Inmueble inmueble) {
        double solvencia = this.getBalance().getSolvencia();
        double precio = 0;
        if (inmueble instanceof Piso) {
            precio = ((Piso) inmueble).getPrecioMensual();
        } else if (inmueble instanceof LocalComercial) {
            precio = ((LocalComercial) inmueble).precioAlquiler();
        } else if (inmueble instanceof Edificio) {
            precio = ((Edificio) inmueble).precioAlquiler();
        }
        return solvencia > precio;
    }

    @Override
    public String toString() {
        return "Empresa{" + "direccion=" + direccion + ", balance=" + balance + ", CIF=" + CIF + '}';
    }

}
