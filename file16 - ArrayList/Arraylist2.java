import java.util.ArrayList;
public class Arraylist2{

    //TO REVERSE AN ARRAYLIST
    public static void main(String k[]){
       ArrayList<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       System.out.println(list);

       for(int i=list.size()-1; i>=0; i--){
        System.out.print(list.get(i) + " ");
       }
       System.out.println();
       
       //TO FIND MAXIMUM ELEMENT
       int max = Integer.MIN_VALUE;
       for(int i=0; i<list.size(); i++){
        if(max < list.get(i)){
            max = list.get(i);
        }
        // max = Math.max(max, list.get(i));
       }
       System.out.println("Max element = " + max);
    }
}