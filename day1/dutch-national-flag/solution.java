import java.util.*;
public class solution{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr,n);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void sort(int arr[],int n){
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }else if(arr[mid] == 1)
                mid++;
            else{
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }
}