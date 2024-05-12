import java.util.*;
public class BST10{

    //MERGE 2 BSTs
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

    public static void getinorder(Node root, ArrayList<Integer> arr){
        if(root == null){
            return ;
        }
        getinorder(root.left, arr);
        arr.add(root.data);
        getinorder(root.right, arr);
    }

    public static Node createBST(ArrayList<Integer> finalarr, int st, int end){
        if(st > end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(finalarr.get(mid));
        root.left = createBST(finalarr, st, mid-1);
        root.right = createBST(finalarr, mid+1, end);
        return root;
    }

    public static Node mergeBST(Node root1, Node root2){
        ArrayList<Integer> arr1 = new ArrayList<>();     
        getinorder(root1, arr1);        //sorted al - bst1

        ArrayList<Integer> arr2 = new ArrayList<>();    
        getinorder(root2, arr2);        //sorted al - bst2

        //merge
        int i=0, j=0;
        ArrayList<Integer> finalarr = new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                finalarr.add(arr1.get(i));
                i++;
            }
            else{
                finalarr.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            finalarr.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            finalarr.add(arr2.get(j));
            j++;
        }

        //sorted al -> balanced BST
        return createBST(finalarr, 0, finalarr.size()-1);
    }

    public static void main(String k[]){
        Node root1 = new Node(2);       //    2
        root1.left = new Node(1);       //  1    4    <- BST1
        root1.right = new Node(4);

        Node root2 = new Node(9);  
        root2.left = new Node(3);       //    9
        root2.right = new Node(12);     // 3     12      <-BST2
        
        /*          3
               1         9
                  2   4    12
        */

       Node root = mergeBST(root1, root2);
       preorder(root);
    }
}