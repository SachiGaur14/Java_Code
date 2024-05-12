import java.util.ArrayList;
import java.util.Collections;
public class Arraylist3{

    //SWAP 2 NUMBERS
    public static void swap(ArrayList<Integer> list, int ind1, int ind2){
        int temp = list.get(ind1);
        list.set(ind1, list.get(ind2));
        list.set(ind2, temp);
    }

    public static void main(String k[]){
       ArrayList<Integer> list = new ArrayList<>();
       list.add(2);
       list.add(5);
       list.add(9);
       list.add(3);
       list.add(6); 
       int ind1 = 1, ind2 = 3;
       System.out.println(list);

       swap(list, ind1, ind2);
       System.out.println(list);

       //TO SORT AN ARRAYLIST IN ASCENDING ORDER
       Collections.sort(list);
       System.out.println(list);

       //IN DECENDING ORDER
       //comparators -- functions that define logic for sorting.
       Collections.sort(list, Collections.reverseOrder());
       System.out.println(list);
    }
}