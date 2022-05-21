package minggu7.latihan;

public class Tugas3Main {
    public static void main(String[] args) {
        int[] array = { 12, 17, 2, 1, 70, 50, 90, 17, 2, 90 };
        Tugas3 tugas3 = new Tugas3(array);
        tugas3.bubbleSort(); // mengurutkan
        tugas3.showSorted(); // menampilkan hasil urutan
        tugas3.findIndex(array, 0, array.length - 1); // mencari index dari nilai terbesar
        System.out.println("Nilai terbesar adalah " + tugas3.largest); // menampilkan nilai terbesar
        System.out.println("Nilai terbesar yang ditemukan sebanyak " + tugas3.counter + " kali"); // menampilkan jumlah nilai terbesar
        tugas3.showIdLargest(); // menampilkan index dari nilai terbesar
    }
}