import java.util.*;

public class solution{
    public static void main(String[] args){
        int ar[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < ar.length; i++){
            set.add(ar[i]);
        }
        System.out.println("Ans: " + set.size());
    }
}