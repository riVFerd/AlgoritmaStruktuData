package minggu14.praktikum2;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray binaryTreeArray = new BinaryTreeArray();
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        binaryTreeArray.populateData(data, idxLast);
        binaryTreeArray.traverseInOrder(0);
        System.out.println("\n-----------------Tugas-----------------");
        binaryTreeArray.add(10);
        binaryTreeArray.add(15);
        binaryTreeArray.traverseInOrder(0);
        System.out.println();
        binaryTreeArray.traversePreOrder(0);
        System.out.println();
        binaryTreeArray.traversePostOrder(0);
    }
}
