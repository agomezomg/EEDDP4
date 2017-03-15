
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
public class Personal implements Serializable {

    private String name;
    private String Cargo;
    private double Sueldo;
    private int CantidadHorasTrabajadas;

    public Personal(String name, String Cargo, double Sueldo) {
        this.name = name;
        this.Cargo = Cargo;
        this.Sueldo = Sueldo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public int getCantidadHorasTrabajadas() {
        return CantidadHorasTrabajadas;
    }

    public void setCantidadHorasTrabajadas(int CantidadHorasTrabajadas) {
        this.CantidadHorasTrabajadas = CantidadHorasTrabajadas;
    }

    @Override
    public String toString() {
        return name + ", " + Cargo;
    }

}
