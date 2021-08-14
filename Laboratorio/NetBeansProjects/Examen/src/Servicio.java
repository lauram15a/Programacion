
import java.time.LocalDateTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */
public class Servicio {

       
        private LocalDateTime fecha;
        private Flota flota;
        private Ubicacion ubicacionRecogida;
        private Ubicacion ubicacionDestino;
        private double distancia;
        private double coste;
        private Cliente cliente;
        private Conductor conductor;
        private int valoracion;
        
    //coonstructor

    public Servicio(LocalDateTime fecha, Flota flota, Ubicacion ubicacionRecogida, Ubicacion ubicacionDestino, double distancia, double coste, Cliente cliente, Conductor conductor, int valoracion) {
        this.fecha = fecha;
        this.flota = flota;
        this.ubicacionRecogida = ubicacionRecogida;
        this.ubicacionDestino = ubicacionDestino;
        this.distancia = distancia;
        this.coste = coste;
        this.cliente = cliente;
        this.conductor = conductor;
        this.valoracion = valoracion;
    }
    
        

    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }    
    
        
    public Flota getFlota() {
        return flota;
    }
    public void setFlota(Flota flota) {
        this.flota = flota;
    }

        

    public Ubicacion getUbicacionRecogida() {
        return ubicacionRecogida;
    }
    public void setUbicacionRecogida(Ubicacion ubicacionRecogida) {
        this.ubicacionRecogida = ubicacionRecogida;
    }
        

    public Ubicacion getUbicacionDestino() {
        return ubicacionDestino;
    }
    public void setUbicacionDestino(Ubicacion ubicacionDestino) {
        this.ubicacionDestino = ubicacionDestino;
    }    
       

    public double getDistancia() {
        return distancia;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    public static double calcularDistancia(Ubicacion ubicacionRecogida, Ubicacion ubicacionDestino){
        double radioTierra = 6371;//en kilómetros  
        double dLat = Math.toRadians(ubicacionDestino.getLatitud() - ubicacionRecogida.getLatitud());  
        double dLng = Math.toRadians(ubicacionDestino.getLongitud() - ubicacionRecogida.getLongitud());  
        double sindLat = Math.sin(dLat / 2);  
        double sindLng = Math.sin(dLng / 2);  
        double va1 = Math.pow(sindLat, 2) + Math.pow(sindLng, 2) * Math.cos(Math.toRadians(ubicacionRecogida.getLatitud())) * Math.cos(Math.toRadians(ubicacionDestino.getLatitud()));  
        double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));  
        double distancia = radioTierra * va2;  
   
        return distancia; 
    }
        

    public double getCoste() {
        return coste;
    }
    public void setCoste(double coste) {
        this.coste = coste;
    }
    
    public static double calcularCoste (Flota flota, Ubicacion ubicacionRecogida, Ubicacion ubicacionDestino){
        double coste = 0;
        double distancia = calcularDistancia(ubicacionRecogida, ubicacionDestino);
        
        if ("JUberX" == flota.getTipo()){
            coste = distancia * 2;
        } else if ("JOne" == flota.getTipo()){
            coste = distancia * 2.5;
        }
        
        return coste;
    }
    
    

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }   
        

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

        
    public int getValoracion() {
        return valoracion;
    }
    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        return "Servicio{" + "fecha=" + fecha + ", flota=" + flota + ", ubicacionRecogida=" + ubicacionRecogida + ", ubicacionDestino=" + ubicacionDestino + ", distancia=" + distancia + ", coste=" + coste + ", cliente=" + cliente + ", conductor=" + conductor + ", valoracion=" + valoracion + '}';
    }
    
    
    
    



}
