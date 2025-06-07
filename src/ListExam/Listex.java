package ListExam;
import java.util.*;
public class Listex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> hollList = new ArrayList<>();
        System.out.println("The List of Size :");
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++){
            List<Integer> innerList = new ArrayList<>();
            System.out.println("Enter the "+(i + 1)+" list Size :");
            int n1 = sc.nextInt();
            for(int j = 0 ; j < n1 ; j++ ){
               innerList.add(sc.nextInt());
            }
            hollList.add(innerList);

        }
        for(int i = 0 ; i < hollList.size() ; i++){
            System.out.println(hollList.get(i));
        }
    }
}
