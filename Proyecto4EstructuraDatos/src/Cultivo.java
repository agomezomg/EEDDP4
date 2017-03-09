
import java.io.Serializable;

public class Cultivo implements Serializable {

<<<<<<< HEAD
    private String TipoProducto;
    private int TiempoCultivarse;
    private double Precio;
=======
public class Cultivo implements Serializable{
    private String TipoProducto;
    private int TiempoCultivarse;
    private int Precio;
>>>>>>> 6d9cebd37e8144ec0d453d8b0b46aea97bcf1e87
    private boolean EstadoVida;
    private boolean TienePlaga;

    public Cultivo(String TipoProducto, int TiempoCultivarse, double Precio, boolean EstadoVida, boolean TienePlaga) {
        this.TipoProducto = TipoProducto;
        this.TiempoCultivarse = TiempoCultivarse;
        this.Precio = Precio;
        this.EstadoVida = EstadoVida;
        this.TienePlaga = TienePlaga;
    }
    
    public String getTipoProducto() {
        return TipoProducto;
    }

    public int getTiempoCultivarse() {
        return TiempoCultivarse;
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

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public void setEstadoVida(boolean EstadoVida) {
        this.EstadoVida = EstadoVida;
    }

    public void setTienePlaga(boolean TienePlaga) {
        this.TienePlaga = TienePlaga;
    }

    @Override
    public String toString() {
        return "Cultivo{" + "TipoProducto=" + TipoProducto + ", TiempoCultivarse=" + TiempoCultivarse + ", Precio=" + Precio + ", EstadoVida=" + EstadoVida + ", TienePlaga=" + TienePlaga + '}';
    }

}
