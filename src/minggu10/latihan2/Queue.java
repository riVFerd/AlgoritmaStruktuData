package minggu10.latihan2;

public class Queue {
    Mahasiswa[] antrian;
    int front, rear, size, max;

    public Queue(int max) {
        this.max = max;
        antrian = new Mahasiswa[max];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa antri) {
        if (!isFull()) {
            if (isEmpty()) front = rear = 0;
            else if (rear == max - 1) rear = 0;
            else rear++;
            antrian[rear] = antri;
            size++;
        } else {
            System.out.println("Antrian sudah penuh");
        }
    }

    public Mahasiswa dequeue() {
        Mahasiswa dataOut = new Mahasiswa();
        if (!isEmpty()) {
            dataOut = antrian[front];
            size--;
            if (isEmpty()) front = rear = -1;
            else if (front == max - 1) front = 0;
            else front++;
        } else {
            System.out.println("Antrian masih kosong");
        }
        return dataOut;
    }

    public void print() {
        if (!isEmpty()) {
            int i = front;
            for (; i != rear; i = (i + 1) % max) {
                System.out.println(antrian[i].nim + " " + antrian[i].nama + " " + antrian[i].absen + " " + antrian[i].ipk);
            }
            System.out.println(antrian[i].nim + " " + antrian[i].nama + " " + antrian[i].absen + " " + antrian[i].ipk);
            System.out.println("Panjang antrian : " + size);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan: " + antrian[front].nim + " " + antrian[front].nama + " " + antrian[front].absen + " " + antrian[front].ipk);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir: " + antrian[rear].nim + " " + antrian[rear].nama + " " + antrian[rear].absen + " " + antrian[rear].ipk);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekPosition(String nim) {
        if (!isEmpty()) {
            boolean isFound = false;
            int i = front;
            for (; i != rear; i = (i + 1) % max) {
                if (antrian[i].nim.equals(nim)) {
                    isFound = true;
                    break;
                }
            }
            if (antrian[i].nim.equals(nim)) isFound = true;
            if (isFound) System.out.println("Mahasiswa dengan nim " + nim + " ada di posisi " + i);
            else System.out.println("Mahasiswa dengan nim " + nim + " tidak ada");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void printMahasiswa(int posisi) {
        if (!isEmpty()) {
            boolean isFound = false;
            int i = front;
            for (; i != rear; i = (i + 1) % max) {
                if (i == posisi) {
                    isFound = true;
                    break;
                }
            }
            if (i == posisi) isFound = true;
            if (isFound) System.out.println(antrian[posisi].nim + " " + antrian[posisi].nama + " " + antrian[posisi].absen + " " + antrian[posisi].ipk);
            else System.out.println("Mahasiswa dengan posisi " + posisi + " tidak ada");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
}
