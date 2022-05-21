package minggu2;

public class TugasBarang {
    String nama;
    int hargaSatuan, jumlah;

    int hitungHargaTotal() {
        int result = hargaSatuan * jumlah;
        return result;
    }

    int hitungDiskon(int hargaTotal) {
        int diskon = 0;
        if (hargaTotal > 100_000) {
            diskon = (hargaTotal*10/100);
        } else if (hargaTotal >= 50_000) {
            diskon = (hargaTotal*5/100);
        }
        return diskon;
    }

    int hitungHargaBayar(int hargaTotal, int diskon) {
        return (hargaTotal-diskon);
    }

    TugasBarang(String name, int hs, int jmlh) {
        nama = name;
        hargaSatuan = hs;
        jumlah = jmlh;
    }
}
