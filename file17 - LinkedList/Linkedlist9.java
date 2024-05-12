public class Linkedlist9{

    //DOUBLY LINKEDLIST
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add
    public void addFirst(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
           head = tail = newnode;
           return;
        }
        newnode.next = head;
        head.prev = newnode;
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
        newnode.prev = tail;
        tail = newnode;
    }

    //print
    public void print(){
        Node temp = head;
        if(head == null){
            System.out.println("Dll is empty");
            return;
        }
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //remove
    public int removeFirst(){
        if(head == null){
            System.out.println("Dll is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("Dll is empty");
            return Integer.MIN_VALUE;  
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //last : i = size-2
        Node last = head;
        for(int i=0; i<size-2; i++){
            last = last.next;   //2nd last value
            i++;
        }
        int val = last.next.data;  //tail data
        last.next = null;
        tail.prev = null;
        tail = last;
        size--;
        return val;
    }

    //REVERSE DOUBLY LINKEDLIST
    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String k[]){
       Linkedlist9 dll = new Linkedlist9();
       dll.addFirst(3);
       dll.addFirst(2);
       dll.addFirst(1);

       dll.addLast(4);
       dll.addLast(5);
       dll.print();  //1-2-3-4-5
       System.out.println(dll.size);

       dll.removeFirst();
       dll.print();   //2-3-4-5
       System.out.println(dll.size); 

       dll.removeLast();
       dll.print();  //2-3-4
       System.out.println(dll.size); 

       dll.reverse();
       dll.print();  //4-3-2
       
    }
}