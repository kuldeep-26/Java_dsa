public class solution{

    public static boolean isPaline(int num){
        return num == reverse(num);
    }
    
    public static int reverse(int num){
        int rev = 0;
        while(num > 0){
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }
    
    public static void makePalindrome(int num){
        int iteration = 0;
        int maxIteration = 1000;
        System.out.println("Starting with: " + num);
        while(!isPaline(num) && iteration < maxIteration){
            int rev = reverse(num);
            int sum = num + rev;

            System.out.println(num + " + " + rev + " = " + sum);
            num = sum;
            iteration++;
        }

        if(isPaline(num)){
            System.out.println("Palindrome Found: " + num + " after " + iteration + " iterations.");
        }else{
            System.out.println("No palindrome found within " + maxIteration + " iterations.");
        }
    }
    
    public static void main(String[] args){
        int num = 178;
        makePalindrome(num);
    }
}