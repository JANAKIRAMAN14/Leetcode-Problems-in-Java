package Graph;
import java.util.*;
public class GraphByList {
    List<List<Integer>> list ;

    GraphByList(){
        list = new ArrayList<>();
    }
    public  void addVertex(){
       list.add(new ArrayList<>());
    }
    public void addEdge(int src , int des){
        if(src >= list.size() && des >= list.size()) {
            System.out.println("Invalid data: ");
            return;
        }
            list.get(src).add((int) des);
            list.get(des).add(src);
        }
        public void removeEdge(int src ,  int des){

        if(src >= list.size() && des >= list.size()){
            System.out.println("Invalid data :");
            return;
        }
        list.get(src).remove(des);
        list.get(des).remove(src);
        }
        public void printGraph(){
       for (List<Integer> i : list){
           System.out.println(i.toString());
       }
        }

    public static void main(String[] args) {
        GraphByList graphByList = new GraphByList();
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        System.out.println("Enter the Vertices : ");
        for(int i = 0 ; i < v ; i++){
            graphByList.addVertex();
        }
        int e = sc.nextInt();
        System.out.println("Enter the Edges : ");
        for(int i = 0 ; i < e ; i++){
            int src = sc.nextInt();
            int des = sc.nextInt();
            graphByList.addEdge(src , des);
        }
        int resrc = sc.nextInt();
        int redes = sc.nextInt();
        graphByList.removeEdge(resrc,redes);

        graphByList.printGraph();
    }
    }
