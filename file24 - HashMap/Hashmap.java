import java.util.HashMap;
public class Hashmap{

    //HASHMAP -- give fastest search operation and is unordered.(data is stored in random order)
    public static void main(String k[]){
        HashMap<String, Integer> hm = new HashMap<>();       //HashMap <key, value>
        
        //add
        hm.put("India", 100);
        hm.put("Nepal", 80);
        hm.put("China", 120);

        //print
        System.out.println(hm);

        //get(key) -- return value
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Bhutan"));  //null
        
        //containsKey
        System.out.println(hm.containsKey("Nepal"));   //true
        System.out.println(hm.containsKey("Bhutan"));  //false

        //size
        System.out.println(hm.size());  //3

        //remove -- return value of key
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        System.out.println(hm.remove("Bhutan"));   //null

       //isEmpty
       System.out.println(hm.isEmpty());   //false
       
       hm.clear();    //clear whole hashmap
       System.out.println(hm.isEmpty());   //true
    }
}