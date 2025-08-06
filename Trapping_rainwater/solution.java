public class solution{

    public static void rainWater(int arr[], int w){

        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for(int i = 1; i < leftMax.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);  // [4,4,4,6,6,6,6]
        }

        int rightMax[] = new int[arr.length];
        rightMax[rightMax.length - 1] = arr[arr.length - 1];
        for(int i = rightMax.length - 2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);  // [6,6,6,6,6,5,5,5]
        }

        int trapWater = 0;
        for(int i = 0; i < arr.length; i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            trapWater = trapWater + ((waterLevel - arr[i]) * w);
        }
        System.out.println("Total Trapped Rain Water: " + trapWater);
    }

    public static void main(String[] args){
        int arr[] = {1,8,6,2,5,4,8,3,7};
        int width = 1;
        rainWater(arr,width);
    }
}