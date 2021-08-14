package cuentas;

import java.awt.HeadlessException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class VentanaCuentas extends javax.swing.JFrame {

    /** Creates new form VentanaPrincipal */
    public VentanaCuentas() {
        initComponents();
        jComboBoxTipo.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelVar = new javax.swing.JLabel();
        jTextFieldVar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNumCu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextFieldSaldo = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldTit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Cuenta Bancaria");

        jLabelVar.setText("var");

        jLabel3.setText("Titular:");

        jLabel4.setText("Saldo Actual:");

        jFormattedTextFieldSaldo.setForeground(new java.awt.Color(255, 0, 51));
        jFormattedTextFieldSaldo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jLabel5.setText("Tipo de cuenta:");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CuentaCorriente", "CuentaPlazo" }));
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Intereses Cuenta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Numero de cuenta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelVar, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFormattedTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTit, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldVar)
                    .addComponent(jTextFieldNumCu, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(132, 132, 132))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumCu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVar)
                    .addComponent(jTextFieldVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(29, 29, 29))
        );

        setSize(new java.awt.Dimension(372, 371));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        // TODO add your handling code here:
        String tipo = (String) jComboBoxTipo.getSelectedItem();
        if (tipo.equals("CuentaCorriente")) {
            jLabelVar.setText("Nº tarjeta de crédito:");
        } else {
            jLabelVar.setText("Número de años:");
        }
    }//GEN-LAST:event_jComboBoxTipoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            String tipo = (String) jComboBoxTipo.getSelectedItem();
            String numeroDeCuenta = jTextFieldNumCu.getText();
            String titular = jTextFieldTit.getText();  
            //double saldo = Double.parseDouble(jFormattedTextFieldSaldo.getText());
            double saldo = ((Number)jFormattedTextFieldSaldo.getValue()).doubleValue();

            //Formato del dia actual
            Date date = new Date();
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String fecha = dateFormat.format(date.getTime());

            if (tipo.equals("CuentaCorriente")) {
                long numTarjCredito = Long.parseLong(jTextFieldVar.getText());
                CuentaCorriente ca = new CuentaCorriente(numeroDeCuenta, titular, saldo, numTarjCredito);
                //Aplicamos el método polimórfico
                double intereses = ca.calculaInteres(saldo);
                ca.setSaldo(intereses);                
                //Muestra por el interés por pantalla
                JOptionPane.showMessageDialog(this, "Saldo en la cuenta: " + ca.getSaldo() + " - A dia: " + fecha, "Saldo final con intereses.", JOptionPane.INFORMATION_MESSAGE);

            } else {

                int numAños = Integer.parseInt(jTextFieldVar.getText());
                CuentaPlazo cp = new CuentaPlazo(numeroDeCuenta, titular, saldo, numAños);
                //Aplicamos el método polimórfico
                double intereses2 = cp.calculaInteres(saldo);
                cp.setSaldo(intereses2);               
                //Muestra por el interés por pantalla
                JOptionPane.showMessageDialog(this, "Saldo en la cuenta: " + cp.getSaldo() + " - A dia: " + fecha, "Saldo final con intereses.", JOptionPane.INFORMATION_MESSAGE);
            }


        } catch (NumberFormatException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error en cuentas: " + e.toString(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new VentanaCuentas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBoxTipo;
    private javax.swing.JFormattedTextField jFormattedTextFieldSaldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelVar;
    private javax.swing.JTextField jTextFieldNumCu;
    private javax.swing.JTextField jTextFieldTit;
    private javax.swing.JTextField jTextFieldVar;
    // End of variables declaration//GEN-END:variables
}
