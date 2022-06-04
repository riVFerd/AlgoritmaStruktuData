package minggu13.kuis2.pembeli;

public class DoubleLinkedListPembeli {
    Node_29 head, tail;
    public int size;
    int noAntri = 1; // iterator untuk print antrian

    public DoubleLinkedListPembeli() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    private void addFirst(Pembeli_29 item) {
        if (isEmpty()) {
            head = new Node_29(null, item, null);
            tail = head;
        } else {
            Node_29 newNode = new Node_29(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Pembeli_29 item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node_29 newNode = new Node_29(tail, item, null);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public Pembeli_29 removeFirst() {
        if (!isEmpty()) {
            Pembeli_29 item = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            } else {
                head.prev = null;
            }
            size--;
            return item;
        } else {
            return null;
        }
    }

    public void print() {
        if (!isEmpty()) {
            Node_29 current = head;
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("Daftar Antrian Resto Royal Delish");
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("|No.\t|Nama Customer\t\t|No hp");
            while (current != null) {
                System.out.println("|" + noAntri + current.data);
                current = current.next;
                noAntri++;
            }
            System.out.println("Total Antrian : " + size);
        } else {
            System.out.println("List masih kosong");
        }
    }
}
