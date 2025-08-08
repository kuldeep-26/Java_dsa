public class solution{

    public static boolean checkPalidrome(String s){
        s = s.toLowerCase();
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String str = "Racecar";
        if(checkPalidrome(str))
            System.out.println(str + " is palindrome.");
        else
            System.out.println(str + " is not palindrome");
    }
}