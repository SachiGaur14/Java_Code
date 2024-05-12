public class Recursion5{

    //FIRST OCCURENCE OF A NUMBER IN AN ARRAY.
    public static int firstocc(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstocc(arr, key, i+1);
    }

    //LAST OCCURENCE OF A NUMBER IN AN ARRAY.
    public static int lastocc(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int found = lastocc(arr, key, i+1);
        if(found == -1 && arr[i] == key){
            return i;
        }
        return found;
    }

    public static void main(String k[]){
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(firstocc(arr, 5, 0));
        System.out.println(lastocc(arr, 5, 0));
    }
}