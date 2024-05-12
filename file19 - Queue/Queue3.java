public class Queue3{

    //QUEUE USING LINKEDLIST
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head = null;
    public static Node tail = null;

    public static boolean isEmpty(){
        return head == null && tail == null;
    }

    //add
    public static void add(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    //remove
    public static int remove(){
        if(isEmpty()){
           System.out.println("Empty queue");
           return -1;
        }
        int front = head.data;
        if(head == tail){  //single element
            head = tail = null;
        }
        else{
            head = head.next;
        }
        return front;
    }

    //peek
    public static int peek(){
      if(isEmpty()){
           System.out.println("Empty queue");
           return -1;
        }
        return head.data;  
    }

    public static void main(String k[]){
        Queue3 q = new Queue3();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}