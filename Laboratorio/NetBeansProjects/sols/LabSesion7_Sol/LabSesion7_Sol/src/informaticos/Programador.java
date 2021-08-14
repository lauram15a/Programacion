/*
 * Programador.java
 *
 */
package informaticos;

public class Programador extends InformaticoAbs {

    private String lenguaje;

    public Programador(String empresa, String lenguaje) {
        super(empresa);
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public double pagarSueldo(int horas) {
        return (double) horas * 6;
    }
}
