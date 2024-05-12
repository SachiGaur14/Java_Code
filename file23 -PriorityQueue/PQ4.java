import java.util.*;
public class PQ4{

    //HEAP SORT (IN ASCENDING ORDER [convert to maxheap first])
    public static void heapify(int arr[], int i, int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxidx = i;  //root

        if(left < size && arr[maxidx] < arr[left]){
            maxidx = left;                   
        }
        if(right < size && arr[maxidx] < arr[right]){
            maxidx = right;                 
        }
        if(maxidx != i){  //swap
            int temp = arr[i];  //root
            arr[i] = arr[maxidx];   //child
            arr[maxidx] = temp;

            heapify(arr, maxidx, size);
        }
    }

    public static void heapsort(int arr[]){
        //create maxheap
        int n = arr.length;
        for(int i=n/2; i>=0; i--){
            heapify(arr, i, n);
        }

        //push largest elemnet to the end
        for(int i=n-1; i>0; i--){    //swap last with 1st
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }

    public static void main(String k[]){
        int arr[] = {1, 2, 4, 5, 3};
        heapsort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}