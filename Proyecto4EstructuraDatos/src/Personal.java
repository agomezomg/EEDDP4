
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
    private int Sueldo;
    private int CantidadHorasTrabajadas;

    public Personal(String name, String Cargo, int Sueldo) {
        this.name = name;
        this.Cargo = Cargo;
        this.Sueldo = Sueldo;
    }

    public Personal(String Cargo, int Sueldo) {
        this.Cargo = Cargo;
        this.Sueldo = Sueldo;
    }

    public Personal(String Cargo, int Sueldo, int CantidadHorasTrabajadas) {
        this.Cargo = Cargo;
        this.Sueldo = Sueldo;
        this.CantidadHorasTrabajadas = CantidadHorasTrabajadas;
    }

    public String getCargo() {
        return Cargo;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public int getCantidadHorasTrabajadas() {
        return CantidadHorasTrabajadas;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }

    public void setCantidadHorasTrabajadas(int CantidadHorasTrabajadas) {
        this.CantidadHorasTrabajadas = CantidadHorasTrabajadas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
