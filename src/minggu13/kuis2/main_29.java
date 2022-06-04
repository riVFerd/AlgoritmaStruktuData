package minggu13.kuis2;
import java.util.Scanner;
import minggu13.kuis2.pembeli.*;
import minggu13.kuis2.pesanan.*;

public class main_29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedListPembeli listPembeli = new DoubleLinkedListPembeli();
        DoubleLinkedListPesanan listPesanan = new DoubleLinkedListPesanan();

        // Input data pembeli by program
        listPembeli.addLast(new Pembeli_29("Mamluatul", "08224500000"));
        listPembeli.addLast(new Pembeli_29("Abyaz A.M", "08224511111"));
        listPembeli.addLast(new Pembeli_29("Yoshinoya2", "08224522222"));

        mainLoop : while (true) {
            System.out.println();
            System.out.println("========= QUIZ 2 PRAKTIKUM ASD TI - 1B =========");
            System.out.println("Dibuat oleh : Virgy Ferdian Surya F.");
            System.out.println("NIM : 2141720116");
            System.out.println("Absen : 29");
            System.out.println("==================================================");
            System.out.println("Sistem Antrian Resto Royal Delish");
            printMenu();
            System.out.print("Pilih(1-6) : ");
            int pilihan = scan.nextInt(); scan.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("----------------------------------------------");
                    System.out.println("Masukkan Data Pembeli");
                    System.out.println("----------------------------------------------");
                    System.out.println("Nomor Antrian : " + (listPembeli.size + 1));
                    System.out.print("Nama Customer : ");
                    String nama = scan.nextLine();
                    System.out.print("No. HP : ");
                    String noHp = scan.nextLine();
                    listPembeli.addLast(new Pembeli_29(nama, noHp));
                    break;
                case 2:
                    listPembeli.print();
                    break;
                case 3:
                    System.out.println("----------------------------------------------");
                    System.out.println("Transaksi input pesanan");
                    System.out.println("----------------------------------------------");
                    listPembeli.removeFirst();
                    System.out.println("Nomor Pesanan : " + (listPesanan.size + 1));
                    System.out.print("Pesanan : ");
                    String pesanan = scan.nextLine();
                    System.out.print("Harga : ");
                    int harga = scan.nextInt(); scan.nextLine();
                    listPesanan.addLast(new Pesanan_29(listPesanan.size + 1, pesanan, harga));
                    listPesanan.print();
                    break;
                case 4:
                    listPesanan.printSortByName();
                    break;
                case 5:
                    listPesanan.printSum();
                    break;
                case 6:
                    break mainLoop;

            }
        }
        scan.close();
    }

    static void printMenu() {
        System.out.println("Menu");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian");
        System.out.println("4. Laporan Pengurutan pesanan by nama");
        System.out.println("5. Hitung total Pendapatan");
        System.out.println("6. Keluar");
    }
}
