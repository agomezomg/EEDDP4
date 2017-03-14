
import java.io.Serializable;


public class Cultivo implements Serializable{
    private String TipoProducto;
    private int TiempoCultivarse;
    private double Precio;
    private boolean EstadoVida;
    private int cantidad;
    private boolean TienePlaga;

    public Cultivo(String TipoProducto, int TiempoCultivarse, double Precio, boolean EstadoVida, boolean TienePlaga) {
        this.TipoProducto = TipoProducto;
        this.TiempoCultivarse = TiempoCultivarse;
        this.Precio = Precio;
        this.EstadoVida = EstadoVida;
        this.TienePlaga = TienePlaga;
    }

    public Cultivo(String TipoProducto, int TiempoCultivarse, double Precio, boolean EstadoVida, int cantidad, boolean TienePlaga) {
        this.TipoProducto = TipoProducto;
        this.TiempoCultivarse = TiempoCultivarse;
        this.Precio = Precio;
        this.EstadoVida = EstadoVida;
        this.cantidad = cantidad;
        this.TienePlaga = TienePlaga;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    

    public String getTipoProducto() {
        return TipoProducto;
    }

    public int getTiempoCultivarse() {
        return TiempoCultivarse;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public boolean isEstadoVida() {
        return EstadoVida;
    }

    public boolean isTienePlaga() {
        return TienePlaga;
    }

    public void setTipoProducto(String TipoProducto) {
        this.TipoProducto = TipoProducto;
    }

    public void setTiempoCultivarse(int TiempoCultivarse) {
        this.TiempoCultivarse = TiempoCultivarse;
    }

    public void setEstadoVida(boolean EstadoVida) {
        this.EstadoVida = EstadoVida;
    }

    public void setTienePlaga(boolean TienePlaga) {
        this.TienePlaga = TienePlaga;
    }

    @Override
    public String toString() {
        return TipoProducto + " Cantidad: "+cantidad;
    }
    
    
}


