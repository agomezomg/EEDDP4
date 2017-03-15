
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
 * @author mario
 */
public class HiloTransporte implements Runnable {

    private final JProgressBar barra1;
    private final JProgressBar barra2;
    private final JProgressBar barra3;
    private final boolean vivo = true;
    private final JLabel fondos;
    private final JButton boton1;
    private final JButton boton2;
    private final JButton boton3;
    private Hacienda actual;
    private Cliente cliente1;
    private Cliente cliente2;
    private Cliente cliente3;
    private boolean activo1 = false;
    private boolean activo2 = false;
    private boolean activo3 = false;
    private Transporte trans1;
    private Transporte trans2;
    private Transporte trans3;
    private double distancia1;
    private double distancia2;
    private double distancia3;

    @Override
    public void run() {
        while (vivo) {
            if (activo1) {
                if (barra1.getMaximum() == barra1.getValue()) {
                    while (cliente1.getCantidadPedida() > 0) {
                        Cultivo temp = null;
                        int post = 0;
                        for (int i = 0; i < actual.getCultivos().getSize(); i++) {
                            if (actual.getCultivos(i).getTipoProducto().equals(cliente1.getPedidoCultivo())) {
                                temp = actual.getCultivos(i);
                                post = i;
                                break;
                            }
                        }
                        if (temp.getCantidad() > cliente1.getCantidadPedida()) {
                            double temporalpago = cliente1.getCantidadPedida() * (cliente1.getPago() + 50);
                            temp.setCantidad(temp.getCantidad() - cliente1.getCantidadPedida());
                            actual.setDineroTotal(actual.getDineroTotal() + temporalpago);
                            JOptionPane.showMessageDialog(null, "Se recibio pago de cliente");
                            cliente1.setCantidadPedida(0);
                            cliente1.setPedidoCultivo("");
                            cliente1.setPago(0);
                            cliente1.setPedidoenProceso(false);
                            //actual.setTransportistas(trans1);
                        } else {
                            double temporalpago = cliente1.getCantidadPedida() * (cliente1.getPago() + 50);
                            cliente1.setCantidadPedida(cliente1.getCantidadPedida() - temp.getCantidad());
                            temp.setCantidad(0);
                            actual.getCultivos().remove(post);
                        }
                    }
                    barra1.setValue(0);
                    boton1.setEnabled(true);
                    fondos.setText(actual.getDineroTotal() + "");
                    activo1 = false;
                } else {
                    barra1.setValue(barra1.getValue() + 100);
                }
            }
            if (activo2) {
                if (barra2.getMaximum() == barra2.getValue()) {
                    while (cliente2.getCantidadPedida() > 0) {
                        Cultivo temp = null;
                        int post = 0;
                        for (int i = 0; i < actual.getCultivos().getSize(); i++) {

                            if (actual.getCultivos(i).getTipoProducto().equals(cliente2.getPedidoCultivo())) {
                                temp = actual.getCultivos(i);
                                post = i;
                                break;
                            }
                        }
                        if (temp.getCantidad() > cliente2.getCantidadPedida()) {
                            double temporalpago = cliente2.getCantidadPedida() * (cliente2.getPago() + 50);
                            temp.setCantidad(temp.getCantidad() - cliente2.getCantidadPedida());
                            actual.setDineroTotal(actual.getDineroTotal() + temporalpago);
                            JOptionPane.showMessageDialog(null, "Se recibio pago de cliente");
                            cliente2.setCantidadPedida(0);
                            cliente2.setPedidoCultivo("");
                            cliente2.setPago(0);
                            cliente2.setPedidoenProceso(false);
                            //actual.setTransportistas(trans2);
                        } else {
                            double temporalpago = cliente2.getCantidadPedida() * (cliente2.getPago() + 50);
                            cliente2.setCantidadPedida(cliente2.getCantidadPedida() - temp.getCantidad());
                            temp.setCantidad(0);
                            actual.getCultivos().remove(post);
                        }
                    }
                    barra2.setValue(0);
                    boton2.setEnabled(true);
                    fondos.setText(actual.getDineroTotal() + "");
                    activo2 = false;
                } else {
                    barra2.setValue(barra2.getValue() + 100);
                }
            }
            if (activo3) {
                if (barra3.getMaximum() == barra3.getValue()) {
                    while (cliente3.getCantidadPedida() > 0) {
                        Cultivo temp = null;
                        int post = 0;
                        for (int i = 0; i < actual.getCultivos().getSize(); i++) {
                            if (actual.getCultivos(i).getTipoProducto().equals(cliente3.getPedidoCultivo())) {
                                temp = actual.getCultivos(i);
                                post = i;
                                break;
                            }
                        }
                        if (temp.getCantidad() > cliente3.getCantidadPedida()) {
                            double temporalpago = cliente3.getCantidadPedida() * (cliente3.getPago() + 50);
                            temp.setCantidad(temp.getCantidad() - cliente3.getCantidadPedida());
                            actual.setDineroTotal(actual.getDineroTotal() + temporalpago);
                            JOptionPane.showMessageDialog(null, "Se recibio pago de cliente");
                            cliente3.setCantidadPedida(0);
                            cliente3.setPedidoCultivo("");
                            cliente3.setPago(0);
                            cliente3.setPedidoenProceso(false);
                            //actual.setTransportistas(trans2);
                        } else {
                            double temporalpago = cliente3.getCantidadPedida() * (cliente3.getPago() + 50);
                            cliente3.setCantidadPedida(cliente3.getCantidadPedida() - temp.getCantidad());
                            temp.setCantidad(0);
                            actual.getCultivos().remove(post);
                        }
                    }
                    barra3.setValue(0);
                    boton3.setEnabled(true);
                    fondos.setText(actual.getDineroTotal() + "");
                    activo3 = false;
                } else {
                    barra3.setValue(barra3.getValue() + 100);
                }
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }

    public HiloTransporte(JProgressBar barra1, JProgressBar barra2, JProgressBar barra3, JButton boton1, JButton boton2, JButton boton3, Hacienda actual, JLabel fondo) {
        this.barra1 = barra1;
        this.barra2 = barra2;
        this.barra3 = barra3;
        this.boton1 = boton1;
        this.boton2 = boton2;
        this.boton3 = boton3;
        this.actual = actual;
        this.fondos = fondo;
    }

    public Hacienda getActual() {
        return actual;
    }

    public void setActual(Hacienda actual) {
        this.actual = actual;
    }

    public Cliente getCliente1() {
        return cliente1;
    }

    public void setCliente1(Cliente cliente1) {
        this.cliente1 = cliente1;
        distancia1 = cliente1.getKmAway();
        barra1.setMaximum((int) distancia1);
        System.out.println(cliente1.toString());
    }

    public Cliente getCliente2() {
        return cliente2;
    }

    public void setCliente2(Cliente cliente2) {
        this.cliente2 = cliente2;
        distancia2 = cliente2.getKmAway();
        barra2.setMaximum((int) distancia2);
    }

    public Cliente getCliente3() {
        return cliente3;
    }

    public void setCliente3(Cliente cliente3) {
        this.cliente3 = cliente3;
        distancia3 = cliente3.getKmAway();
        barra3.setMaximum((int) distancia3);
    }

    public Transporte getTrans1() {
        return trans1;
    }

    public void setTrans1(Transporte trans1) {
        this.trans1 = trans1;
    }

    public Transporte getTrans2() {
        return trans2;
    }

    public void setTrans2(Transporte trans2) {
        this.trans2 = trans2;
    }

    public Transporte getTrans3() {
        return trans3;
    }

    public void setTrans3(Transporte trans3) {
        this.trans3 = trans3;
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

}
