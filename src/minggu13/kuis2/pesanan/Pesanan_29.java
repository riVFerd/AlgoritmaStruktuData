package minggu13.kuis2.pesanan;

public class Pesanan_29 {
    int KodePesanan;
    String namaPesanan;
    int harga;

    public Pesanan_29(int KodePesanan, String namaPesanan, int harga) {
        this.KodePesanan = KodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
    }

    public String toString() {
        return String.format("|%d\t|%s\t\t|%d", KodePesanan, namaPesanan, harga);
    }
}