import java.util.*;
public class solution{

    public static int longestSubstring(String str){
        // StringBuilder s = new StringBuilder();
        int arr[] = new int[26];
        for(int i = 0; i < 26; i++){
            arr[i] = -1;
        }
        int start = 0;
        int maxlen = 0;
        int maxstart = 0;
        for(int end = 0; end < str.length(); end++){
            char c = str.charAt(end);
            int charIndex = c - 'a';

            if(arr[charIndex] >= start){
                start = arr[charIndex] + 1;
            }

            arr[charIndex] = end;
            
            if(end - start + 1 > maxlen){
                maxlen = end - start + 1;
                maxstart = start;
            }
        }
        return str.substring(maxstart, maxstart + maxlen).length();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(longestSubstring(str));
    }
}