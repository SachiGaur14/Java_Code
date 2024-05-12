public class Bitree3{

    //HEIGHT & COUNT OF A TREE and SUM OF NODES.
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //HEIGHT
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);    //left height
        int rh = height(root.right);   //right height
        return Math.max(lh, rh) + 1;
    }

    //COUNT OF NODES
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int lc = count(root.left);   //left count
        int rc = count(root.right);  //right count
        return (lc + rc + 1);
    }

    //SUM OF NODES
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int ls = sum(root.left);   //left sum
        int rs = sum(root.right);  //right sum
        return (ls + rs + root.data);
    }

    public static void main(String k[]){         //Binary tree     
        Node root = new Node(1);
        root.left = new Node(2);               //         1
        root.right = new Node(3);             //       2     3
        root.left.left = new Node(4);       //       4  5   6  7  
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height = " + height(root));

        System.out.println("Count = " + count(root));

        System.out.println("Sum = " + sum(root));
    }
}