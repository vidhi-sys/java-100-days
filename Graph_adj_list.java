import java.util.*;

class Graph_adj_list {
    int node;
    ArrayList<ArrayList<Integer>> adj;

    Graph_adj_list(int node) {
        this.node = node;

        adj = new ArrayList<>();

        for (int i = 0; i < node; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int start, int end) {
        adj.get(start).add(end);   // directed graph

        // For undirected graph uncomment:
        // adj.get(end).add(start);
    }

    public void display() {
        for (int i = 0; i < node; i++) {
            System.out.print(i + " -> ");

            for (int neighbor : adj.get(i)) {
                System.out.print(neighbor + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph_adj_list g = new Graph_adj_list(4);

        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 0);

        g.display();
    }
}
