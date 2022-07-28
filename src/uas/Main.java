package uas;

import java.util.Scanner;

public class Main {
    static int counterKode = 0;
    public static void main(String[] args) {
        // instansiasi
        int counterKode = 0;
        Scanner scan = new Scanner(System.in);
        DoubleLinkedList<Kendaraan> listKendaraan = new DoubleLinkedList<>();
        DoubleLinkedList<Pajak> listPajak = new DoubleLinkedList<>();
        
        // input kendaraan by program
        listKendaraan.addLast(new Kendaraan("B12345", "Motor1", "roda 2", "150", "2018", 9));
        listKendaraan.addLast(new Kendaraan("B12346", "Motor2", "roda 2", "300", "2018", 12));
        listKendaraan.addLast(new Kendaraan("B12347", "Motor3", "roda 2", "90", "2010", 7));
        listKendaraan.addLast(new Kendaraan("L12348", "Mobil1", "roda 4", "750", "2013", 10));
        listKendaraan.addLast(new Kendaraan("L12349", "Mobil2", "roda 4", "1500", "2015", 12));
        listKendaraan.addLast(new Kendaraan("L12350", "Mobil3", "roda 4", "3000", "2017", 5));

        // menu
        menu : while (true) {
            printMenu();
            int pilihan = scan.nextInt();
            scan.nextLine();
            switch (pilihan) {
                case 1 : 
                    inputPajak(scan, listKendaraan, listPajak);
                    break;
                case 2 :
                    listPajak.print();
                    break;
                case 3 :
                    break;
                case 4 :
                    break menu;
            }
        }
    }

    static void printMenu() {
        System.out.println("=====PROGRAM PEMBAYARAN PAJAK=====");
        System.out.println("1. Bayar Pajak");
        System.out.println("2. Lihat History Transaksi");
        System.out.println("3. Urutkan Transaksi");
        System.out.println("4. Keluar");
        System.out.println("----------------------------------");
        System.out.print("Pilihan: ");
    }

    static void inputPajak(Scanner scan, DoubleLinkedList<Kendaraan> dll, DoubleLinkedList<Pajak> dllPajak) {
        System.out.println("=====BAYAR PAJAK=====");
        System.out.println("~~Daftar Kendaraan~~");
        dll.print();
        System.out.println("~~Silahkan Masukan Data-Data Berikut~~");
        System.out.print("TNBK : ");
        String tnkb = scan.nextLine();

        // cari kendaraan berdasarkan tnkb
        Kendaraan kendaraan = findKendaraan(dll, tnkb);
        if (kendaraan == null) {
            System.out.println("Kendaraan dengan nomor TNKB tersebut tidak ditemukan");
            return;
        }

        // mencari pajak berdasarkan tipe kendaraan
        int nominalPajak;
        if (kendaraan.jenis.equals("roda 2")) {
            if (Integer.parseInt(kendaraan.cc) > 250) nominalPajak = 500_000;
            else if (Integer.parseInt(kendaraan.cc) >= 100) nominalPajak = 250_000;
            else nominalPajak = 100_000;
        } else if (kendaraan.jenis.equals("roda 4")) {
            if (Integer.parseInt(kendaraan.cc) > 2500) nominalPajak = 1_500_000;
            else if (Integer.parseInt(kendaraan.cc) >= 1000) nominalPajak = 1_000_000;
            else nominalPajak = 750_000;
        } else {
            System.out.println("Tipe kendaraan tidak ditemukan");
            return;
        }

        System.out.print("Bulan Bayar(1-12) : ");
        int bulanBayar = scan.nextInt();scan.nextLine();

        // mencari denda
        int denda = 0;
        if (kendaraan.bulanHarusBayar < bulanBayar) {
            if (bulanBayar - kendaraan.bulanHarusBayar > 3) denda = (bulanBayar - kendaraan.bulanHarusBayar) * 50_000;
            else denda = 50_000;
        }

        // input pajak
        dllPajak.addLast(new Pajak(++counterKode, nominalPajak, denda, bulanBayar));
    }

    static Kendaraan findKendaraan(DoubleLinkedList<Kendaraan> dll, String tnbk) {
        if (!dll.isEmpty()) {
            Node<Kendaraan> current = dll.head;
            while (current != null) {
                if (current.data.tnbk.equals(tnbk)) {
                    return current.data;
                }
                current = current.next;
            }
        }
        return null;
    }

    static void sortPajak(DoubleLinkedList<Pajak> dllPajak) {
        if (!dllPajak.isEmpty()) {
            Node<Pajak> current = dllPajak.head;
            while (current != null) {
                if (current.next != null) {
                    if (current.data.nominal > current.next.data.nominal) {
                        Pajak temp = current.data;
                        current.data = current.next.data;
                        current.next.data = temp;
                    }
                }
                current = current.next;
            }
        }
    }
}