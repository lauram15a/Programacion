package alquilerInmuebles;

public class Balance {

    private double fondosPropios; // parte del pasivo que no se debe a financiación externa sino a las aportaciones de los socios y a los beneficios generados por la empresa.
    private double activo; // conjunto de bienes económicos, derechos a cobrar que posee una empresa y aquellas erogaciones que serán aprovechadas en ejercicios futuros.
    private double pasivo;// deudas que la empresa posee frente a terceros como proveedores, bancos u otros acreedores

    public Balance(double fondosPropios, double activo, double pasivo) {
        this.fondosPropios = fondosPropios;
        this.activo = activo;
        this.pasivo = pasivo;
    }

    public double getSolvencia() {
        return this.fondosPropios + this.activo - this.pasivo;
    }

    public double getFondosPropios() {
        return fondosPropios;
    }

    public void setFondosPropios(double fondosPropios) {
        this.fondosPropios = fondosPropios;
    }

    public double getActivo() {
        return activo;
    }

    public void setActivo(double activo) {
        this.activo = activo;
    }

    public double getPasivo() {
        return pasivo;
    }

    public void setPasivo(double pasivo) {
        this.pasivo = pasivo;
    }

    @Override
    public String toString() {
        return "Balance{" + "fondosPropios=" + fondosPropios + ", activo=" + activo + ", pasivo=" + pasivo + '}';
    }

}
