package minggu10.latihan1;

public class Queue {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        data = new int[max];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan : " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen : " + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void enqueue(int dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public int dequeue() {
        int dt = 0;
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    // Jawaban latihan1
    public void peekPosition(int target) {
        if (!isEmpty()) {
            int idTarget = -1;
            for (int i = 0; i < data.length; i++) {
                if (data[i] == target) {
                    idTarget = i;
                    break;
                }
            }
            if (idTarget == -1)
                System.out.println("Nilai tidak ada dalam Queue");
            else
                System.out.println("Posisi dari nilai " + target + " berada di index ke-" + idTarget);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    // Jawaban latihan1
    public void peekAt(int idTarget) {
        if (!isEmpty()) {
            boolean isFound = false;
            int i = front;
            for (; i != rear; i = (i + 1) % max) {
                if (idTarget == i) isFound = true;
            }
            if (idTarget == i) isFound = true;
            if (isFound)
                System.out.println("Pada index ke-" + idTarget + " ditempati oleh nilai " + data[idTarget]);
            else
                System.out.println("Index ke-" + idTarget + " kosong");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
}
