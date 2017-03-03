/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mario
 */
public class VsArrayList implements ADTList {
    private int size;
    private int capacity;
    private Object[] objetos;

    public int getSize() {
        return size;
    }

    public boolean insert(Object elemento,int pos) {
        if (getSize() == capacity) {
            resize();
        }
        for (int i = getSize(); i > pos; i--) {
            objetos[i] = objetos[i-1];
        }
        objetos[pos] = elemento;
        size++;
        return true;
    }

    public Object remove(int pos) {
        for (int i = pos; i < getSize(); i++) {
            objetos[i] = objetos[i+1];
        }
        size--;
        return true;
    }

    public Object first() {
        return objetos[0];
    }

    public Object last() {
        return objetos[size-1];
    }

    public void clear() {
        objetos = new Object[size];
    }

    public int indexof(Object elemento) {
        for (int i = 0; i < objetos.length; i++) {
            if (objetos.equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public Object get(int pos) {
        return objetos[pos];
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isEmpty() {
        if (objetos.length > 0) {
            return true;
        }else{
            return false;
        }
    }
    public void resize(){
        Object[] nueva = new Object[capacity+5];
        for (int i = 0; i < objetos.length; i++) {
            nueva[i] = objetos[i];
        }
        objetos = nueva;
        capacity+=5;
    }

    public boolean isFull() {
        if (objetos.length == capacity) {
            return true;
        }else{
            return false;
        }
    }
    
    
}
