public class Backtracking{
    //BACKTRACKING
    public static void changearray(int arr[], int i, int val){
        if(i == arr.length){
            print(arr);
            return;
        }
        arr[i] = val;
        changearray(arr, i+1, val+1);
        arr[i] = arr[i] - 2;    //backtracking step
    }

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String k[]){
        int arr[] = new int[5];
        changearray(arr, 0, 1);
        print(arr);
    }
}