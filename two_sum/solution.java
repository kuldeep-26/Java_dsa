import java.io.*;
import java.util.*;
public class solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        // Approach 1 :-

        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<size;i++){
        //     int comp = target - arr[i];
        //     if(map.containsKey(comp)){
        //         System.out.print(map.get(comp) + ", " + i);
        //         return ; 
        //     }
        //     map.put(arr[i],i);
        // }
        

        // Approach 2 :-

        // for(int i=0;i<size;i++){
        //     for(int j=i+1;j<size;j++){
        //         if(arr[i] + arr[j] == target){
        //             System.out.print(i + ", " + j);
        //             return ;
        //         }
        //     }
        // }
    }
}