import java.util.*;
public class Greedy8{

    //CHOCOLATE PROBLEM
    public static void main(String k[]){
        int n = 4, m = 6;
        Integer costVer[] = {2, 1, 3, 1, 4};  //m-1(col cut)
        Integer costHor[] = {4, 1 ,2};  //n-1(row cut)

        Arrays.sort(costVer, Collections.reverseOrder());  //descending order
        Arrays.sort(costHor, Collections.reverseOrder());
        int h = 0, v = 0;  //pointer variable on cost array
        int hp = 1, vp = 1;  //pieces
        int cost = 0;

        while(h < costHor.length && v < costVer.length){
            if(costVer[v] <= costHor[h]){   //horizontal cut
                cost += (costHor[h] * vp);
                hp++;
                h++;
            }
            else{  //vertical cut
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        while(h < costHor.length){
            cost += (costHor[h] * vp);
              hp++;
              h++;
        }
        while(v < costVer.length){
            cost += (costVer[v] * hp);
              vp++;
              v++;
        }

        System.out.println("Min cost of cutting chocolate = " + cost);
    }
}