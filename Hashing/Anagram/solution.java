import java.util.*;

public class solution{

    public static boolean chechAnagram(String s, String t){
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Adding first String into map....
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // removing String from map with respect to second String....
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            if(map.get(ch) != null){
                if(map.get(ch) == 1){
                    map.remove(ch);
                }else{
                    map.put(ch, map.get(ch) - 1);  
                }
            }else{
                return false;
            }
        }
    
        return map.isEmpty();
    }

    public static void main(String[] args){
        String s = "knee";
        String t = "keen";
        System.out.println(chechAnagram(s, t));
    }
}