package alquilerInmuebles;

import java.util.ArrayList;

public class Oficina {

    private String nombre;
    private Empresa empresa;
    private ArrayList<Planta> plantas;

    public Oficina(Empresa empresa, ArrayList<Planta> plantas) {
        this.empresa = empresa;
        this.plantas = plantas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public ArrayList<Planta> getPlantas() {
        return plantas;
    }

    public void setPlantas(ArrayList<Planta> plantas) {
        this.plantas = plantas;
    }

    @Override
    public String toString() {
        return "Oficina{" + "nombre=" + nombre + ", empresa=" + empresa + '}';
    }
    
}
