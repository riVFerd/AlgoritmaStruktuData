package jobsheet6.latihan;

public class TiketService {
    Tiket[] tikets = new Tiket[8];
    int idTikets;

    void tambah(Tiket t) {
        if (idTikets < tikets.length) {
            tikets[idTikets] = t;
            idTikets++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampilAll() {
        System.out.println("Daftar tiket : ");
        for (Tiket tiket : tikets) {
            tiket.showTicket();
        }
    }

    void showByMaskapai(String maskapai) {
        System.out.println("Daftar tiket : ");
        int counter = 0;
        for (Tiket tiket : tikets) {
            if (tiket.maskapai.equalsIgnoreCase(maskapai)) {
                tiket.showTicket();
                counter++;
            }
        }
        if (counter == 0) System.out.println("Tiket yang anda cari tidak tersedia");
    }

    void showByDestinasi(String destinasi) {
        System.out.println("Daftar tiket : ");
        int counter = 0;
        for (Tiket tiket : tikets) {
            if (tiket.tujuan.equalsIgnoreCase(destinasi)) {
                tiket.showTicket();
                counter++;
            }
        }
        if (counter == 0) System.out.println("Tiket yang anda cari tidak tersedia");
    }

    void bubleSort() {
        for (int i = 0; i < tikets.length - 1; i++) {
            for (int j = 0; j < tikets.length - i - 1; j++) {
                if (tikets[j + 1].harga < tikets[j].harga) {
                    Tiket temp = tikets[j + 1];
                    tikets[j + 1] = tikets[j];
                    tikets[j] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < tikets.length - 1; i++) {
            int idMin = i;
            for (int j = i + 1; j < tikets.length; j++) {
                if (tikets[j].harga < tikets[idMin].harga) {
                    idMin = j;
                }
            }
            Tiket temp = tikets[idMin];
            tikets[idMin] = tikets[i];
            tikets[i] = temp;
        }
    }
}