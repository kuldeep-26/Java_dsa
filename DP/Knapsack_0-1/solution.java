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

    public static void print(int dp[][]){
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int knapSackTab(int val[], int wt[], int W){
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
                int v = val[i-1];   // ith item value
                int w = wt[i-1];    // ith item weight
                if(w <= j){    // valid
                    int incProfit = v + dp[i-1][j-w];
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                }else{     // invalid
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        print(dp);
        return dp[n][W];
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
        System.out.println("Max Profit by Tabulation: " + knapSackTab(val, wt, W));
    }
}