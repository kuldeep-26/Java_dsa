public class search{

    public static int bin_search(int arr[], int key){
        int start = 0, end = arr.length-1;
        while(start <= end){
            int mid  = (start + end)/2;
            if(key == arr[mid]){
                return mid + 1;
            }
            if(key > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            } 
        }
        return -1;
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,10,20,25};
        int key = 26;
        int pos = bin_search(arr, key);        
        if(pos == -1){
            System.out.println("Not Found.");
        }else{
            System.out.println("Found at: " + pos);
        }
    }
}