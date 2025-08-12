public class solution{

    // public static int fib(int n){
    //     if(n == 0 || n == 1){
    //         return n;
    //     }
    //     return fib(n - 1) + fib(n - 2);
    // }

    public static int lastOccurance(int arr[], int key, int i){
        if(i == -1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return lastOccurance(arr,key,i-1);
    }

    public static void main(String[] args){
        // System.out.println(fib(3));
        int arr[] = {4,4,4,4};
        System.out.println(lastOccurance(arr,4,arr.length-1));
    }
}