import java.util.*;
public class Solution{
    public static void printArray(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static int minCoin(int[] coins, int amount){
        int max = amount + 1;
        int dp[] = new int[amount + 1];
        
        Arrays.fill(dp, max);
        dp[0] = 0;
        
        for(int i = 1; i <= amount; i++){
            for(int coin : coins){
                if(coin <= i){
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        printArray(dp);
        return dp[amount] > amount ? -1 : dp[amount];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of coins: ");
        int n = sc.nextInt();
        int[] coins = new int[n];
        System.out.print("Enter coins: ");
        for(int i = 0; i < n; i++){
            coins[i] = sc.nextInt();
        }
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();
        int result = minCoin(coins, amount);
        System.out.println("\n" + result);
    }
}