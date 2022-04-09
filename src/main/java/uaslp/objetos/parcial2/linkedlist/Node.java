package uaslp.objetos.parcial2.linkedlist;

class Node <T> { //Generico implementado por el operador diamante "<T>"
    T data;
    Node<T> next;
    Node<T> previous;

    Node(T data){
        this.data = data;
    }
}