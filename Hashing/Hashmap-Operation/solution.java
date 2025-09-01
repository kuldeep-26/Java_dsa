import java.util.*;

public class solution{
    public static void main(String[] args){
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert  O(1)...
        hm.put("Burger", 50);
        hm.put("Tea", 10);
        hm.put("Pizza", 250);

        System.out.println(hm);

        // Get O(1)...
        int price = hm.get("Tea");
        System.out.println(price);
        System.out.println(hm.get("Samosa"));  // null

        // containsKey O(1)...
        System.out.println(hm.containsKey("Tea"));  // true
        System.out.println(hm.containsKey("Samosa")); // false

        // Remove O(1)...
        System.out.println(hm.remove("Burger"));  // remove Burger and return 50
        System.out.println(hm.remove("Samosa")); // null

        // Iterate...
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println("Key: " + k + ", Value: " + hm.get(k));
        }

        // entrySet...
        System.out.println(hm.entrySet());
    }
}