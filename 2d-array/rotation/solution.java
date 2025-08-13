public class solution{

    public static void printMatrix(int arr[][]){
        for(int[] row : arr){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("Transposed Matrix: ");
        printMatrix(arr);
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length / 2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length-j-1];
                arr[i][arr.length-j-1] = temp;
            }
        }
        System.out.println("\n90 deg Rotated Matrix: ");
        printMatrix(arr);
    }

    public static void main(String[] args){
        int arr[][] = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};
        rotate(arr);
    }
}