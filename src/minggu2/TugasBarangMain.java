package minggu2;

public class TugasBarangMain {
    public static void main(String[] args) {

        TugasBarang barang1 = new TugasBarang("MX Master", 1000_000, 2);
        int hargaTotal = barang1.hitungHargaTotal();
        int diskon = barang1.hitungDiskon(hargaTotal);
        int hargaAkhir = barang1.hitungHargaBayar(hargaTotal, diskon);

        System.out.printf("Barang yg dibeli : %s\nHarga : %d\nJumlah : %d\n", barang1.nama, barang1.hargaSatuan, barang1.jumlah);
        System.out.println("-----------------------");
        System.out.println("Total bayar : " + hargaAkhir);

    }
}
