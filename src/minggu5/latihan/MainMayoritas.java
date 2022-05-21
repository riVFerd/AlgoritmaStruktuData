package minggu5.latihan;

import java.util.Scanner;

public class MainMayoritas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan banyaknya suara : ");
        Mayoritas mayoritas = new Mayoritas(scanner.nextInt());
        scanner.nextLine();

        for (int i = 0; i < mayoritas.hasilSuara.length; i++) {
            System.out.print("Masukkan hasil suara ke-" + (i + 1 + " : "));
            mayoritas.hasilSuara[i] = scanner.nextLine();
        }

        System.out.println("Mayoritas suaranya adalah : " + mayoritas.cariMayoritas(mayoritas.hasilSuara, 0, mayoritas.hasilSuara.length-1));

        scanner.close();
    }
}
