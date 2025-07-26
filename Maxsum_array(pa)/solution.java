public class solution{

    public static int maxSum(int arr[]){
        int maxsum = Integer.MIN_VALUE, sum;
        int prefix[] = new int[arr.length];
        
        prefix[0] = arr[0];
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        
        for(int i = 0;i < arr.length; i++){
            int start = i;
            sum = 0;
            for(int j = i + 1; j < arr.length; j++){
                int end = j;
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
            }
            if(maxsum < sum){
                maxsum = sum;
            }
        }
        return maxsum;
    }

    public static void main(String[] args){
        int arr[] = {1,-2,6,-1,3};
        System.out.println(maxSum(arr));
    }
}