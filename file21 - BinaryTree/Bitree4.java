public class Bitree4{

    //DIAMETER OF A TREE (APPROACH 1)  -- O(n2)
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

    //DIAMETER
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        //d -- diameter, h -- height
        int ld = diameter(root.left);
        int lh = height(root.left);
        int rd = diameter(root.right);
        int rh = height(root.right);

        int selfd = lh + rh + 1;
        return Math.max(selfd, Math.max(ld, rd));
    }

    public static void main(String k[]){         //Binary tree     
        Node root = new Node(1);
        root.left = new Node(2);               //         1
        root.right = new Node(3);             //       2     3
        root.left.left = new Node(4);       //       4  5   6  7  
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        System.out.println("Diameter = " + diameter(root));
    }
}