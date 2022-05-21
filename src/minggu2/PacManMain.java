package minggu2;
import java.util.Scanner;

public class PacManMain {
    public static void main(String[] args) {
        
        PacMan p1 = new PacMan(8, 8, 28, 38);
        Scanner sc = new Scanner(System.in);

        p1.printPosistion();
        
        loop: while (true) {
            switch (sc.nextLine()) {
                case "w":
                    p1.moveUp();
                    break;
                case "s":
                    p1.moveDown();
                    break;
                case "d":
                    p1.moveRight();
                    break;
                case "a":
                    p1.moveLeft();
                    break;
                case "exit":
                    break loop;
                default:
                    p1.printPosistion();
                    break;
            }

        }
        sc.close();

    }
}
