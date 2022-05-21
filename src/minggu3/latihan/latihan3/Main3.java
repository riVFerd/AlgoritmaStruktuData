package minggu3.latihan.latihan3;

public class Main3 {
    public static void main(String[] args) {
        Mahasiswa[] mhs = new Mahasiswa[3];

        //input data
        for (int i=0; i<mhs.length; i++) {
            mhs[i] = new Mahasiswa();
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            mhs[i].input();
            System.out.println();
        }
        System.out.println();

        //output
        for (int i=0; i<mhs.length; i++) {
            System.out.println("Data Mahasisswa ke-" + (i+1));
            mhs[i].display();
        }
    }
}
