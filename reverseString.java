// class reverseString{
//     public static void main(String[] args) {
//         String s = "Hello World";
//         String rev = "";
//         for(int i =s.length()-1; i>=0 ;i--){
//             rev += s.charAt(i);
//         }
//         System.err.println(rev);
//     }
// }

import java.util.Arrays;
class reverseString{
    public static void main(String[] args) {
        char[] arr = {'h' ,'e' ,'l','l','o'};
        String str = new String(arr);
        String rev = "";

        for(int i = str.length() -1; i >= 0 ;i--){
          rev = rev + str.charAt(i);
        }

        for(int j = 0 ; j< rev.length();j++){
            arr[j] = rev.charAt(j);
        }
        System.out.println(Arrays.toString(arr));
    }
}