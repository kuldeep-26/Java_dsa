import java.util.*;

public class solution{

    public static void maxActivity(int start[], int end[]){
        //sorting...
        int activities[][] = new int[start.length][3]; 
        for(int i = 0; i < start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // lambda function -> shortform...
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));
        
        // end time basis sorted...
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity...
        count = 1;
        ans.add(activities[0][0]);
        int current = activities[0][2];
        for(int i = 1; i < start.length; i++){
            if(activities[i][1] >= current){
                count++;
                ans.add(activities[i][0]);
                current = activities[i][2];
            }
        }
        System.out.println("Maximum Activity: " + count + "\n" + ans);
    }

    public static void main(String[] args){
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        maxActivity(start, end);
    }
}