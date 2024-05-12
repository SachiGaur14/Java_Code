public class Linkedlist5{
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

    //TO REMOVE CYCLE
    public static void Removecycle(){
        Node slow = head;  //detecting cycle
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        //find meeting point
        slow = head;
        Node prev = null; //last node
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //last.next = null
        prev.next = null;
    }

    //TO CHECK CYCLE EXIST OR NOT IN LL.
    public static boolean cycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;    //cycle exists
            }
        }
        return false;
    }

    public static void main(String k[]){
       head = new Node(1);
       Node temp = new Node(2);
       head.next = temp;
       head.next.next = new Node(3);
       head.next.next.next = temp;     //cycle must not be connected to head but to any middle node.
        //1->2->3->2
       System.out.println(cycle());
       Removecycle();
       System.out.println(cycle());
    }
}
