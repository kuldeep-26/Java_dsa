public class solution{

    public static void SubArray(int arr[]){
        int maxsum = Integer.MIN_VALUE, sum;
        for(int i = 0;i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                sum = 0;
                for(int k = i; k <= j; k++){
                    sum = sum + arr[k];
                }
                System.out.println("Current Sum: " + sum);
                if(maxsum < sum){
                    maxsum = sum;
                }
            }
        }
        System.out.println("Maximum sum in the array: " + maxsum);
    }

    public static void main(String[] args){
        int arr[] = {2,-1,6,-2,3};
        SubArray(arr);
    }
}