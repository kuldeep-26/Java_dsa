import java.util.*;

public class solution{

    public static int mostWater(ArrayList<Integer> height){
        int left = 0;
        int right = height.size() - 1;
        int maxWater = Integer.MIN_VALUE;
        while(left < right){
            int length = Math.min(height.get(left), height.get(right));
            int width = right - left;
            int water = length * width;
            maxWater = Math.max(water, maxWater);

            if(left < right){
                left++;
            }else{
                right--;
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