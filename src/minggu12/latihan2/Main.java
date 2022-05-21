package minggu12.latihan2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList listFilm = new DoubleLinkedList();
        Scanner scan = new Scanner(System.in);
        listFilm.addFirst(new Film(111, "Avengers", 9.5));
        listFilm.addLast(new Film(222, "Hello World", 8.5));
        mainLoop: while (true) {
            System.out.println("==============================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("==============================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("==============================");
            int pilihan = scan.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.print("ID Film : ");
                    int idFilm = scan.nextInt(); scan.nextLine();
                    System.out.print("Judul Film : ");
                    String judulFilm = scan.nextLine();
                    System.out.print("Rating Film : ");
                    double ratingFilm = scan.nextDouble();
                    listFilm.addFirst(new Film(idFilm, judulFilm, ratingFilm));
                    break;
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.print("ID Film : ");
                    idFilm = scan.nextInt(); scan.nextLine();
                    System.out.print("Judul Film : ");
                    judulFilm = scan.nextLine();
                    System.out.print("Rating Film : ");
                    ratingFilm = scan.nextDouble();
                    listFilm.addLast(new Film(idFilm, judulFilm, ratingFilm));
                    break;
                case 3:
                    System.out.println("Masukkan Data Film Posisi Tertentu");
                    System.out.print("ID Film : ");
                    idFilm = scan.nextInt(); scan.nextLine();
                    System.out.print("Judul Film : ");
                    judulFilm = scan.nextLine();
                    System.out.print("Rating Film : ");
                    ratingFilm = scan.nextDouble();
                    System.out.print("Data Film ini akan masuk di urutan ke : ");
                    int posisi = scan.nextInt();
                    listFilm.add(new Film(idFilm, judulFilm, ratingFilm), posisi);
                    break;
                case 4:
                    Film temp = listFilm.removeFirst();
                    if (temp == null) System.out.println("Data Film masih kosong");
                    else System.out.println("Data Film yang dihapus :\n" + temp);
                    break;
                case 5:
                    temp = listFilm.removeLast();
                    if (temp == null) System.out.println("Data Film masih kosong");
                    else System.out.println("Data Film yang dihapus :\n" + temp);
                    break;
                case 6:
                    System.out.print("Data Film yang akan dihapus ada di urutan ke : ");
                    temp = listFilm.remove(scan.nextInt());
                    if (temp == null) System.out.println("Data Film masih kosong/tidak ditemukan");
                    else System.out.println("Data Film yang dihapus :\n" + temp);
                    break;
                case 7:
                    listFilm.print();
                    break;
                case 8:
                    System.out.print("Masukkan ID Film yang dicari : ");
                    Film film = listFilm.getById(scan.nextInt());
                    if (film == null) System.out.println("Data Film tidak ditemukan");
                    else System.out.println("Data Film yang dicari :\n" + film);
                    break;
                case 9:
                    listFilm.printDesc();
                    break;
                case 10:
                    System.out.println("Anda telah keluar dari program.");
                    break mainLoop;
            }
        }
        scan.close();
    }
}