import java.util.LinkedList;

//Stack using Linkedlist.
public class Stack2{
   public static class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
   }
   public static Node head = null;

   public static boolean isempty(){
    return head == null;
   }

   //push
   public static void push(int data){
     Node newnode = new Node(data);
     if(isempty()){
        head = newnode;
        return;
     }
     newnode.next = head;
     head = newnode;
   }

   //pop
   public static int pop(){
     if(isempty()){
        return -1;
     }
     int top = head.data;
     head = head.next;
     return top;
   }

   //peek
   public static int peek(){
     if(isempty()){
        return -1;
     }
     return head.data;
   }

   public static void main(String k[]){
    Stack2 s = new Stack2();
    s.push(1);
    s.push(2);
    s.push(3);
    while(!s.isempty()){
        System.out.println(s.peek());
        s.pop();
    }
   }
}