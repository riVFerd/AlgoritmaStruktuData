package minggu9.latihan;

public class Tugas2Stack {
    int size;
    int top;
    Tugas2Struk[] data;

    public Tugas2Stack(int size) {
        this.size = size;
        data = new Tugas2Struk[size];
        top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Tugas2Struk struk) {
        if (!isFull()) {
            top++;
            data[top] = struk;
        } else {
            System.out.println("Isi stack penuh");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            Tugas2Struk x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x.noTransaksi + " " + x.tglPembelian + " " + x.jmlhBarang + " " + x.totalHarga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen teratas: " + data[top].noTransaksi + " " + data[top].tglPembelian + " " + data[top].jmlhBarang + " " + data[top].totalHarga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void print() {
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].noTransaksi + " " + data[i].tglPembelian + " " + data[i].jmlhBarang + " " + data[i].totalHarga);
        }
        System.out.println();
    }

    public void clear() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }
}