
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
public class Cliente implements Serializable, Comparable<Cliente> {

    private String Nombre;
    private String PedidoCultivo;
    private int Pago;
    private String FechaPedido;
    private int CantidadPedida;
    private boolean PedidoenProceso;
    private double kmAway;

    public Cliente(String Nombre, String PedidoCultivo, int Pago, String FechaPedido, boolean PedidoenProceso,int CantidadPedida) {
        this.Nombre = Nombre;
        this.PedidoCultivo = PedidoCultivo;
        this.Pago = Pago;
        this.FechaPedido = FechaPedido;
        this.PedidoenProceso = PedidoenProceso;
        this.CantidadPedida=CantidadPedida;
    }

    
    public Cliente(String Nombre, double kmAway) {
        this.Nombre = Nombre;
        this.kmAway = kmAway;
        this.PedidoCultivo = "";
    }

    public void setKmAway(double kmAway) {
        this.kmAway = kmAway;
    }

    public double getKmAway() {
        return kmAway;
    }

    public int getCantidadPedida() {
        return CantidadPedida;
    }

    public void setCantidadPedida(int CantidadPedida) {
        this.CantidadPedida = CantidadPedida;
    }

    
    
    public String getNombre() {
        return Nombre;
    }

    public String getPedidoCultivo() {
        return PedidoCultivo;
    }

    public int getPago() {
        return Pago;
    }

    public String getFechaPedido() {
        return FechaPedido;
    }

    public boolean isPedidoenProceso() {
        return PedidoenProceso;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPedidoCultivo(String PedidoCultivo) {
        this.PedidoCultivo = PedidoCultivo;
    }

    public void setPago(int Pago) {
        this.Pago = Pago;
    }

    public void setFechaPedido(String FechaPedido) {
        this.FechaPedido = FechaPedido;
    }

    public void setPedidoenProceso(boolean PedidoenProceso) {
        this.PedidoenProceso = PedidoenProceso;
    }

    @Override
    public String toString() {
        return Nombre + ", " + kmAway + "km away" + ", PedidoCultivo: " + PedidoCultivo + ", Pago por unidad :" + Pago + "Cantidad Pedida: "+ CantidadPedida;
    }

    @Override
    public int compareTo(Cliente o) {
        if (this.getKmAway() > o.getKmAway())
            return 1;
        else if (this.getKmAway() == o.getKmAway())
            return 0;
        else 
            return -1;
    }

}
