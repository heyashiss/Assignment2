import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class GraphTraversal {
    private int vertices;
    private LinkedList<Integer>[] adjacencyList;
    private int[][] adjacencyMatrix;
    private boolean[] visited;

    GraphTraversal(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
        adjacencyMatrix = new int[vertices][vertices];
        visited = new boolean[vertices];
    }

    public static void main(String[] args) {
        GraphTraversal graph = new GraphTraversal(5);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();
        System.out.println("Enter the edges (source destination):");
        for (int i = 0; i < edges; i++) {
            graph.addEdge(scanner.nextInt(), scanner.nextInt());
        }
        graph.display();
        System.out.println("DFS Traversal:");
        graph.dfs(0);
        graph.resetVisitedArray();
        System.out.println("\nBFS Traversal:");
        graph.bfs(0);
    }

    public void addEdge(int u, int v) {
        adjacencyList[u].add(v);
        adjacencyList[v].add(u);
        adjacencyMatrix[u][v] = 1;
        adjacencyMatrix[v][u] = 1;
    }

    public void display() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + ": ");
            for (int j = 0; j < adjacencyList[i].size(); j++) {
                System.out.print(adjacencyList[i].get(j) + " ");
            }
            System.out.println();
        }
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void dfs(int source) {
        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        while (!stack.isEmpty()) {
            int u = stack.pop();
            if (!visited[u]) {
                visited[u] = true;
                System.out.print(u + " ");
                for (int v : adjacencyList[u]) {
                    if (!visited[v]) {
                        stack.push(v);
                    }
                }
            }
        }
    }

    public void bfs(int source) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);
        visited[source] = true;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.print(u + " ");
            for (int v : adjacencyList[u]) {
                if (!visited[v]) {
                    queue.offer(v);
                    visited[v] = true;
                }
            }
        }
    }

    public void resetVisitedArray() {
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
    }
}
