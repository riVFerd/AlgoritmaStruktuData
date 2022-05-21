package minggu12.latihan2;

public class Node {
    Node prev;
    Film data;
    Node next;

    public Node(Node prev, Film data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
