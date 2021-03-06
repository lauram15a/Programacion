/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import clases.Historial;
import clases.Partida;
import clases.PartidaMedia;
import clases.Torneo;
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
public class DificultadMedia extends javax.swing.JFrame {

    /**
     * Creates new form DificultadMedia
     */
    private static HashMap<String, clases.Historial> torneo;
    private static Usuario usuario;
    DefaultTableModel model = new DefaultTableModel();
    private static ArrayList<Historial> ordenado;

    public DificultadMedia(HashMap<String, clases.Historial> torne, Usuario usuari) {
        torneo = torne;
        usuario = usuari;
        initComponents();

        transparenciaBoton();
        this.setLocationRelativeTo(null);  //ajustarlo en el medio de la pantalla
        Historial historial = Torneo.devolverHistorial(torneo, usuario.getDNI());
        PartidaMedia p = historial.getPartidasMedias();
        ArrayList<Partida> array = p.getPartidasMedias();
        
        
        
        jLabelNombre_DificultadMedia.setText(usuario.getNombre());
        jLabelPuntos_DificultadMedia.setText(Integer.toString(historial.getPartidasMedias().getPuntos()));

        //creamos las columnas de la tabla
        model.addColumn("Puntos");
        model.addColumn("Terminada");
        model.addColumn("Ganada");
        this.jTable_DificultadMedia.setModel(model);

        for (int i = 0; i < array.size(); i++){
            String[] fila = new String[3];
            fila[0] = Integer.toString(array.get(i).getPuntos());
            fila[1] = Boolean.toString(array.get(i).isTerminada());
            fila[2] = Boolean.toString(array.get(i).isGanada());
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

        botonTorneo_DificultadMedia = new javax.swing.JButton();
        botonAtras_DificultadMedia = new javax.swing.JButton();
        jLabelNombre_DificultadMedia = new javax.swing.JLabel();
        jLabelPuntos_DificultadMedia = new javax.swing.JLabel();
        jScroll_DificultadMedia = new javax.swing.JScrollPane();
        jTable_DificultadMedia = new javax.swing.JTable();
        fondo_DificultadMedia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonTorneo_DificultadMedia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonTorneo_DificultadMediaMouseClicked(evt);
            }
        });
        getContentPane().add(botonTorneo_DificultadMedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 650, 530, 60));

        botonAtras_DificultadMedia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAtras_DificultadMediaMouseClicked(evt);
            }
        });
        getContentPane().add(botonAtras_DificultadMedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 700, 170, 40));

        jLabelNombre_DificultadMedia.setFont(new java.awt.Font("Cooper Black", 0, 48)); // NOI18N
        jLabelNombre_DificultadMedia.setForeground(new java.awt.Color(255, 204, 204));
        jLabelNombre_DificultadMedia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelNombre_DificultadMedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 810, 100));

        jLabelPuntos_DificultadMedia.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabelPuntos_DificultadMedia.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPuntos_DificultadMedia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelPuntos_DificultadMedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 240, 60));

        jTable_DificultadMedia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScroll_DificultadMedia.setViewportView(jTable_DificultadMedia);

        getContentPane().add(jScroll_DificultadMedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 301, 790, 300));

        fondo_DificultadMedia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dificultadMedia.jpg"))); // NOI18N
        getContentPane().add(fondo_DificultadMedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtras_DificultadMediaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtras_DificultadMediaMouseClicked
        // TODO add your handling code here:
        HistorialInterfaz historial = new HistorialInterfaz(torneo, usuario);
        historial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAtras_DificultadMediaMouseClicked

    private void botonTorneo_DificultadMediaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTorneo_DificultadMediaMouseClicked
        // TODO add your handling code here:
        TorneoMedia t = new TorneoMedia(torneo, usuario);
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonTorneo_DificultadMediaMouseClicked

    /**
     * Los botones ser??n transparentes
     */
    public void transparenciaBoton() {
        botonAtras_DificultadMedia.setOpaque(false);
        botonAtras_DificultadMedia.setContentAreaFilled(false);
        botonAtras_DificultadMedia.setBorderPainted(false);

        botonTorneo_DificultadMedia.setOpaque(false);
        botonTorneo_DificultadMedia.setContentAreaFilled(false);
        botonTorneo_DificultadMedia.setBorderPainted(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras_DificultadMedia;
    private javax.swing.JButton botonTorneo_DificultadMedia;
    private javax.swing.JLabel fondo_DificultadMedia;
    private javax.swing.JLabel jLabelNombre_DificultadMedia;
    private javax.swing.JLabel jLabelPuntos_DificultadMedia;
    private javax.swing.JScrollPane jScroll_DificultadMedia;
    private javax.swing.JTable jTable_DificultadMedia;
    // End of variables declaration//GEN-END:variables
}
