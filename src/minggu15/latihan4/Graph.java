package minggu15.latihan4;
import minggu15.latihan.*;

public class Graph <T> {
    T[] vertex;
    LinkedList list[];
    boolean isDirected = false; // Menyimpan informasi tipe graph

    public Graph(T[] vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex.length];
        for (int i = 0; i < vertex.length; i++) {
            list[i] = new LinkedList();
        }
    }

    // method untuk Tugas 2
    public boolean graphType() {
        return isDirected;
    }

    public void addEdge(int source, int destination) {
        list[source].addFirst(destination);

        // for undirected graph
        if (!graphType()) list[destination].addFirst(source);
    }

    public void degree(int source) throws Exception {
        // for undirected graph
        if (!graphType()) System.out.println("Degree vertex " + vertex[source] + " : " + list[source].size());

        // for directed graph
        if (graphType()) {
            int k, totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex.length; i++) {
                // in degree
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].get(j) == source) {
                        ++totalIn;
                    }
                }
                // out degree
                for (k = 0; k < list[source].size(); k++) {
                    list[source].get(k);
                }
                totalOut = k;
            }
            System.out.println("Indegree dari vertex " + vertex[source] + " : " + totalIn);
            System.out.println("Outdegree dari vertex " + vertex[source] + " : " + totalOut);
            System.out.println("Degree dari vertex " + vertex[source] + " : " + (totalIn + totalOut));
        }
    }

    public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i < vertex.length; i++) {
            if (i == destination) {
                list[source].remove(destination);
            }
        }
    }

    public void removeAllEdge() {
        for (int i = 0; i < vertex.length; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex.length; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + vertex[i] + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(vertex[list[i].get(j)] + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }
}
