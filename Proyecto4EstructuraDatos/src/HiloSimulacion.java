
import javax.swing.JLabel;

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
private int contadordia=1;
private boolean vivo=true;
private String Temporal;
    @Override
    
    
    
    
    public void run() {
        while (vivo){
            this.dia.setText(""+contadordia);
            contadordia++;
           
            try{
                Thread.sleep(5000);
            }catch(Exception e){
                
            }
        }    
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public HiloSimulacion(JLabel dia) {
        this.dia = dia;
        this.contadordia=1;
    }
    
    
}
