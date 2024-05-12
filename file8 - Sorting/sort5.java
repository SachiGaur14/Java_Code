import java.util.Arrays;
import java.util.Collections;

public class sort5{

    //INBUILT SORT -- descending order
     public static void print(Integer ar[]){
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    public static void main(String []k){
    Integer ar[] = {5, 4, 1, 3, 2};    //Integer -- object datatype.
    Arrays.sort(ar, Collections.reverseOrder());   //as this function works on objects only.
    print(ar);

    Integer arr[] = {3, 2, 4, 1, 5};
    Arrays.sort(arr, 0, 4, Collections.reverseOrder());
    print(arr);
    }
}