package minggu9.latihan;

public class Tugas2Main {
    public static void main(String[] args) {
        //Implementasi dari Dewi mempunyai 8 struk belanja
        Tugas2Stack stack = new Tugas2Stack(8);
        stack.push(new Tugas2Struk(11, 15, 1, 100_000));
        stack.push(new Tugas2Struk(22, 16, 3, 75_000));
        stack.push(new Tugas2Struk(33, 17, 2, 125_000));
        stack.push(new Tugas2Struk(44, 18, 1, 250_000));
        stack.push(new Tugas2Struk(55, 19, 5, 500_000));
        stack.push(new Tugas2Struk(66, 20, 2, 100_000));
        stack.push(new Tugas2Struk(77, 21, 1, 250_000));
        stack.push(new Tugas2Struk(88, 22, 4, 100_000));

        //Implementasi dari Dewi mengambil 5 struk belanja
        System.out.println("Struk yang diambil Dewi: ");
        for (int i = 0; i < 5; i++) stack.pop();

        System.out.println("\nIsi stack setelah mengambil 5 struk belanja: ");
        stack.print();
    }
}