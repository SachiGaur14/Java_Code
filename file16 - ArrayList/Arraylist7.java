import java.util.ArrayList;
public class Arraylist7{

    //CONTAINER WITH MOST WATER -- optimized way(2 pointer approach)
    public static int storewater(ArrayList<Integer> heights){
        int maxwater = 0;
        int lp = 0;
        int rp = heights.size()-1;
        while(lp < rp){
          int height = Math.min(heights.get(lp), heights.get(rp));
          int width = rp-lp;
          int currwater = height*width;
          maxwater = Math.max(maxwater, currwater);

          if(heights.get(lp) < heights.get(rp)){
            lp++;
          }
          else{
            rp--;
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