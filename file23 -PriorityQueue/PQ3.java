import java.util.*;
public class PQ3{

    //OPERATIONS IN HEAP (minheap)
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        //add or insert
        public void add(int data){
            arr.add(data);    //add at last index

            int x = arr.size()-1;  //child's index
            int par = (x-1)/2;     //parent's index
            while(arr.get(x) < arr.get(par)){    //for maxheap -- arr.get(x) > arr.get(par)
                int temp = arr.get(x);   //swap
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }

        //peek -- min value in heap
        public int peek(){
            return arr.get(0);
        }

        //heapify  -- to fix heap
        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minidx = i;  //root

            if(left < arr.size() && arr.get(minidx) > arr.get(left)){
                minidx = left;                   //for maxheap -- arr.get(maxidx) < arr.get(left)
            }
            if(right < arr.size() && arr.get(minidx) > arr.get(right)){
                minidx = right;                 //for maxheap -- arr.get(maxidx) < arr.get(right)
            }
            if(minidx != i){  //swap
                int temp = arr.get(i);  //root
                arr.set(i, arr.get(minidx));   //child
                arr.set(minidx, temp);

                heapify(minidx);
            }
        }

        //remove -- min value
        public int remove(){
            int data = arr.get(0);   //min value

            //swap 1st and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //delete last node
            arr.remove(arr.size()-1);

            //heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }

    public static void main(String k[]){
        Heap h = new Heap();
        h.add(4);
        h.add(5);
        h.add(2);
        h.add(7);
        while(!h.isEmpty()){
            System.out.println(h.peek());  //return min element
            h.remove();
        }
        //all the operations are same like in priority queue. that's why we use PQ to implement heap.
    }
}