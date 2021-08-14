
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */
public class Cliente extends Persona {
    
        private String contraseña;
        private long tarjeta;
        
    //constructor

    public Cliente(String nombre, String dni, String correo, int telefono,String contraseña,  long tarjeta) {
        super (nombre, dni, correo, telefono);
        this.contraseña = contraseña;
        this.tarjeta = tarjeta;
    }
    
   
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
    public long getTarjeta() {
        return tarjeta;
    }
    public void setTarjeta(long tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.contraseña);
        hash = 83 * hash + (int) (this.tarjeta ^ (this.tarjeta >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.tarjeta != other.tarjeta) {
            return false;
        }
        if (!Objects.equals(this.contraseña, other.contraseña)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "contrase\u00f1a=" + contraseña + ", tarjeta=" + tarjeta + '}';
    }

}
