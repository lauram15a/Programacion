/*
 * Analista.java
 * 
 */
package informaticos;

public class Analista extends InformaticoAbs {

    private String especialidad;

    public Analista(String empresa, String especialidad) {
        super(empresa);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public double pagarSueldo(int horas) {
        return (double) horas * 12;
    }
}
