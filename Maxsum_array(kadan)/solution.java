public class solution{

    public static void maxSum(int arr[]){
        int sum = 0,maxsum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            if(sum < 0){
                sum = 0;
            }
            if(maxsum < sum){
                maxsum = sum;
            }
        }
        System.out.println(maxsum);
    }

    public static void main(String[] args){
        int arr[] = {1,-2,6,-1,3};
        maxSum(arr);
    }
}