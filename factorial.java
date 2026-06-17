// public class factorial {
//     public static void main(String[] args) {
//         int n = 5;
//         long fact = 1;
//         for(int i = 1 ;i<=n ;i++){
//             fact = fact*i;
//         }
//         System.out.println("Factorial of " + n+ " is " +fact);
//     }
    
// }



// with recursion
public class factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
        
    }
    public static int fact(int n){
        if(n == 1 || n == 0){
            return 1;
        }
            return fact(n-1) * n;
    }
    
}
