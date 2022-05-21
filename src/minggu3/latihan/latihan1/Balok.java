package minggu3.latihan.latihan1;

public class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok (int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public int hitungLuas() {
        return 2 * ((panjang*lebar) + (panjang*tinggi) + (lebar*tinggi));
    }
}
