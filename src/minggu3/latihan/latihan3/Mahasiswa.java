package minggu3.latihan.latihan3;

import java.util.Scanner;

public class Mahasiswa {
    Scanner sc = new Scanner(System.in);
    String nama;
    int nim;
    char kelamin;
    double ipk;

    void display() {
        System.out.println("nama : " + nama);
        System.out.println("nim : " + nim);
        System.out.println("Jenis kelamin : " + kelamin);
        System.out.println("Nilai IPK : " + ipk);
    }

    void input() {
        System.out.print("Masukkan nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan nim : ");
        nim = sc.nextInt();
        System.out.print("Masukkan jenis kelamin : ");
        kelamin = sc.next().charAt(0);
        System.out.print("Masukkan Nilai IPK : ");
        ipk = sc.nextDouble();
    }
}