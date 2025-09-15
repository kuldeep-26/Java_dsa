import java.util.*;

public class solution{
    public static void main(String[] args){
        int set1[] = {7, 3, 9};
        int set2[] = {6, 3, 9, 2, 9, 4};
        HashSet<Integer> sets = new HashSet<>();

        // Union...
        for(int i = 0; i < set1.length; i++){
            sets.add(set1[i]);
        }

        for(int i = 0; i < set2.length; i++){
            sets.add(set2[i]);
        }
        System.out.println("Union: " + sets.size());

        // Intersection...
        sets.clear();
        
        for(int i = 0; i < set1.length; i++){
            sets.add(set1[i]);
        }

        int count = 0;
        for(int i = 0; i < set2.length; i++){
            if(sets.contains(set2[i])){
                count++;
                sets.remove(set2[i]);
            }
        }
        System.out.println("Intersection: " + count);
    }
}