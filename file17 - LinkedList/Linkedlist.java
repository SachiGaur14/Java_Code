public class Linkedlist{

    //TO CREATE A NODE
    public static class Node{
        int data;
        Node next;

        public Node(int data){  //constructor
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

//main was static that's why methods were static but now we will call through linkedlist so methods can be non-static.
    public void addFirst(int data){
       Node newnode = new Node(data);   //create node
       size++;
       if(head == null){
        head = tail = newnode;
        return;
       }
       newnode.next = head;  //linking
       head = newnode;
    }
    
    public void addLast(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;   //i = idx-1 -- previous node.
        temp.next = newnode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;  //any invalid value
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;  //any invalid value
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev : i = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data; //tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static void main(String k[]){
      // Linkedlist lla = new Linkedlist();   //object creation
      // lla.head = new Node(1);  //we will create methods in the class to perform various operations on linkedlist.
      //lla.head.next = new Node(2);   //like add(), remove(), search(), etc.

       Linkedlist ll = new Linkedlist();
       ll.print();
       ll.addFirst(2);
       ll.print();
       ll.addFirst(1);
       ll.print();

       ll.addLast(3);
       ll.print();
       ll.addLast(4);
       ll.print();

       ll.add(2, 7);
       ll.print();
       System.out.println("Size of ll = " + size);

       ll.removeFirst();
       ll.print();
       System.out.println(ll.size);

       ll.removeLast();
       ll.print();
    }
}