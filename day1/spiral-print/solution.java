import java.util.*;
public class solution{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int top = 0, bottom = row-1,left = 0, right = col-1,d=0; 
        while(top<=bottom && left <= right){
            if(d==0){
                for(int i=left;i<=right;i++){
                    System.out.print(arr[top][i] + " ");
                }
                top++;
            }
            else if(d==1){
                for(int i=top;i<=right;i++){
                    System.out.print(arr[i][right] + " ");
                }
                right--;
            }
            else if(d==2){
                for(int i=right;i>=left;i--){
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }
            else if(d==3){
                for(int i=bottom;i>=top;i--){
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
            d = (d +1 ) % 4;
        }
    }
}