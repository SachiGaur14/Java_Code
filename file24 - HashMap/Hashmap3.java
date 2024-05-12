import java.util.*;
public class Hashmap3{
    
    //LINKED HASHMAP AND TREEMAP.
    public static void main(String args[]){
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();      //doubly linked list 
        lhm.put("India", 100);     //stored in the order as we inserted it.
        lhm.put("Nepal", 80);      //insertion order
        lhm.put("China", 120);
        lhm.put("US", 90);


        TreeMap<String, Integer> tm = new TreeMap<>();         //red black tree(BST)
        tm.put("India", 100);          //keys are sorted(alphabetically or in ascending order)
        tm.put("Nepal", 80);
        tm.put("China", 120);
        tm.put("US", 90);


        HashMap<String, Integer> hm = new HashMap<>();       //array of linkedlist
        hm.put("India", 100);          //no order
        hm.put("Nepal", 80);
        hm.put("China", 120);
        hm.put("US", 90);

        System.out.println(hm);
        System.out.println(lhm);
        System.out.println(tm);
    }    
}