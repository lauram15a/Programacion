package alquilerInmuebles;

import java.util.ArrayList;

public class Edificio extends Inmueble {

    private String nombre;
    private ArrayList<Planta> plantas;

    public Edificio(int id, Direccion direccion) {
        super(id, direccion);
        plantas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addPlanta(Planta p) {
        if (!this.plantas.contains(p)) {
            this.plantas.add(p);
            p.setEdificio(this);
        }
    }

    public void removePlanta(Planta p) {
        if (this.plantas.contains(p)) {
            this.plantas.remove(p);
            p.setEdificio(null);
        }
    }

    public ArrayList<Planta> getPlantas() {
        return plantas;
    }

    public void setPlantas(ArrayList<Planta> plantas) {
        this.plantas = plantas;
    }

    @Override
    public double precioAlquiler() {
        double precio = 0;
        for (Planta planta : plantas) {
            precio += (planta.getPrecio() * planta.getSuperficie());
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Edificio{" + "nombre=" + nombre + '}';
    }

}
