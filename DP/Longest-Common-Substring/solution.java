import java.util.*;
public class solution{
    public static int longestCommonSubString(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        int dp[][] = new int[m+1][n+1];
        int max = 0;
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    max = Math.max(dp[i][j], max);
                } else {
                    dp[i][j] = 0;
                }
            } 
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().trim();
        String s2 = sc.nextLine().trim();
        int result = longestCommonSubString(s1, s2);
        System.out.println(result);
    }
}