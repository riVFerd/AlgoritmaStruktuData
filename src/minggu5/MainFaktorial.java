package minggu5;

import java.util.Scanner;
import org.apache.commons.lang3.time.StopWatch;

public class MainFaktorial {

    public static void main(String[] args) {
        StopWatch stopWatchBF = new StopWatch();
        StopWatch stopWatchDC = new StopWatch();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i+1) + " : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("=======================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        stopWatchBF.start();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        stopWatchBF.stop();
        System.out.println("=======================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        stopWatchDC.start();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai));
        }
        stopWatchDC.stop();
        System.out.println("=======================================================");

        double bfTime = (double) stopWatchBF.getNanoTime()/1000_000_000;
        double dcTime = (double) stopWatchDC.getNanoTime()/1000_000_000;
        System.out.printf("Execution time Bruteforce : %.2f seconds\n", bfTime);
        System.out.printf("Execution time Divide Conquer %.2f:  seconds\n", dcTime);

    }
    
}
