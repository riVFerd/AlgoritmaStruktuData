package minggu12.latihan2;

public class Film {
    int id;
    String judul;
    double rating;

    public Film(int id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
    }

    public String toString() {
        return String.format("""
                ID: %d
                  Judul Film: %s
                  Rating Film: %.1f""", id, judul, rating);
    }
}
