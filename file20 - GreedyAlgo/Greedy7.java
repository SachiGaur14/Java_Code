import java.util.*;
public class Greedy7{

    //JOB SEQUENCING PROBLEM
    public static class Job{
        int deadline;
        int profit;
        int id;   //0(A), 1(B), ...

        public Job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String k[]){
       int jobinfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};
       
       ArrayList<Job> jobs = new ArrayList<>();   //to create object of jobinfo
       for(int i=0; i<jobinfo.length; i++){
           jobs.add(new Job(i, jobinfo[i][0], jobinfo[i][1]));
       }
       //descending order sort based on profit
       Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);  //for ascending ---(obj1-obj2)

       ArrayList<Integer> seq = new ArrayList<>();
       int time = 0;
       for(int i=0; i<jobs.size(); i++){
          Job curr = jobs.get(i);
          if(curr.deadline > time){
              seq.add(curr.id);
              time++;
          }
       }

       System.out.println("Max job = " + seq.size());
       for(int i=0; i<seq.size(); i++){
           System.out.print(seq.get(i) + " ");
       }
       System.out.println();
    }
}