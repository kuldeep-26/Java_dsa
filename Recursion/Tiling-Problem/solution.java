public class solution{

    public static int tilingProblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        // vertical ways....
        int vert = tilingProblem(n-1);

        // horizontal ways....
        int hori = tilingProblem(n-2);

        int total_ways = vert + hori;
        return total_ways;
    }

    public static void main(String[] args){
        System.out.println(tilingProblem(20));
    }
}