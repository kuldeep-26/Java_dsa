import java.util.*;
class prime{
   public static void main(String args[]){

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter num: ");
       int num = sc.nextInt();

       while(num <= 100) {
           int count = 0;
           for (int i = 1; i <= num; i++) {
               if (num % i == 0) {
                   count++;
               }
           }
           if(count == 2){
               System.out.print(num + " ");
           }
           num++;
       }
   }
}


// import java.util.*;
// public class solution{
//     public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Number: ");
//         int num = sc.nextInt();
//         if(num == 2){
//             System.out.println(num + " is prime no.");
//         }else{
//             boolean isprime = true;
//             for(int i=2 ; i<=Math.sqrt(num) ; i++){
//                 if(num % i == 0){
//                     isprime = false;
//                 }
//             }
            
//             if(isprime == true) {
//                 System.out.println(num + " is prime no.");
//             }else{
//                 System.out.printf(num + " is composite no.");
//             }
//         }
//     }
// }