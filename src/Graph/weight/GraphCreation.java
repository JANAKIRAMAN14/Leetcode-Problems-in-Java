package Graph.weight;
import java.util.*;

public class GraphCreation {
    HashMap<Integer, List<Integer>> adjList;

    public GraphCreation() {
        this.adjList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        adjList.put(vertex, new ArrayList<>());
    }

    public void addEdge(int source, int destination) {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }

    public void displayGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (Integer neighbor : entry.getValue()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public List<Integer> bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> vis = new HashSet<>();
        List<Integer> bfs = new ArrayList<>();
        q.add(start);
        vis.add(start);

        while (!q.isEmpty()) {
            int currentvertex = q.poll();
            bfs.add(currentvertex);

            for (int neighbor : adjList.getOrDefault(currentvertex, Collections.emptyList())) {
                if (!vis.contains(neighbor)) {
                    vis.add(neighbor);
                    q.add(neighbor);
                }
            }
        }

        return bfs;
    }
public List<Integer> dfs (int startVertex){
        Stack<Integer> s = new Stack<>();
        List<Integer> res = new ArrayList<>();
        Set<Integer> vis = new HashSet<>();

        s.add(startVertex);
        while(!s.empty()){
            int curVertex = s.pop();
            if(!vis.contains(curVertex)){
                vis.add(curVertex);
                res.add(curVertex);
            }
            for(Integer neigbour  : adjList.getOrDefault(curVertex , Collections.emptyList())){
                if(!vis.contains(neigbour)){
                    s.add(neigbour);
                }
            }
        }
        return res;
}

    public static void main(String[] args) {
        GraphCreation graphCreation = new GraphCreation();
        graphCreation.addVertex(1);
        graphCreation.addVertex(2);
        graphCreation.addVertex(3);
        graphCreation.addVertex(4);

        graphCreation.addEdge(1, 2);
        graphCreation.addEdge(1, 3);
        graphCreation.addEdge(1, 4);
        graphCreation.addEdge(3, 4);

        graphCreation.displayGraph();

        System.out.println("DFS from 1: " + graphCreation.dfs(1));
    }
}
