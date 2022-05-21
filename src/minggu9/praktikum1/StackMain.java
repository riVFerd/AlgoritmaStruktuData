package minggu9.praktikum1;

import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Stack stk = new Stack(5);
        Scanner sc = new Scanner(System.in);

        char pilih;

        while (true) {
            System.out.print("Ingin melakukan operasi apa? (push/pop/peek/print)");
            String operasi = sc.nextLine();
            switch (operasi) {
                case "push":
                    do {
                        System.out.print("Jenis: ");
                        String jenis = sc.nextLine();
                        System.out.print("Warna: ");
                        String warna = sc.nextLine();
                        System.out.print("Merk: ");
                        String merk = sc.nextLine();
                        System.out.print("Ukuran: ");
                        String ukuran = sc.nextLine();
                        System.out.print("Harga: ");
                        double harga = sc.nextDouble();

                        Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
                        System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)?");
                        pilih = sc.next().charAt(0);
                        sc.nextLine();
                        stk.push(p);
                    } while (pilih == 'y');
                    break;
                case "pop":
                    stk.pop();
                    break;
                case "peek":
                    stk.peek();
                    break;
                case "print":
                    stk.print();
                    break;
                default:
                    System.out.println("Operasi tidak ditemukan");
                    break;
            }
            System.out.print("Apakah ingin melakukan operasi lainya? (y/n)");
            if (sc.nextLine().equalsIgnoreCase("n")) break;
        }
    }
}
