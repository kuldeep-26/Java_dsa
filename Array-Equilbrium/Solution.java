public class Solution{
    public static void equilbrium(int[] arr){
        int totalSum = 0;
        for(int num : arr){
            totalSum = totalSum + num;
        }
        int leftSum = 0;
        for(int i = 0; i < arr.length; i++){
            int rightSum = totalSum - leftSum - arr[i];
            if(leftSum == rightSum){
                System.out.println("Mid Element: " + arr[i] + "\nNumber: " + leftSum);
                return;
            }
            leftSum = leftSum + arr[i];
        }
        System.out.println("-1");
    }
    public static void main(String[] args){
        int arr[] = {2, 1, 2, 9, 4, 1};
        equilbrium(arr);
    }
}