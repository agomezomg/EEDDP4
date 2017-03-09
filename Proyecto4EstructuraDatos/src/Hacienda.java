
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
public class Hacienda implements Serializable {

    private VsArrayList Inventario = new VsArrayList(5);
    private VsArrayList Cultivos = new VsArrayList(5);
    private VsArrayList Personal = new VsArrayList(5);
    private VsArrayList Transportistas = new VsArrayList(5);
    private int DineroTotal = 0;
    private double SaldoBase;
    private String Nombre;
    private String Contra;
    //public Queue Clientes;

    public Hacienda() {
    }

    public Hacienda(double SaldoBase, String Nombre, String Contra) {
        this.SaldoBase = SaldoBase;
        this.Nombre = Nombre;
        this.Contra = Contra;
    }

    public int getDineroTotal() {
        return DineroTotal;
    }

    public void setDineroTotal(int DineroTotal) {
        this.DineroTotal = DineroTotal;
    }

    public double getSaldoBase() {
        return SaldoBase;
    }

    public void setSaldoBase(double SaldoBase) {
        this.SaldoBase = SaldoBase;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContra() {
        return Contra;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }

    @Override
    public String toString() {
        return "Hacienda{" + "Inventario=" + Inventario + ", Cultivos=" + Cultivos + ", Personal=" + Personal + ", Transportistas=" + Transportistas + ", DineroTotal=" + DineroTotal + '}';
    }

    public boolean addPersonnel(Personal n_employee) {
        return Personal.insert(n_employee, 0);
    }

    public boolean addCultivo(Cultivo n_cultivo) {
        return Cultivos.insert(n_cultivo, Cultivos.getSize());
    }
    
}
