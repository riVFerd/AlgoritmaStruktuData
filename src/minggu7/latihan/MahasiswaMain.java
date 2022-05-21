package minggu7.latihan;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumMhs = s.nextInt();
        PencarianMhs data = new PencarianMhs(jumMhs);

        System.out.println("----------------------------------------------------");
        System.out.println("Masukkan data mahasiswa");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = sl.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();

            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        // data.bubbleSort();
        data.tampil();
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan nama Mahasiswa yang dicari: ");
        System.out.print("Nama : ");
        String cari = sl.nextLine(); // tipedata cari dibuah menjadi String
        System.out.println("menggunakan sequential Search");
        int posisi = data.FindSeqSearchByNama(cari); // mencari posisi data berdasarkan nama
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
        // System.out.println("====================================================");
        // System.out.println("menggunakan binary Search");
        // posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        // data.Tampilposisi(cari, posisi);
        // data.TampilData(cari, posisi);

        s.close();
        sl.close();
    }
}