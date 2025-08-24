import java.util.*;

public class solution{

    public static int maxProfit(int[] val, int[] weight, int w){
        double ratio[][] = new double[val.length][2];
        for(int i = 0; i < val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }

        //sorting in ascending...
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int profit = 0;
        for(int i = ratio.length-1; i >= 0; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){   // include full value...
                capacity -= weight[idx];
                profit += val[idx];
            }else{   // include fractional value...
                profit += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        return profit;
    }

    public static void main(String[] args){
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int w = 50;

        System.out.println(maxProfit(val, weight, w));
    }
}