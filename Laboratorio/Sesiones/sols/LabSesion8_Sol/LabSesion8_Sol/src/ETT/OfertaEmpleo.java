package ETT;

public class OfertaEmpleo {
    
    private String identificador;
    private String empresa;
    private String categoria;
    private double salario;

    //constructor
    public OfertaEmpleo(String identificador, String empresa, String categoria, double salario) {
        this.identificador = identificador;
        this.empresa = empresa;
        this.categoria = categoria;
        this.salario = salario;
    }
    //metodos get y set
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }   
            
}
