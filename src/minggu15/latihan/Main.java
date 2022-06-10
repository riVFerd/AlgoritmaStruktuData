package minggu15.latihan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Tugas 1
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah vertex : ");
        Graph graph = new Graph(input.nextInt());
        System.out.println("1. Directed\n2. Undirected");
        System.out.print("Jenis Graph (1/2) : ");
        graph.isDirected = (input.nextInt() == 1) ? true : false; // Set tipe dari graph berdasarkan inputan
        System.out.print("Masukkan jumlah edge : ");
        int edges = input.nextInt();
        System.out.println("Masukkan Edge: <from> <to>");
        for (int i = 0; i < edges; i++) {
            graph.addEdge(input.nextInt(), input.nextInt());
        }
        graph.printGraph();
        graph.degree(2);
        input.close();
    }
}
