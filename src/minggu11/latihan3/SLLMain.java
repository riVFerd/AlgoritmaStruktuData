package minggu11.latihan3;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.addFirst("Komputer");
        singLL.print();
        singLL.insertAfter("Komputer", "Android");
        singLL.print();
        singLL.insertBefore("Komputer", "Basis Data");
        singLL.print();
        singLL.addFirst("Algoritma");
        singLL.print();
        singLL.insertAt(1, "Matematika");
        singLL.print();
        singLL.addLast("Bahasa");
        singLL.print();
        singLL.addFirst("Statistika");
        singLL.print();
        singLL.addFirst("Multimedia");
        singLL.print();
    }
}
