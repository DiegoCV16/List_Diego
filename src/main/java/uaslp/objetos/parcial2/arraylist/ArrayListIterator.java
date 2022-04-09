package uaslp.objetos.parcial2.arraylist;

import uaslp.objetos.parcial2.Iterator;

public class ArrayListIterator <T> implements Iterator<T> {
    private ArrayList<T> arrayList; //Generico implementado por el operador diamante "<T>"
    private int currentItem;

    public ArrayListIterator(ArrayList<T> arrayList){
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        return currentItem < arrayList.getSize();
    }

    @Override
    public T next() {
        T data = arrayList.getAt(currentItem);

        currentItem++;

        return data;
    }
}