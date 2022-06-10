package minggu13.kuis2.pesanan;

public class DoubleLinkedListPesanan {
    Node_29 head, tail;
    public int size;

    public DoubleLinkedListPesanan() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    private void addFirst(Pesanan_29 item) {
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

    public void addLast(Pesanan_29 item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node_29 newNode = new Node_29(tail, item, null);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public Pesanan_29 removeFirst() {
        if (!isEmpty()) {
            Pesanan_29 item = head.data;
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
            System.out.println("Daftar Pesanan Resto Royal Delish");
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("|No.\t|Nama Pesanan\t\t|Harga");
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        } else {
            System.out.println("List masih kosong");
        }
    }

    public void printSortByName() {
        if (!isEmpty()) {
            Node_29 current = head;
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("Daftar Pesanan Resto Royal Delish");
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("|No.\t|Nama Pesanan\t\t|Harga");
            int i = 0;
            while (i < size) {
                int j = 0;
                while (j < size - 1) {
                    int shortest = (current.data.namaPesanan.length() < current.next.data.namaPesanan.length()) ? current.data.namaPesanan.length() : current.next.data.namaPesanan.length();
                    for (int k = 0; k < shortest; k++) {
                        if (current.data.namaPesanan.charAt(k) < current.next.data.namaPesanan.charAt(k)) {
                            Pesanan_29 temp = current.data;
                            current.data = current.next.data;
                            current.next.data = temp;
                            break;
                        }
                    }
                    current = current.next;
                    j++;
                }
                current = head;
                i++;
            }
            print();
        } else {
            System.out.println("List masih kosong");
        }
    }

    public void printSum() {
        if (!isEmpty()) {
            Node_29 current = head;
            int sum = 0;
            while (current != null) {
                sum += current.data.harga;
                current = current.next;
            }
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("TOTAL PENDAPATAN");
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("Pendapatan hari ini : " + sum);
        } else {
            System.out.println("List masih kosong");
        }
    }
}
