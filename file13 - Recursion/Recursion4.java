public class Recursion4{

    //CHECK IF ANY ARRAY IS SORTED OR NOT.
    public static boolean issorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
       return issorted(arr, i+1);
    }

    public static void main(String k[]){
       int arr[] = {1, 2, 3, 4};
       System.out.println(issorted(arr, 0));
       
       int arr1[] = {5, 7, 2, 3, 4};
       System.out.println(issorted(arr1, 0));
    }
}