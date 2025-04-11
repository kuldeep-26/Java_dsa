import java.util.*;
public class solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int alive = josephus(n,k) + 1;
        System.out.println("Person alive: " + alive);
    }
    public static int josephus(int n, int k){
        if(n==1)
            return 0;
        else
            return (josephus(n-1,k) + k ) % n;
    }
}