import java.util.*;

public class solution{

    public static int minAbsolute(int[] ar1, int[] ar2){
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        
        int minDif = 0;
        for(int i = 0; i < ar1.length; i++){
            minDif = minDif + Math.abs(ar1[i] - ar2[i]);
        }
        return minDif;
    }

    public static void main(String[] args){
        int ar1[] = {4, 1, 8, 7};
        int ar2[] = {2, 3, 6, 5};
        System.out.println(minAbsolute(ar1, ar2));
    }
}