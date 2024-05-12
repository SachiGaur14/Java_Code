import java.util.*;
public class Hashmap6{
    
    //HASHSET -- implemented by hashmap.(contain keys, dummy value)
    public static void main(String k[]){
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(7);
        set.add(2);

        System.out.println(set);
        System.out.println(set.size());

        if(set.contains(2)){
            System.out.println("2 exists");
        }
        if(set.contains(9)){
            System.out.println("9 exists");
        }

        set.remove(2);
        if(set.contains(2)){
            System.out.println("2 exists");
        }

        set.clear();
        System.out.println(set.isEmpty());
    }
}