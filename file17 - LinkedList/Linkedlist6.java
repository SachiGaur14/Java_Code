import java.util.LinkedList;  //JCF -- inbuilt Linkedlist.

public class Linkedlist6{
    public static void main(String k[]){
        //create -- no primitive data type, only object class like Integer, Float.
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //print
        System.out.println(ll);
        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}