// import java.util.*;

// public class solution{

//     public static void jobSequencing(int[][] jobs){
//         int j[][] = new int[jobs.length][3];
//         for(int i = 0; i < j.length; i++){
//             j[i][0] = i;
//             j[i][1] = jobs[i][0];
//             j[i][2] = jobs[i][1];
//         }
//         Arrays.sort(j, Comparator.comparingDouble(o -> o[2]));

//         ArrayList<Integer> ans = new ArrayList<>();
//         int time = 0;
//         int profit = 0;
//         for(int i = j.length-1; i >= 0; i--){
//             if(j[i][1] > time){
//                 ans.add(j[i][0]);
//                 profit += j[i][2];
//                 time++;
//             }
//         }
//         System.out.println(profit + "\n" + ans);
//     }

//     public static void main(String[] args){
//         int jobs[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 20}};
//         jobSequencing(jobs);
//     }
// }





// Object method.....
import java.util.*;
public class solution{

    static class Job{
        int deadline;
        int profit;
        int id;

        Job(int id, int profit, int deadline){
            this.id = id;
            this.profit = profit;
            this.deadline = deadline;
        }
    }

    public static void jobSequencing(int[][] jobInfo){
        ArrayList<Job> jobs = new ArrayList<>();
        
        for(int i = 0; i < jobInfo.length; i++){
            jobs.add(new Job(i, jobInfo[i][1], jobInfo[i][0]));
        }
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);  // descending order sorting...

        int time = 0, profit = 0;
        ArrayList<Integer> seq = new ArrayList<>();
        for(int i = 0; i < jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
                profit += curr.profit;
            }
        }
        System.out.println("Maximum Profit: " + profit + "\nMaximum Seq: " + seq.size() + "\n" + seq);
    }

    public static void main(String[] args){
        int jobInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 20}};
        jobSequencing(jobInfo);
    }
}