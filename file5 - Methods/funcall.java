import java.util.*;

// Function call by value.
public class funcall{

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping a = " + a);
        System.out.println("after swapping b = " + b);
    }

    public static void main(String k[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("a = ");
       int a = sc.nextInt();
       System.out.print("b = ");
       int b = sc.nextInt();

       swap(a, b);

       System.out.println("a = " + a);
       System.out.println("b = " + b);

    }
}