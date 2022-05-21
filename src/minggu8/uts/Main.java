package minggu8.uts;

public class Main {
    public static void main(String[] args) {
        CalonAnggota calonAnggota = new CalonAnggota();
        Siswa siswa0 = new Siswa("Budi", 171);
        Siswa siswa1 = new Siswa("Andi", 180);
        Siswa siswa2 = new Siswa("Caca", 165);
        Siswa siswa3 = new Siswa("Dede", 175);
        Siswa siswa4 = new Siswa("Euis", 178);
        Siswa siswa5 = new Siswa("Fafa", 173);
        Siswa siswa6 = new Siswa("Gaga", 175);
        Siswa siswa7 = new Siswa("Haha", 168);
        Siswa siswa8 = new Siswa("Ichi", 181);
        Siswa siswa9 = new Siswa("Jiji", 166);

        calonAnggota.addSiswa(siswa0);
        calonAnggota.addSiswa(siswa1);
        calonAnggota.addSiswa(siswa2);
        calonAnggota.addSiswa(siswa3);
        calonAnggota.addSiswa(siswa4);
        calonAnggota.addSiswa(siswa5);
        calonAnggota.addSiswa(siswa6);
        calonAnggota.addSiswa(siswa7);
        calonAnggota.addSiswa(siswa8);
        calonAnggota.addSiswa(siswa9);

        System.out.println("Daftar calon anggota: ");
        calonAnggota.showAll();
        calonAnggota.sort();    // mengurutkan
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Daftar calon anggota setelah diurutkan berdasarkan tinggi badan: ");
        calonAnggota.showAll();
        System.out.println("Siswa-siswa yang tinggi badannya lebih dari 170 adalah: ");
        calonAnggota.showEligible();    // menampilkan yang memenuhi syarat
        System.out.println("Banyaknya siswa pada team khusus: " + calonAnggota.countEligible);
    }
}
