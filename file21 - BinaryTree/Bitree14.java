public class Bitree14{

    //TRANSFORM TO SUM TREE
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int transform(Node root){
        if(root == null){
            return 0;
        }
        int lchild = transform(root.left);
        int rchild = transform(root.right);
        int data = root.data;

        int newl = root.left == null ? 0 : root.left.data;
        int newr = root.right == null ? 0 : root.right.data;

        root.data = newl + lchild + newr + rchild;
        return data;
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String args[]){         //Binary tree     
        Node root = new Node(1);
        root.left = new Node(2);               //          1
        root.right = new Node(3);             //       2      3
        root.left.left = new Node(4);       //       4   5   6  7  
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        transform(root);
        preorder(root);
    }    
}