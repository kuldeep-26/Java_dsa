public class solution{
    
    public static void removeDuplicates(String str,int i,StringBuilder newstr,boolean map[]){
        if(i == str.length()){
            System.out.println(newstr);
            return;
            // return newstr.toString();
        }
        char currChar = str.charAt(i);
        if(map[currChar - 'a'] == true){
            removeDuplicates(str,i+1,newstr,map);
        }else{
            map[currChar - 'a'] = true;
            removeDuplicates(str,i+1,newstr.append(currChar),map);
        }
    }
    
    public static void main(String[] args){
        removeDuplicates("appnaacollege",0,new StringBuilder(""),new boolean[26]);
    }
}