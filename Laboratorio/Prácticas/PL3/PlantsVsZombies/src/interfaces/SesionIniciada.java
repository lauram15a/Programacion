/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import clases.Usuario;
import java.util.HashMap;
import javax.swing.ImageIcon;

/**
 *
 * @author laura
 */
public class SesionIniciada extends javax.swing.JFrame {

    /**
     * Creates new form SesionIniciada
     */
    private static HashMap<String, clases.Historial> torneo;
    private static Usuario usuario;
    
    public SesionIniciada(HashMap<String, clases.Historial> torne, Usuario usuari) {
        torneo = torne;
        usuario = usuari;
        initComponents();
        transparenciaBoton();
        this.setLocationRelativeTo(null);  //ajustarlo en el medio de la pantalla
        
        jLabelNombre_SesionIniciada.setText(usuario.getNombre());
        
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

        botonHistorial_SesionIniciada = new javax.swing.JButton();
        botonContinuarPartida_SesionIniciada = new javax.swing.JButton();
        botonPartidaNueva_SesionIniciada = new javax.swing.JButton();
        botonAtras_SesionIniciada = new javax.swing.JButton();
        jLabelNombre_SesionIniciada = new javax.swing.JLabel();
        fondo_SesionIniciada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonHistorial_SesionIniciada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonHistorial_SesionIniciadaMouseClicked(evt);
            }
        });
        getContentPane().add(botonHistorial_SesionIniciada, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 400, 40));

        botonContinuarPartida_SesionIniciada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonContinuarPartida_SesionIniciadaMouseClicked(evt);
            }
        });
        getContentPane().add(botonContinuarPartida_SesionIniciada, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 380, 50));

        botonPartidaNueva_SesionIniciada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonPartidaNueva_SesionIniciadaMouseClicked(evt);
            }
        });
        getContentPane().add(botonPartidaNueva_SesionIniciada, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 390, 40));

        botonAtras_SesionIniciada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAtras_SesionIniciadaMouseClicked(evt);
            }
        });
        getContentPane().add(botonAtras_SesionIniciada, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 390, 40));

        jLabelNombre_SesionIniciada.setFont(new java.awt.Font("Cooper Black", 0, 48)); // NOI18N
        jLabelNombre_SesionIniciada.setForeground(new java.awt.Color(255, 204, 204));
        jLabelNombre_SesionIniciada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelNombre_SesionIniciada, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 430, 60));

        fondo_SesionIniciada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sesionIniciada.jpg"))); // NOI18N
        getContentPane().add(fondo_SesionIniciada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonHistorial_SesionIniciadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonHistorial_SesionIniciadaMouseClicked
        // TODO add your handling code here:
        HistorialInterfaz historial = new HistorialInterfaz(torneo, usuario);
        historial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonHistorial_SesionIniciadaMouseClicked

    private void botonContinuarPartida_SesionIniciadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonContinuarPartida_SesionIniciadaMouseClicked
        // TODO add your handling code here:
        PartidasGuardadas pG = new PartidasGuardadas(torneo, usuario);
        pG.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonContinuarPartida_SesionIniciadaMouseClicked

    private void botonPartidaNueva_SesionIniciadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPartidaNueva_SesionIniciadaMouseClicked
        // TODO add your handling code here:
        Dificultad dificultad = new Dificultad(torneo, usuario);
        dificultad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonPartidaNueva_SesionIniciadaMouseClicked

    private void botonAtras_SesionIniciadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtras_SesionIniciadaMouseClicked
        // TODO add your handling code here:
        IniciarSesion iniciarSesion = new IniciarSesion();
        iniciarSesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAtras_SesionIniciadaMouseClicked

    /**
     * Los botones serán transparentes
     */
    public void transparenciaBoton(){
        botonHistorial_SesionIniciada.setOpaque(false);
        botonHistorial_SesionIniciada.setContentAreaFilled(false);
        botonHistorial_SesionIniciada.setBorderPainted(false);
        
        botonContinuarPartida_SesionIniciada.setOpaque(false);
        botonContinuarPartida_SesionIniciada.setContentAreaFilled(false);
        botonContinuarPartida_SesionIniciada.setBorderPainted(false);
        
        botonPartidaNueva_SesionIniciada.setOpaque(false);
        botonPartidaNueva_SesionIniciada.setContentAreaFilled(false);
        botonPartidaNueva_SesionIniciada.setBorderPainted(false);
        
        botonAtras_SesionIniciada.setOpaque(false);
        botonAtras_SesionIniciada.setContentAreaFilled(false);
        botonAtras_SesionIniciada.setBorderPainted(false);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras_SesionIniciada;
    private javax.swing.JButton botonContinuarPartida_SesionIniciada;
    private javax.swing.JButton botonHistorial_SesionIniciada;
    private javax.swing.JButton botonPartidaNueva_SesionIniciada;
    private javax.swing.JLabel fondo_SesionIniciada;
    private javax.swing.JLabel jLabelNombre_SesionIniciada;
    // End of variables declaration//GEN-END:variables
}
