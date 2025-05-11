package Graph;
import java.util.*;
import java.util.*;

class Graph {
    private Map<Integer, List<Integer>> adjList;

    // Constructor
    public Graph() {
        this.adjList = new HashMap<>();
    }

    // Add a vertex to the graph
    public void addVertex(int vertex) {
        adjList.put(vertex, new ArrayList<>());
    }

    // Add an edge to the graph (undirected)
    public void addEdge(int source, int destination) {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }
    // Remove the edges between two vertices

    public void removeEdge(int source , int destination){
        adjList.get(source).remove((Integer) destination);
        adjList.get(destination).remove((Integer) source);
    }
    // remove vertex in graph
    public void removeVertex(int vertex){
        adjList.remove(vertex);

        // remove the edges in all vertex
        for(List<Integer> neigbours : adjList.values()){
            neigbours.remove(vertex);
        }
    }

    // Display the graph
    public void displayGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (Integer neighbor : entry.getValue()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();

        // Adding vertices
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        // Adding edges
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(4,1);

        // display the graph
        graph.displayGraph();

        //Removing edges
        graph.removeEdge(4,1);

        // remove vertex
        graph.removeVertex(1);

        // Display the graph
        graph.displayGraph();
    }
}
