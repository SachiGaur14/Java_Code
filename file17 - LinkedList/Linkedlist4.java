public class Linkedlist4{
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
       head.next = new Node(2);
       head.next.next = new Node(3);
       //1->2->3
       System.out.println(cycle());

       head.next.next.next = head;
       //1->2->3->1
       System.out.println(cycle());
    }
}