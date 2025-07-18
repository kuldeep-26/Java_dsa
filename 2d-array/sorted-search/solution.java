public class solution{

    public static boolean sortedSearch(int arr[][], int key){
        int row = 0;
        int col = arr[0].length - 1;
        while(row < arr.length && col >=0){
            if(arr[row][col] == key){
                System.out.println("Found at: " + row + ", " + col);
                return true;
            }
            else if(arr[row][col] > key){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Not found.");
        return false;
    }

    public static void main(String[] args){
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10,11,12},
                          {13,14,15,16}};
        sortedSearch(matrix,20);
    }
}