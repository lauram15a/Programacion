/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import clases.Historial;
import clases.Partida;
import clases.PartidaAlta;
import clases.PartidaMedia;
import clases.Torneo;
import clases.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author laura
 */
public class DificultadAlta extends javax.swing.JFrame {

    /**
     * Creates new form DificultadAlta
     */
    private static HashMap<String, clases.Historial> torneo;
    private static Usuario usuario;
    DefaultTableModel model = new DefaultTableModel();
    private static ArrayList<Historial> ordenado;
    
    public DificultadAlta(HashMap<String, clases.Historial> torne, Usuario usuari) {
        torneo = torne;
        usuario = usuari;
        initComponents();
        transparenciaBoton();
        this.setLocationRelativeTo(null);  //ajustarlo en el medio de la pantalla
        
        Historial historial = Torneo.devolverHistorial(torneo, usuario.getDNI());
        
        jLabelNombre_DificultadAlta.setText(usuario.getNombre());
        jLabelPuntos_DificultadAlta.setText(Integer.toString(historial.getPartidasAltas().getPuntos()));
        
        
        PartidaAlta p = historial.getPartidasAltas();
        ArrayList<Partida> array = p.getPartidasAltas();
        
        //creamos las columnas de la tabla
        model.addColumn("Puntos");
        model.addColumn("Terminada");
        model.addColumn("Ganada");
        this.jTable_DificultadAlta.setModel(model);

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

        botonTorneo_DificultadAlta = new javax.swing.JButton();
        botonAtras_DificultadAlta = new javax.swing.JButton();
        jLabelNombre_DificultadAlta = new javax.swing.JLabel();
        jLabelPuntos_DificultadAlta = new javax.swing.JLabel();
        jScroll_DificultadMedia = new javax.swing.JScrollPane();
        jTable_DificultadAlta = new javax.swing.JTable();
        fondo_DificultadAlta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonTorneo_DificultadAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonTorneo_DificultadAltaMouseClicked(evt);
            }
        });
        getContentPane().add(botonTorneo_DificultadAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 650, 540, 60));

        botonAtras_DificultadAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAtras_DificultadAltaMouseClicked(evt);
            }
        });
        getContentPane().add(botonAtras_DificultadAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 700, 170, 40));

        jLabelNombre_DificultadAlta.setFont(new java.awt.Font("Cooper Black", 0, 48)); // NOI18N
        jLabelNombre_DificultadAlta.setForeground(new java.awt.Color(255, 204, 204));
        jLabelNombre_DificultadAlta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelNombre_DificultadAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 810, 90));

        jLabelPuntos_DificultadAlta.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabelPuntos_DificultadAlta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPuntos_DificultadAlta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelPuntos_DificultadAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 240, 50));

        jTable_DificultadAlta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScroll_DificultadMedia.setViewportView(jTable_DificultadAlta);

        getContentPane().add(jScroll_DificultadMedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 301, 790, 300));

        fondo_DificultadAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dificultadAlta.jpg"))); // NOI18N
        getContentPane().add(fondo_DificultadAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtras_DificultadAltaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtras_DificultadAltaMouseClicked
        // TODO add your handling code here:
        HistorialInterfaz historial = new HistorialInterfaz(torneo, usuario);
        historial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAtras_DificultadAltaMouseClicked

    private void botonTorneo_DificultadAltaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTorneo_DificultadAltaMouseClicked
        // TODO add your handling code here:
        TorneoAlta t = new TorneoAlta(torneo, usuario);
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonTorneo_DificultadAltaMouseClicked

    /**
     * Los botones serán transparentes
     */
    public void transparenciaBoton(){
        botonAtras_DificultadAlta.setOpaque(false);
        botonAtras_DificultadAlta.setContentAreaFilled(false);
        botonAtras_DificultadAlta.setBorderPainted(false);
        
        botonTorneo_DificultadAlta.setOpaque(false);
        botonTorneo_DificultadAlta.setContentAreaFilled(false);
        botonTorneo_DificultadAlta.setBorderPainted(false);
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras_DificultadAlta;
    private javax.swing.JButton botonTorneo_DificultadAlta;
    private javax.swing.JLabel fondo_DificultadAlta;
    private javax.swing.JLabel jLabelNombre_DificultadAlta;
    private javax.swing.JLabel jLabelPuntos_DificultadAlta;
    private javax.swing.JScrollPane jScroll_DificultadMedia;
    private javax.swing.JTable jTable_DificultadAlta;
    // End of variables declaration//GEN-END:variables
}
