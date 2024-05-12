import java.util.*;
public class array4{

    //LARGEST AND SMALLEST IN ARRAY
    public static void compare(int num[]){
        int largest = Integer.MIN_VALUE;     // -infinity
        int smallest = Integer.MAX_VALUE;   // +infinity
        for(int i=0; i<num.length; i++){
            if(largest < num[i]){
                largest = num[i];
            }
            if(smallest > num[i]){
                smallest = num[i];
            }
        }
        
        System.out.println("Largest number is : " + largest);
        System.out.println("Smallest number is : " + smallest);
    }

    public static void main(String k[]){
        int numbers[] = {1, 2, 3, 6, 4, 5};
        compare(numbers);
    }
}