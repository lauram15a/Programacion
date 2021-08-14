package logica;

public class Telefono extends Producto{
    private String operador;

    public Telefono(String codigo, String nombre, double precio, int cantidad, String operador) {
        super(codigo,nombre,precio,cantidad);
        this.operador = operador;
    }
    
    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTelefono{" + " - operador = " + operador + '}';
    }

}
