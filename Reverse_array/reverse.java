import java.util.*;
public class reverse{
    public static int[] reverse_arr(int arr[]){
        int i = 0, j = arr.length - 1;
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--; 
        }
        return arr;
    }
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50};
        System.out.println(Arrays.toString(reverse_arr(arr)));
    }
}