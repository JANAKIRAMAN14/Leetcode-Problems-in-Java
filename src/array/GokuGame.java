package array;
import java.util.*;
public class GokuGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Goku Energy Level:");
        int energy = sc.nextInt();
        System.out.println("Enter the Variants : ");
        int variants = sc.nextInt();
        int [] goku = new int[variants];
        System.out.println("Enter the No of Variants : ");
        for(int i = 0 ;  i < variants ; i++){
          goku[i] = sc.nextInt();
        }
       if(gokugame(goku,variants,energy)){
           System.out.println("Winned :");
       }
       else{
           System.out.println("Defeat:");
       }
    }
    static boolean gokugame(int [] goku , int variants , int energy){
        Arrays.sort(goku);
        int energyloss = 0;
        int i = 0;
        for( i = 0; i < goku.length ; i++){
            energyloss = (goku[i] % 2) + (goku[i] / 2);
            if(energy < energyloss){
                i--;
                System.out.println("Killed variants : "+i);
                return false;
            }
        }

    System.out.println("Killed variants : "+i);
        return true;
    }
}
