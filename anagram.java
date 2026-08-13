import java.util.*;
public class anagram {
    public static void main(String[] args) {
        String s = "hello";
        String t = "elolh";
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

       
        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1,c2)){
            System.out.println("They are anagram");
        }else{
            System.out.println("not anagram");
        }
    }
}



