package minggu11.latihan2;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.addFirst('C');
        singLL.print();
        singLL.insertAfter('C', 'D');
        singLL.print();
        singLL.insertBefore('C', 'A');
        singLL.print();
        singLL.insertAt(1, 'B');
        singLL.print();
        singLL.addLast('E');
        singLL.print();
    }
}
