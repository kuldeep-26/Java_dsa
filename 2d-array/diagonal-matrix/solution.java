public class solution{

    public static void diagonalSum(int arr[][]){
        int sum = 0;

        // Brute Force......
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = 0; j < arr.length; j++){
        //         if(i == j){
        //             sum += arr[i][j];
        //         }
        //         else if(i + j == arr.length - 1){
        //             sum += arr[i][j];
        //         }
        //     }
        // }
        // System.out.println("Total sum of diagonal: " + sum);

        // Optimized.....
        for(int i = 0; i < arr.length; i++){
            // pd...
            sum += arr[i][i];
            // sd...
            if(i != arr.length-1-i)
                sum += arr[i][arr.length-i-1];
        }
        System.out.println("Total sum of diagonal: " + sum);
    }

    public static void main(String[] args){
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10,11,12},
                          {13,14,15,16}};
        diagonalSum(matrix);
    }
}