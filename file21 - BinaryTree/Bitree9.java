import java.util.*;
public class Bitree9{

    //Kth LEVEL ELEMENTS (iteratively)  ----- NOT RIGHT
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void klevel(Node root, int level, int k){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                if(level == k){
                    System.out.print(root.data + " ");
                    return;
                }
                Node currnode = q.remove();
                if(currnode == null){
                    level++;
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    if(currnode.left != null || currnode.right != null){
                        level++;
                        if(currnode.left != null){
                        q.add(currnode.left);
                        }
                        if(currnode.right != null){
                        q.add(currnode.right);
                        }
                    }
                }
            }
        
    }

    public static void main(String args[]){         //Binary tree     
        Node root = new Node(1);
        root.left = new Node(2);               //          1
        root.right = new Node(3);             //       2      3
        root.left.left = new Node(4);       //       4   5   6  7  
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 3;
        klevel(root, 1, k);
    }
}    
 