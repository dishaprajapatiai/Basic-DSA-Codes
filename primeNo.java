import java.util.*;
public class primeNo{
    public static void main(String[] args){
        int n = 30;
        boolean isPrimeNum = true;
        if(n <= 1){
            isPrimeNum = false;           
        }
        for(int i = 2 ;i<= Math.sqrt(n) ;i++){
            if(n % i == 0){
                isPrimeNum = false;
                break;
            }

        }
        if(isPrimeNum){
            System.out.println("It is a prime no");
        }else{
             System.out.println("It is not a prime no");
        }
    }

}