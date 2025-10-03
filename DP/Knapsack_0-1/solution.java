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

    public static void main(String[] args){
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;
        System.out.println(knapSack(val, wt, W, val.length));
    }
}