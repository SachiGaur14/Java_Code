import java.util.*;
public class Greedy2{

    //ACTIVITY SELECTION (if not sorted) ---O(nlogn)
    public static void main(String k[]){
        int start[] = {0, 1, 3, 5, 5, 8};
        int end[] = {6, 2, 4, 7, 9, 9};

        //sorting
        int activities[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //lambda function
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));  //for 2d arrays
        
        int maxact = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //choose 1st activity
        maxact = 1;
        ans.add(activities[0][0]);   //index of activity
        int lastEnd = activities[0][2];
        for(int i=1; i<end.length; i++){
            if(activities[i][1] >= lastEnd){
                //select the activity
                maxact++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Max activity = " + maxact);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}