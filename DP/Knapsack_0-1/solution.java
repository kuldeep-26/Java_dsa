public class solution{

    public static int knapSack(int val[], int wt[], int W, int i){
        if(W == 0 || i == 0){
            return 0;
        }

        if(wt[i-1] <= W){      // valid...
            int ans1 = val[i-1] + knapSack(val, wt, W-wt[i-1], i-1);     // include...
            int ans2 = knapSack(val, wt, W, i-1);           // exclude...
            return Math.max(ans1, ans2);
        }else{                 // invalid...
            return knapSack(val, wt, W, i-1);
        }
    }

    public static int knapSackMemo(int val[], int wt[], int W, int i, int dp[][]){
        if(W == 0 || i == 0){
            return 0;
        }

        if(dp[i][W] != -1){
            return dp[i][W];
        }

        if(wt[i-1] <= W){
            int ans1 = val[i-1] + knapSackMemo(val, wt, W-wt[i-1], i-1, dp);
            int ans2 = knapSackMemo(val, wt, W, i-1, dp);
            dp[i][W] = Math.max(ans1, ans2);
            return dp[i][W];
        }else{
            dp[i][W] = knapSackMemo(val, wt, W, i-1, dp);
            return dp[i][W];
        }
    }

    public static void main(String[] args){
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;
        int dp[][] = new int[val.length + 1][W + 1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println("Max Profit of knapsack: " + knapSack(val, wt, W, val.length));
        System.out.println("Max Profit by Memo.: " + knapSackMemo(val, wt, W, val.length, dp));
    }
}