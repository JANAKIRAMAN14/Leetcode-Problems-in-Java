package array;
import java.util.*;
public class ShopKeeper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {30,30,60,90,120};
        System.out.println("Enter the Item Value :");
        int item = sc.nextInt();
        shopkeeper(arr,item);
    }
    static void shopkeeper(int [] arr,int item){
        int change = 0 ;
        int loss = 0 ;
        int gain = 0;
        int eeturn = 0 ;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == item ){
                change += arr[i];
            }
            else if (arr[i] > item){
                eeturn  =  arr[i] - item ;
                if(eeturn <= change) {
                    change += item;
                    System.out.println(i+" "+"Return amount to customer:" + eeturn);
                }
                else System.out.println("shopkeeper doesnt have amount return to customer");
            }
            else System.out.println("the customer didnt able buying items ");
        }
        System.out.println("Totally That ShopKeeper Today Gain Amount are :"+change);
    }
}
