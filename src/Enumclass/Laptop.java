package Enumclass;
import java.util.*;
enum lap{
    asus(1000) , thinkpad, del(3000);
    private int price;
private lap(){
    this.price = 600;
}
    lap(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class Laptop {
    public static void main(String[] args) {
       // lap la = lap.asus;
      //  System.out.println(la);
        for(lap la : lap.values()){
            System.out.println(la + ":"+ la.getPrice());
        }
    }
}
