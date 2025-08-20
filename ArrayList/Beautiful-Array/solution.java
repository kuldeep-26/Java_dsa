import java.util.*;

public class solution{

    public static ArrayList<Integer> beautifulArray(int num){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        for(int i = 2; i <= num; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(Integer e:ans){
                if(e*2 <= num){
                    temp.add(e*2);
                }
            }
            for(Integer e:ans){
                if(e*2-1 <= num){
                    temp.add(e*2-1);
                }
            }
            ans = temp;
        }
        return ans;
    }

    public static void main(String[] args){
        int num = 4;
        ArrayList<Integer> list = beautifulArray(num);
        System.out.println(list);
    }
}