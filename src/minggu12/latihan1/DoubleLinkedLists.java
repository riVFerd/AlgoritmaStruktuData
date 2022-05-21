package minggu12.latihan1;

public class DoubleLinkedLists {
    Node head;
    Node tail;
    int size;

    public DoubleLinkedLists() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(int nomor, String nama) {
        if (isEmpty()) {
            head = new Node(null, nomor, nama, null);
            tail = head;
        } else {
            Node temp = new Node(null, nomor, nama, head);
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    public void addLast(int nomor, String nama) {
        if (isEmpty()) {
            addFirst(nomor, nama);
        } else {
            Node temp = new Node(tail, nomor, nama, null);
            tail.next = temp;
            tail = temp;
            size++;
        }
    }

    public String removeFirst() {
        if (isEmpty()) {
            return "";
        } else {
            Node temp = head;
            head = head.next;
            if (head != null) head.prev = null;
            size--;
            return temp.nama;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("+++++++++++++++++++++++");
        System.out.println("DAFTAR PENGANTRI VAKSIN");
        System.out.println("+++++++++++++++++++++++");
        System.out.println("|No.\t|Nama   \t|");
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.println("|" + temp.nomor + "\t|" + temp.nama + "   \t|");
            temp = temp.next;
        }
        System.out.println("Sisa Antrian : " + size);
    }

}