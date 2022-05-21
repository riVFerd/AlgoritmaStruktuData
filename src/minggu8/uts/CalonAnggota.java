package minggu8.uts;

public class CalonAnggota {
    Siswa[] daftarSiswa = new Siswa[10];
    int idmax = 0;
    int countEligible = 0;

    public void addSiswa(Siswa siswa) {
        if (idmax < daftarSiswa.length) {
            daftarSiswa[idmax] = siswa;
            idmax++;
        } else {
            System.out.println("Daftar siswa sudah penuh");
        }
    }

    public void sort() {
        for (int i = 0; i < daftarSiswa.length - 1; i++) {
            for (int j = 0; j < daftarSiswa.length - 1 - i; j++) {
                if (daftarSiswa[j].tinggiBadan < daftarSiswa[j + 1].tinggiBadan) {
                    Siswa temp = daftarSiswa[j];
                    daftarSiswa[j] = daftarSiswa[j + 1];
                    daftarSiswa[j + 1] = temp;
                }
            }
        }
    }

    public void showEligible() {
        for (int i = 0; i < daftarSiswa.length; i++) {
            if (daftarSiswa[i].tinggiBadan > 170) {
                countEligible++;
                System.out.println("Siswa ke-" + countEligible);
                daftarSiswa[i].print();
            }
        }
    }

    public void showAll() {
        for (int i = 0; i < daftarSiswa.length; i++) {
            System.out.println("Siswa ke-" + (i + 1));
            daftarSiswa[i].print();
        }
    }
}
