package string;

public class StringBuilder12 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        sb.replace(1,4,"java");
        System.out.println(sb);
       int n = sb.capacity();
        System.out.println(n);
    }
}
