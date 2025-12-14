import java.util.*;
public class solution{
    public static int lcs(int ar1[], int ar2[]){
        int m = ar1.length;
        int n = ar2.length;
        int dp[][] = new int[m+1][n+1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(ar1[i-1] == ar2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public static int lis(int ar1[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < ar1.length; i++){
            set.add(ar1[i]);
        }
        int ar2[] = new int[set.size()];
        int i = 0;
        for(int num : set){
            ar2[i] = num;
            i++;
        }

        return lcs(ar1, ar2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = lis(arr);
        System.out.println(result);
    }
}