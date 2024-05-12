import java.util.Arrays;

public class sort4{

    //INBUILT SORT -- ascending order.
     public static void print(int ar[]){
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    public static void main(String k[]){
        int ar[] = {5, 4, 1, 3, 2};
        Arrays.sort(ar);
        print(ar);

        //Arrays.sort(ar, starting index, ending index+1) -- to sort a part.
        int arr[] = {4, 3, 1, 5, 2};
        Arrays.sort(arr, 0, 3);
        print(arr);
    }
}