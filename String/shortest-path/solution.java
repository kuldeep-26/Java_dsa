public class solution{

    public static double shortDistance(String s){
        s = s.toLowerCase();
        int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'e'){
                x2++;
            }else if(s.charAt(i) == 'w'){
                x2--;
            }else if(s.charAt(i) == 'n'){
                y2++;
            }else{
                y2--;
            }
        }
        double dist = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        return dist;
    }

    public static void main(String[] args){
        String dir = "WNEENESENNN";
        System.out.println(shortDistance(dir)); 
    }
}