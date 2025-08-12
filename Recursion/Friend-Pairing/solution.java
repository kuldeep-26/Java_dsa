public class solution{
    
    public static int friendPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }

        int single = friendPairing(n-1);

        int pair = (n-1) * friendPairing(n-2);

        int total_ways = single + pair;
        return total_ways;
    }
    
    public static void main(String[] args){
        System.out.println(friendPairing(3));
    }
}