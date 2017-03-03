
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
public class Queue {

    private Object[] objetos;
    private int size;
    private int capacity;

    public void resize() {
        Object[] nueva = new Object[capacity + 5];
        for (int i = 0; i < objetos.length; i++) {
            nueva[i] = objetos[i];
        }
        objetos = nueva;
        capacity += 5;
    }

    public int getSize() {
        return size;
    }

    public boolean Queue(Object elemento) {
        if (getSize() == capacity) {
            resize();
        }
        for (int i = getSize(); i > 0; i--) {
            objetos[i] = objetos[i - 1];
        }
        objetos[size - 1] = elemento;
        return true;
    }

    public boolean DeQueue() {
        Object temp = objetos[0];
        for (int i = getSize(); i > 0; i--) {
            objetos[i] = objetos[i - 1];
        }
        return true;
    }
    public Object peek(){
        return objetos[0];
    }
}
