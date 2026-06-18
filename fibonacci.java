public class fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci");
        for (int i = 0; i < n; i++) {
            System.out.println(a+ " ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
}
