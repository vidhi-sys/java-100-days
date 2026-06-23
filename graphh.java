public class graphh {

    int[][] adj_matrix;
    int len_graph;

    public graphh(int len_graph) {
        this.len_graph = len_graph;
        adj_matrix = new int[len_graph][len_graph];
    }

    public void add_edge(int start, int end, boolean directed) {

        if (directed) {
            adj_matrix[start][end] = 1;
        } else {
            adj_matrix[start][end] = 1;
            adj_matrix[end][start] = 1;
        }
    }

    public void remove_edge(int start, int end) {
        adj_matrix[start][end] = 0;
        adj_matrix[end][start] = 0;
    }

    public void print_graph() {
        for (int i = 0; i < len_graph; i++) {
            for (int j = 0; j < len_graph; j++) {
                System.out.print(adj_matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        graphh g = new graphh(5);

        g.add_edge(0, 1, false);
        g.add_edge(1, 2, false);
        g.add_edge(2, 0, false);
        g.add_edge(1, 3, false);

        g.print_graph();
    }
}
