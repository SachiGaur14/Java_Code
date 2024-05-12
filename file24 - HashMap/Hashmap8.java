import java.util.*;
public class Hashmap8{

    public static void main(String k[]){

        //Hashset -- no order  -- (implemented by hashmap)
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Agra");
        cities.add("Kolkata");
        System.out.println(cities);

        //Linked hashset  -- order of insertion  -- (implemented by Linked hashmap)
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Agra");
        lhs.add("Kolkata");
        System.out.println(lhs);

        //Treeset  -- ascending order  -- (implemented by treemap)
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Agra");
        ts.add("Kolkata");
        System.out.println(ts);
    }
}