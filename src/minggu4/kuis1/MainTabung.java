package minggu4.kuis1;

public class MainTabung {
    public static void main(String[] args) {
        double terbesar = 0;
        String namaTerbesar = "";
        Tabung[] tabungs = new Tabung[3];

        //instansiasi
        tabungs[0] = new Tabung(15, 17);
        tabungs[1] = new Tabung(20, 30);
        tabungs[2] = new Tabung(17, 20);

        //Menampilkan luas permukaan dan volume masing" objek tabung
        for (int i=0; i<tabungs.length; i++) {
            System.out.printf("Tabung ke-%d, Luas permukaan = %.1f & Volume = %.1f\n", (i+1), tabungs[i].hitungLuas(), tabungs[i].hitungVolume());
            if (tabungs[i].hitungVolume() > terbesar) {
                terbesar = tabungs[i].hitungVolume();
                namaTerbesar = "Tabung ke-" + (i+1);
            }
        }

        //Menampilkan tabung terbesar
        System.out.println("\nTabung yang paling besar adalah : " + namaTerbesar);
    }
}
