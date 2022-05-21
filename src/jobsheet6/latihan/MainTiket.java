package jobsheet6.latihan;

import java.util.Scanner;

public class MainTiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tiket t1 = new Tiket("Lion Air", "Jakarta", "Surabaya", 1_068_000);
        Tiket t2 = new Tiket("Citilink", "Jakarta", "Surabaya", 1_167_000);
        Tiket t3 = new Tiket("Garuda", "Jakarta", "Surabaya", 1_418_000);
        Tiket t4 = new Tiket("Air Asia", "Jakarta", "Bali", 1_410_000);
        Tiket t5 = new Tiket("Garuda", "Jakarta", "Bali", 1_709_000);
        Tiket t6 = new Tiket("Lion Air", "Jakarta", "Pekanbaru", 1_270_000);
        Tiket t7 = new Tiket("Air Asia", "Jakarta", "Pekanbaru", 1_224_000);
        Tiket t8 = new Tiket("Citilink", "Jakarta", "Pekanbaru", 1_339_000);

        TiketService tiketService = new TiketService();
        tiketService.tambah(t1);
        tiketService.tambah(t2);
        tiketService.tambah(t3);
        tiketService.tambah(t4);
        tiketService.tambah(t5);
        tiketService.tambah(t6);
        tiketService.tambah(t7);
        tiketService.tambah(t8);

        // tiketService.bubleSort();
        tiketService.selectionSort();

        System.out.println("1.Maskapai\n2.Destinasi\n3.Tampilkan Semua");
        System.out.print("Ingin mencari tiket berdasarkan apa? (1-3)");
        int uChoice = sc.nextInt();
        sc.nextLine();
        switch (uChoice) {
            case 1:
                System.out.print("Masukan nama maskapai yang ingin dicari: ");
                tiketService.showByMaskapai(sc.nextLine());
                break;
            case 2:
                System.out.print("Masukan destinasi yang ingin dicari: ");
                tiketService.showByDestinasi(sc.nextLine());
                break;
            default:
                tiketService.tampilAll();
                break;
        }

        sc.close();
    }
}