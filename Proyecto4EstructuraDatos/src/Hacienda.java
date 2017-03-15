
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

    private final VsArrayList Inventario;
    private VsArrayList Cultivos;
    private final VsArrayList Personal;
    private final VsArrayList ListaEdges;
    private double DineroTotal = 0;
    private double SaldoBase;
    private String Nombre;
    private String Contra;
    private final Queue Transportistas;
    private final VsArrayList Clientes;

    public Hacienda(double SaldoBase, String Nombre, String Contra) {
        Inventario = new VsArrayList(5);
        Cultivos = new VsArrayList(5);
        Personal = new VsArrayList(5);
        Clientes = new VsArrayList(5);
        ListaEdges = new VsArrayList(5);
        Transportistas = new Queue();
        this.SaldoBase = SaldoBase;
        this.Nombre = Nombre;
        this.Contra = Contra;
        this.DineroTotal = SaldoBase;

    }

    public Queue getTransportistasQ() {
        return Transportistas;
    }

    public Object getListaEdges(int p) {
        return ListaEdges.get(p);
    }

    public void setListaEdges(Object ListaEdges) {
        this.ListaEdges.insert(ListaEdges, 0);
    }

    public VsArrayList getListaEdges() {
        return ListaEdges;
    }

    public VsArrayList getPersonal() {
        return Personal;
    }

    public Queue getTransportistas() {
        return Transportistas;
    }
    
    public Transportista getTransportista() {
        return (Transportista) Transportistas.DeQueue();
    }

    public Object getClientes(int p) {
        return Clientes.get(p);
    }

    public void setTransportistas(Object Transportistas) {
        this.Transportistas.Queue(Transportistas);
    }

    public void setClientes(Object Clientes) {
        this.Clientes.insert(Clientes, 0);
    }

    public VsArrayList getClientes() {
        return Clientes;
    }

    public VsArrayList getCultivos() {
        return Cultivos;
    }

    public Cultivo getCultivos(int i) {
        return (Cultivo) Cultivos.get(i);
    }

    public void setCultivos(VsArrayList Cultivos) {
        this.Cultivos = Cultivos;
    }

    public void setCultivos(Cultivo Cultivos) {
        this.Cultivos.insert(Cultivos, 0);
    }

    public double getDineroTotal() {
        return DineroTotal;
    }

    public void setDineroTotal(double DineroTotal) {
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
