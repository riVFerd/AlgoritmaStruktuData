package minggu12.latihan1;

import java.util.Scanner;

public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        DoubleLinkedLists antrian = new DoubleLinkedLists();
        Scanner scan = new Scanner(System.in);

        mainLoop: while (true) {
            System.out.println("++++++++++++++++++++++++++++");
            System.out.println("PENGATRI VAKSIN EXTRAVAGANZA");
            System.out.println("++++++++++++++++++++++++++++");
            System.out.println("\n1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("++++++++++++++++++++++++++++");
            int option = scan.nextInt();
            switch (option) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.print("Nomor Antrian : ");
                    int nomor = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Nama Penerima : ");
                    String nama = scan.nextLine();
                    antrian.addLast(nomor, nama);
                    break;
                case 2:
                    String namaPenerima = antrian.removeFirst();
                    if (namaPenerima.isEmpty()) {
                        System.out.println("Antrian kosong");
                    } else {
                        System.out.println(namaPenerima + " telah selesai divaksinasi.");
                    }
                    break;
                case 3:
                    antrian.print();
                    break;
                case 4:
                    break mainLoop;
            }
        }
        scan.close();
    }
}