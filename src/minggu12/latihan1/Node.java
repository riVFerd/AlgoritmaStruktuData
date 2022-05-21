package minggu12.latihan1;

public class Node {
    Node prev;
    int nomor;
    String nama;
    Node next;

    public Node(Node prev, int nomor, String nama, Node next) {
        this.prev = prev;
        this.nomor = nomor;
        this.nama = nama;
        this.next = next;
    }
}