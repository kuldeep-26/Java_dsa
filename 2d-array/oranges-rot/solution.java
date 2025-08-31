public class solution{

    public static void findTime(int arr[][]){
        int count = 0;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr[0].length-1; j++){
                if(arr[i][j] == 2){
                    if(arr[i+1][j] == 1){
                        arr[i+1][j] += 1;
                        count++; 
                    }
                    else if(arr[i][j+1] == 1){
                        arr[i][j+1] += 1;
                        count++;
                    }
                }
                System.out.println("Current count: " + count);
                for(int a = 0; a < arr.length; a++){
                    for(int b = 0; b < arr[0].length; b++){
                        System.out.print(arr[a][b] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
        System.out.println("final count: " + count);
    }

    public static void main(String[] args){
        int arr[][] = {{2,1,1},{1,1,0},{0,1,1}};
        findTime(arr);
    }
}