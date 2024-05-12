import java.util.PriorityQueue;
import java.util.*;
public class PQ{

    //PRIORITY QUEUES IN JCF
    public static void main(String k[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();   //Integer PQ by default give highest priority 
        pq.add(7);                                           //to lowest value
        pq.add(3);
        pq.add(4);
        pq.add(1);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());   //by default ascending order
            pq.remove();                     //value with highest priority is removed first.
        }
        System.out.println();


        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.add(3);                                     //for descending order
        pq2.add(7);
        pq2.add(4);
        pq2.add(1);
        while(!pq2.isEmpty()){
            System.out.println(pq2.peek());   
            pq2.remove();                     
        }
    }
}