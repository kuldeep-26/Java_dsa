import java.util.*;

public class solution{

    public static void indianCoins(int rs){
        int indianRupee[] = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;
        ArrayList<Integer> notes = new ArrayList<>();

        for(int i = 0; i < indianRupee.length; i++){
            if(indianRupee[i] <= rs){
                while(indianRupee[i] <= rs){
                    count++;
                    notes.add(indianRupee[i]);
                    rs = rs - indianRupee[i];
                }
            }
        }
        System.out.println(count + "\n" + notes);
    }

    public static void main(String[] args){
        int rs = 1059;
        indianCoins(rs);
    }
}