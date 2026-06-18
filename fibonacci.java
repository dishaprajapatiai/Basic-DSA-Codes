// // Without Recursion
// public class fibonacci {
//     public static void main(String[] args) {
//         int n = 5;
//         int a = 0;
//         int b = 1;

//         System.out.println("Fibonacci");
//         for (int i = 0; i < n; i++) {
//             System.out.println(a+ " ");
//             int c = a+b;
//             a = b;
//             b = c;
//         }
//     }
// }



// WITH RECURSION
public class fibonacci{
    public static void main(String[] args){
        int n = 5;
        for (int i = 0; i < n; i++) {
             System.out.println(fib(i)+ " ");
        }
       
    }

    public static int fib(int n){
        
        if(n <= 1){
            return n;
        }

        return fib(n-1)+fib(n-2);
    }
}