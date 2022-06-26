package minggu16.latihan1;

public class Film {
    String id, judul, tahun, director;

    public Film(String id, String judul, String tahun, String director) {
        this.id = id;
        this.judul = judul;
        this.tahun = tahun;
        this.director = director;
    }

    public String toString() {
        return "Film{" + "id=" + id + ", judul=" + judul + ", tahun=" + tahun + ", director=" + director + "}";
    }
}