public class solution{

    public static int stocks(int arr[]){

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < arr.length; i++){
            int sellPrice = arr[i];
            if(buyPrice < sellPrice){
                int profit = sellPrice - buyPrice;
                System.out.println(profit);
                maxProfit = Math.max(maxProfit,profit);
            }else{
                buyPrice = sellPrice;
            }
        }
        return maxProfit; 
    }

    public static void main(String[] args){
        int price[] = {7,1,5,3,6,4};
        System.out.println("Maximum Profit: " + stocks(price));
    }
}