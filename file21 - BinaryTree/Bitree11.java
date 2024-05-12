public class Bitree11{

    //LOWEST COMMON ANCESTOR (Approach 2)
    //1st ancestor -- contains subtrees with n1 & n2
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node lca2(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node llca = lca2(root.left, n1, n2);
        Node rlca = lca2(root.right, n1, n2);

        if(rlca == null){   //right subtree doesn't contain n1 or n2
            return llca;
        }
        if(llca == null){    //left subtree doesn't contain n1 or n2
            return rlca;
        }

        return root;  //left & right both != null
    }

    public static void main(String args[]){         //Binary tree     
        Node root = new Node(1);
        root.left = new Node(2);               //          1
        root.right = new Node(3);             //       2      3
        root.left.left = new Node(4);       //       4   5   6  7  
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 5;
        System.out.println(lca2(root, n1, n2).data);

        int n3 = 6, n4 = 5;
        System.out.println(lca2(root, n3, n4).data);
    }    
}