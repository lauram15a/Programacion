package presentacion;

public class PanelDatos extends javax.swing.JPanel {

    /** Creates new form PanelDatos */
    public PanelDatos() {
        initComponents();
    }

    //metodos para devolver y presentar el contenido de los campos del formulario
    public String getJTextFieldCodigo() {
        return jTextFieldCodigo.getText();
    }

    public void setJTextFieldCodigo(String txt) {
        this.jTextFieldCodigo.setText(txt);
    }

    public String getJTextFieldNombre() {
        return jTextFieldNombre.getText();
    }

    public void setJTextFieldNombre(String txt) {
        this.jTextFieldNombre.setText(txt);
    }

    public String getJTextFieldPrecio() {
        return jTextFieldPrecio.getText();
    }

    public void setJTextFieldPrecio(String txt) {
        this.jTextFieldPrecio.setText(txt);
    }

    public String getJTextFieldCantidad() {
        return jTextFieldCantidad.getText();
    }

    public void setJTextFieldCantidad(String txt) {
        this.jTextFieldCantidad.setText(txt);
    }

    public String getJTextFieldVar() {
        return jTextFieldVar.getText();
    }

    public void setJTextFieldVar(String txt) {
        this.jTextFieldVar.setText(txt);
    }

    //metodos para cambiar las etiquetas variables
    public void setLabelVar(String txt) {
        this.jLabelVar.setText(txt);
    }

    //borra el contenido del panel
    public void borrar() {
        setJTextFieldCodigo("");
        setJTextFieldNombre("");
        setJTextFieldPrecio("");
        setJTextFieldCantidad("");
        setJTextFieldVar("");
    }

    //activa la caja de texto codigo
    public void activaCodigo() {
        this.jTextFieldCodigo.setEditable(true);
    }

    //desactiva la caja de texto código
    public void desactivaCodigo() {
        this.jTextFieldCodigo.setEditable(false);
    }

    //activa la caja de texto cantidad
    public void activaCantidad() {
        this.jTextFieldCantidad.setEditable(true);
    }

    //desactiva la caja de texto cantidad
    public void desactivaCantidad() {
        this.jTextFieldCantidad.setEditable(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelPrecio = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jLabelCantidad = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabelVar = new javax.swing.JLabel();
        jTextFieldVar = new javax.swing.JTextField();

        setLayout(new java.awt.GridLayout(5, 2));

        jLabelCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCodigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCodigo.setText("Código");
        add(jLabelCodigo);
        add(jTextFieldCodigo);

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNombre.setText("Nombre");
        add(jLabelNombre);
        add(jTextFieldNombre);

        jLabelPrecio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPrecio.setText("Precio");
        add(jLabelPrecio);
        add(jTextFieldPrecio);

        jLabelCantidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCantidad.setText("Cantidad");
        add(jLabelCantidad);
        add(jTextFieldCantidad);

        jLabelVar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelVar.setText("var");
        add(jLabelVar);
        add(jTextFieldVar);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelVar;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldVar;
    // End of variables declaration//GEN-END:variables
}