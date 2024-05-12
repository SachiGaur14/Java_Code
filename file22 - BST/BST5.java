public class BST5{

    //MIRROR A BST
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

    public static Node mirror(Node root){
        if(root == null){
            return null;
        }
        Node lm = mirror(root.left);
        Node rm = mirror(root.right);
        
        root.left = rm;
        root.right = lm;
        return root;
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String k[]){
        Node root = new Node(8);              //    8
        root.left = new Node(5);           //    5     10
        root.right = new Node(10);        //   3   6      11
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        /*      8
            10     5
         11      6   3  */

         root = mirror(root);
         preorder(root);
    }
}