/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import clases.Torneo;
import clases.Usuario;
import java.util.HashMap;
import javax.swing.ImageIcon;
import clases.Historial;

/**
 *
 * @author laura
 */
public class HistorialInterfaz extends javax.swing.JFrame {

    /**
     * Creates new form Historial
     */
    private static HashMap<String, clases.Historial> torneo;
    private static Usuario usuario;
    
    public HistorialInterfaz(HashMap<String, clases.Historial> torne, Usuario usuari) {
        torneo = torne;
        usuario = usuari;
        initComponents();
        transparenciaBoton();
        this.setLocationRelativeTo(null);  //ajustarlo en el medio de la pantalla
        clases.Historial historial = Torneo.devolverHistorial(torneo, usuario.getDNI());
        jLabelNombre_Historial.setText(usuario.getNombre());
        jLabelPuntosBaja_Historial.setText(Integer.toString(historial.getPartidasBajas().getPuntos()));
        jLabelPuntosMedia_Historial.setText(Integer.toString(historial.getPartidasMedias().getPuntos()));
        jLabelPuntosAlta_Historial.setText(Integer.toString(historial.getPartidasAltas().getPuntos()));
        jLabelPuntosImposible_Historial.setText(Integer.toString(historial.getPartidasImposibles().getPuntos()));
        
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

        botonAtras_Historial = new javax.swing.JButton();
        botonBaja_Historial = new javax.swing.JButton();
        botonMedia_Historial = new javax.swing.JButton();
        botonAlta_Historial = new javax.swing.JButton();
        botonImposible_Historial = new javax.swing.JButton();
        jLabelNombre_Historial = new javax.swing.JLabel();
        jLabelPuntosBaja_Historial = new javax.swing.JLabel();
        jLabelPuntosMedia_Historial = new javax.swing.JLabel();
        jLabelPuntosAlta_Historial = new javax.swing.JLabel();
        jLabelPuntosImposible_Historial = new javax.swing.JLabel();
        fondo_Historial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAtras_Historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAtras_HistorialMouseClicked(evt);
            }
        });
        getContentPane().add(botonAtras_Historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 680, 170, 40));

        botonBaja_Historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBaja_HistorialMouseClicked(evt);
            }
        });
        getContentPane().add(botonBaja_Historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 590, 70));

        botonMedia_Historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMedia_HistorialMouseClicked(evt);
            }
        });
        getContentPane().add(botonMedia_Historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 600, 70));

        botonAlta_Historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAlta_HistorialMouseClicked(evt);
            }
        });
        getContentPane().add(botonAlta_Historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 600, 70));

        botonImposible_Historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonImposible_HistorialMouseClicked(evt);
            }
        });
        getContentPane().add(botonImposible_Historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, 590, 60));

        jLabelNombre_Historial.setFont(new java.awt.Font("Cooper Black", 0, 48)); // NOI18N
        jLabelNombre_Historial.setForeground(new java.awt.Color(255, 204, 204));
        jLabelNombre_Historial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelNombre_Historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 870, 100));

        jLabelPuntosBaja_Historial.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabelPuntosBaja_Historial.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPuntosBaja_Historial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelPuntosBaja_Historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 210, 50));

        jLabelPuntosMedia_Historial.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabelPuntosMedia_Historial.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPuntosMedia_Historial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelPuntosMedia_Historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 210, 60));

        jLabelPuntosAlta_Historial.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabelPuntosAlta_Historial.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPuntosAlta_Historial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelPuntosAlta_Historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 210, 60));

        jLabelPuntosImposible_Historial.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabelPuntosImposible_Historial.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPuntosImposible_Historial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelPuntosImposible_Historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 210, 60));

        fondo_Historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historial.jpg"))); // NOI18N
        getContentPane().add(fondo_Historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtras_HistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtras_HistorialMouseClicked
        // TODO add your handling code here:
        SesionIniciada sesionIniciada = new SesionIniciada(torneo, usuario);
        sesionIniciada.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAtras_HistorialMouseClicked

    private void botonBaja_HistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBaja_HistorialMouseClicked
        // TODO add your handling code here:
        DificultadBaja d = new DificultadBaja(torneo, usuario);
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonBaja_HistorialMouseClicked

    private void botonMedia_HistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMedia_HistorialMouseClicked
        // TODO add your handling code here:
        DificultadMedia d = new DificultadMedia(torneo, usuario);
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonMedia_HistorialMouseClicked

    private void botonAlta_HistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAlta_HistorialMouseClicked
        // TODO add your handling code here:
        DificultadAlta d = new DificultadAlta(torneo, usuario);
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAlta_HistorialMouseClicked

    private void botonImposible_HistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonImposible_HistorialMouseClicked
        // TODO add your handling code here:
        DificultadImposible d = new DificultadImposible(torneo, usuario);
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonImposible_HistorialMouseClicked

    /**
     * Los botones serán transparentes
     */
    public void transparenciaBoton(){
        botonAtras_Historial.setOpaque(false);
        botonAtras_Historial.setContentAreaFilled(false);
        botonAtras_Historial.setBorderPainted(false);
        
        botonBaja_Historial.setOpaque(false);
        botonBaja_Historial.setContentAreaFilled(false);
        botonBaja_Historial.setBorderPainted(false);
        
        botonMedia_Historial.setOpaque(false);
        botonMedia_Historial.setContentAreaFilled(false);
        botonMedia_Historial.setBorderPainted(false);
        
        botonAlta_Historial.setOpaque(false);
        botonAlta_Historial.setContentAreaFilled(false);
        botonAlta_Historial.setBorderPainted(false);
        
        botonImposible_Historial.setOpaque(false);
        botonImposible_Historial.setContentAreaFilled(false);
        botonImposible_Historial.setBorderPainted(false);
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAlta_Historial;
    private javax.swing.JButton botonAtras_Historial;
    private javax.swing.JButton botonBaja_Historial;
    private javax.swing.JButton botonImposible_Historial;
    private javax.swing.JButton botonMedia_Historial;
    private javax.swing.JLabel fondo_Historial;
    private javax.swing.JLabel jLabelNombre_Historial;
    private javax.swing.JLabel jLabelPuntosAlta_Historial;
    private javax.swing.JLabel jLabelPuntosBaja_Historial;
    private javax.swing.JLabel jLabelPuntosImposible_Historial;
    private javax.swing.JLabel jLabelPuntosMedia_Historial;
    // End of variables declaration//GEN-END:variables
}
