package minggu11.latihan4;

import java.util.Scanner;

public class SLLMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SingleLinkedList linkedList = new SingleLinkedList();
        int pilihan = 0;
        do {
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
                    int nim = sc.nextInt();
                    sc.nextLine(); //Scanner safety
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Absen : ");
                    int absen = sc.nextInt();
                    System.out.print("IPK : ");
                    double ipk = sc.nextDouble();
                    linkedList.addLast(new Mahasiswa(nim, nama, absen, ipk));
                    break;
                case 2:
                    linkedList.removeFirst();
                    break;
                case 3:
                    linkedList.print();
                    break;
                case 4:
                    linkedList.peek();
                    break;
                case 5:
                    linkedList.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan NIM : ");
                    int indexFound = linkedList.indoxOf(sc.nextInt());
                    System.out.println("Mahasiswa yang dicari ada diantrian ke-" + (indexFound + 1));
                    break;
                case 7:
                    System.out.print("Masukkan nomor antrian yang ingin di cek : ");
                    Mahasiswa mahasiswaFound = linkedList.getData((sc.nextInt() - 1));
                    System.out.println("Nomor antrian tersebut ditempati oleh : " + mahasiswaFound.nim + " " + mahasiswaFound.nama + " " + mahasiswaFound.absen);
                    break;
                case 8:
                    System.out.println("Terima kasih telah menggunakan program ini");
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        } while (pilihan != 0);
        sc.close();
    }
}
