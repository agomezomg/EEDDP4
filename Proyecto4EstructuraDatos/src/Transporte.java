
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author didiermurillo
 */
public class Transporte implements Serializable{
    public String Identificacion;
    public int Tiempo;
    public int Costo;
    public boolean Disponible;
    public int Carga;

    public Transporte(String Identificacion, int Tiempo, int Costo, boolean Disponible, int Carga) {
        this.Identificacion = Identificacion;
        this.Tiempo = Tiempo;
        this.Costo = Costo;
        this.Disponible = Disponible;
        this.Carga = Carga;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public int getCosto() {
        return Costo;
    }

    public boolean isDisponible() {
        return Disponible;
    }

    public int getCarga() {
        return Carga;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    public void setDisponible(boolean Disponible) {
        this.Disponible = Disponible;
    }

    public void setCarga(int Carga) {
        this.Carga = Carga;
    }

    @Override
    public String toString() {
        return "Transporte{" + "Identificacion=" + Identificacion + ", Tiempo=" + Tiempo + ", Costo=" + Costo + ", Disponible=" + Disponible + ", Carga=" + Carga + '}';
    }
    
    
    
}
