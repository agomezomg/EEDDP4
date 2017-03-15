
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
public class Transportista implements Serializable {

    private String Identificacion;
    private int Tiempo;
    private double cobroEnvio;
    private boolean Disponible;

    public Transportista(String Identificacion, int Tiempo, double Costo) {
        this.Identificacion = Identificacion;
        this.Tiempo = Tiempo;
        this.cobroEnvio = Costo;
        this.Disponible = true;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public double getCobroEnvio() {
        return cobroEnvio;
    }

    public void setCobroEnvio(double cobroEnvio) {
        this.cobroEnvio = cobroEnvio;
    }

    public boolean isDisponible() {
        return Disponible;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

    public void setDisponible(boolean Disponible) {
        this.Disponible = Disponible;
    }

    @Override
    public String toString() {
        return "ID: " + Identificacion + ", $" + cobroEnvio;
    }

}
