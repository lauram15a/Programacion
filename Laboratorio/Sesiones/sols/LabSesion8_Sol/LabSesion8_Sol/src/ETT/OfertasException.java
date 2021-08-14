package ETT;

public class OfertasException extends Exception {

    public static final String OFERTA_REPETIDA = "La oferta ya existe";

    public OfertasException() {
        super("Se ha producido una excepción en la aplicación.");
    }

    public OfertasException(String txt) {
        super(txt);
    }
}
