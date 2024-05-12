import java.util.ArrayList;
public class Arraylist6{

    //CONTAINER WITH MOST WATER
    public static int storewater(ArrayList<Integer> heights){
        int maxwater = 0;
        for(int i=0; i<heights.size(); i++){
            for(int j=i+1; j<heights.size(); j++){
                int height = Math.min(heights.get(i), heights.get(j));
                int width = j-i;
                int currwater = height*width;
                maxwater = Math.max(maxwater, currwater);
            }
        }
        return maxwater;
    }

    public static void main(String k[]){
       ArrayList<Integer> heights = new ArrayList<>();
       heights.add(1);
       heights.add(8);
       heights.add(6);
       heights.add(2);
       heights.add(5);
       heights.add(4);
       heights.add(8);
       heights.add(3);
       heights.add(7);
       System.out.println(storewater(heights));
    }
}