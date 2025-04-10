import java.util.*;
public class solution{
    
    public static int findGcd(int a,int b){
        if(b==0){
            return a;
        }
        return findGcd(b, a % b);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result = arr[0];
        for(int i=1;i<n;i++){
            result = findGcd(result, arr[i]);
        }
        System.out.println("Gcd: " + result);
    }
}