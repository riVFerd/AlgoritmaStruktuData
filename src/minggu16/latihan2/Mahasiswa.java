package minggu16.latihan2;

public class Mahasiswa {
    String nim, nama, noTelp;

    public Mahasiswa(String nim, String nama, String noTelp) {
        this.nim = nim;
        this.nama = nama;
        this.noTelp = noTelp;
    }

    public String toString() {
        return String.format("%s\t%-15s\t%s", nim, nama, noTelp);
    }
}