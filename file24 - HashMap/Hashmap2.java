import java.util.*;
public class Hashmap2{

    //ITERATE ON HASHMAPS
    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<>();       //HashMap <key, value>
        
        hm.put("India", 100);
        hm.put("Nepal", 80);
        hm.put("China", 120);
        hm.put("US", 90);

        Set<String> keys = hm.keySet();
        System.out.println(keys);
        
        //foreach loop
        for(String k : keys){    
            System.out.println(k + ", " + hm.get(k));
        }
    }
}