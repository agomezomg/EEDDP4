
import java.io.Serializable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mario
 */
public class Queue implements Serializable {

    private final ArrayList<Object> objetos;

    public Queue() {
        objetos = new ArrayList<>();
    }

    public int getSize() {
        return objetos.size();
    }

    public boolean Queue(Object elemento) {
        return objetos.add(elemento);
    }

    public Object DeQueue() {
        return objetos.remove(0);
    }

    public Object peek() {
        return objetos.get(0);
    }

    public ArrayList<Object> getObjetos() {
        return objetos;
    }

}
