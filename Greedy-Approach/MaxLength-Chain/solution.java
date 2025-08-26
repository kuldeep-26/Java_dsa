import java.util.*;

public class solution{

    public static int maxChain(int[][] pairs){
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        ArrayList<Integer> ans = new ArrayList<>();
        int currEnd = pairs[0][1];
        int count = 1;
        for(int i = 1; i < pairs.length; i++){
            if(pairs[i][0] > currEnd){
                count++;
                currEnd = pairs[i][1];
            }
        }
        return count;
    }

    public static void main(String[] args){
        int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};
        System.out.println(maxChain(pairs));
    }
}