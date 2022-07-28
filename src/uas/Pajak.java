package uas;

public class Pajak {
    int kode, nominal, denda, bulanBayar;

    public Pajak(int kode, int nominal, int denda, int bulanBayar) {
        this.kode = kode;
        this.nominal = nominal;
        this.denda = denda;
        this.bulanBayar = bulanBayar;
    }

    public String toString() {
        return "Pajak{" + "kode=" + kode + ", nominal=" + nominal + ", denda=" + denda + ", bulanBayar=" + bulanBayar + '}';
    }
}