package array;
import java.util.*;

public class Dominos_sum {
    public static void main(String[] args) {
        int [] tops = {2,1,2,4,2,2};
        int [] bottoms = {5,2,6,2,3,2};
       int res = mainDominoRotation(tops,bottoms);
        System.out.println(res);
    }
    static int mainDominoRotation(int [] tops , int [] bottoms){
        int res = 0;
        for(int num = 1 ; num <= 6 ; num++){
          int top = tofindDomino(num,tops,bottoms);
          int bottom = Integer.MAX_VALUE;
          if(top != Integer.MAX_VALUE)
              bottom = tofindDomino(num,bottoms,tops);

          res = Math.min(top,bottom);

        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    static int tofindDomino(int num , int [] first , int[] second){
        int count = 0 ;
        for(int i = 0 ; i < first.length ; i++){
            if(first[i] == num) continue;
            else if (second[i] == num) {
                count++;
            }
            else return Integer.MAX_VALUE;
        }
        return count;
    }
}
