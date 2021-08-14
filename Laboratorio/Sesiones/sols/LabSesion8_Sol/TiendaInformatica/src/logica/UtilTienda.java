package logica;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UtilTienda {

    private static ArrayList<Producto> productos = new ArrayList<>();
    private static Producto objpro;

    /** Establece el ArrayList de Productos
     * @param p */
    public static void setProductos(ArrayList<Producto> p) {
        productos = p;
    }

    /** Devuelve el ArrayList de Productos
     * @return  */
    public static ArrayList<Producto> getProductos() {
        //Comparador para ordenar los Productos por su nombre
        Comparator NomproComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Producto p1 = (Producto) o1;
                Producto p2 = (Producto) o2;
                return p1.getNombre().compareTo(p2.getNombre());
            }
        };
        //Ordenamos el array
        Collections.sort(productos, NomproComp);
        return productos;
    }

    /** Da de alta una Producto
     * @param objpro
     * @return  */
    public static boolean altaProducto(Producto objpro) {
        if (consultaProductoPorCodigo(objpro.getCodigo()) == null) {
            productos.add(objpro);
            return true;
        } else {
            return false;
        }

    }

    /** Da de baja una Producto
     * @param objpro
     * @return  */
    public static boolean bajaProducto(Producto objpro) {
        if (productos.contains(objpro)) {
            productos.remove(objpro);
            return true;
        } else {
            return false;
        }
    }

    /** Devuelve un Producto por la posición dentro del ArrayList
     * @param indice
     * @return  */
    public static Producto consultaProducto(int indice) {
        objpro = productos.get(indice);
        return objpro;
    }

    /** Modifica los datos de un Producto
     * @param pro
     * @param p_codigo
     * @param p_nombre
     * @param p_precio
     * @param p_cantidad
     * @param var
     * @return  */
    public static boolean modificaProducto(Producto pro, String p_codigo, String p_nombre, double p_precio, int p_cantidad, String var) {
        if (pro == null || !productos.contains(pro)) {
            return false;
        }
        pro.setNombre(p_nombre);
        pro.setCodigo(p_codigo);
        pro.setPrecio(p_precio);
        pro.setCantidad(p_cantidad);
        String tipo = pro.getClass().getSimpleName();
        if (tipo.equals("Ordenador")) {
            Ordenador ord = (Ordenador) pro;
            ord.setCaracteristicas(var);

        } else {
            Telefono tel = (Telefono) pro;
            tel.setOperador(var);
        }
        return true;
    }

    /** Modifica los datos de un Producto
     * @param pro
     * @param p_nombre
     * @param p_precio
     * @param var
     * @return  */
    public static boolean modificaProducto(Producto pro, String p_nombre, double p_precio, String var) {
        if (pro == null || !productos.contains(pro)) {
            return false;
        }
        pro.setNombre(p_nombre);
        pro.setPrecio(p_precio);
        String tipo = pro.getClass().getSimpleName();
        if (tipo.equals("Ordenador")) {
            Ordenador ord = (Ordenador) pro;
            ord.setCaracteristicas(var);

        } else {
            Telefono tel = (Telefono) pro;
            tel.setOperador(var);
        }
        return true;
    }

    /** Consulta los datos de un Producto por su código
     * @param codigo
     * @return  */
    public static Producto consultaProductoPorCodigo(String codigo) {
        //Comparador para ordenar los Productos por su código
        Comparator CodigoproComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Producto p1 = (Producto) o1;
                Producto p2 = (Producto) o2;
                return p1.getCodigo().compareTo(p2.getCodigo());
            }
        };
        //Ordenamos el array
        Collections.sort(productos, CodigoproComp);
        //creamos un Producto con el código a buscar
        Producto p = new Producto();
        p.setCodigo(codigo);
        int pos = Collections.binarySearch(productos, p, CodigoproComp);
        if (pos >= 0) {
            objpro = productos.get(pos);
        } else {
            objpro = null;
        }

        return objpro;
    }

    /** Consulta los datos de un Producto por su nombre
     * @param nombre
     * @return  */
    public static Producto consultaProductoPorNombre(String nombre) {
        //Comparador para ordenar las Productos por su nombre
        Comparator NomproComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Producto p1 = (Producto) o1;
                Producto p2 = (Producto) o2;
                return p1.getNombre().compareTo(p2.getNombre());
            }
        };
        //Ordenamos el array
        Collections.sort(productos, NomproComp);
        //creamos una Producto con el nombre a buscar
        Producto p = new Producto();
        p.setNombre(nombre);
        int pos = Collections.binarySearch(productos, p, NomproComp);
        if (pos >= 0) {
            objpro = productos.get(pos);
        } else {
            objpro = null;
        }

        return objpro;
    }

    /** Carga los datos de Productos del fichero */
    public static void cargarDatos() {
        try {
            try (FileInputStream istreampro = new FileInputStream("copiasegpro.dat")) {
                ObjectInputStream oispro = new ObjectInputStream(istreampro);
                productos = (ArrayList) oispro.readObject();
            }
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } 
    }//fin cargarDatos

    /** Guarda los datos de Productos en el fichero */
    public static void guardarDatos() {
        try {
            //Si hay datos los guardamos...
            if (!productos.isEmpty()) {
                try (FileOutputStream ostreampro = new FileOutputStream("copiasegpro.dat")) {
                    ObjectOutputStream oospro = new ObjectOutputStream(ostreampro);
                    //guardamos el array de Productos
                    oospro.writeObject(productos);
                }
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } 
    }//fin guardarDatos

    /** Crea un fichero de texto con los datos de una venta
     * @param pro
     * @param cantidad
     * @throws java.io.IOException */
    public static void generaFactura(Producto pro, int cantidad) throws IOException {
        LocalDate hoy = LocalDate.now();
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");        
        String fn = hoy.format(formatoCorto);        
        String rutaFicheroFactura = "./Facturas/Factura(" + fn.replace('/', '_') + ").txt";
        double importe = pro.getPrecio() * cantidad;
        try {
            //Si no existe el directorio Facturas, lo creamos
            File dirFacturas = new File("./Facturas");

            if (!dirFacturas.exists()) {
                dirFacturas.mkdir();
            }

            FileWriter fw = new FileWriter(rutaFicheroFactura);
            try (PrintWriter salida = new PrintWriter(new BufferedWriter(fw))) {
                salida.println("-------------------------------- Factura Producto --------------------------------");
                salida.println("\n");
                salida.println("-------------------------------- Fecha: " + fn + " -------------------------------");
                salida.println("\n");
                salida.println("Código: " + pro.getCodigo());
                salida.println("\n");
                if (pro.getClass().getSimpleName().equals("Telefono")) {
                    salida.println("Tipo: Teléfono Móvil");
                    salida.println("Nombre: " + pro.getNombre());
                    salida.println("Operador: " + ((Telefono) pro).getOperador());
                } else {
                    salida.println("Tipo: Ordenador");
                    salida.println("Nombre: " + pro.getNombre());
                    salida.println("Características: " + ((Ordenador) pro).getCaracteristicas());
                }
                salida.println("\n");
                salida.println("Precio: " + pro.getPrecio());
                salida.println("Cantidad: " + cantidad);
                salida.println("---------------------------------------------------------------------------------");
                salida.println("IMPORTE: " + importe);
                salida.println("\n");
                salida.println("-------------------------------------------------------------------------------");
            }
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        }
    }//fin generaFactura
}
