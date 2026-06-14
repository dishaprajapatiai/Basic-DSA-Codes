public class palindrome {
    public static void main(String[] args) {
        String s = "madsam";

        int mid = s.length()/2;
        for(int i = 0; i<mid ;i++){
        int n = s.length();

        if(s.charAt(i)!= s.charAt(n-1-i)){
            System.out.println("Not a Paindrome");
            return;
        }
     }
        System.out.println("Paindrome");
    }
    
}





// // 2nd way
// public class palindrome{
//     public static void main(String[] args) {
//         String s = "madam";
//         String rev = "";
//         for(int i = s.length()-1;i>=0;i--){
//             rev += s.charAt(i);
//         }

//         if(rev.equals(s)){
//             System.out.println("It is Palindrome");
//         }else{
//             System.out.println("It is not Palindrome");
//         }
//     }
// }
