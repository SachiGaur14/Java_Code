import java.util.LinkedList;

public class Linkedlist7{
   //MERGE SORT USING LINKEDLIST.
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

   private Node getmid(Node head){  //can't be directly called from main function.
      Node slow = head;
      Node fast = head.next;
      while(fast != null && fast.next != null){
         slow = slow.next;
         fast = fast.next.next;
      }
      return slow;  //midnode
   }
 
   private Node merge(Node head1, Node head2){
      Node mergell = new Node(-1);
      Node temp = mergell;
      while(head1 != null && head2 != null){
         if(head1.data <= head2.data){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
         }
         else{
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
         }
      }
      while(head1 != null){
         temp.next = head1;
         head1 = head1.next;
         temp = temp.next;
      }
      while(head2 != null){
         temp.next = head2;
         head2 = head2.next;
         temp = temp.next;
      }
      return mergell.next;
   }

   public Node mergesort(Node head){
      if(head == null || head.next == null){
         return head;
      }
      Node mid = getmid(head);

      Node righthead = mid.next;
      mid.next = null;
      Node newleft = mergesort(head);
      Node newright = mergesort(righthead);
      return merge(newleft, newright);
   }

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

   public static void main(String k[]){
      Linkedlist7 ll = new Linkedlist7();
      ll.addFirst(1);
      ll.addFirst(2);
      ll.addFirst(3);
      ll.addFirst(4);
      ll.addFirst(5);   //5->4->3->2->1
      ll.print();

      ll.head = ll.mergesort(ll.head);
      ll.print();
   }
}