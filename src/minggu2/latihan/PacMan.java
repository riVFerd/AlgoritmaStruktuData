package minggu2.latihan;
import java.util.Scanner;

public class PacMan {
    Scanner sc = new Scanner(System.in);
    int x,y, width, height;
    String dir = "c ";

    void moveLeft() {
        if (x > 1) x--;
        dir = ") ";
        printPosistion();
    }

    void moveRight() {
        if (x < width-1) x++;
        dir = "( ";
        printPosistion();
    }

    void moveUp() {
        if (y > 1) y--;
        dir = "u ";
        printPosistion();
    }

    void moveDown() {
        if (y < height-1) y++;
        dir = "n ";
        printPosistion();
    }

    void printPosistion() {
        System.out.print("\033[2J\033[1;1H");
        //draw the arena
        for (int i=0; i<=height; i++) {
            for (int j=0; j<=width; j++) {
                if (i==0 || i==height || j==0 || j==width) {
                    System.out.print("# ");
                } else if (i==y && j==x) {
                    System.out.print(dir);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    void play() {
        printPosistion();

        System.out.print("Masukkan instruction untuk PacMan: ");
        String direct = sc.nextLine();
        
        for (int i=0; i<direct.length(); i++) {
            switch (direct.charAt(i)) {
                case 'w':
                    moveUp();
                    break;
                case 's':
                    moveDown();
                    break;
                case 'd':
                    moveRight();
                    break;
                case 'a':
                    moveLeft();
                    break;
                default:
                    printPosistion();
                    break;
            }
            try {
                Thread.sleep(1000/12);
            } catch (Exception e) {
            }
        }
    }

    PacMan(int xx, int yy, int w, int h) {
        x = xx;
        y = yy;
        width = w;
        height = h;
    }
}
