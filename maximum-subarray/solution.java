import java.util.*;
public class solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // [1,-2,3,4,5]
        int max = arr[0];
        int maxSum = 0;
        for(int i=1; i<n; i++){
            max = Math.max(arr[i], max + arr[i]);
            maxSum = Math.max(maxSum, max);
        }
        System.out.print("Maximum sum: " + maxSum);
    }
}