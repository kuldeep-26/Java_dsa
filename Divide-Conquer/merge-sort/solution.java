public class solution{

    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int arr[], int start,int end){
        if(start >= end){
            return;
        }
        int mid = start + (end - start)/2;
        mergeSort(arr,start,mid);    // left part
        mergeSort(arr,mid+1,end);    // right part
        merge(arr, start, mid, end);
    }

    public static void merge(int arr[],int start,int mid,int end){
        int temp[] = new int[end-start+1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }
        // left part..
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        // right part..
        while(j <= end){
            temp[k++] = arr[j++];
        }

        for(k = 0 , i = start; k < temp.length ; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args){
        int arr[] = {2,3,4,1,5,6};
        
        mergeSort(arr,0,arr.length-1);
        printArray(arr);
    }
}