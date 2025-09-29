import java.util.*;

public class solution{

    public static int climbStairs(int n){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }

    public static int climbStairsMemo(int ways[], int n){
        if(n == 0){
            return 1;
        }
        if(n < 1){
            return 0;
        }
        if(ways[n] != -1){
            return ways[n];
        }
        ways[n] = climbStairsMemo(ways, n-1) + climbStairsMemo(ways, n-2);
        return ways[n];
    }

    public static void main(String[] args){
        int n = 5;
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);
        System.out.println("Counting Ways Using Simple Recursion: " + climbStairs(n));
        System.out.println("Counting Ways Using Memoization: " + climbStairsMemo(ways, n));
    }
}