public class solution{

    // Way-1....  
    public static int gridWays(int i, int j, int n, int m){
        if(i == n-1 && j == m-1){         // base condition...
            return 1;
        }else if(i == n || j == m){       // boundry cross condition...
            return 0;
        }

        int w1 = gridWays(i+1,j,n,m);
        int w2 = gridWays(i,j+1,n,m);
        return w1 + w2;
    }

    // // Way-2....
    // public static int fact(int num){
    //     if(num <= 1){
    //         return num;
    //     }
    //     return num * fact(num-1);
    // }

    public static void main(String[] args){
        int n = 3, m = 3;
        
        // Way-1....
        System.out.println(gridWays(0,0,n,m));
        
        // Way-2....
        // (n-1 + m-1)/(n-1) * (m-1)
        // int ans = fact(n-1 + m-1) / (fact(n-1) * fact(m-1));
        // System.out.println(ans);

    }
}