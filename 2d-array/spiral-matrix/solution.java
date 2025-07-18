public class solution{

    public static void spiralMatrix(int arr[][]){
        // System.out.println(arr[1][1]);
        int top = 0, left = 0;
        int bottom = arr.length - 1;
        int right = arr[0].length - 1;
        while(top <= bottom && left <= right){
            // top...
            for(int i = left; i <= right; i++){
                System.out.print(arr[top][i] + " ");
            }

            for(int i = top + 1; i <= bottom; i++){
                System.out.print(arr[i][right] + " ");
            }

            for(int i = right - 1; i >= left; i--){
                if(top == bottom){
                    break;
                }
                System.out.print(arr[bottom][i] + " ");
            }

            for(int i = bottom - 1; i >= top + 1; i--){
                if(left == right){
                    break;
                }
                System.out.print(arr[i][left] + " ");
            }

            left++;
            top++;
            right--;
            bottom--;
        }
    }

    public static void main(String[] args){
        int matrix[][] = {{1, 2, 3, 4,17},
                          {5, 6, 7, 8,18},
                          {9, 10,11,12,19},
                          {13,14,15,16,20},
                          {21,22,23,24,25}};
        spiralMatrix(matrix);
    }
}