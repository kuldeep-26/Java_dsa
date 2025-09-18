import java.util.*;

public class solution {
    public static int longestSubarray(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>(); // prefixSum -> first index
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i); // store first occurrence
            }

            if (map.containsKey(sum - k)) {
                int prevIndex = map.get(sum - k);
                maxLen = Math.max(maxLen, i - prevIndex);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 3, -1, 4};
        int k = 6;

        System.out.println("Longest subarray length = " + longestSubarray(arr, k));
    }
}
