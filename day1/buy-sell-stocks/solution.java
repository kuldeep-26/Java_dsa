import java.io.*;
import java.util.*;
// [3,2,4,5,3]
public class solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int minPrice = arr[0];
        int maxProfit = 0;
        for(int i=1; i<size; i++){
            if(arr[i] < minPrice){
                minPrice = arr[i];
            }else{
                int profit = arr[i] - minPrice;
                maxProfit = Math.max(maxProfit,profit);
            }
        }
        System.out.print("Maximum Profit: " + maxProfit);
    }
}