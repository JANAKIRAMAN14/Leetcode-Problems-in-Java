package Recursion;
import java.util.*;
public class Killratecircle {
    public static void main(String[] args) {
        int kill = 7;
        int num = 3;
        System.out.println("Save Position : "+ survivePlace(kill,num));
    }
    static int survivePlace(int k , int n){
             if(n == 1) return 0;
             else
           return ((survivePlace(k,n-1) + k) % n);
    }
}
