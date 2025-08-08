public class solution{

    public static String Maxoverlap(String s1, String s2){
        // if(s1.contains(s2)) return s1;
        // if(s2.contains(s1)) return s2;

        int maxOverlap = 0;
        int minlen = Math.min(s1.length(),s2.length());
        for(int i = 1; i <= minlen; i++){
            if(s1.endsWith(s2.substring(0,i))){
                maxOverlap = i;
            }
        }
        return s1 + s2.substring(maxOverlap);
    }

    public static String subSequence(String s1,String s2){
        String option1 = Maxoverlap(s1,s2);
        String option2 = Maxoverlap(s2,s1);

        return option1.length() <= option2.length() ? option1 : option2;
    }

    public static void main(String[] args){
        String s1 = "abac";
        String s2 = "cab";
        // System.out.println(s1.contains(s2));
        System.out.println(subSequence(s1,s2));
    }
}