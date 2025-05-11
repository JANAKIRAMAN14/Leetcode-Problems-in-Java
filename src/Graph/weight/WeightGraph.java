package Graph.weight;
import java.util.*;
public class WeightGraph {
    private int vertices;
    private List<GraphEdge>[] adjlist;

    public WeightGraph(int vertices, List<GraphEdge>[] adjlist) {
        this.vertices = vertices;
        this.adjlist = adjlist;

        for (int i = 0; i < vertices; i++){
            adjlist[i]=new ArrayList<>();
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
}
