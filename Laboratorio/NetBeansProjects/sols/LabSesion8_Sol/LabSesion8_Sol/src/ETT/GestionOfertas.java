package ETT;

import java.util.*;

public class GestionOfertas {

    private static ArrayList<OfertaEmpleo> ofertas = new ArrayList<>();

    public GestionOfertas() {
    }

    public static ArrayList<OfertaEmpleo> getOfertas() {
        return ofertas;
    }

    public static void setOfertas(ArrayList<OfertaEmpleo> ofertas) {
        GestionOfertas.ofertas = ofertas;
    }

    //método para añadir ofertas
    public static String altaOfertas(OfertaEmpleo oferta) {
        try {

            if (ofertas.contains(oferta)) {
                throw new OfertasException(OfertasException.OFERTA_REPETIDA);
            }
            ofertas.add(oferta);
            return "Oferta dada de alta correctamente";
        } catch (OfertasException pe) {
            return pe.getMessage();
        }
    }

    //método búsqueda de ofertas que devuelve un arraylist con las oferta encontradas
    public static ArrayList<OfertaEmpleo> busquedaOfertas(String categoria, double salario) {

        ArrayList<OfertaEmpleo> ofertasBuscadas = new ArrayList<>();

        for (OfertaEmpleo oe : ofertas) {

            if (oe.getCategoria().equals(categoria) && oe.getSalario() >= salario) {
                ofertasBuscadas.add(oe);
            }

        }
        return ofertasBuscadas;
    }
}
