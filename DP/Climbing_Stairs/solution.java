public class solution{
    public static int climbStairs(int n){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        int ways = climbStairs(n-1) + climbStairs(n-2);
        return ways;
    }

    public static void main(String[] args){
        int n = 5;
        System.out.println(climbStairs(n));
    }
}