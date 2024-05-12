public class sort1a{

    //BUBBLE SORT
    public static void bubblesort(int arr[]){
        int swap = 0;
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
        }
        if(swap == 0){
            System.out.println("Array was already sorted.");
        }
    }
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] k){
        int arr[] = {1, 2, 3, 4, 5};
        int ar[] = {4, 5, 3, 2, 1};
        bubblesort(arr);
        print(arr);
        bubblesort(ar);
        print(ar);
    }
}