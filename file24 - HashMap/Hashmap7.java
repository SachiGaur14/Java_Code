import java.util.*;
public class Hashmap7{
    
    //ITERATION ON HASHSET
    public static void main(String k[]){
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Agra");
        cities.add("Kolkata");

        Iterator i = cities.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        for(String city : cities){
            System.out.println(city);
        }
    }
}