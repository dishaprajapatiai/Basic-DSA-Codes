public class maxNumber {
    public static void  main(String[] args){
        int[] arr = {60,20,19,30,45};
        int maxValue = 0;

        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]> maxValue){
                maxValue = Math.max(maxValue,arr[i]);
            }
        }
        System.out.println("The max value is: "+ maxValue);
    }
}

