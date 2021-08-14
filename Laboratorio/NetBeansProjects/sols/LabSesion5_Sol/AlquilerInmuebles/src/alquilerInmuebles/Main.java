package alquilerInmuebles;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Inmueble inmueble = new Piso(4, 'A', 800, 1, new Direccion("Calle Mayor", 6, 28803, "Alcala de Henares", "Madrd"));
        Particular particular = new Particular("Marta", "49587625M", "918856987", "marta.gr@yahoo.es", 1500, 17);
        if (particular.esSolvente(inmueble)) {
            ContratoAlquiler contrato = new ContratoAlquiler(12, particular, inmueble);
            System.out.println("Contrato formalizado.");
            System.out.println("Contrato: \n" + contrato.toString());
        } else {
            System.out.println("Contrato no formalizado. inquilino no solvente!");
        }

        Recibo r = new Recibo(inmueble, 1, 800, 50, 25);
        System.out.println("Recibo: \n" + r.toString());
        r.imprimir();
    }
}
