public class Linkedlist3{

     //PALINDROME
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

     //Palindrome or not
    public Node findmid(Node head){    //Slow-Fast approach
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;  //+1
            fast = fast.next.next;  //+2
        }
        return slow; //slow = mid
    }

    public boolean Palindrome(){
        if(head == null || head.next == null){
            return true;
        }
        Node midnode = findmid(head);    
        Node prev = null;
        Node curr = midnode;
        Node next;
        while(curr != null){     //reversing 2nd half
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;  //right half head
        Node left = head;
        //check left = right
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String k[]){
        Linkedlist3 ll = new Linkedlist3();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        ll.print(); //1->2->2->1
        System.out.println(ll.Palindrome());

        ll.print();
        System.out.println(ll.Palindrome());
    }
}