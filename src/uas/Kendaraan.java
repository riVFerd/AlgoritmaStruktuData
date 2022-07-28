package uas;

public class Kendaraan {
    String tnbk, nama, jenis, cc, tahun;
    int bulanHarusBayar;

    public Kendaraan(String tnbk, String nama, String jenis, String cc, String tahun, int bulanHarusBayar) {
        this.tnbk = tnbk;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun = tahun;
        this.bulanHarusBayar = bulanHarusBayar;
    }

    public String toString() {
        return "Kendaraan{" + "tnbk=" + tnbk + ", nama=" + nama + ", jenis=" + jenis + ", cc=" + cc + ", tahun=" + tahun + ", bulanHarusBayar=" + bulanHarusBayar + '}';
    }
}
