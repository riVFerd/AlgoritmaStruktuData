package minggu10.latihan2;

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah maksimal antrian : ");
        Queue queue = new Queue(sc.nextInt());
        int pilihan = 0;
        menu : do {
            System.out.println("1. Antrian baru");
            System.out.println("2. Antrian keluar");
            System.out.println("3. Tampilkan semua antrian");
            System.out.println("4. Tampilkan antrian terdepan");
            System.out.println("5. Tampilkan antrian terakhir");
            System.out.println("6. Cari posisi antrian");
            System.out.println("7. Cek posisi antrian");
            System.out.println("8. Keluar");
            System.out.println("-----------------------------");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan data antrian : ");
                    System.out.print("NIM : ");
                    String nim = sc.next();
                    System.out.print("Nama : ");
                    String nama = sc.next();
                    System.out.print("Absen : ");
                    int absen = sc.nextInt();
                    System.out.print("IPK : ");
                    double ipk = sc.nextDouble();
                    queue.enqueue(new Mahasiswa(nim, nama, absen, ipk));
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.print();
                    break;
                case 4:
                    queue.peek();
                    break;
                case 5:
                    queue.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan NIM : ");
                    queue.peekPosition(sc.nextLine());
                    break;
                case 7:
                    System.out.print("Masukkan nomor antrian yang ingin di cek : ");
                    queue.printMahasiswa(sc.nextInt());
                    break;
                case 8:
                    System.out.println("Terima kasih telah menggunakan program ini");
                    break menu;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        } while (pilihan != 0);
        sc.close();
    }
}
