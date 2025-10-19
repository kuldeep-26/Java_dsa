public class solution{
    public static int unboundKnapsack(int[] val, int[] wt, int W){
        int n = val.length;
        int dp[][] = new int[n+1][W+1];
        for(int i = 0; i < dp.length; i++){
            dp[i][0] = 0;
        }
        for(int j = 0; j < dp[0].length; j++){
            dp[0][j] = 0;
        }
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < W+1; j++){
                int v = val[i-1];
                int w = wt[i-1];
                if(w <= j){ // valid....
                    dp[i][j] = Math.max(v + dp[i][j-w], dp[i-1][j]);    // main differnce from 0-1 knapsack
                }else{ // invalid...
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args){
        int val[] = {15, 14, 10, 45, 30};
        int weight[] = {2, 5, 1, 3, 4};
        int maxWeight = 7;
        System.out.println(unboundKnapsack(val, weight, maxWeight));
    }
}