import java.util.*;
public class Greedy4{

    //MIN ABSOLUTE DIFFERENCE PAIRS
    //absolute - |a-b| always +ve.
    public static void main(String k[]){
        int A[] = {4, 1, 8, 7};
        int B[] = {2, 3, 6, 5};

        Arrays.sort(A);
        Arrays.sort(B);
        int minDiff = 0;
        for(int i=0; i<A.length; i++){
            minDiff += Math.abs(A[i]-B[i]);
        }
        System.out.println("Min absolute diff pair = " + minDiff);
    }
}