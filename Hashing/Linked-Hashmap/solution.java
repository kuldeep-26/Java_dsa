import java.util.*;

public class solution{
    public static void main(String[] args){
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("Us", 200);
        lhm.put("China", 150);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("Us", 200);
        hm.put("China", 150);

        System.out.println(lhm);
        System.out.println(hm);
    }
}