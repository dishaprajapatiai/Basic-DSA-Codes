import java.util.*;

public class removeDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {12,34,12,45,90,87,45};
        Set<Integer> set = new LinkedHashSet<>();

        for(int i =0 ;i<arr.length; i++){
            set.add(arr[i]);
        }
        // System.out.println(set);
        // To return a new array
        int[] result = new int[set.size()];
        int index = 0;

        for(int num: set){
            result[index++] = num;
        }
        System.out.println("Result: " + Arrays.toString(result));
    }
}
