import java.util.*;
public class Greedy{

    //ACTIVITY SELECTION (already sorted) ---O(n)
    public static void main(String k[]){
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        //end time based sorted 
        int maxact = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //choose 1st activity
        maxact = 1;
        ans.add(0);   //index of activity
        int lastEnd = end[0];
        for(int i=1; i<end.length; i++){
            if(start[i] >= lastEnd){
                //select the activity
                maxact++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("Max activity = " + maxact);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}