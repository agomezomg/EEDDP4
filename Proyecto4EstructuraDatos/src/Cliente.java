/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author didiermurillo
 */
public class Cliente {
    public String Nombre;
    public String PedidoCultivo;
    public int Pago;
    public String FechaPedido;
    public boolean PedidoenProceso;

    public Cliente(String Nombre, String PedidoCultivo, int Pago, String FechaPedido, boolean PedidoenProceso) {
        this.Nombre = Nombre;
        this.PedidoCultivo = PedidoCultivo;
        this.Pago = Pago;
        this.FechaPedido = FechaPedido;
        this.PedidoenProceso = PedidoenProceso;
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
        return "Cliente{" + "Nombre=" + Nombre + ", PedidoCultivo=" + PedidoCultivo + ", Pago=" + Pago + ", FechaPedido=" + FechaPedido + ", PedidoenProceso=" + PedidoenProceso + '}';
    }
    
    
    
}
