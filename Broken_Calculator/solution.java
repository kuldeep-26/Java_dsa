public class solution{

    public static int brokenCal(int n, int tar){
        int count = 0;
        while(tar > n){
            if(tar % 2 == 0){
                tar /= 2;
            }else{
                tar += 1;
            }
            System.out.print(tar + " ");
            count++;
        }
        return count;
    }

    public static void main(String[] args){
        int num = 1;
        int target = 1000000000;
        int output = brokenCal(num,target);
        System.out.println(output);
    }
}