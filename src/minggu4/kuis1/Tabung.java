package minggu4.kuis1;

public class Tabung {
    double jariJari, tinggi;

    Tabung(double r, double t) {
        jariJari = r;
        tinggi = t;
    }

    double hitungLuas() {
        return 2.0*3.14*jariJari*(jariJari+tinggi);
    }

    double hitungVolume() {
        return 3.14*jariJari*jariJari*tinggi;
    }
        
}