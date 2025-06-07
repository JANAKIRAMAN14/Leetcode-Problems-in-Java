package string;

public class Removecharacter {
    public static void main(String[] args) {
        String s = "4523EF58EF";
      String res =  removeCharacter(s);
        System.out.println(res);
    }
    static String removeCharacter(String s){
      s = s.replace("EF","");
      s = s.replace("G","");
     return s;
    }
}
