public class solution{

    public static String toUpper(String str){
        StringBuilder s = new StringBuilder("");
        s.append(Character.toUpperCase(str.charAt(0)));
        
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ' ' && i < str.length()-1){
                s.append(str.charAt(i));
                i++;
                s.append(Character.toUpperCase(str.charAt(i)));
            }else{
                s.append(str.charAt(i));
            }
        }
        return s.toString();
    }

    public static void main(String[] args){
        String str = "hello world";
        System.out.println(toUpper(str));
    }
}