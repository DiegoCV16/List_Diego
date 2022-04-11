package uaslp.objetos.parcial2.linkedlist;

class Node <T> {
    T data;
    Node<T> next;
    Node<T> previous;

    Node(T data)
    {
        this.data = data;
    }
}