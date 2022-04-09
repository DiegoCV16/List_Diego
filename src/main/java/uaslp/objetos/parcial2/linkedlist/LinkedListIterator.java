package uaslp.objetos.parcial2.linkedlist;

import uaslp.objetos.parcial2.Iterator;

public class LinkedListIterator <T> implements Iterator<T> { //Generico implementado por el operador diamante "<T>"
    private Node<T> currentNode;

    LinkedListIterator(Node<T> startNode) {
        currentNode = startNode;
    }

    public boolean hasNext() {
        return currentNode != null;
    }

    public T next() {
        T data = currentNode.data;

        currentNode = currentNode.next;

        return data;
    }
}