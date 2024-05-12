public class DAC2{
    //QUICK SORT

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quicksort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pidx = partition(arr, si, ei);    //pivot index
        quicksort(arr, si, pidx-1);
        quicksort(arr, pidx+1, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;   //make space for elements smaller than pivot.
        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
               i++;
              int temp = arr[j];    //swap
              arr[j] = arr[i];
              arr[i] = temp;
            }
        }
        i++;    //for pivot index
        int temp = pivot;
        arr[ei] = arr[i];  //not pivot = arr[i] as pivot is variable and we have to make changes at index.
        arr[i] = temp;
        return i;
    }

    public static void main(String k[]){
       int arr[] = {6, 3, 9, 8, 2, 5};
       quicksort(arr, 0, arr.length-1);
       print(arr);
    }
}