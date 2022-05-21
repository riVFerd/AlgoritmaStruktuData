package minggu3.latihan.latihan2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int terluas = 0;
        String tanahTerluas = "";

        //input banyak tanah
        System.out.print("Jumlah tanah: ");
        Tanah[] tnh = new Tanah[sc.nextInt()];

        //loop input panjang lebar
        System.out.println();
        for (int i=0; i<tnh.length; i++) {
            tnh[i] = new Tanah();
            System.out.println("Tanah " + (i+1));
            System.out.print("Panjang: ");
            tnh[i].panjang = sc.nextInt();
            System.out.print("Lebar: ");
            tnh[i].lebar = sc.nextInt();
        }
        System.out.println();

        //loop output luas tanah
        for (int i=0; i<tnh.length; i++) {
            System.out.printf("Luas Tanah %d: %d\n", i+1, tnh[i].hitungLuas());
            if (tnh[i].hitungLuas() > terluas) {
                terluas = tnh[i].hitungLuas();
                tanahTerluas = "Tanah " + (i+1);
            }
        }
        System.out.println("\nTanah terluas: " + tanahTerluas);

        sc.close();
    }
}
