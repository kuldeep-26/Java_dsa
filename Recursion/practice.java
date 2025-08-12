// public class practice{

//     static String digit[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

//     public static void printNumber(int n){
//         if(n == 0)
//             return;
//         int lastdigit = n % 10;
//         printNumber(n/10);
//         System.out.print(digit[lastdigit] + " ");
//     }

//     public static void main(String[] args){
//         printNumber(1234);
//         System.out.println();
//     }
// }


public class practice{
    public static void towerOfHanoi(int n,String src,String helper,String dest) {
        if(n==1) {
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        //transfer top n-1 from src to helper usingdest as 'helper'
        towerOfHanoi(n-1,src,dest,helper);
        //transfer nth from src to dest
        System.out.println("transfer disk "+n+" from "+src+" to "+helper);
        //transfer n-1 from helper to dest using srcas 'helper'
        towerOfHanoi(n-1,helper,src,dest);
    }
    public static void main(String args[]) {
        int n=4;
        towerOfHanoi(n,"A","B","C");
    }
}