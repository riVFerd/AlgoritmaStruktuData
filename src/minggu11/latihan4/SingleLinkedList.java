package minggu11.latihan4;

public class SingleLinkedList {
    Node head;
    Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Isi Linked List:   ");
            int counter = 1;
            while (tmp != null) {
                System.out.println("Antrian ke-" + counter + " : " + tmp.data.nim + " " + tmp.data.nama + " " + tmp.data.absen + " " + tmp.data.ipk);
                tmp = tmp.next;
                counter++;
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void peek() {
        System.out.println("Antrian terdepan : " + head.data.nim + " " + head.data.nama + " " + head.data.absen + " " + head.data.ipk);
    }

    public void peekRear() {
        System.out.println("Antrian terakhir : " + tail.data.nim + " " + tail.data.nama + " " + tail.data.absen + " " + tail.data.ipk);
    }

    public void addLast(Mahasiswa input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public Mahasiswa getData(int index) {
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int indoxOf(int key) {
        Node tmp = head;
        int index = 0;
        while (tmp.next != null && tmp.data.nim != key) {
            tmp = tmp.next;
            index++;
        }

        if (tmp.data.nim != key) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }
    
}
