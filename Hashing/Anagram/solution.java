import java.util.*;

public class solution{

    public static boolean chechAnagram(String s, String t){
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Adding first String into map....
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }

        // removing String from map with respect to second String....
        for(int i = 0; i < t.length(); i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            }else{
                return false;
            }
            if(map.get(t.charAt(i)) == 0){
                map.remove(t.charAt(i));
            }
        }
    
        return map.isEmpty() ? true : false;
    }

    public static void main(String[] args){
        String s = "knee";
        String t = "keen";
        System.out.println(chechAnagram(s, t));
    }
}