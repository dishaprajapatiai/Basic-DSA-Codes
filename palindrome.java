// package Basic-DSA-Codes;

public class palindrome {
    public static void main(String[] args) {
        String s = "madsam";
        boolean isPalindrome = true;

        int mid = s.length()/2;
        for(int i = 0; i<mid ;i++){
        int n = s.length();

        if(s.charAt(i)!= s.charAt(n-1-i)){
            isPalindrome = false;
            break;
        }
     }
     if(isPalindrome){
        System.out.println("It is a Palindrome");
     }else{
        System.out.println("Not a palindrome");
     }
    }
    
}
