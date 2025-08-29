import java.util.*;

public class solution{

    public static int findCost(Integer v_cut[], Integer h_cut[]){
        
        Arrays.sort(v_cut, Collections.reverseOrder());
        Arrays.sort(h_cut, Collections.reverseOrder());

        int i = 0, j = 0;
        int hp = 1, vp = 1;
        int cost = 0; 
        while(i < v_cut.length && j < h_cut.length){
            if(v_cut[i] >= h_cut[j]){
                cost += (hp * v_cut[i++]);
                vp++;
            }else{
                cost += (vp * h_cut[j++]);
                hp++;
            }
        }

        // Remainings...
        while(i < v_cut.length){
            cost += (hp * v_cut[i++]);
            vp++;
        }

        while(j < h_cut.length){
            cost += (vp * h_cut[j++]);
            hp++;
        }
        return cost;
    }

    public static void main(String[] args){
        int n = 4;
        int m = 6;
        Integer v_cut[] = {2, 1, 3, 1 ,4};   // m-1
        Integer h_cut[] = {4, 1, 2};   // n-1
        System.out.println("Minimum Cost: " + findCost(v_cut, h_cut));
    }
}