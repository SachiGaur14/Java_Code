public class PQ4a{

    //HEAP SORT (IN DESCENDING ORDER[convert to minheap first])
    public static void heapify(int arr[], int i, int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int minidx = i;  //root

        if(left < size && arr[minidx] > arr[left]){
            minidx = left;                   
        }
        if(right < size && arr[minidx] > arr[right]){
            minidx = right;                 
        }
        if(minidx != i){  //swap
            int temp = arr[i];  //root
            arr[i] = arr[minidx];   //child
            arr[minidx] = temp;

            heapify(arr, minidx, size);
        }
    }

    public static void heapsort(int arr[]){
        //create minheap
        int n = arr.length;
        for(int i=n/2; i>=0; i--){
            heapify(arr, i, n);
        }

        //push smallest elemnet to the end
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