public class solution{

    public static String stringCompression(String str){
        StringBuilder s = new StringBuilder("");
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            s.append(str.charAt(i));
            if(count > 1){
                s.append(count.toString());
            }
        }
        return s.toString();
    }

    public static void main(String[] args){
        String str = "abbc";
        System.out.println(stringCompression(str));
    }
}