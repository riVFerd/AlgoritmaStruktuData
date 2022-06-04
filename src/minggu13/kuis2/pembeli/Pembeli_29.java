package minggu13.kuis2.pembeli;

public class Pembeli_29 {
    String namaPembeli, noHp;

    public Pembeli_29(String namaPembeli, String noHp) {
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
    }

    public String toString() {
        return String.format("\t|%s\t\t|%s", namaPembeli, noHp);
    }
}
