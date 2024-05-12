public class Linkedlist2{
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

    public void addFirst(int data){
       Node newnode = new Node(data);   
       size++;
       if(head == null){
        head = tail = newnode;
        return;
       }
       newnode.next = head;  
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

    //Iterative search
    public int search(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    //Recursive search
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recursion(int key){
        return helper(head, key);
    }

    //Reverse a linkedlist
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //Find Nth node from end and delete it.
    public void deleteNnode(int n){
        int size = 0;
        Node temp = head;
        while(temp != null){   //calculate size
            temp = temp.next;
            size++;       
        }
        if(n == size){
            head = head.next;  //removeFirst
            return;
        }
        //size-n
        int i=1;
        int itofind = size-n;
        Node prev = head;
        while(i < itofind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String k[]){
        Linkedlist2 ll = new Linkedlist2();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);
        ll.print();   //1->2->3->4->5->null.

        System.out.println(ll.search(3));
        System.out.println(ll.search(10));

        System.out.println(ll.recursion(4));

        ll.reverse();
        ll.print();

        ll.deleteNnode(2); //from end
        ll.print();
    }
}   