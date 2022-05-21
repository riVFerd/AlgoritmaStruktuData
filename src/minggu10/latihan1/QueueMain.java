package minggu10.latihan1;

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();
        Queue Q = new Queue(n);
        int pilih;
        mainLoop: do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    if (Q.isFull()) {
                        System.out.println("Antrian penuh");
                        break mainLoop;
                    }
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        break;
                    } else {
                        break mainLoop;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    System.out.print("Masukkan nilai yang ingin dicari posisi indexnya: ");
                    Q.peekPosition(sc.nextInt());
                    break;
                case 6:
                    System.out.print("Masukkan posisi index yang dicari: ");
                    Q.peekAt(sc.nextInt());
                    break;
                case 7:
                    Q.clear();
                    break;
            }
        } while (pilih != 0);
    }

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Peek Position");
        System.out.println("6. Peek At");
        System.out.println("7. Clear");
        System.out.println("---------------------------------");
    }
}
