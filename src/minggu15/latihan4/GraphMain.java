package minggu15.latihan4;
import java.util.Scanner;

public class GraphMain {
    public static void main(String[] args) throws Exception {
        // Tugas 1
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah vertex : ");
        String[] vertexs = new String[input.nextInt()]; // Tipe data disesuaikan dengan data yang akan disimpan dalam Graph
        input.nextLine();
        for (int i = 0; i < vertexs.length; i++) {
            System.out.print("Masukkan data vertex ke-" + i + " : ");
            vertexs[i] = input.nextLine();
        }
        Graph<String> graph = new Graph<String>(vertexs);

        System.out.println("1. Directed\n2. Undirected");
        System.out.print("Jenis Graph (1/2) : ");
        graph.isDirected = (input.nextInt() == 1) ? true : false; // Set tipe dari graph berdasarkan inputan

        System.out.print("Masukkan jumlah edge : ");
        int edges = input.nextInt();

        System.out.println("Masukkan Edge: <from> <to>");
        for (int i = 0; i < edges; i++) {
            // Saat input asal dan tujuan edge, gunakan index dari vertex (bukan isi datanya)
            graph.addEdge(input.nextInt(), input.nextInt());
        }
        graph.printGraph();
        graph.degree(2);
        input.close();
    }
}
