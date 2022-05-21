package minggu8.uts;

public class Siswa {
    String nama;
    double tinggiBadan;

    public Siswa(String nama, double tinggiBadan) {
        this.nama = nama;
        this.tinggiBadan = tinggiBadan;
    }

    public void print() {
        System.out.println("Nama: " + nama);
        System.out.println("Tinggi badan: " + tinggiBadan);
    }

}
