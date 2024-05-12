import java.util.*;
public class BST7{
    
    //CONVERT BST TO BALANCED BST
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void getinorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return ;
        }
        getinorder(root.left, inorder);
        inorder.add(root.data);
        getinorder(root.right, inorder);
    }

    public static Node createBST(ArrayList<Integer> inorder, int st, int end){
        if(st > end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, st, mid-1);
        root.right = createBST(inorder, mid+1, end);
        return root;
    }

    public static Node balancedBST(Node root){
        //inorder sequence -- sorted arraylist
        ArrayList<Integer> inorder = new ArrayList<>();
        getinorder(root, inorder);

        //sorted al -- balanced BST
        root = createBST(inorder, 0, inorder.size()-1);
        return root;
    }

    public static void main(String k[]){
        Node root = new Node(8);            //             8
        root.left = new Node(6);            //           6   10
        root.left.left = new Node(5);       //         5       11
        root.left.left.left = new Node(3);  //       3            12     <- given

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        /*          8
               5        11
            3    6   10    12    <- expected
        */

       root = balancedBST(root);
       preorder(root);
    }
}