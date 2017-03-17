
import static java.lang.Math.random;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author didiermurillo
 */
public class HiloCliente implements Runnable {
    VsArrayList Clientes;
    VsArrayList Personal;
    Hacienda hacienda;
    private JLabel dia;
    boolean vivo=true;

    public HiloCliente(VsArrayList Clientes, VsArrayList Personal, JLabel dia,Hacienda hacienda) {
        this.Clientes = Clientes;
        this.Personal = Personal;
        this.dia = dia;
        this.hacienda=hacienda;
        
        
        
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    
    
    
    
    
    public void run() {
        while(vivo){
            if(Integer.parseInt(dia.getText())%30==0){
                JOptionPane.showMessageDialog(null,"Llego la hora de pagarle a los empleados! :D (?)");
                for (int i = 0; i <Personal.getSize(); i++) {
                    if (((Personal)Personal.get(i)).getSueldo()>hacienda.getDineroTotal()) {
                        JOptionPane.showMessageDialog(null,"No tienes dinero suficiente para pagarle a tu personal ? -_-");
                    }else{
                        hacienda.setDineroTotal(hacienda.getDineroTotal()-(((Personal)Personal.get(i)).getSueldo()*((Personal)Personal.get(i)).getDiasTrabajados())/30);
                        ((Personal)Personal.get(i)).setDiasTrabajados(0);
                    }
                }
                for (int i = 0; i <Clientes.getSize(); i++) {
                    PedidoClientes((Cliente) Clientes.get(i));
                }
            }else{
                for (int i = 0; i < Personal.getSize(); i++) {
                    ((Personal)Personal.get(i)).setDiasTrabajados(((Personal)Personal.get(i)).getDiasTrabajados()+1);
                }
            }
            try{
                Thread.sleep(5000);
            }catch(Exception e){

            }
        }       
    } 
    
    
    public void PedidoClientes(Cliente cliente){
        int OpcionCultivo=(int) (Math.random() * 7)+1;
        String TemporalPedido=" ";
        int TemporalPrecio=0;
        switch (OpcionCultivo) {
            case 1: {
                TemporalPedido="Maiz";
                TemporalPrecio=275;
                break;
            }
            case 2 : {
                TemporalPedido="Frijoles";
                TemporalPrecio=900;
                break;
            }
            case 3: {
                TemporalPedido="Cafe";
                TemporalPrecio=2000;
                break;
            }
            case 4: {
                TemporalPedido="Banano";
                TemporalPrecio=2300;
                break;
            }
            case 5: {
                TemporalPedido="Cocoa";
                TemporalPrecio=500;
                break;
            }
            case 6: {
                TemporalPedido="Cacao";
                TemporalPrecio=3000;
                break;
            }
            case 7: {
                TemporalPedido="Didier";
                TemporalPrecio=5000;
                break;
            }
        }
        TemporalPrecio+=(int) (Math.random() * 30)+1;
        cliente.setPedidoCultivo(TemporalPedido);
        cliente.setPago(TemporalPrecio);
        cliente.setCantidadPedida((int) (Math.random() * 50)+1);
    }        
    
    
    
    
}


