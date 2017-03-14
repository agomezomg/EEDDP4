
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author didiermurillo
 */
public class HiloSimulacion implements Runnable {

    private JLabel dia;
    private JProgressBar barra1;
    private JProgressBar barra2;
    private JProgressBar barra3;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private Hacienda actual;
    private Cultivo cult1;
    private Cultivo cult2;
    private Cultivo cult3;
    private boolean activo1 = false;
    private boolean activo2 = false;
    private boolean activo3 = false;
    private int contadordia = 1;
    private boolean vivo = true;
    private String Temporal;

    @Override

    public void run() {
        while (vivo) {
            this.dia.setText("" + contadordia);
            contadordia++;
            if (activo1) {
                if (barra1.getMaximum() == barra1.getValue()) {
                    Random random = new Random();
                    int cantidad = cult1.getCantidad() * 2;
                    int aumento = random.nextInt(cantidad) + 1;
                    cult1.setCantidad(aumento + cult1.getCantidad());
                    actual.addCultivo(cult1);
                    activo1 = false;
                    barra1.setValue(0);
                    boton1.setEnabled(true);
                    JOptionPane.showMessageDialog(null, "Cultivo Terminado\nCantidad de Producto: " + cult1.getCantidad());
                } else {

                    barra1.setValue(barra1.getValue() + 1);
                }
            }
            if (activo2) {
                if (barra2.getMaximum() == barra2.getValue()) {
                    Random random = new Random();
                    int cantidad = cult2.getCantidad() * 2;
                    int aumento = random.nextInt(cantidad) + 1;
                    cult2.setCantidad(aumento + cult2.getCantidad());
                    actual.addCultivo(cult2);
                    activo2 = false;
                    barra2.setValue(0);
                    boton2.setEnabled(true);
                    JOptionPane.showMessageDialog(null, "Cultivo Terminado\nCantidad de Producto: " + cult1.getCantidad());
                } else {

                    barra2.setValue(barra2.getValue() + 1);
                }
            }
            if (activo3) {
                if (barra3.getMaximum() == barra3.getValue()) {
                    Random random = new Random();
                    int cantidad = cult3.getCantidad() * 2;
                    int aumento = random.nextInt(cantidad) + 1;
                    cult3.setCantidad(aumento + cult3.getCantidad());
                    actual.addCultivo(cult3);
                    activo3 = false;
                    barra3.setValue(0);
                    boton3.setEnabled(true);
                    JOptionPane.showMessageDialog(null, "Cultivo Terminado\nCantidad de Producto: " + cult1.getCantidad());
                } else {

                    barra3.setValue(barra3.getValue() + 1);
                }
            }
            try {
                Thread.sleep(5000);
            } catch (Exception e) {

            }
        }
    }

    public HiloSimulacion(JLabel dia, JProgressBar barra1, JProgressBar barra2, JProgressBar barra3, JButton boton1, JButton boton2, JButton boton3, Hacienda actual) {
        this.dia = dia;
        this.barra1 = barra1;
        this.barra2 = barra2;
        this.barra3 = barra3;
        this.boton1 = boton1;
        this.boton2 = boton2;
        this.boton3 = boton3;
        this.actual = actual;
    }

    public HiloSimulacion(JLabel dia, JProgressBar barra1, JProgressBar barra2, JProgressBar barra3, Hacienda actual) {
        this.dia = dia;
        this.barra1 = barra1;
        this.barra2 = barra2;
        this.barra3 = barra3;
        this.actual = actual;
    }

    public HiloSimulacion(JLabel dia, JProgressBar barra1, JProgressBar barra2, JProgressBar barra3) {
        this.dia = dia;
        this.barra1 = barra1;
        this.barra2 = barra2;
        this.barra3 = barra3;
    }

    public HiloSimulacion(JProgressBar barra1, JProgressBar barra2, JProgressBar barra3) {
        this.barra1 = barra1;
        this.barra2 = barra2;
        this.barra3 = barra3;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public JProgressBar getBarra1() {
        return barra1;
    }

    public void setBarra1(JProgressBar barra1) {
        this.barra1 = barra1;
    }

    public JProgressBar getBarra2() {
        return barra2;
    }

    public void setBarra2(JProgressBar barra2) {
        this.barra2 = barra2;
    }

    public JProgressBar getBarra3() {
        return barra3;
    }

    public void setBarra3(JProgressBar barra3) {
        this.barra3 = barra3;
    }

    public Cultivo getCult1() {
        return cult1;
    }

    public void setCult1(Cultivo cult1) {
        this.cult1 = cult1;
        barra1.setMaximum(cult1.getTiempoCultivarse());
    }

    public Cultivo getCult2() {
        return cult2;
    }

    public void setCult2(Cultivo cult2) {
        this.cult2 = cult2;
        barra2.setMaximum(cult2.getTiempoCultivarse());
    }

    public Cultivo getCult3() {
        return cult3;
    }

    public void setCult3(Cultivo cult3) {
        this.cult3 = cult3;
        barra3.setMaximum(cult3.getTiempoCultivarse());
    }

    public boolean isActivo1() {
        return activo1;
    }

    public void setActivo1(boolean activo1) {
        this.activo1 = activo1;
    }

    public boolean isActivo2() {
        return activo2;
    }

    public void setActivo2(boolean activo2) {
        this.activo2 = activo2;
    }

    public boolean isActivo3() {
        return activo3;
    }

    public void setActivo3(boolean activo3) {
        this.activo3 = activo3;
    }

    public HiloSimulacion(JLabel dia) {
        this.dia = dia;
        this.contadordia = 1;
    }

}
