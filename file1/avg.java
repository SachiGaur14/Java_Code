import java.util.*;
public class avg{
    public static void main(String k[]){
        // to find average.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a+b+c;
        int average = sum/3;
        System.out.println("Average is " + average );
    }
}