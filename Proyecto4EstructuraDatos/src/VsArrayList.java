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

    public VsArrayList() {
    }

    public VsArrayList(int size) {
        this.size = size;
    }
    
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean insert(Object elemento, int pos) {
        if (getSize() == capacity) {
            resize();
        }
        for (int i = getSize(); i > pos; i--) {
            objetos[i] = objetos[i - 1];
        }
        objetos[pos] = elemento;
        size++;
        return true;
    }

    @Override
    public Object remove(int pos) {
        for (int i = pos; i < getSize(); i++) {
            objetos[i] = objetos[i + 1];
        }
        size--;
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public Object first() {
        return objetos[0];
    }

    @Override
    public Object last() {
        return objetos[size - 1];
    }

    @Override
    public void clear() {
        objetos = new Object[size];
    }

    @Override
    public int indexof(Object elemento) {
        for (int i = 0; i < objetos.length; i++) {
            if (objetos.equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Object get(int pos) {
        return objetos[pos];
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public boolean isEmpty() {
        return objetos.length > 0;
    }

    public void resize() {
        Object[] nueva = new Object[capacity + 5];
        System.arraycopy(objetos, 0, nueva, 0, objetos.length);
        objetos = nueva;
        capacity += 5;
    }

    @Override
    public boolean isFull() {
        return objetos.length == capacity;
    }
}