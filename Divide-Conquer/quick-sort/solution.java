public class solution{

    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int arr[],int start,int end){
        if(start >= end){
            return;
        }
        int pi = partition(arr,start,end);
        quickSort(arr,start,pi-1);
        quickSort(arr,pi+1,end);
    }

    public static int  partition(int arr[], int start, int end){
        int pivot = arr[end];
        int i = start - 1;
        for(int j = start; j < end; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args){
        int arr[] = {6,3,9,8,2,5};
        quickSort(arr,0,arr.length-1);
        printArray(arr);
    }
}