import java.util.*;
public class solution{

    public static List<Integer> makePalindrome(List<Integer> arr){
        int i = 0;
        int j = arr.size() - 1;

        while(i < j){
            int left = arr.get(i);
            int right = arr.get(j);
            if(left == right){
                i++;
                j--;
            }
            else if(left < right){
                arr.set(i+1,arr.get(i) + arr.get(i+1));
                arr.remove(i);
                j--;
            }
            else{
                arr.set(j-1,arr.get(j-1) + arr.get(j));
                arr.remove(j);
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args){
        List<Integer> input = new ArrayList<>(Arrays.asList(1,6,4,3,1,7));
        System.out.println("Original Array: " + input);
        List<Integer> result = makePalindrome(input);
        System.out.println("Palindrome Array: " + result);
    }
}