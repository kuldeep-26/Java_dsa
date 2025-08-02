
// Prime Factors......
// public class solution{
//     public static void main(String[] args){
//         int num = 60;
//         while(num%2==0){
//             System.out.print(2 + " ");
//             num /= 2;
//         }
//         for(int i=3;i<=Math.sqrt(num);i+=2){
//             while(num%i==0){
//                 System.out.print(i + " ");
//                 num /= i;
//             }
//         }
//         if(num > 2){
//             System.out.println(num);
//         }
//     }
// }


// Factors are prime or not....

public class solution{

    public static void Factors(int n){
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                if(isPrime(i))
                    System.out.println(i + " is prime factor.");
                else
                    System.out.println(i + " is not prime factor.");
            }
        }
    }

    public static boolean isPrime(int n){
        
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;

        for(int i=3; i<=Math.sqrt(n);i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int num = 12;
        Factors(num);
    }
}