package jobsheet6.latihan;

public class Tiket {
    String maskapai, asal, tujuan;
    int harga;

    public Tiket(String maskapai, String asal, String tujuan, int harga) {
        this.maskapai = maskapai;
        this.asal = asal;
        this.tujuan = tujuan;
        this.harga = harga;
    }

    void showTicket() {
        System.out.println("Maskapai    = " + maskapai);
        System.out.println("Harga       = " + harga);
        System.out.println("Asal        = " + asal);
        System.out.println("Tujuan      = " + tujuan);
        System.out.println("-------------------------------");
    }

}
