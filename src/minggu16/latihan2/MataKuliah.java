package minggu16.latihan2;

public class MataKuliah {
    String kodeMk, namaMk, sks;

    public MataKuliah(String kodeMk, String namaMk, String sks) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
        this.sks = sks;
    }

    public String toString() {
        return String.format("%s\t%-40s%s", kodeMk, namaMk, sks);
    }
}
