package uas;

public class Node <T>{
    Node<T> prev;
    T data;
    Node<T> next;

    public Node(Node<T> prev, T data, Node<T> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}