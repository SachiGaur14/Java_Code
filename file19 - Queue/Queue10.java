import java.util.*;
public class Queue10{

    //DEQUE -- DOUBLE ENDED QUEUE
    //Deque -- interface in JCF
    public static void main(String k[]){
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1); //1
        d.addFirst(2); //2 1
        d.addLast(3);  //2 1 3
        d.addLast(4);  //2 1 3 4
        System.out.println(d);

        d.removeFirst();  //1 3 4
        System.out.println(d);
        d.removeLast();  //1 3
        System.out.println(d);

        System.out.println("1st element = " + d.getFirst());  //1
        System.out.println("Last element = " + d.getLast());  //3
    }
}