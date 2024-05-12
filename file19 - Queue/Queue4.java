import java.util.*;
public class Queue4{
    
    //QUEUE BY JCF
    public static void main(String k[]){
        //Queue is an interface so cant have objects
        //implemented by class LinkedList or ArrayDeque
        
        Queue<Integer> q = new LinkedList<>();  
        q.add(1);
        q.add(2);
        q.add(3); 
        while(!q.isEmpty()){
           System.out.println(q.peek());
           q.remove();
        }  

        Queue<Integer> q2 = new ArrayDeque<>();
        q.add(4);
        q.add(5);
        q.add(6); 
        while(!q.isEmpty()){
           System.out.println(q.peek());
           q.remove();
        }                                      
    }
}