public class Main {
    public static void main(String args[]) {
        // Create a graph with 11 vertices
        Graph g = new Graph(11);

        // Add edges to the graph as described in the given graph
        g.addEdge(1, 2);
        g.addEdge(1, 5);
        g.addEdge(1, 9);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);
        g.addEdge(5, 6);
        g.addEdge(5, 7);
        g.addEdge(5, 8);
        g.addEdge(9, 10);
        g.addEdge(9, 8);
        g.addEdge(8, 10);

        System.out.println("Depth First Search (DFS) starting from node 1:");
        g.DFS(1); // Perform DFS starting from node 1
    }
}