
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
public class Hacienda implements Serializable{
    public VsArrayList Inventario=new VsArrayList(5);
    public VsArrayList Cultivos=new VsArrayList(5);
    public VsArrayList Personal=new VsArrayList(5);
    public VsArrayList Transportistas=new VsArrayList(5);
    public int DineroTotal=0;
    public double SaldoBase;
    public String Nombre;
    public String Contra;
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
    
    
    public VsArrayList getInventario(){
        return this.Inventario;
    }
    
    public VsArrayList getCultivos(){
        return this.Cultivos;
    }
    
    public  VsArrayList getPersonal(){
        return this.Personal;
    }
    
    public VsArrayList getTransportistas(){
        return this.Transportistas;
    }
    
    public void setInventario(VsArrayList Inventario){
        this.Inventario=Inventario;
    }
    
    public void setCultivos(VsArrayList Cultivos){
        this.Cultivos=Cultivos;
    }
    
    public void setTransportistas(VsArrayList Transportistas){
        this.Transportistas=Transportistas;
    }
    
    public void setPersonal(VsArrayList Personal){
        this.Personal=Personal;
    }
    
    public boolean addPersonnel(Personal n_employee) {
        return Personal.insert(Inventario, DineroTotal);
    }
    
}



