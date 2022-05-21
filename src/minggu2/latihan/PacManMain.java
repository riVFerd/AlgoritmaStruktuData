package minggu2.latihan;

import java.util.Scanner;

public class PacManMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PacMan p1 = new PacMan(8, 8, 20, 24);
        
        do {
            p1.play();

            System.out.print("Ingin main lagi: (y/t)");
            if (sc.nextLine().equalsIgnoreCase("t")) break;
        } while (true);

        sc.close();
    }
}
