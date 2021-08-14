/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import clases.Historial;
import clases.Usuario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author laura
 */
public class TorneoImposible extends javax.swing.JFrame {

    /**
     * Creates new form TorneoImposible
     */
    private static HashMap<String, clases.Historial> torneo;
    private static Usuario usuario;
    DefaultTableModel model = new DefaultTableModel();
    private static ArrayList<Historial> ordenado;

    public TorneoImposible(HashMap<String, clases.Historial> torne, Usuario usuari) {
        torneo = torne;
        usuario = usuari;
        initComponents();
        transparenciaBoton();
        this.setLocationRelativeTo(null);  //ajustarlo en el medio de la pantalla

        //creamos las columnas de la tabla
        model.addColumn("Posición");
        model.addColumn("Nombre");
        model.addColumn("Puntos");
        this.tabla_TorneoAlta.setModel(model);

        ordenado = new ArrayList<>(torneo.values());

        Collections.sort(ordenado, Comparator.comparing(Historial::getPuntosAlta));

        for (int i = 0; i < ordenado.size(); i++) {
            String[] fila = new String[4];
            fila[0] = Integer.toString(i + 1);
            fila[1] = ordenado.get(i).getUsuario().getNombre();
            fila[2] = Integer.toString(ordenado.get(i).getPuntosImposible());
            model.addRow(fila);

        }

        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.jpg")).getImage());  //cambiar logo
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAtras_TorneoImposible = new javax.swing.JButton();
        scrollPane_TorneoImposible = new javax.swing.JScrollPane();
        tabla_TorneoAlta = new javax.swing.JTable();
        fondo_TorneoImposible = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAtras_TorneoImposible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAtras_TorneoImposibleMouseClicked(evt);
            }
        });
        getContentPane().add(botonAtras_TorneoImposible, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 650, 210, 50));

        tabla_TorneoAlta.setBorder(new javax.swing.border.MatteBorder(null));
        tabla_TorneoAlta.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        tabla_TorneoAlta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Posición", "Nombre", "Puntos", "Número Partidas"
            }
        ));
        tabla_TorneoAlta.setRowHeight(40);
        scrollPane_TorneoImposible.setViewportView(tabla_TorneoAlta);

        getContentPane().add(scrollPane_TorneoImposible, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 960, 230));

        fondo_TorneoImposible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/torneoImposible.jpg"))); // NOI18N
        getContentPane().add(fondo_TorneoImposible, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtras_TorneoImposibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtras_TorneoImposibleMouseClicked
        // TODO add your handling code here:
        DificultadImposible d = new DificultadImposible(torneo, usuario);
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAtras_TorneoImposibleMouseClicked

    /**
     * Los botones serán transparentes
     */
    public void transparenciaBoton() {
        botonAtras_TorneoImposible.setOpaque(false);
        botonAtras_TorneoImposible.setContentAreaFilled(false);
        botonAtras_TorneoImposible.setBorderPainted(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras_TorneoImposible;
    private javax.swing.JLabel fondo_TorneoImposible;
    private javax.swing.JScrollPane scrollPane_TorneoImposible;
    private javax.swing.JTable tabla_TorneoAlta;
    // End of variables declaration//GEN-END:variables
}
