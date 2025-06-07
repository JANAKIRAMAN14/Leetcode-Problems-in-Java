package Graph.weight;

import java.util.*;
public class WeightGraph {
    private int vertices;
    private List<GraphEdge>[] adjlist;

    public WeightGraph(int vertices) {
        this.vertices = vertices;
        this.adjlist = new ArrayList[vertices]; // size must equal vertex count

        for (int i = 0; i < vertices; i++) {
            adjlist[i] = new ArrayList<>();
        }
    }
    public void addDirectEdge(int source , int destination , int weight){
        GraphEdge edge = new GraphEdge(source, destination, weight);
        adjlist[source].add(edge);
    }
    public void addUndirectEdge(int source , int destination , int weight){
        GraphEdge sourcetodestionation = new GraphEdge(source, destination, weight);
        GraphEdge destinationtosource  = new GraphEdge(source, destination, weight);

        adjlist[source].add(sourcetodestionation);
        adjlist[source].add(destinationtosource);

    }
    public List<GraphEdge>[] getVertices(){
        return adjlist;
    }
    public void printGraph() {
        for (int v = 0; v < vertices; v++) {
            System.out.print("[" + v + "] -> ");
            for (GraphEdge e : adjlist[v]) {
                System.out.print(
                        "(" + e.getDestination() + ", w=" + e.getWeight() + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        WeightGraph weightGraph = new WeightGraph(6);
        // Add the undir graph
        weightGraph.addUndirectEdge(4, 5, 1);
        weightGraph.addDirectEdge(0, 2, 4);
        weightGraph.addDirectEdge(2, 3, 7);

        // print the all graph
     weightGraph.printGraph();

    }
}
