package minggu2;

public class PacMan {
    int x,y, width, height;

    void moveLeft() {
        x--;
        printPosistion();
    }

    void moveRight() {
        x++;
        printPosistion();
    }

    void moveUp() {
        y--;
        printPosistion();
    }

    void moveDown() {
        y++;
        printPosistion();
    }

    void printPosistion() {
        //draw the arena
        for (int i=0; i<=height; i++) {
            for (int j=0; j<=width; j++) {
                if (i==0 || i==height-1 || j==0 || j==width-1) {
                    System.out.print("# ");
                } else if (i==y && j==x) {
                    System.out.print("C ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    PacMan(int xx, int yy, int w, int h) {
        x = xx;
        y = yy;
        width = w;
        height = h;
    }
}
