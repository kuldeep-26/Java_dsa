import java.util.*;

public class solution{

    public static int mostWater(ArrayList<Integer> height){
        int maxWater = Integer.MIN_VALUE;
        for(int i = 0; i < height.size(); i++){
            for(int j = i+1; j < height.size(); j++){
                int length = Math.min(height.get(i), height.get(j));  // finding height of water
                int width = j - i;                                    // finding width of water
                int water = length * width;
                maxWater = Math.max(water,maxWater); 
            }
        }
        return maxWater;
    }

    public static void main(String[] args){
        ArrayList<Integer> height = new ArrayList<>(); 
        // 1, 8, 6, 2, 5, 4, 8, 3, 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int output = mostWater(height);
        System.out.println(output);
    }
}