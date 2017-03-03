/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mario
 */
public interface ADTList {
        public int getSize();
        public boolean insert(Object elemento,int pos);
        public Object remove(int pos);
        public Object first();
        public Object last();
        public void clear();
        public int indexof(Object elemento);
        public Object get(int pos);
        public int getCapacity();
        public boolean isEmpty();
        public boolean isFull();
}
